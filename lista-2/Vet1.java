//Nome: Leonardo Canuto Junior -  RA: 2453533
public class Vet1{
	public static void main(String args[]){
		int larg=30;
		int vet[] = new int[larg];
		System.out.println("O tamanho do vetor é: "+vet.length);
		int cont=0;
		for(int i=0;i<vet.length;i++){
			cont=cont+2;
			vet[i]=cont;
		}
		for(int i=0;i<vet.length;i++){
			System.out.println("Vetor no local "+(i+1)+" tem valor "+vet[i]);
		}
	}
}