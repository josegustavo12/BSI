// dijkstra.h
#ifndef DIJKSTRA_H
#define DIJKSTRA_H

#define MAXV 1000
#define MAXE 100000
#define INF 1000000000

void initGraph(int numVertices);
void addEdge(int u, int v, int w);
int hasNegCycle(void);
void runDijkstra(int src);
int getDistance(int v);
void printPath(int src, int v);

#endif // DIJKSTRA_H