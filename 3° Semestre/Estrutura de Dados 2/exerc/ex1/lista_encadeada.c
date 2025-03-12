#include <stdio.h>
#include <stdlib.h>
#include "lista_encadeada.h"

// Insere um novo nó no início da lista
Node* insertHead(Node *head, int value) {
    Node *newNode = (Node*) malloc(sizeof(Node));
    newNode->data = value;
    newNode->next = head;
    newNode->prev = NULL;
    if(head != NULL) {
        head->prev = newNode;
    }
    return newNode;
}

// Insere um novo nó no final da lista
Node* insertTail(Node *head, int value) {
    Node *newNode = (Node*) malloc(sizeof(Node));
    newNode->data = value;
    newNode->next = NULL;
    newNode->prev = NULL;
    if(head == NULL)
        return newNode;
    Node *current = head;
    while(current->next != NULL) {
        current = current->next;
    }
    current->next = newNode;
    newNode->prev = current;
    return head;
}

// Insere um novo nó em uma posição específica (índice)
Node* insertIndex(Node *head, int index, int value) {
    if(index == 0) {
        return insertHead(head, value);
    }
    Node *newNode = (Node*) malloc(sizeof(Node));
    newNode->data = value;
    
    Node *current = head;
    int i = 0;
    while(i < index - 1 && current != NULL) {
        current = current->next;
        i++;
    }
    newNode->next = current->next;
    newNode->prev = current;
    if(current->next != NULL) {
        current->next->prev = newNode;
    }
    current->next = newNode;
    return head;
}

void printList(Node *head) {
    if (head == NULL)
        return;
    
    // Imprime o nó head sem pular linha
    if (head->next != NULL)
        printf("Head -> Data: %d, Next: %d\n", head->data, head->next->data);
    else
        printf("Head -> Data: %d\n", head->data);
    
    Node *current = head->next;
    int count = 1;
    while (current != NULL) {
        if (current->next != NULL)
            printf("Node %d -> Previous: %d, Data: %d, Next: %d\n", count, current->prev->data, current->data, current->next->data);
        else
            printf("Node %d -> Previous: %d, Data: %d\n", count, current->prev->data, current->data);
        current = current->next;
        count++;
    }
}


// Libera a memória alocada para a lista
void freeList(Node *head) {
    Node *current = head;
    while(current != NULL) {
        Node *temp = current;
        current = current->next;
        free(temp);
    }
}

