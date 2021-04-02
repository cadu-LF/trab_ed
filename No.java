package br.com.unifacef.trab_ed;

/**
 *
 * @author Cadu Lourenço
 */
public class No {
    
    private String valor;
    private No next;

    public String getValor() {
        return valor;
    }

    public final void setValor(String valor) {
        this.valor = valor;
    }

    public No getNext() {
        return next;
    }

    public final void setNext(No next) {
        this.next = next;
    }

    public No() {
    }

    public No(String valor) {
        this.setValor(valor);
    }

    @Override
    public String toString() {
        return "No{" + "valor=" + valor + ", next=" + next + '}';
    }
    
}
