#include <stdio.h>
#include <stdlib.h>
#include "dijkstra.h"

typedef struct {
    int to, weight, next;
} Edge;

static Edge edges[MAXE];
static int head[MAXV];
static int edgeCnt;
static int NV;

static int distArr[MAXV];
static int parent[MAXV];

typedef struct {
    int vert, d;
} HeapNode;

static HeapNode heapArr[MAXE];
static int heapSize;

void initGraph(int numVertices) {
    NV = numVertices;
    edgeCnt = 0;
    for (int i = 0; i < NV; i++) head[i] = -1;
}

static void heapPush(int v, int d) {
    int i = heapSize++;
    heapArr[i].vert = v;
    heapArr[i].d    = d;
    while (i > 0) {
        int p = (i - 1) / 2;
        if (heapArr[p].d <= heapArr[i].d) break;
        HeapNode tmp = heapArr[p];
        heapArr[p] = heapArr[i];
        heapArr[i] = tmp;
        i = p;
    }
}

static HeapNode heapPop(void) {
    HeapNode ret = heapArr[0];
    heapArr[0] = heapArr[--heapSize];
    int i = 0;
    while (1) {
        int l = 2*i + 1, r = l + 1, best = i;
        if (l < heapSize && heapArr[l].d < heapArr[best].d) best = l;
        if (r < heapSize && heapArr[r].d < heapArr[best].d) best = r;
        if (best == i) break;
        HeapNode tmp = heapArr[best];
        heapArr[best] = heapArr[i];
        heapArr[i] = tmp;
        i = best;
    }
    return ret;
}

void addEdge(int u, int v, int w) {
    edges[edgeCnt].to     = v;
    edges[edgeCnt].weight = w;
    edges[edgeCnt].next   = head[u];
    head[u] = edgeCnt++;
}

int hasNegCycle(void) {
    int *d = malloc(sizeof(int) * NV);
    for (int i = 0; i < NV; i++) d[i] = 0;
    for (int i = 1; i < NV; i++) {
        for (int u = 0; u < NV; u++) {
            for (int e = head[u]; e != -1; e = edges[e].next) {
                int v = edges[e].to;
                int w = edges[e].weight;
                if (d[u] + w < d[v]) d[v] = d[u] + w;
            }
        }
    }
    for (int u = 0; u < NV; u++) {
        for (int e = head[u]; e != -1; e = edges[e].next) {
            int v = edges[e].to;
            int w = edges[e].weight;
            if (d[u] + w < d[v]) {
                free(d);
                return 1;
            }
        }
    }
    free(d);
    return 0;
}

void runDijkstra(int src) {
    for (int i = 0; i < NV; i++) {
        distArr[i] = INF;
        parent[i]  = -1;
    }
    distArr[src] = 0;
    heapSize = 0;
    heapPush(src, 0);
    while (heapSize > 0) {
        HeapNode cur = heapPop();
        int u = cur.vert;
        if (cur.d != distArr[u]) continue;
        for (int e = head[u]; e != -1; e = edges[e].next) {
            int v = edges[e].to;
            int w = edges[e].weight;
            if (cur.d + w < distArr[v]) {
                distArr[v] = cur.d + w;
                parent[v]  = u;
                heapPush(v, distArr[v]);
            }
        }
    }
}

int getDistance(int v) {
    return distArr[v];
}

void printPath(int src, int v) {
    if (v == src) {
        printf("%d", src);
    } else if (parent[v] < 0) {
        printf("%d", v);
    } else {
        printPath(src, parent[v]);
        printf(" -> %d", v);
    }
}
