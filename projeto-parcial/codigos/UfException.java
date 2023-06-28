// Nome: Leonardo Canuto Junior - RA: 2453533

public class UfException extends Exception{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();

	public void msgUfException(){
		System.out.println("\t[ALERTA] SIGLA UF INVALIDA. (DIGITE UMA SIGLA EXISTENTE)\n\t|-> Tente novamente.\n");
	}

	public Apartamento corrUfAp(Apartamento a){
		try{
			a.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			msgUfException();
			a = corrUfAp(a);
		}
		return a;
	}

	public Casa corrUfCs(Casa c){
		try{
			c.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			msgUfException();
			c = corrUfCs(c);
		}
		return c;
	}

	public Kitnet corrUfKn(Kitnet k){
		try{
			k.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			msgUfException();
			k = corrUfKn(k);
		}
		return k;
	}

	public Pousada corrUfPs(Pousada p){
		try{
			p.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			msgUfException();
			p = corrUfPs(p);
		}
		return p;
	}

}