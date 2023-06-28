//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class ExercStrings{
	public static void main(String args[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		int cont=0;
		System.out.println("Digite uma frase: ");
		String frase="";
		try{
			frase = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		System.out.println("\nEscolha uma letra: ");
		String leitura="";
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		System.out.println("");
		char letra=leitura.charAt(0);
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)==letra){
				System.out.println("A letra '"+letra+"' aparece na posição ["+i+"].");
				cont++;
			}
		}
		if(cont>0){
			System.out.println("\n-> A letra aparece "+cont+" vezes.");
		}else{
			System.out.println("-> Não tem essa letra na frase.");
		}
	}

}