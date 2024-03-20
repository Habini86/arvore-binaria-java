package com.arvre;

public class Arvores {

    public static void main(String[] args) {
        int[] array = {15, 10, 20, 5, 12, 18, 25, 3, 7, 11, 14, 17, 22, 2, 6, 9, 13, 16, 19, 24, 27, 1, 4, 8, 23, 26, 29, 30, 31, 32};

        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int i : array) {
            arvore.inserir(i);
        }

        System.out.println("Altura arvre: " + arvore.altura());
        System.out.println();

        System.out.println("Altura do nó 13 da arvre: " + arvore.alturaNo(13));
        System.out.println();

        System.out.println("Nós folhas: ");
        arvore.nosFolha();
        System.out.println();

        System.out.println("Nós Internos: ");
        arvore.nosInternos();
        System.out.println();

        System.out.println("Somente os valores ímpares e menores de 23 em ordem: ");
        arvore.imparesMenores23();
        System.out.println();

        System.out.println("Somente os valores pares e maiores de 14 em pós-orden: ");
        arvore.paresMaiores14();
        System.out.println();
    }
}
