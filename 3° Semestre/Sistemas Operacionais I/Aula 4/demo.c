/*
 * demo.c
 * Este programa cria três processos filhos: dois deles CPU-bound e
 * um deles simula I/O-bound dormindo periodicamente.
 * Vamos observar como o escalonamento trata cada processo.
 */
 
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
#include <time.h>
void cpu_bound() {
    // Loop para simular carga de CPU
    double x = 0;
    for (long i = 0; i < 1000000000; i++) {
        x += 0.0001;  // Operação "inútil" para gastar CPU
    }
    printf("Processo CPU-bound finalizado. x=%.4f\n", x);
}
void io_bound() {
    // Loop simulando I/O: dorme periodicamente
    for (int i = 0; i < 5; i++) {
        printf("Processo I/O-bound: dormindo...\n");
        usleep(500000); // 0.5s
    }
    printf("Processo I/O-bound finalizado.\n");
}
int main() {
    printf("PID do processo pai: %d\n", getpid());
    // Criar processo filho 1 (CPU-bound)
    pid_t pid1 = fork();
    if (pid1 == 0) {
        cpu_bound();
        exit(0);
    }
    // Criar processo filho 2 (CPU-bound)
    pid_t pid2 = fork();
    if (pid2 == 0) {
        cpu_bound();
        exit(0);
    }
    // Criar processo filho 3 (I/O-bound)
    pid_t pid3 = fork();
    if (pid3 == 0) {
        io_bound();
        exit(0);
    }
    // Processo pai aguarda todos os filhos
    for (int i = 0; i < 3; i++) {
        wait(NULL);
    }
    printf("Todos os processos filhos terminaram.\n");
    return 0;
}
