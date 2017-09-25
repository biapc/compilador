/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.util.Stack;
import java.util.Hashtable;
/**
 *
 * @author gabri
 */
public class Smc 
{
    Stack  S;
    Hashtable<Object, Object> M;
    Stack C;
    
    
    
    public void EvalExp (Exp e)
    {
        switch(e.getTipo())
        {
            case ATRIBUICAO:
                EvalExp(e.getFilho_dir());
                M.put(e.getFilho_esq().getValue(), S.pop());
                break;
                
            case VAR:
                S.push(M.get(e.getValue()));
        }
    }
    
    public void EvalCmd (Cmd c){
        
    }
    
    public void Smc(Stack S, Hashtable<Object,Object> M, Stack C){
        
    }
}
