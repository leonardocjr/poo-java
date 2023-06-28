// Nome: Leonardo Canuto Junior - RA: 2453533

public class ParedesException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();

	public void msgParedesException(){
		System.out.println("\t[ALERTA] ESTRUTURA INVALIDA. (DIGITE UMA DAS ESTRUTURAS DISPONIVEIS)\n\t|-> Tente novamente.\n");
	}

	public Casa corrParedes(Casa c){
		try{
			c.setParedes(l.entDados(msg.paredes));
		}catch(ParedesException pde){
			msgParedesException();
			c = corrParedes(c);
		}
		return c;
	}

}