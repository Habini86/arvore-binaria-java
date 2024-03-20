package com.arvre;

public class ArvoreBinaria {
    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return this.raiz;
    }

    // Inserir um novo nó na árvore
    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (raiz == null) {
            raiz = novoNo;
        } else {
            inserirRecursivo(valor, raiz);
        }
    }

    private void inserirRecursivo(int valor, No noAtual) {
        if (valor <= noAtual.valor) {
            if (noAtual.esquerdo == null) {
                noAtual.esquerdo = new No(valor);
            } else {
                inserirRecursivo(valor, noAtual.esquerdo);
            }
        } else {
            if (noAtual.direito == null) {
                noAtual.direito = new No(valor);
            } else {
                inserirRecursivo(valor, noAtual.direito);
            }
        }
    }

    // Buscar um valor na árvore
    public No buscar(int valor) {
        if (raiz == null) {
            return null;
        } else {
            return buscarRecursivo(valor, raiz);
        }
    }

    private No buscarRecursivo(int valor, No noAtual) {
        if (valor == noAtual.valor) {
            return noAtual;
        } else if (valor <= noAtual.valor) {
            if (noAtual.esquerdo == null) {
                return null;
            } else {
                return buscarRecursivo(valor, noAtual.esquerdo);
            }
        } else {
            if (noAtual.direito == null) {
                return null;
            } else {
                return buscarRecursivo(valor, noAtual.direito);
            }
        }
    }
    
    public void emordem(No no) {
        if (no != null) {
            emordem(no.esquerdo);
            System.out.println(no.valor);
            emordem(no.direito);
        }
    }
    
    public void preordem(No no) {
        if (no != null) {
            System.out.println(no.valor);
            preordem(no.esquerdo);
            preordem(no.direito);
        }
    }
    
    public void posordem(No no) {
        if (no != null) {
            posordem(no.esquerdo);
            posordem(no.direito);
            System.out.println(no.valor);
        }
    }
    
    // Remover um valor da árvore
    public void remover(int valor) {
        if (raiz == null) {
            return;
        } else {
            removerRecursivo(valor, raiz);
        }
    }
    
    private No menorValor(No noAtual) {
        while (noAtual.esquerdo != null) {
            noAtual = noAtual.esquerdo;
        }
        return noAtual;
    }
    
    private void removerRecursivo(int valor, No noAtual) {
        if (valor == noAtual.valor) {
            // Nó folha
            if (noAtual.esquerdo == null && noAtual.direito == null) {
                noAtual = null;
            }
            // Nó com um filho
            else if (noAtual.esquerdo == null) {
                noAtual = noAtual.direito;
            } else if (noAtual.direito == null) {
                noAtual = noAtual.esquerdo;
            }
            // Nó com dois filhos
            else {
                No noSubstituto = menorValor(noAtual.direito);
                noAtual.valor = noSubstituto.valor;
                removerRecursivo(noSubstituto.valor, noAtual.direito);
            }
        } else if (valor < noAtual.valor) {
            if (noAtual.esquerdo != null) {
                removerRecursivo(valor, noAtual.esquerdo);
            }
        } else {
            if (noAtual.direito != null) {
                removerRecursivo(valor, noAtual.direito);
            }
        }
    }
}