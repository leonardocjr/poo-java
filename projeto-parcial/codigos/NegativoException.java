// Nome: Leonardo Canuto Junior - RA: 2453533

public class NegativoException extends Exception{

	public void msgZeroException(){
		System.out.println("\t[ALERTA] DIGITE NUMEROS MAIORES QUE 0.\n\t|-> Tente novamente.\n");
	}

	public void msgNegativoException(){
		System.out.println("\t[ALERTA] DIGITE NUMEROS MAIORES OU IGUAL A 0.\n\t|-> Tente novamente.\n");
	}

}