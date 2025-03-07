# include <stdio.h>
#include <stdlib.h>

#include "pilhadinamica.h" // declarando o header da pilha

Pilha* criarNode(int data){

    Node* node = (Node*)malloc(sizeof(Node*)); // cria uma variavel chamada node, dentro dela guarda um espa�o de memoria suficiente para guardar o node

    node->next == NULL; // indica qual o pr�ximo elemento ligado ao n�
    node->data = data;

}

Pilha* criarPilha(){

    Pilha* pilha = (Pilha*)malloc(sizeof(Pilha)); // cria efetivamente a pilha

    pilha->top = NULL;
    pilha->tamanho = 0;

}

void push(Pilha* pilha, int data){

    Node* node = criarNode(data); // cria��o do n� com o dado novo

    node->next = pilha->top; // liga��o do n� com a pilha
    pilha->top = node; // indica��o do topo
    pilha->tamanho++; // aumenta o tamanho

}

int getSize(Pilha* pilha){

    return pilha->tamanho;
}

int pop(Pilha* pilha){

    if(isEmpty(pilha)==1){

        printf("\nPilha Vazia, Erro (underflow)\n");
        return 1; // underflow (caso tente remover algo da pilha vazia
    }

    Node* tempNode = pilha->top; // armazenando o valor do top
    int data = tempNode->data; // declara a data com o valor para onde o top est� apontando

    pilha->top = tempNode->next;

    pilha->tamanho--;

    free(tempNode);


}

int isEmpty(Pilha* pilha){

    if (pilha->tamanho == 0){

        return 1; // True
    }

    else{

        return 0; // False
    }
}

void imprimir(Pilha* pilha){

    Pilha* auxPilha = criarPilha(); // criando a pilha auxiliar, porque a unica forma de imprimir a pilha � destruindo ela
    printf("\nPilha: [");

    while( isEmpty(pilha) != 1){

        int data = pop(pilha);
        push(auxPilha, data);

        printf("%d ", data);
    }

    while(isEmpty(auxPilha) != 1){

        int temp = pop(auxPilha);
        push(pilha, temp);
    }

    printf("]\n");
}

