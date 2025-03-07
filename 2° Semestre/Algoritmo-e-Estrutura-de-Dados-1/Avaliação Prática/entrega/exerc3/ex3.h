#ifndef EX3_H
#define EX3_H

#include <stdio.h>
#include <stdlib.h>

#define CAPACITY_MAX 10
#define INDEX_NULL -1

// Estrutura para representar um n� na LNSE
typedef struct {
    int data;
    int next;
} Node;

// Estrutura para implementar uma fila est�tica
typedef struct {
    int data[CAPACITY_MAX];
    int front;
    int rear;
    int capacity;
    int size; // N�mero de elementos na fila
} FilaEstat;

// Estrutura para implementar a Lista N�o Sequencial e Est�tica (LNSE)
typedef struct {
    Node vetor[CAPACITY_MAX];   // Vetor de n�s
    FilaEstat filalivre;       // Fila de �ndices livres
    int head;                    // �ndice do primeiro elemento
    int tail;                    // �ndice do �ltimo elemento
    int size;                    // N�mero de elementos na lista
} LNSE;

// Fun��es da Fila Est�tica
void criarFilaEstat(FilaEstat *fila, int capacity);

// Fun��o para verificar se a fila est� vazia
int isEmpty(FilaEstat *fila);

// Fun��o para verificar se a fila est� cheia
int isFull(FilaEstat *fila);

// Fun��o para adicionar um item � fila
int enqueue(FilaEstat *fila, int item);

// Fun��o para remover um item da fila
int dequeue(FilaEstat *fila, int *item);

// Fun��o para copiar os elementos da fila para um array tempor�rio
int copiarFila(FilaEstat *fila, int *tempArray, int *tempSize);

// Fun��es da LNSE

// Fun��o que cria e inicializa a Lista N�o Sequencial Est�tica
void criarLNSE(LNSE *list, int capacity);

// Fun��o para inserir um elemento na LNSE
void inserir(LNSE *list, int x, int i);

// Fun��o para remover um elemento da LNSE
int remover(LNSE *list, int i);

// Fun��o para buscar um elemento na LNSE
int buscar(LNSE *list, int x);

// Fun��o para retornar o tamanho da LNSE
int size_listaLNSE(LNSE *list);

// Fun��o para limpar a LNSE
void clearListaLNSE(LNSE *list);

// Fun��o para imprimir os elementos da LNSE
void imprimir(LNSE *list);

#endif // EX3_H
