// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class ZeroNegException extends Exception{

	public void msgZeroException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"DIGITE UM NUMERO MAIOR QUE 0.\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
	}
	public void msgNegativoException(String caixa){
            JOptionPane.showMessageDialog(
                    null,
                    "Em: '"+caixa+"'\n"+"DIGITE UM NUMERO MAIOR OU IGUAL A 0.\n\nTente novamente.\n",
                    "Alerta em "+caixa,
                    2
            );
	}
}