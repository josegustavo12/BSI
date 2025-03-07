#ifndef PILHADINAMICA_H
#define PILHADINAMICA_H


// Cria��o do n� da pilha dinamica
typedef struct Node{ // tem que nomear a struct porque utiliza ela dentro da pr�pria struct

    int data; // dado dentro do n�
    struct Node* next; // autoreferencia de dentro da struct

} Node;

typedef struct{

    Node* top; // indica quem � o primeiro valor da pilha
    int tamanho; // indica o tamanho da pilha

} Pilha;

Pilha* criarNode(int data); // fun��o do tipo Pilha pra construir o n�

Pilha* criarPilha(); // fun��o do tipo Pilha para construir a pilha

int getSize(Pilha* pilha);

int isEmpty(Pilha* pilha); // fun��o para retornar se a pilha est� vazia ou n

void push(Pilha* pilha, int data); // fun��o para inserir algo na pilha

int pop(Pilha* pilha); // fun��o para retirar algo da pilha

void imprimir(Pilha* pilha);


#endif // PILHADINAMICA_H
