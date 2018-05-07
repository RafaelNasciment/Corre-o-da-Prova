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
public class FabricaInvestimento extends FabricaBancoBanco{

    @Override
    public Banco criarBanco(int opcao) {
        Integer.parseInt(JOptionPane.showInputDialog(" Digite \n1CBO \n2Titulos \n3Acões"));
        switch(opcao){
            case 1:
                return new CBO(01234, "Felipe de Sousa", BigDecimal.valueOf(20000,00));
            case 2:
                return new Titulos(23404, "Jurandi Sousa", BigDecimal.valueOf(400,00));
            case 3:
                return new Acoes(823404, "Anttonio Sousa", BigDecimal.valueOf(300,00));
                default:
                   JOptionPane.showMessageDialog(null, "Opção Invalida");
    }
        return null;
    
   }
}
