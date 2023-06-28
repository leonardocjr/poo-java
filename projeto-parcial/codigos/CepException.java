// Nome: Leonardo Canuto Junior - RA: 2453533

public class CepException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();

	public void msgCepException(){
		System.out.println("\t[ALERTA] CEP INVALIDO. (PRECISA CONTER DE 8 A 10 DIGITOS)\n\t|-> Tente novamente.\n");
	}

	public Apartamento corrCepAp(Apartamento a){
		try{
			a.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException cpe){
			msgCepException();
			a = corrCepAp(a);
		}
		return a;
	}

	public Casa corrCepCs(Casa c){
		try{
			c.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException cpe){
			msgCepException();
			c = corrCepCs(c);
		}
		return c;
	}

	public Kitnet corrCepKn(Kitnet k){
		try{
			k.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException cpe){
			msgCepException();
			k = corrCepKn(k);
		}
		return k;
	}

	public Pousada corrCepPs(Pousada p){
		try{
			p.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException cpe){
			msgCepException();
			p = corrCepPs(p);
		}
		return p;
	}

}