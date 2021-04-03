package br.com.unifacef.trab_ed;

/**
 *
 * @author Cadu Lourenço
 */
public class Hash {
    
    private String par;

    ListaLigada tabela[]  = new ListaLigada[25];
    
    public void Hash(){}
    
    public void Hash(String chave, String valor){
        this.setPar(chave, valor);
    }
    
    private void setPar(String chave, String valor){
        this.par = criaChave(chave) + " : " + valor;
    }
    
    public String getPar(){
        return par;
    }
    
    public void put(String chave, String valor){
    
        int posicao = criaChave(chave);
        System.out.println(posicao);
        this.setPar(chave, valor);
        ListaLigada l = new ListaLigada();
        if(tabela[posicao] == null){
            tabela[posicao] = l;
        }
        tabela[posicao].insereElemento(par);
        
    }
    
    public void print(){
        for(Object elemento : tabela){
            System.out.println(elemento);
        }
    }
    
    public int criaChave(String chave){
        int hash = 0;
        
        for(int i = 0; i < chave.length(); i++){
            hash += (int) chave.charAt(i);
        }
        
        return hash % 37;
    }
    
    public void rmElementoPosicao(String elemento, String chave){
        
        int posicao = criaChave(chave);
        System.out.println(posicao);
        System.out.println(tabela[posicao].toString());
        tabela[posicao].rmElemento(elemento, posicao);
        
    }
    
    public int tamanhoTabela(){
        int qtde = 0;
        for(ListaLigada elemento : tabela){
            if(elemento != null){
                qtde += elemento.tamanho;
            }
        }
        
        return qtde;
    }
    
}
