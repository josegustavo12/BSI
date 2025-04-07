#ifndef MATGRAPH_H
#define MATGRAPH_H

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numVertices;
    int numEdges;   // Cada aresta inserida conta apenas uma vez
    int **matrix;   // Matriz de adjacência
} Graph;

// Inicializa o grafo
Graph* initGraph(int numVertices) {
    Graph* g = (Graph*) malloc(sizeof(Graph));
    if (!g) {
        fprintf(stderr, "Erro ao alocar memória para o grafo.\n");
        exit(EXIT_FAILURE);
    }

    g->numVertices = numVertices;
    g->numEdges = 0;
    g->matrix = (int**) malloc(numVertices * sizeof(int*));
    if (!g->matrix) {
        fprintf(stderr, "Erro ao alocar memória para a matriz de adjacência.\n");
        exit(EXIT_FAILURE);
    }

    for (int i = 0; i < numVertices; i++) {
        g->matrix[i] = (int*) malloc(numVertices * sizeof(int));
        if (!g->matrix[i]) {
            fprintf(stderr, "Erro ao alocar memória para a linha %d da matriz.\n", i);
            exit(EXIT_FAILURE);
        }
        for (int j = 0; j < numVertices; j++) {
            g->matrix[i][j] = 0;
        }
    }

    return g;
}

// Libera a memória do grafo
void destroyGraph(Graph* g) {
    if (!g) return;
    for (int i = 0; i < g->numVertices; i++) {
        free(g->matrix[i]);
    }
    free(g->matrix);
    free(g);
}

// Insere uma aresta não direcionada
void insertEdge(Graph* g, int v, int w) {
    if (v < 0 || v >= g->numVertices || w < 0 || w >= g->numVertices) {
        fprintf(stderr, "Vértices inválidos: %d, %d\n", v, w);
        return;
    }
    if (g->matrix[v][w] == 0) {
        g->matrix[v][w] = 1;
        g->matrix[w][v] = 1;
        g->numEdges++;
    }
}

// Remove uma aresta
void removeEdge(Graph* g, int v, int w) {
    if (v < 0 || v >= g->numVertices || w < 0 || w >= g->numVertices) {
        fprintf(stderr, "Vértices inválidos: %d, %d\n", v, w);
        return;
    }
    if (g->matrix[v][w] == 1) {
        g->matrix[v][w] = 0;
        g->matrix[w][v] = 0;
        g->numEdges--;
    }
}

// Imprime o grafo (opcional para debug)
void printGraph(Graph* g) {
    printf("Total of vertices: %d, total of arcs: %d\n", g->numVertices, g->numEdges);
    for (int i = 0; i < g->numVertices; i++) {
        printf("Vertex %d, arcs:", i);
        int first = 1;
        for (int j = 0; j < g->numVertices; j++) {
            if (g->matrix[i][j] == 1) {
                if (first) {
                    printf(" %d", j);
                    first = 0;
                } else {
                    printf(", %d", j);
                }
            }
        }
        printf("\n");
    }
}

// Função auxiliar recursiva para DFS
void dfsVisit(Graph* g, int v, int* visited) {
    visited[v] = 1;
    printf("visited %d \n", v);

    for (int i = 0; i < g->numVertices; i++) {
        if (g->matrix[v][i] && !visited[i]) {
            dfsVisit(g, i, visited);
        }
    }
}

// DFS principal
void dfs(Graph* g, int start) {
    if (start < 0 || start >= g->numVertices) {
        fprintf(stderr, "Vértice inicial inválido para DFS: %d\n", start);
        return;
    }

    int* visited = (int*) calloc(g->numVertices, sizeof(int));
    if (!visited) {
        fprintf(stderr, "Erro ao alocar memória para o vetor de visitados (DFS).\n");
        exit(EXIT_FAILURE);
    }

    printf("DFS\n");
    dfsVisit(g, start, visited);
    free(visited);
}

// BFS
void bfs(Graph* g, int start) {
    if (start < 0 || start >= g->numVertices) {
        fprintf(stderr, "Vértice inicial inválido para BFS: %d\n", start);
        return;
    }

    int* visited = (int*) calloc(g->numVertices, sizeof(int));
    if (!visited) {
        fprintf(stderr, "Erro ao alocar memória para o vetor de visitados (BFS).\n");
        exit(EXIT_FAILURE);
    }

    int* queue = (int*) malloc(g->numVertices * sizeof(int));
    if (!queue) {
        fprintf(stderr, "Erro ao alocar memória para a fila (BFS).\n");
        free(visited);
        exit(EXIT_FAILURE);
    }

    int front = 0, rear = 0;

    visited[start] = 1;
    queue[rear++] = start;

    printf("BFS\n");

    while (front < rear) {
        int v = queue[front++];
        printf("visited %d \n", v);

        for (int i = 0; i < g->numVertices; i++) {
            if (g->matrix[v][i] && !visited[i]) {
                visited[i] = 1;
                queue[rear++] = i;
            }
        }
    }

    free(queue);
    free(visited);
}

#endif // MATGRAPH_H
