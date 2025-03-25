#ifndef MATGRAPH_H
#define MATGRAPH_H

#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int numVertices;
    int numEdges;   // Cada aresta inserida conta apenas uma vez
    int **matrix;   // Matriz de adjacência
} Graph;

static inline Graph* initGraph(int numVertices) {
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

static inline void destroyGraph(Graph* g) {
    if (!g) return;
    for (int i = 0; i < g->numVertices; i++) {
        free(g->matrix[i]);
    }
    free(g->matrix);
    free(g);
}

static inline void insertEdge(Graph* g, int v, int w) {
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

static inline void removeEdge(Graph* g, int v, int w) {
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

static inline void printGraph(Graph* g) {
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

#endif // MATGRAPH_H
