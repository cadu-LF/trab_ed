package br.com.unifacef.trab.ed;

/**
 *
 * @author Cadu Lourenço
 */
public class Teste {

    public static void main(String[] args) {
        /*
        String nome = "dp";
        
        char a = 'p';
        
        System.out.println(nome);
        
        int x = (int) nome.charAt(0);
        System.out.println(x);
        
        int soma = x;
        
        x = (int) nome.charAt(1);
        System.out.println(x);
        
        soma += x;
        System.out.println(soma);
        */
        
        Hash h = new Hash();
        h.put("astolfo", "astolfo");
        h.put("cadu", "cadu");
        h.put("Carlos", "Carlos");
        h.print();
        
    }
    
}
