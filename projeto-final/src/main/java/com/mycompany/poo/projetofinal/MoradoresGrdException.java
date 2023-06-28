// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class MoradoresGrdException extends Exception{

	public void msgMoradoresGrdException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"NUMERO DE MORADORES INVALIDO. (DIGITE UM NUMERO MENOR OU IGUAL A 3)\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
	}
}