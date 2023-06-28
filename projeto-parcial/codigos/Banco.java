// Nome: Leonardo Canuto Junior - RA: 2453533

import java.util.List;
import java.util.ArrayList;

public class Banco{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();
	static List<Apartamento> ap;
	static List<Casa> cs;
	static List<Kitnet> kn;
	static List<Pousada> ps;

	private static Banco b_Unic;

	private Banco(){
		ap = new ArrayList<Apartamento>();
		cs = new ArrayList<Casa>();
		kn = new ArrayList<Kitnet>();
		ps = new ArrayList<Pousada>();
	}

	public static Banco getBanco(){
		if(b_Unic == null)
			b_Unic = new Banco();
		return b_Unic;
	}
	
	// ======================== COLECOES DE APARTAMENTO =======================================

	public static final Apartamento cadAp(Apartamento a){
		boolean loop = false;
		a.setId(ap.size());
		System.out.println(msg.ap_titulo_id+"["+a.getId()+"]");
		System.out.println(msg.local_titulo);
		try{
			a.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			ufe.msgUfException();
			a = ufe.corrUfAp(a);
		}
		a.getLocal().getReg().setCidade(l.entDados(msg.cidade));
		a.getLocal().getReg().setBairro(l.entDados(msg.bairro));
		try{
			a.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException ce){
			ce.msgCepException();
			a = ce.corrCepAp(a);
		}

		a.getLocal().setRua(l.entDados(msg.rua));
		do{
			loop = true;
			try{
				a.getLocal().setNumero(Integer.parseInt(l.entDados(msg.numero)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);

		System.out.println("\n"+msg.imv_titulo);
		do{
			loop = true;
			try{
				a.setArea(Integer.parseInt(l.entDados(msg.area)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				a.setQuarto(Integer.parseInt(l.entDados(msg.quarto)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				a.setBanheiro(Integer.parseInt(l.entDados(msg.banheiro)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.mobilia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.setMobilia(cond);
		}while(loop);

		do{
			loop = true;
			try{
				a.setAndar(Integer.parseInt(l.entDados(msg.andar)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.salaFesta);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.setSalaFesta(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.academia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.setAcademia(cond);
		}while(loop);
	
		System.out.println("\n"+msg.contrato_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.ocupado);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.getContrato().setOcupado(cond);
		}while(loop);
		do{
			loop = true;
			try{
				a.getContrato().setImposto(Double.parseDouble(l.entDados(msg.impostos)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgNegativoException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
	
		System.out.println("\n"+msg.corretor_titulo);
		a.getContrato().getCorretor().setNome(l.entDados(msg.nome));
		a.getContrato().getCorretor().setTelefone(l.entDados(msg.telefone));
		a.getContrato().getCorretor().setCelular(l.entDados(msg.celular));
				
		System.out.println("\n"+msg.operacao_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaAluguel);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.getContrato().getAluguel().setHabilitado(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaCompra);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				a.getContrato().getCompra().setHabilitado(cond);
		}while(loop);
		if(a.getContrato().getAluguel().getHabilitado()){
			a.getContrato().getAluguel().setValor(a.contAluguel());
			System.out.println(msg.valorAluguel+String.format("%.2f", a.getContrato().getAluguel().getValor()));
		}
		if(a.getContrato().getCompra().getHabilitado()){
			a.getContrato().getCompra().setValor(a.contCompra());
			System.out.println(msg.valorCompra+String.format("%.2f", a.getContrato().getCompra().getValor()));
		}
		ap.add(a);
		return a;
	}

	public static final Apartamento remAp(Apartamento a){
		if(a != null){
			ap.remove(a);
			return a;	
		}
		return null;
	}

	public static final void exibeAp(Apartamento a){
		System.out.println("\n"+msg.ap_titulo_id+"["+a.getId()+"]");
		System.out.println(msg.titulo_local);
		System.out.println("\t|-> "+a.getLocal().getReg().getCidade()+", "+a.getLocal().getReg().getUf());
		System.out.println(msg.saida_rua+a.getLocal().getRua()+", "+a.getLocal().getNumero());
		System.out.println(msg.saida_bairro+a.getLocal().getReg().getBairro());
		System.out.println(msg.saida_cep+a.getLocal().getReg().getCep());
		System.out.println("\n"+msg.titulo_info);
		System.out.println("\t|-> "+a.getArea()+msg.saida_area);
		System.out.println("\t|-> "+a.getQuarto()+msg.saida_quarto);
		System.out.println("\t|-> "+a.getBanheiro()+msg.saida_banheiro);
		if(a.getMobilia())
			System.out.println(msg.saida_mobilia_1);
		else
			System.out.println(msg.saida_mobilia_2);
	
		System.out.println("\t|-> "+a.getAndar()+msg.saida_andar);
		if(a.getSalaFesta())
			System.out.println(msg.saida_salafesta_1);
		else
			System.out.println(msg.saida_salafesta_2);
		if(a.getAcademia())
			System.out.println(msg.saida_academia_1);
		else
			System.out.println(msg.saida_academia_2);
	}

	public static final void exibeAllAp(){
		for(Apartamento a : ap)
			exibeAp(a);
		
	}

	public static final Apartamento consulIndAp(int id){
		if(ap.size()>id)
 			return ap.get(id);
		return null;
	}

	public static final List<Apartamento> consulNomeAp(Apartamento a){
		List<Apartamento> apTemp = new ArrayList<Apartamento>();
		for(int i = 0; i < ap.size(); i++){
				if(a.getContrato().getCorretor().getNome().equalsIgnoreCase(ap.get(i).getContrato().getCorretor().getNome()))
 					apTemp.add(ap.get(i));
		}
		if(apTemp.size()>0)
			return apTemp;
		return null;
	}

	// ======================== COLECOES DE CASA =======================================

	public static final Casa cadCs(Casa c){
		boolean loop = false;
		c.setId(cs.size());
		System.out.println(msg.cs_titulo_id+"["+c.getId()+"]");
		System.out.println(msg.local_titulo);
		try{
			c.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			ufe.msgUfException();
			c = ufe.corrUfCs(c);
		}
		c.getLocal().getReg().setCidade(l.entDados(msg.cidade));
		c.getLocal().getReg().setBairro(l.entDados(msg.bairro));
		try{
			c.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException ce){
			ce.msgCepException();
			c = ce.corrCepCs(c);
		}
	
		c.getLocal().setRua(l.entDados(msg.rua));
		do{
			loop = true;
			try{
				c.getLocal().setNumero(Integer.parseInt(l.entDados(msg.numero)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);

		System.out.println("\n"+msg.imv_titulo);
		do{
			loop = true;
			try{
				c.setArea(Integer.parseInt(l.entDados(msg.area)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				c.setQuarto(Integer.parseInt(l.entDados(msg.quarto)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				c.setBanheiro(Integer.parseInt(l.entDados(msg.banheiro)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.mobilia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.setMobilia(cond);
		}while(loop);

		try{
			c.setParedes(l.entDados(msg.paredes));
		}catch(ParedesException pde){
			pde.msgParedesException();
			c = pde.corrParedes(c);
		}
		do{
			loop = false;
			String texto = l.entDados(msg.jardim);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.setJardim(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.esquina);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.setEsquina(cond);
		}while(loop);

		System.out.println("\n"+msg.contrato_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.ocupado);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.getContrato().setOcupado(cond);
		}while(loop);
		do{
			loop = true;
			try{
				c.getContrato().setImposto(Double.parseDouble(l.entDados(msg.impostos)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgNegativoException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
	
		System.out.println("\n"+msg.corretor_titulo);
		c.getContrato().getCorretor().setNome(l.entDados(msg.nome));
		c.getContrato().getCorretor().setTelefone(l.entDados(msg.telefone));
		c.getContrato().getCorretor().setCelular(l.entDados(msg.celular));
				
		System.out.println("\n"+msg.operacao_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaAluguel);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.getContrato().getAluguel().setHabilitado(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaCompra);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				c.getContrato().getCompra().setHabilitado(cond);
		}while(loop);
		if(c.getContrato().getAluguel().getHabilitado()){
			c.getContrato().getAluguel().setValor(c.contAluguel());
			System.out.println(msg.valorAluguel+String.format("%.2f", c.getContrato().getAluguel().getValor()));
		}
		if(c.getContrato().getCompra().getHabilitado()){
			c.getContrato().getCompra().setValor(c.contCompra());
			System.out.println(msg.valorCompra+String.format("%.2f", c.getContrato().getCompra().getValor()));
		}
		cs.add(c);
		return c;
	}

	public static final Casa remCs(Casa c){
		if(c != null){
			cs.remove(c);
			return c;	
		}
		return null;
	}

	public static final void exibeCs(Casa c){
		System.out.println("\n"+msg.cs_titulo_id+"["+c.getId()+"]");
		System.out.println(msg.titulo_local);
		System.out.println("\t|-> "+c.getLocal().getReg().getCidade()+", "+c.getLocal().getReg().getUf());
		System.out.println(msg.saida_rua+c.getLocal().getRua()+", "+c.getLocal().getNumero());
		System.out.println(msg.saida_bairro+c.getLocal().getReg().getBairro());
		System.out.println(msg.saida_cep+c.getLocal().getReg().getCep());
		System.out.println("\n"+msg.titulo_info);
		System.out.println("\t|-> "+c.getArea()+msg.saida_area);
		System.out.println("\t|-> "+c.getQuarto()+msg.saida_quarto);
		System.out.println("\t|-> "+c.getBanheiro()+msg.saida_banheiro);
		if(c.getMobilia())
			System.out.println(msg.saida_mobilia_1);
		else
			System.out.println(msg.saida_mobilia_2);
	
		System.out.println(msg.saida_paredes+c.getParedes());
		if(c.getJardim())
		System.out.println(msg.saida_jardim_1);
		else
			System.out.println(msg.saida_jardim_2);
		if(c.getEsquina())
			System.out.println(msg.saida_esquina);
	}

	public static final void exibeAllCs(){
		for(Casa c : cs)
			exibeCs(c);
		
	}

	public static final Casa consulIndCs(int id){
		if(cs.size()>id)
 			return cs.get(id);
		return null;
	}

	public static final List<Casa> consulNomeCs(Casa c){
		List<Casa> csTemp = new ArrayList<Casa>();
		for(int i = 0; i < cs.size(); i++){
				if(c.getContrato().getCorretor().getNome().equalsIgnoreCase(cs.get(i).getContrato().getCorretor().getNome()))
 					csTemp.add(cs.get(i));
		}
		if(csTemp.size()>0)
			return csTemp;
		return null;
	}

	// ======================== COLECOES DE KITNET =======================================

	public static final Kitnet cadKn(Kitnet k){
		boolean loop = false;
		k.setId(kn.size());
		System.out.println(msg.kn_titulo_id+"["+k.getId()+"]");
		System.out.println(msg.local_titulo);
		try{
			k.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			ufe.msgUfException();
			k = ufe.corrUfKn(k);
		}
		k.getLocal().getReg().setCidade(l.entDados(msg.cidade));
		k.getLocal().getReg().setBairro(l.entDados(msg.bairro));
		try{
			k.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException ce){
			ce.msgCepException();
			k = ce.corrCepKn(k);
		}

		k.getLocal().setRua(l.entDados(msg.rua));
		do{
			loop = true;
			try{
				k.getLocal().setNumero(Integer.parseInt(l.entDados(msg.numero)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);

		System.out.println("\n"+msg.imv_titulo);
		do{
			loop = true;
			try{
				k.setArea(Integer.parseInt(l.entDados(msg.area)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				k.setQuarto(Integer.parseInt(l.entDados(msg.quarto)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				k.setBanheiro(Integer.parseInt(l.entDados(msg.banheiro)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.mobilia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				k.setMobilia(cond);
		}while(loop);

		do{
			loop = false;
			String texto = l.entDados(msg.compartilhada);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				k.setCompartilhada(cond);
		}while(loop);
		if(k.getCompartilhada()){
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
					mge.msgMoradoresGrdException();
					k = mge.corrMoradoresGrd(k);
					break;
				}catch(NumberFormatException nfe){
					System.out.println(msg.exnumerformat+"\n");
				}
			}while(loop);
		}
		System.out.println("\n"+msg.contrato_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.ocupado);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				k.getContrato().setOcupado(cond);
		}while(loop);
		do{
			loop = true;
			try{
				k.getContrato().setImposto(Double.parseDouble(l.entDados(msg.impostos)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgNegativoException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
	
		System.out.println("\n"+msg.corretor_titulo);
		k.getContrato().getCorretor().setNome(l.entDados(msg.nome));
		k.getContrato().getCorretor().setTelefone(l.entDados(msg.telefone));
		k.getContrato().getCorretor().setCelular(l.entDados(msg.celular));
				
		System.out.println("\n"+msg.operacao_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaAluguel);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				k.getContrato().getAluguel().setHabilitado(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaCompra);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				k.getContrato().getCompra().setHabilitado(cond);
		}while(loop);
		if(k.getContrato().getAluguel().getHabilitado()){
			k.getContrato().getAluguel().setValor(k.contAluguel());
			System.out.println(msg.valorAluguel+String.format("%.2f", k.getContrato().getAluguel().getValor()));
		}
 		if(k.getContrato().getCompra().getHabilitado()){
			k.getContrato().getCompra().setValor(k.contCompra());
			System.out.println(msg.valorCompra+String.format("%.2f", k.getContrato().getCompra().getValor()));
		}
		kn.add(k);
		return k;
	}

	public static final Kitnet remKn(Kitnet k){
		if(k != null){
			kn.remove(k);
			return k;	
		}
		return null;
	}

	public static final void exibeKn(Kitnet k){
		System.out.println("\n"+msg.kn_titulo_id+"["+k.getId()+"]");
		System.out.println(msg.titulo_local);
		System.out.println("\t|-> "+k.getLocal().getReg().getCidade()+", "+k.getLocal().getReg().getUf());
		System.out.println(msg.saida_rua+k.getLocal().getRua()+", "+k.getLocal().getNumero());
		System.out.println(msg.saida_bairro+k.getLocal().getReg().getBairro());
		System.out.println(msg.saida_cep+k.getLocal().getReg().getCep());
		System.out.println("\n"+msg.titulo_info);
		System.out.println("\t|-> "+k.getArea()+msg.saida_area);
		System.out.println("\t|-> "+k.getQuarto()+msg.saida_quarto);
		System.out.println("\t|-> "+k.getBanheiro()+msg.saida_banheiro);
		if(k.getMobilia())
			System.out.println(msg.saida_mobilia_1);
		else
			System.out.println(msg.saida_mobilia_2);
	
		if(k.getCompartilhada()){
			System.out.println(msg.saida_compartilhada_2);
			System.out.println(k.getMoradores()+msg.saida_moradores);
		}else{
			System.out.println(msg.saida_compartilhada_1);
		}
	}

	public static final void exibeAllKn(){
		for(Kitnet k : kn)
			exibeKn(k);
	}

	public static final Kitnet consulIndKn(int id){
		if(kn.size()>id)
 			return kn.get(id);
		return null;
	}

	public static final List<Kitnet> consulNomeKn(Kitnet k){
		List<Kitnet> knTemp = new ArrayList<Kitnet>();
		for(int i = 0; i < kn.size(); i++){
				if(k.getContrato().getCorretor().getNome().equalsIgnoreCase(kn.get(i).getContrato().getCorretor().getNome()))
 					knTemp.add(kn.get(i));
		}
		if(knTemp.size()>0)
			return knTemp;
		return null;
	}

	// ======================== COLECOES DE POUSADA =======================================

	public static final Pousada cadPs(Pousada p){
		boolean loop = false;
		p.setId(ps.size());
		System.out.println(msg.ps_titulo_id+"["+p.getId()+"]");
		System.out.println(msg.local_titulo);
		try{
			p.getLocal().getReg().setUf(l.entDados(msg.uf));
		}catch(UfException ufe){
			ufe.msgUfException();
			p = ufe.corrUfPs(p);
		}
		p.getLocal().getReg().setCidade(l.entDados(msg.cidade));
		p.getLocal().getReg().setBairro(l.entDados(msg.bairro));
		try{
			p.getLocal().getReg().setCep(l.entDados(msg.cep));
		}catch(CepException ce){
			ce.msgCepException();
			p = ce.corrCepPs(p);
		}
	
		p.getLocal().setRua(l.entDados(msg.rua));
		do{
			loop = true;
			try{
				p.getLocal().setNumero(Integer.parseInt(l.entDados(msg.numero)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);

		System.out.println("\n"+msg.imv_titulo);
		do{
			loop = true;
			try{
				p.setArea(Integer.parseInt(l.entDados(msg.area)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				p.setQuarto(Integer.parseInt(l.entDados(msg.quarto)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = true;
			try{
				p.setBanheiro(Integer.parseInt(l.entDados(msg.banheiro)));
				loop = false;
			}catch(NegativoException nge){
				nge.msgZeroException();
			}catch(NumberFormatException nfe){
				System.out.println(msg.exnumerformat+"\n");
			}
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.mobilia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.setMobilia(cond);
		}while(loop);

		try{
			p.setLazer(l.entDados(msg.lazer));
		}catch(LazerException lze){
			lze.msgLazerException();
			p = lze.corrLazer(p);
		}
		p.setHoraCheckin(l.entDados(msg.horaCheckin));
		do{
			loop = false;
			String texto = l.entDados(msg.cafeM);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getRef().setCafeM(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.almoco);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getRef().setAlmoco(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.cafeT);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getRef().setCafeT(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.janta);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getRef().setJanta(cond);
		}while(loop);
		do{
			loop = false;
			String texto = l.entDados(msg.ceia);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getRef().setCeia(cond);
		}while(loop);
		p.getRef().setQtdRef(p.getRef().calcRef());
		System.out.println(msg.qtdRef+p.getRef().getQtdRef());
	
		System.out.println("\n"+msg.contrato_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.ocupado);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getContrato().setOcupado(cond);
		}while(loop);
		/* p.getContrato().setImposto(Double.parseDouble(l.entDados(msg.impostos))); -> no modelo de negocio pousada nao tem impostos */
	
		System.out.println("\n"+msg.corretor_titulo);
		p.getContrato().getCorretor().setNome(l.entDados(msg.nome));
		p.getContrato().getCorretor().setTelefone(l.entDados(msg.telefone));
		p.getContrato().getCorretor().setCelular(l.entDados(msg.celular));
				
		System.out.println("\n"+msg.operacao_titulo);
		do{
			loop = false;
			String texto = l.entDados(msg.habilitaAluguel);
			boolean cond = false;
			if(texto.startsWith("s") || texto.startsWith("S"))
				cond = true;
			else if(texto.startsWith("n") || texto.startsWith("n"))
				cond = false;
			else{
				loop = true;
				System.out.println(msg.exboolean+"\n");
			}
			if(!loop)
				p.getContrato().getAluguel().setHabilitado(cond);
		}while(loop);
/*		p.getContrato().getCompra().setHabilitado(Boolean.parseBoolean(l.entDados(msg.habilitaCompra))); -> O MODELO DE NEGOCIO DE POUSADA NAO HABILITA COMPRA. */
		if(p.getContrato().getAluguel().getHabilitado()){
			p.getContrato().getAluguel().setValor(p.contAluguel());
			System.out.println(msg.valorAluguelPs+String.format("%.2f", p.getContrato().getAluguel().getValor()));
		}
		if(p.getContrato().getCompra().getHabilitado()){
			p.getContrato().getCompra().setValor(p.contCompra());
			System.out.println(msg.valorCompra+String.format("%.2f", p.getContrato().getCompra().getValor()));
		}
		ps.add(p);
		return p;
	}

	public static final Pousada remPs(Pousada p){
		if(p != null){
			ps.remove(p);
			return p;	
		}
		return null;
	}

	public static final void exibePs(Pousada p){
		System.out.println("\n"+msg.ps_titulo_id+"["+p.getId()+"]");
		System.out.println(msg.titulo_local);
		System.out.println("\t|-> "+p.getLocal().getReg().getCidade()+", "+p.getLocal().getReg().getUf());
		System.out.println(msg.saida_rua+p.getLocal().getRua()+", "+p.getLocal().getNumero());
		System.out.println(msg.saida_bairro+p.getLocal().getReg().getBairro());
		System.out.println(msg.saida_cep+p.getLocal().getReg().getCep());
		System.out.println("\n"+msg.titulo_info);
		System.out.println("\t|-> "+p.getArea()+msg.saida_area);
		System.out.println("\t|-> "+p.getQuarto()+msg.saida_quarto);
		System.out.println("\t|-> "+p.getBanheiro()+msg.saida_banheiro);
		if(p.getMobilia())
			System.out.println(msg.saida_mobilia_1);
		else
			System.out.println(msg.saida_mobilia_2);
	
		System.out.println(msg.saida_lazer+p.getLazer());
		System.out.println(msg.saida_checkin+p.getHoraCheckin());
		if(p.getRef().getQtdRef()>0){
			System.out.println("\t|-> "+p.getRef().getQtdRef()+msg.saida_qtdref_1);
		}else{
			System.out.println(msg.saida_qtdref_2);
		}
	}

	public static final void exibeAllPs(){
		for(Pousada p : ps)
			exibePs(p);
		
	}

	public static final Pousada consulIndPs(int id){
		if(ps.size()>id)
 			return ps.get(id);
		return null;
	}

	public static final List<Pousada> consulNomePs(Pousada p){
		List<Pousada> psTemp = new ArrayList<Pousada>();
		for(int i = 0; i < ps.size(); i++){
				if(p.getContrato().getCorretor().getNome().equalsIgnoreCase(ps.get(i).getContrato().getCorretor().getNome()))
 					psTemp.add(ps.get(i));
		}
		if(psTemp.size()>0)
			return psTemp;
		return null;
	}

}