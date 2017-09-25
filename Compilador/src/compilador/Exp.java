package compilador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Exp {
    public enum Tipo {
       ATRIBUICAO, MULTIPLICACAO, ADICAO, SUBTRACAO, VAR;
    } 
    
    private Tipo tipo;
    private Exp filho_esq;
    private Exp filho_dir;
    private String value;

    public Exp getFilho_esq() {
        return filho_esq;
    }

    public Exp getFilho_dir() {
        return filho_dir;
    }

    public String getValue() {
        return value;
    }

    
    
    public Exp(){
        
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
