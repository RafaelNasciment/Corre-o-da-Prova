/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasegundo;

import java.math.BigDecimal;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Titulos extends Investimento{

    public Titulos(int codigo, String titular, BigDecimal valor) {
        super(codigo, titular, valor);
    }

    @Override
    public void mostrarDetalhes() {
         NumberFormat nf = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null, "Titulos!\n Codigo: "
                                  + super.getCodigo()+ "Titular"
                                  + super.getTitular()+ "\n Valor: " 
                                  +nf.format(super.getValor()));
    }
    
}
