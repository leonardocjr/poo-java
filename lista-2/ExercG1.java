//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class ExercG1{
	public static void main(String args[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		int vet[] = new int[2];;
		String leitura = "";
		System.out.println("\t1. Digite o valor A: ");
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		vet[0] = Integer.parseInt(leitura);
		System.out.println("\t2. Digite o valor B: ");
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		vet[1] = Integer.parseInt(leitura);
		System.out.println("\t\nMenu de Opções:\n\t\t1 - Somar (A+B)\n\t\t2 - Multiplicar (A*B)\n\t\t3 - Subtrair (A-B)\n\t\t4 - Dividir (A/B)\n\tEscolha uma opção: ");
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		int escolha = Integer.parseInt(leitura);
		switch(escolha){
			case 1:
				System.out.println("A soma de A+B é: "+(vet[0]+vet[1]));
			break;

			case 2:
				System.out.println("A multiplicação de A*B é: "+(vet[0]*vet[1]));
			break;

			case 3:
				System.out.println("A subtração de A-B é: "+(vet[0]-vet[1]));
			break;

			case 4:
				System.out.println("A divisão de A/B é: "+(vet[0]/vet[1]));
			break;
			default:
				System.out.println("Opção inválida.");
			break;
		}
	}
}