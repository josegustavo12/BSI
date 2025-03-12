# Nome do executável
TARGET = main

# Arquivos fonte
SRCS = main.c lista_encadeada.c

# Arquivos de cabeçalho
HEADERS = lista_encadeada.h

# Compilador
CC = gcc

# Flags de compilação
CFLAGS = -Wall -Wextra -pedantic


# Regra para limpar os arquivos gerados
all:
	$(CC) $(CFLAGS) $(SRCS) -o $(TARGET)

# Permite rodar o programa após compilado com 'make run'
run:
	./$(TARGET)