#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "lista_encadeada.h"

int main() {
    int total;
    scanf("%d", &total); // Lê o número total de operações

    Node* minhaLista = NULL; // Inicializa a lista como vazia
    char comando[20];
    int numero, posicao;

    // Loop para processar cada comando de entrada
    for (int contador = 0; contador < total; contador++) {
        scanf("%s", comando); // Lê o comando principal
        if (strcmp(comando, "INSERT") == 0) {
            scanf("%s", comando); // Lê o tipo de inserção
            if (strcmp(comando, "HEAD") == 0) {
                scanf("%d", &numero);
                minhaLista = insertHead(minhaLista, numero); // Insere no início da lista
            } else if (strcmp(comando, "TAIL") == 0) {
                scanf("%d", &numero);
                minhaLista = insertTail(minhaLista, numero); // Insere no final da lista
            } else if (strcmp(comando, "INDEX") == 0) {
                scanf("%d %d", &posicao, &numero);
                minhaLista = insertIndex(minhaLista, posicao, numero); // Insere em uma posição específica
            }
        }
    }

    printList(minhaLista); // Exibe a lista final
    freeList(minhaLista); // Libera a memória alocada
    return 0;
}
