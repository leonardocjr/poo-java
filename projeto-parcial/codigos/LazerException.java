// Nome: Leonardo Canuto Junior - RA: 2453533

public class LazerException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();

	public void msgLazerException(){
		System.out.println("\t[ALERTA] LAZER INVALIDO. (DIGITE UM DOS LAZERES DISPONIVEIS)\n\t|-> Tente novamente.\n");
	}

	public Pousada corrLazer(Pousada p){
		try{
			p.setLazer(l.entDados(msg.lazer));
		}catch(LazerException lze){
			msgLazerException();
			p = corrLazer(p);
		}
		return p;
	}

}