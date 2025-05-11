#include <stdio.h>
#include "dijkstra.h"
int main(void) {
    int NV;
    if (scanf("%d", &NV) != 1) return 0;
    initGraph(NV);
    int u, v, w;
    while (scanf("%d %d %d", &u, &v, &w) == 3) {
        addEdge(u, v, w);
    }


    for (int s = 0; s < NV; s++) {
        printf("Node %d:\n", s);
        runDijkstra(s);
        for (int t = 0; t < NV; t++) {
            printf("Distance from %d to %d = ", s, t);
            int d = getDistance(t);
            if (d == INF) {
                printf("infinity\n");
            } else {
                printf("%d\n", d);
                if (s != t) {
                    printf("Path: ");
                    printPath(s, t);
                    printf("\n");
                }
            }
        }
        if (s != NV - 1) printf("\n");
    }

    return 0;
}