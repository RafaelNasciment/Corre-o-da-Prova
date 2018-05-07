/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasegundo;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class FabricaConta extends FabricaBancoBanco{

    @Override
    public Banco criarBanco(int opcao) {
        Integer.parseInt(JOptionPane.showInputDialog(" Digite \n1 Corrente \n2 Poupança"));
        switch(opcao){
            case 1:
                return new ContaCorrente(1234, "João de Sousa", BigDecimal.valueOf(200,00));
                
            case 2:
                return new ContaPoupanca(2344, "Janir Sousa", BigDecimal.valueOf(300,00));
                default:
                   JOptionPane.showMessageDialog(null, "Opção Invalida");
        }
        return null;
    }
    
        
}
