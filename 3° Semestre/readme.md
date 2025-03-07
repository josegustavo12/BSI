# Caderno de anotações 
# Sumário
- [Cálculo Numérico](#cálculo-numérico)
    - [Introdução](#introdução-cn)
- [Sistemas Operacionais I](#sistemas-operacionais-i)
    - [Introdução](#introdução-so)

- [Programação Orientada a Objetos](#programação-orientada-a-objetos)
- [Algoritmo e Estrutura de Dados II](#algoritmo-e-estrutura-de-dados-ii)
- [Requisitos de Software](#requisitos-de-software)
- [Introdução a Estatística](#introdução-a-estatística)
- [Programação Funcional](#programação-funcional)
    - [Aula 1](#aula-1)
    - [Aula 2](#aula-2)
      - [Introdução](#introdução-hs)
      - [Funções](#funções-em-haskell)
      - [Listas](#listas-em-haskell)

---

# Cálculo Numérico
## Introdução CN.
- Bibliografia
    - Livro texto: **Cálculo Científico com MATLAB e Octave, Alfio Quarteroni e Fausto Saleri**
    - Complementares: 
        - Slides do Afonso Paiva Neto (link)
        - o resto era livro em ingles 
- Programa Resumido:
    - Programação, Introdução a Python e Numpy
    - Resolução de sistemas lineares
    - Interpolação


- **Primeira tarefa:** Redija uma opinião sobre o conteúdo da disciplina e sobre o planejamento proposto.
    - Considere o conteúdo adequado, no contexto, de seus objetivos profissionais
    - se tivesse que acrescentar um tópico, qual seria?
    - se tivesse que tirar um tópico, qual seria?
    - quais são, atualmente, os algoritmos de ciência de dados que você gostaria de compreender com maior profundidade? Porquê?
    - **Entrega:** Pelo edisciplinas


# Sistemas Operacionais I
## Introdução SO.
- Bibliografia
    - Livro texto: **Sistemas Operacionais Modernos, TANENBAUM**
- Programa Resumido:

    - Processos
    
      - Definição
      - Tipos de Processos
      - Diagrama de Estados
      - Escalonamento de CPU
      - Comunicação entre Processos
      - Sincronização entre Processos
      - Regiões Críticas
      - Threads
      - Deadlocks
    
    - Gerência de Memória
    
      - Compiladores, Linkers, Loaders e Relocadores
      - Alocação Contígua Simples
      - Alocação Particionada Estática e Dinâmica
      - Swapping
      - Memória Virtual: Paginação e Segmentação
    
    - Entrada/Saída
    
      - Princípios de Hardware e Software
      - Controladores de Dispositivos e Dispositivos de E/S
      - Interrupções
      - Estrutura do Software Gerenciador de E/S
    
    - Sistemas de Arquivos
    
      - Gerência de Espaço em Disco
      - Tipos de Estruturas de Sistemas de Arquivos
      - Tipos de Arquivos, Nomes e Estrutura Interna
      - Exemplos de Sistemas de Arquivos
    - Segurança
      - Criptografia
      - Autenticação
      - Ataques
    - Projeto de Sistemas Operacionais
    - Avaliação de Desempenho de Sistemas Computacionais
    - Exemplos de Sistemas Operacionais
    
      - Windows
      - Linux
      - Android / Symbian / iOS



# Programação Orientada a Objetos
Conteúdo sobre Programação Orientada a Objetos.

# Algoritmo e Estrutura de Dados II
Conteúdo sobre Algoritmo e Estrutura de Dados II.

# Requisitos de Software
Conteúdo sobre Requisitos de Software.

# Introdução a Estatística
Conteúdo sobre Introdução a Estatística.

# Programação Funcional

## Aula 1

## Aula 2

### Introdução HS
1. Instalar o GHCup
2. Criar o hello world em haskell (o arquivo deve ser .hs)
    - Utilizar o "runhaskell <nome_arquivo>", ele compila, gera o executavel, executa ele e apaga

- **Hello world**
```haskell
-- monad
main = do
  putStrLn "Hello world!!"
  putStrLn (show x)

y = x+1
x = 5
p = show y

```

- função `show`:
  -  converte valores em string, mas não imprime eles
  - por ex: no código acima ele transforma o y em string e guarda ele em p
  - tambem existe o "show de show", por ex:
  ```haskell
  main = do
    PutStrLn (show p) -- imprimirá "8", ou seja, string da string de 8

  y = 8
  p = show y
  ```
- a ordem não importa em haskell, mas é bom manter por conveniencia 
- **NÃO** pode conter multiplas declarações para a mesma variavel
- cuidado com loops
  - se uma variavel usa ela mesma para o cálculo, o haskell calcula infinitamente, por ex:
  ```haskell
  main = do
    putStrLn (show x)
  x = x + 1 -- dessa forma o programa iria ficar em um loop eterno tentando calcular o x
  
  ```

- utilização de valores booleanos

```haskell
main = do 
  putStrLn (show (f True)) -- 5
  putStrLn (show (f False)) -- 42

f True = 5
f False = 42
```

- haskell (ou seus programadores) **ODEIAM** parentesês !!
  - ao invez de usar o () em tudo que for fazer, podemos usar a função "$", da forma apresentada abaixo

```haskell
main = do
    putStrLn  "Hello world!!!"
    putStrLn (show y) -- 8
    putStrLn (show p) -- "8"
    --putStrLn (show w) -- loop
    putStrLn (show (f True)) -- 5
    putStrLn (show (f ( y > 10 ))) -- 42
    putStrLn $ show $ f $ y > 10
```

### **Funções em Haskell**

#### **Definição de Funções**

Em Haskell, as funções são definidas usando a seguinte sintaxe:

```haskell
<nome_da_funcao> <parametro> = <corpo_da_funcao>
```

A chamada de funções em Haskell é feita de forma direta, sem necessidade de parênteses ou operadores especiais. Veja um exemplo simples:

```haskell
main = do
    putStrLn $ show $ g 10 -- Saída: 11

g h = h + 1 -- Função que incrementa o valor recebido em 1
```

Aqui:
- `g` é uma função que recebe um argumento `h` e retorna `h + 1`.
- `putStrLn` imprime a saída no terminal.
- `show` converte o resultado da função `g 10` em uma string para ser impresso.
- O operador `$` evita o uso excessivo de parênteses.

### **Recursão em Haskell**

Em Haskell, funções podem ser **recursivas**, ou seja, chamar a si mesmas. Isso permite a implementação de algoritmos como o **cálculo do fatorial**:

```haskell
main = do
  putStrLn $ show $ fat 5 -- 120

fat 0 = 1
fat n = n * fat (n - 1)
```

Explicação:
- Se `n` for `0`, o fatorial retorna `1` (caso base).
- Caso contrário, multiplicamos `n` pelo fatorial de `n - 1`, até atingir `0`.

### **Listas em Haskell**

As listas são uma estrutura de dados fundamental em Haskell. Elas são representadas por colchetes (`[]`) e podem conter elementos do mesmo tipo.

#### **Exemplo de lista:**
```haskell
numeros :: [Int]
numeros = [1, 2, 3, 4, 5]
```

#### **Operações básicas com listas**

- **Concatenação (`++`)**
```haskell
lista1 = [1, 2, 3]
lista2 = [4, 5]
resultado = lista1 ++ lista2 -- [1, 2, 3, 4, 5]
```

- **Adição de elemento no início (`:`)**
```haskell
novoLista = 0 : numeros -- [0, 1, 2, 3, 4, 5]
```

- **Acessando elementos**
```haskell
primeiro = head numeros -- 1
resto = tail numeros -- [2, 3, 4, 5]
ultimo = last numeros -- 5
```

- **Comprimento da lista**
```haskell
tamanho = length numeros -- 5
```

- **Verificando se a lista está vazia**
```haskell
estaVazia = null numeros -- False
```

- **Mapeamento sobre listas (`map`)**
```haskell
dobro = map (*2) numeros -- [2, 4, 6, 8, 10]
```

- **Filtragem de listas (`filter`)**
```haskell
pares = filter even numeros -- [2, 4]
```

- A lista **tem que ter** um tipo, por ex:

```haskell
o4 = [4, False, "oi"] -- essa lista não funciona, pois ela não possui um tipo
```


- Calculando o tamanho de uma lista com uma função recursiva:
  ```haskell
  r [] = 0
  r (x:xs) = 1 + r xs
  ```
  - **1️⃣ Caso Base**
  ```haskell
  r [] = 0
  ```
  Se a lista for **vazia (`[]`)**, o tamanho dela é **zero**.

  - **2️⃣ Caso Recursivo**
  ```haskell
  r (x:xs) = 1 + r xs
  ```
  Se a lista **não** estiver vazia, significa que tem pelo menos um elemento (`x`) e um restante (`xs`).

  - O `x` (primeiro elemento) não é usado diretamente, apenas conta como um elemento da lista.
  - Chamamos `r xs` para calcular o tamanho do restante da lista (`xs`).
  - Como `x` é um elemento válido, somamos `1` ao resultado da chamada recursiva.

  ```haskell
  r [3, 7, 2]
  = 1 + r [7, 2]
  = 1 + (1 + r [2])
  = 1 + (1 + (1 + r []))
  = 1 + (1 + (1 + 0))
  = 3
  ```

  A lista `[3, 7, 2]` tem **3 elementos**, e a função retorna `3`.


