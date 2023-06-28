// Nome: Leonardo Canuto Junior - RA: 2453533

public class MoradoresGrdException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();
	private boolean loop = false;

	public void msgMoradoresGrdException(){
		System.out.println("\t[ALERTA] NUMERO DE MORADORES INVALIDO. (DIGITE UM NUMERO MENOR OU IGUAL A 3)\n\t|-> Tente novamente.\n");
	}

	public Kitnet corrMoradoresGrd(Kitnet k){
		do{
			loop = true;
			try{
				k.setMoradores(Integer.parseInt(l.entDados(msg.moradores)));
				loop = false;
			}catch(MoradoresPeqException mpe){
				mpe.msgMoradoresPeqException();
				k = mpe.corrMoradoresPeq(k);
				break;
			}catch(MoradoresGrdException mge){
				msgMoradoresGrdException();
				k = corrMoradoresGrd(k);
				break;
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		return k;
	}

}