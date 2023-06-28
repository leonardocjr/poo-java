public class Mat1{
	public static void main(String args[]){
		int lin=5, col=5, cont=1;
		int matriz[][] = new int[lin][col];
		System.out.println(matriz.length);
		for(int i=0;i<lin;i++){
			for(int j=0;j<col;j++){
				matriz[i][j]=cont++;
			}
		}
		for(int i=0;i<lin;i++){
			for(int j=0;j<col;j++){
				System.out.println("Valor da linha "+i+" e coluna "+j+" é: "+matriz[i][j]);
			}
		}
	}

}