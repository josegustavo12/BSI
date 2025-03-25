#include "matgraph.h"
#include <stdio.h>

int main(void) {
    int numVertices;
    
    if (scanf("%d", &numVertices) != 1) {
        fprintf(stderr, "Erro ao ler o número de vértices.\n");
        return 1;
    }
    
    Graph* g = initGraph(numVertices);
    
    int v, w;
    while (scanf("%d %d", &v, &w) == 2) {
        insertEdge(g, v, w);
    }
    
    printGraph(g);
    
    destroyGraph(g);
    
    return 0;
}
