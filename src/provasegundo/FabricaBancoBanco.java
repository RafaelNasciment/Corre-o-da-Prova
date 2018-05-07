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
public abstract class FabricaBancoBanco {
    public abstract Banco criarBanco(int opcao);
    
    public static FabricaBancoBanco criarFactory(int opcao) {
        if(opcao == 1){
            return new FabricaConta();
        }else if(opcao == 2){
            return new FabricaInvestimento();
        }else{
            JOptionPane.showMessageDialog(null, "Opção Invalida");
        }
        return null;
    }
}
