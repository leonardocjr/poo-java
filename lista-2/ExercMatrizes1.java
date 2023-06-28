//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercMatrizes1{
	public static void main(String args[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);	
		int TAM = 5;
		int vet[] = new int[TAM];
		String leitura="";
		for(int i=0;i<TAM;i++){
			System.out.println("Digite o vet["+i+"]: ");
			try{
				leitura = cd.readLine();
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			vet[i]=Integer.parseInt(leitura);
		}
		for(int i=(TAM-1);i>=0;i--){
			System.out.println("vet["+i+"]: "+vet[i]);
		}
	}

}