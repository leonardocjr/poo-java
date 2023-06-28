// Nome: Leonardo Canuto Junior - RA: 2453533

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leitura{

	private static Leitura l_Unic;

	private Leitura(){}

	public static Leitura getLeitura(){
		if(l_Unic == null)
			l_Unic = new Leitura();
		return l_Unic;
	}

	public final String entDados(String texto){

		System.out.print(texto);
		String entrada = "";

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(teclado);

		try{
			entrada = buffer.readLine();
		}catch(IOException ioe){
			System.out.println("[SISTEMA] Erro de entrada.");
		}
		return entrada;

	}

}