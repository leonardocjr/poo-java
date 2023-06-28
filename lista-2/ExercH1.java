//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercH1 {
	public static void main(String args[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura = "";
		System.out.println("Digite um valor inteiro: ");
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		int x = Integer.parseInt(leitura);
		String resp = (x%2)==0?"par":"ímpar";
		System.out.println("O valor digitado é "+resp+".");
	}

}