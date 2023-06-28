//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Selec1 {

	public static void main(String arg[]){
		System.out.println("Digite valor de A: ");
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String aS = "";
		try{
			aS = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		System.out.println("Digite valor de B: ");
		String bS = "";
		try{
			bS = cd.readLine();
		}
		catch(IOException e){
			System.out.println("Erro de entrada");
		}
		int a = Integer.parseInt(aS);
		int b = Integer.parseInt(bS);

		if(a==b){
			System.out.println("A ("+a+") e B("+b+") são iguais.");
		}else if(a>b){
			System.out.println("A ("+a+") é maior que B ("+b+").");
		}else {
			System.out.println("B ("+b+") é maior que A ("+a+").");
		}
	}
}