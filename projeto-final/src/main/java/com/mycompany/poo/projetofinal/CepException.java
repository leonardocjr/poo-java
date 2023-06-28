// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class CepException extends Exception{

    public void msgCepException(String caixa){
        JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"CEP INVALIDO. (PRECISA CONTER DE 8 A 10 DIGITOS INTEIROS)\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
        );
    }
}