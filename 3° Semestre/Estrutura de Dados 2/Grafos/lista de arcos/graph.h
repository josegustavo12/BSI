#ifndef GRAPH_H
#define GRAPH_H

#include <stdio.h>
#include <stdlib.h>

#define Vertex int
#define Edge Arc


typedef struct{
    Vertex v;
    Vertex w;

} Arc;



struct arclist{
    int size;
    Arc *arcs;
};

typedef struct arclist *Graph; // definição da struct que é o grafo (uma lista do tipo arc de arcos)


Graph initGraph();

Arc newArc (Vertex v, Vertex w);

void destroyGraph(Graph grafo);

void insertArc(Graph grafo, Vertex v, Vertex w);
void insertEdge (Graph grafo, Vertex v, Vertex w);

void removeArc(Graph grafo, Vertex v, Vertex w);

void printGraph(Graph grafo);

#endif // GRAPH_H