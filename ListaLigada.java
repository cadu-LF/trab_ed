package br.com.unifacef.trab_ed;

/**
 *
 * @author Cadu Lourenço
 */
public class ListaLigada {
    
    int tamanho = 0;
    No head = null;
    
    public ListaLigada(){}
    
    public void insereElemento(String elemento){
        No novo = new No(elemento);
        novo.setNext(head);
        this.head = novo;
        System.out.println(novo);
        System.out.println(head);
        tamanho++;
        
    }
    
public void rmElemento(String elemento, int posicao){
    System.out.println(head);
    No atual = head;
    No anterior = new No();
    int cont = 0;
    
    if(posicao < 10){
        while(!atual.getValor().substring(4).equals(elemento)){
            System.out.println(atual.getValor());
            System.out.println(atual.getValor().substring(4));
            System.out.println(elemento);
            System.out.println(atual.getValor().substring(4).equals(elemento));
            anterior = atual;
            atual = atual.getNext();
            cont++;
        }
    } else{
        while(!atual.getValor().substring(5).equals(elemento)){
            System.out.println(atual.getValor());
            System.out.println(atual.getValor().substring(5));
            System.out.println(elemento);
            System.out.println(atual.getValor().substring(5).equals(elemento));
            anterior = atual;
            atual = atual.getNext();
            cont++;
        }
    }
    

        if(cont == 0){
            head = head.getNext();
            atual.setNext(null);
        } else{
            anterior.setNext(atual.getNext());
            atual.setNext(null);
        }
        tamanho--;
    
    }
   
    @Override
    public String toString(){
        if(tamanho == 0){ // verificar se existe algum elemento na lista
            return "[]";
        }
        /**
         * cria uma nova celula que representa o primeiro elemento da fila
         */
        No atual = head;
        
        // cria o StringBuilder para poder armazenar os dados da lista
        StringBuilder builder = new StringBuilder("{ ");
        
        // cria um for para percorrer todos os elementos da lista
        for(int i = 0; i < tamanho; i++){
            // adiciona o elemento atual à variável builder
            builder.append("[");
            builder.append(atual.getValor());
            builder.append("] -> ");
            
            // faz o autal apontar para o póximo elemento da lista
            atual = atual.getNext();
        }
        
        builder.append("}");
        
        return builder.toString();
    }
    
}
