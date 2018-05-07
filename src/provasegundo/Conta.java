/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasegundo;

import java.math.BigDecimal;

/**
 *
 * @author angel
 */
public abstract class Conta extends Banco{
    
    public Conta(int codigo, String titular, BigDecimal valor) {
        super(codigo, titular, valor);
    }
    public abstract void mostrarDetalhes();
}
