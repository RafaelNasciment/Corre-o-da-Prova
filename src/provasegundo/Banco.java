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
public abstract class Banco {
    private int codigo;
    private String titular;
    private BigDecimal valor;

    public Banco(int codigo, String titular, BigDecimal valor) {
        this.codigo = codigo;
        this.titular = titular;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    
    public abstract void mostrarDetalhes();
}
