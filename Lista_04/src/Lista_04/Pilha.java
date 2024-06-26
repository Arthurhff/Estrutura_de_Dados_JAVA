package Lista_04;

import java.util.Scanner;

/*
Implemente a classe Pilha para armazenar valores inteiros, utilizando vetores como estrutura de armazenamento.
Crie um método para criar uma pilha vazia.
Crie um método responsável por inserir um elemento na pilha.
Crie um método responsável por remover um elemento da pilha.
Crie um método para exibir o conteúdo de uma pilha.
Crie um método que retorne o número de elementos existentes na pilha.
*/

public class Pilha {

    private int tamanho;
    private int ultimoElemento;
    private int pilha[];

    public Pilha(int qtdElementos){
        this.pilha = new int[qtdElementos];
        this.tamanho = qtdElementos;
        this.ultimoElemento = -1;
    }

    public boolean push(int elemento){
        if(this.ultimoElemento < this.tamanho - 1){
            this.ultimoElemento++;
            this.pilha[this.ultimoElemento] = elemento;
            return true;
        }
        else{
            System.out.println("A pilha está cheia. Remova um elemento antes de inserir outro!");
            return false;
        }
    }

    public boolean pop(){
        if(this.ultimoElemento >= 0){
            this.pilha[this.ultimoElemento] = 0;
            this.ultimoElemento--;
            return true;
        }
        else{
            System.out.println("A pilha está vazia. Adicione um elemento antes de remover outro!");
            return false;
        }
    }

    public boolean exibirPilha(){
        if(this.ultimoElemento >= 0){
            System.out.println("Elementos da pilha:");
            for(int i = 0; i < this.ultimoElemento + 1; i++){
                System.out.println(this.pilha[i]);
            }
            return true;
        }
        else{
            System.out.println("A pilha está vazia. Adicione um elemento antes de exibir a pilha!");
            return false;
        }
    }

    public boolean size(){
        if(this.ultimoElemento >= 0){
            System.out.printf("A pilha contém %d elemento(s).\n", this.ultimoElemento + 1);
            return true;
        }
        else{
            System.out.println("A pilha está vazia!");
            return false;
        }
    }
}