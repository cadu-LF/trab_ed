package br.com.unifacef.trab_ed;

/**
 *
 * @author Cadu Lourenço
 */
public class ListaLigada {
    
    private Object elemento, next;
    
    int tamanho = 0;
    ListaLigada head = null;
    
    public ListaLigada(){}
    
    private void setElemento(Object elemento){
        this.elemento = elemento;
    }
    
    private void setNext(Object next){
        this.next = next;
    }
    
    public Object getElemento(){
        return elemento;
    }
    
    public Object getNext(){
        return next;
    }
    
    public void insereInicio(String elemento){
        ListaLigada novo = new ListaLigada();
        novo.setElemento(elemento);
        novo.setNext(head);
        head = novo;
        
        tamanho++;
        
    }
    
    @Override
    public String toString(){
        if(tamanho == 0){ // verificar se existe algum elemento na lista
            return "[]";
        }
        /**
         * cria uma nova celula que representa o primeiro elemento da fila
         */
        ListaLigada atual = head;
        
        // cria o StringBuilder para poder armazenar os dados da lista
        StringBuilder builder = new StringBuilder("{ ");
        
        // cria um for para percorrer todos os elementos da lista
        for(int i = 0; i < tamanho; i++){
            // adiciona o elemento atual à variável builder
            builder.append("[");
            builder.append(atual.getElemento());
            builder.append("] -> ");
            
            // faz o autal apontar para o póximo elemento da lista
            atual = (ListaLigada) atual.getNext();
        }
        
        builder.append("}");
        
        return builder.toString();
    }
    
}
