#ifndef LISTA_ENCADEADA_H
#define LISTA_ENCADEADA_H

// Definição do nó da lista duplamente encadeada
typedef struct Node {
    int data;
    struct Node *next;
    struct Node *prev;
} Node;

// Declaração das funções para manipulação da lista
Node* insertHead(Node *head, int value);
Node* insertTail(Node *head, int value);
Node* insertIndex(Node *head, int index, int value);
void printList(Node *head);
void freeList(Node *head);

#endif // LISTA_ENCADEADA_H