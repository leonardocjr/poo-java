//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExercMatrizes2{
	public static void main(String args[]){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		int LIN=2,COL=2;
		int matriz[][] = new int[LIN][COL];
		String leitura="";
		for(int i=0;i<LIN;i++){
			for(int j=0;j<COL;j++){
				System.out.println("Insira o valor da matriz["+i+"]["+j+"]: ");
				try{
					leitura = cd.readLine();
				}catch(IOException e){
					System.out.println("Erro de entrada.");
				}
				matriz[i][j] = Integer.parseInt(leitura);
				
			}
		}
		for(int i=(LIN-1);i>=0;i--){
			for(int j=(COL-1);j>=0;j--){
				System.out.println("A matriz["+i+"]["+j+"] vale: "+matriz[i][j]);
			}
		}
	}


}