// Nome: Leonardo Canuto Junior - RA: 2453533

public class MoradoresPeqException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();
	private boolean loop = false;

	public void msgMoradoresPeqException(){
		System.out.println("\t[ALERTA] NUMERO DE MORADORES INVALIDO. (DIGITE UM NUMERO MAIOR QUE 0)\n\t|-> Tente novamente.\n");
	}

	public Kitnet corrMoradoresPeq(Kitnet k){
		do{
			loop = true;
			try{
				k.setMoradores(Integer.parseInt(l.entDados(msg.moradores)));
				loop = false;
			}catch(MoradoresGrdException mge){
				mge.msgMoradoresGrdException();
				k = mge.corrMoradoresGrd(k);
				break;
			}catch(MoradoresPeqException mpe){
				msgMoradoresPeqException();
				k = corrMoradoresPeq(k);
				break;
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		return k;
	}

}