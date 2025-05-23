#ifndef EXERC7_H_INCLUDED
#define EXERC7_H_INCLUDED

#include <stdio.h>
#include <stdlib.h>

typedef struct Node{

    int data;
    struct Node* left;
    struct Node* right;

} Node;

typedef struct{
    Node* root;
}Tree;

Node* createNode(int data);

Tree* createTree();

Node* insert( Node* node, int data );

int search( Node* node, int data );

Node* getMaxNode( Node* node );

Node* getMinNode( Node* node );

Node* deleteNode( Node* node, int data, char filhoSubstituto);

void strPreorder(Node *node);
void strInorder(Node *node);
void strPostorder(Node *node);

void somaCaminhos (int caminho[], int n);
void encontrarCaminhos (Node* raiz, int caminho[], int n ); 
void caminhos(Tree* tree);


#endif // EXERC7_H_INCLUDED
