/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasegundo;

import javax.swing.JOptionPane;


/**
 *
 * @author angel
 */
public class ProvaSegundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dimensoes = Integer.parseInt(JOptionPane.showInputDialog("O que vc deseja fazer\n1-Conta \n2-INVESTIMENTO"));
        
        FabricaBancoBanco fabrica = FabricaBancoBanco.criarFactory(dimensoes);
        Banco banco = fabrica.criarBanco(dimensoes);
        banco.mostrarDetalhes();
        
    }
    
}
