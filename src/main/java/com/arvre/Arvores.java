package com.arvre;

public class Arvores {

    public static void main(String[] args) {
        int[] array = {15, 10, 20, 5, 12, 18, 25, 3, 7, 11, 14, 17, 22, 2, 6, 9, 13, 16, 19, 24, 27, 1, 4, 8, 23, 26, 29, 30, 31, 32};

        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int i : array) {
            arvore.inserir(i);
        }

        arvore.emordem(arvore.getRaiz());
    }
}
