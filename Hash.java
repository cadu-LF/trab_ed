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
        this.setPar(chave, valor);
        ListaLigada l = new ListaLigada();
        l.insereInicio(par);
        if(tabela[posicao] == null){
            tabela[posicao] = l;
        }
        tabela[posicao].insereInicio(par);
        
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
    
}
