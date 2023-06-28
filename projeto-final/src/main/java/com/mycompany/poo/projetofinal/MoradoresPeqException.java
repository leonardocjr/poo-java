// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class MoradoresPeqException extends Exception{

	public void msgMoradoresPeqException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"NUMERO DE MORADORES INVALIDO. (DIGITE UM NUMERO MAIOR QUE 0)\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
	}
}