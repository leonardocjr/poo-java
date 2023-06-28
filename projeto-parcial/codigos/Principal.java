//Nome: Leonardo Canuto Junior - RA: 2453533

import java.util.List;
import java.util.ArrayList;

public class Principal{

	static Leitura l = Leitura.getLeitura();
	static Mensagens msg = Mensagens.getMensagens();
	static Banco BD = Banco.getBanco();

	public static void main(String args[]){

		int id = 0;
		boolean loop = true;
		do{
			switch(menu()){
				case 'x':
					System.out.println("\n"+msg.menu_saida);
					System.out.println("\n"+msg.separador);
					loop = false;
					break;

				case '1':
					cadastrar();
					break;

				case '2':
					remover();
					break;

				case '3':
					buscar(); 
					break;

				case '4':
					listar();
					break;

				case '5':
					parcelar();
					break;
					
				case '6':
					gerar_comissao();
					break;
				
				default:
					System.out.println(msg.opc_invalida);
					break;	
			}
		}while(loop);
		
	}

	public static char menu(){
		boolean loop = true;
		String texto = "";
		char opc = ' ';
		System.out.println("\n"+msg.separador+"\n"
			+msg.sistema+"\n"
			+msg.menu + "\n"+"\n"
			+msg.menu_escopo + "\n"
		);
		do{
			texto = l.entDados(msg.ent_opc);
			if(texto.isEmpty())
				System.out.println(msg.exinservazia+"\n");
			else
				loop = false;
		}while(loop);
		opc = texto.charAt(0);
		if(Character.isLetter(opc))
			opc = Character.toLowerCase(opc);
		return opc;
	}

	public static char filtro(String tipo, String titulo){
		boolean loop = true;
		String texto = "";
		char opc = ' ';
		System.out.println("\n"+msg.separador+"\n"
			+titulo + "\n"
		);
		if(tipo.equalsIgnoreCase("GERAL"))
			System.out.println(msg.filtro_geral + "\n");
		else if(tipo.equalsIgnoreCase("LISTAR"))
			System.out.println(msg.filtro_listar + "\n");
		else if(tipo.equalsIgnoreCase("SIMULAR"))
			System.out.println(msg.filtro_simular + "\n");
		else if(tipo.equalsIgnoreCase("BUSCAR"))
			System.out.println(msg.filtro_buscar + "\n");
		else
		System.out.println(msg.filtro_invalido);
		do{
			texto = l.entDados(msg.ent_opc);
			if(texto.isEmpty())
				System.out.println(msg.exinservazia+"\n");
			else
				loop = false;
		}while(loop);
		opc = texto.charAt(0);
		if(Character.isLetter(opc))
			opc = Character.toLowerCase(opc);
		return opc;
	}

	public static void cadastrar(){
		boolean loop = false;
		boolean loop2 = false;
		do{
			loop = false;
			loop2 = false;
			switch(filtro("geral", msg.filtro_cad)){
				case 'a':
					System.out.println("\n" + msg.separador);
					System.out.println(msg.menu_cad_ap + "\n");
					do{
						Apartamento a = new Apartamento();
						BD.cadAp(a);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_cad);
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
								loop2 = cond;
						}while(loop);
					}while(loop2);
					break;
	
				case 'b':
					System.out.println("\n" + msg.separador);
					System.out.println(msg.menu_cad_cs + "\n");
					do{
						Casa c = new Casa();
						BD.cadCs(c);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_cad);
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
								loop2 = cond;
						}while(loop);
					}while(loop2);
					break;
	
				case 'c':
					System.out.println("\n" + msg.separador);
					System.out.println(msg.menu_cad_kn + "\n");
					do{
						Kitnet k = new Kitnet();
						BD.cadKn(k);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_cad);
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
								loop2 = cond;
						}while(loop);
					}while(loop2);
					break;
		
				case 'd':
					System.out.println("\n" + msg.separador);
					System.out.println(msg.menu_cad_ps + "\n");
					do{
						Pousada p = new Pousada();
						BD.cadPs(p);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_cad);
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
								loop2 = cond;
						}while(loop);
					}while(loop2);
					break;

				case 'x':
					System.out.println(msg.filtro_saida);
					break;

				default:
					System.out.println(msg.opc_invalida);
					loop=true;
					break;
			}
			System.out.println("\n" + msg.separador);
		}while(loop);
	}

	public static void remover(){
		int id = 0;
		boolean loop = true;
		boolean loop2 = false;
		do{
			loop = true;
			loop2 = false;
			switch(filtro("geral", msg.filtro_rem)){
				case 'a':
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_ap));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					Apartamento a = new Apartamento();
					a = BD.consulIndAp(id);
					if(a != null){
						BD.exibeAp(a);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_rem);
							boolean cond = false;
							if(texto.startsWith("s") || texto.startsWith("S"))
								cond = true;
							else if(texto.startsWith("n") || texto.startsWith("n"))
								cond = false;
							else{
								loop = true;
							System.out.println(msg.exboolean);
							}
							if(!loop)
								loop2 = cond;
						}while(loop);
						if(loop2){
							a = BD.remAp(a);
							System.out.println("\n"+msg.removido_info+a.getContrato().getCorretor().getNome()+"\n"
							+msg.removido_sucesso);
						}else
							System.out.println("\n"+msg.removido_cancelado);
						loop = false;
					}else{
						System.out.println(msg.id_invalido);
					}
					break;
	
				case 'b':
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_cs));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					Casa c = new Casa();
					c = BD.consulIndCs(id);
					if(c != null){
						BD.exibeCs(c);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_rem);
							boolean cond = false;
							if(texto.startsWith("s") || texto.startsWith("S"))
								cond = true;
							else if(texto.startsWith("n") || texto.startsWith("n"))
								cond = false;
							else{
								loop = true;
							System.out.println(msg.exboolean);
							}
							if(!loop)
								loop2 = cond;
						}while(loop);
						if(loop2){
							c = BD.remCs(c);
							System.out.println("\n"+msg.removido_info+c.getContrato().getCorretor().getNome()+"\n"
							+msg.removido_sucesso);
						}else
							System.out.println("\n"+msg.removido_cancelado);
						loop = false;
					}else{
						System.out.println(msg.id_invalido);
					}
				break;
	
				case 'c':
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_kn));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					Kitnet k = new Kitnet();
					k = BD.consulIndKn(id);
					if(k != null){
						BD.exibeKn(k);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_rem);
							boolean cond = false;
							if(texto.startsWith("s") || texto.startsWith("S"))
								cond = true;
							else if(texto.startsWith("n") || texto.startsWith("n"))
								cond = false;
							else{
								loop = true;
							System.out.println(msg.exboolean);
							}
							if(!loop)
								loop2 = cond;
						}while(loop);
						if(loop2){
							k = BD.remKn(k);
							System.out.println("\n"+msg.removido_info+k.getContrato().getCorretor().getNome()+"\n"
							+msg.removido_sucesso);
						}else
							System.out.println("\n"+msg.removido_cancelado);
						loop = false;
					}else{
						System.out.println(msg.id_invalido);
					}
				break;
		
				case 'd':
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_ps));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					Pousada p = new Pousada();
					p = BD.consulIndPs(id);
					if(p != null){
						BD.exibePs(p);
						do{
							loop = false;
							String texto = l.entDados("\n"+msg.ent_confirm_rem);
							boolean cond = false;
							if(texto.startsWith("s") || texto.startsWith("S"))
								cond = true;
							else if(texto.startsWith("n") || texto.startsWith("n"))
								cond = false;
							else{
								loop = true;
							System.out.println(msg.exboolean);
							}
							if(!loop)
								loop2 = cond;
						}while(loop);
						if(loop2){
							p = BD.remPs(p);
							System.out.println("\n"+msg.removido_info+p.getContrato().getCorretor().getNome()+"\n"
							+msg.removido_sucesso);
						}else
							System.out.println("\n"+msg.removido_cancelado);
						loop = false;	
					}else{
						System.out.println(msg.id_invalido);
					}
				break;

				case 'x':
					System.out.println(msg.filtro_saida);
					loop = false;
					break;

				default:
					System.out.println(msg.opc_invalida);
					break;
			}
			System.out.println("\n" + msg.separador);
		}while(loop);
	}

	public static void buscar(){
		int id = 0;
		boolean loop = true;
		do{
			loop = true;
			switch(filtro("buscar", msg.filtro_bus)){
				case 'a':
					do{
						switch(filtro("geral", msg.filtro_bus)){
							case 'a':
								do{
									try{
										id = Integer.parseInt(l.entDados(msg.ent_id_ap));
										loop = false;
									}catch(NumberFormatException nfe){
										System.out.println(msg.exnumerformat+"\n");
									}
								}while(loop);
								loop = true;
								Apartamento a = new Apartamento();
								a = BD.consulIndAp(id);
								if(a == null){
									System.out.println("\n"+msg.id_invalido);
								}else{
									BD.exibeAp(a);
									System.out.println("\n"+msg.titulo_status);
									if(a.getContrato().getOcupado()){
										System.out.println(msg.saida_ocupado_1);
									}else{
										System.out.println(msg.saida_ocupado_2);
										System.out.println("\n"+msg.titulo_valores);
										if(!a.getContrato().getAluguel().getHabilitado()&&!a.getContrato().getCompra().getHabilitado())
											System.out.println(msg.saida_valores_nenhum);
										if(a.getContrato().getAluguel().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", a.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
										if(a.getContrato().getCompra().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", a.getContrato().getCompra().getValor())+msg.saida_valores_compra);
										System.out.println("\n"+msg.titulo_contato);
										System.out.println(msg.saida_nome+a.getContrato().getCorretor().getNome());
										System.out.println(msg.saida_telefone+a.getContrato().getCorretor().getTelefone());
										System.out.println(msg.saida_celular+a.getContrato().getCorretor().getCelular());
									}
								loop = false;
								}
								break;
							case 'b':
								do{
									try{
										id = Integer.parseInt(l.entDados(msg.ent_id_cs));
										loop = false;
									}catch(NumberFormatException nfe){
										System.out.println(msg.exnumerformat+"\n");
									}
								}while(loop);
								loop = true;
								Casa c = new Casa();
								c = BD.consulIndCs(id);
								if(c == null)
									System.out.println("\n"+msg.id_invalido);
								else{
									BD.exibeCs(c);
									System.out.println("\n"+msg.titulo_status);
									if(c.getContrato().getOcupado()){
										System.out.println(msg.saida_ocupado_1);
									}else{
										System.out.println(msg.saida_ocupado_2);
										System.out.println("\n"+msg.titulo_valores);
										if(!c.getContrato().getAluguel().getHabilitado()&&!c.getContrato().getCompra().getHabilitado())
											System.out.println(msg.saida_valores_nenhum);
										if(c.getContrato().getAluguel().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", c.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
										if(c.getContrato().getCompra().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", c.getContrato().getCompra().getValor())+msg.saida_valores_compra);
										System.out.println("\n"+msg.titulo_contato);
										System.out.println(msg.saida_nome+c.getContrato().getCorretor().getNome());
										System.out.println(msg.saida_telefone+c.getContrato().getCorretor().getTelefone());
										System.out.println(msg.saida_celular+c.getContrato().getCorretor().getCelular());
									}
								loop = false;
								}
								break;
							case 'c':
								do{
									try{
										id = Integer.parseInt(l.entDados(msg.ent_id_kn));
										loop = false;
									}catch(NumberFormatException nfe){
										System.out.println(msg.exnumerformat+"\n");
									}
								}while(loop);
								loop = true;
								Kitnet k = new Kitnet();
								k = BD.consulIndKn(id);
								if(k == null)
									System.out.println("\n"+msg.id_invalido);
								else{
									BD.exibeKn(k);
									System.out.println("\n"+msg.titulo_status);
									if(k.getContrato().getOcupado())
										System.out.println(msg.saida_ocupado_1);
									else{
										System.out.println(msg.saida_ocupado_2);
										System.out.println("\n"+msg.titulo_valores);
										if(!k.getContrato().getAluguel().getHabilitado()&&!k.getContrato().getCompra().getHabilitado())
											System.out.println(msg.saida_valores_nenhum);
										if(k.getContrato().getAluguel().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", k.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
										if(k.getContrato().getCompra().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", k.getContrato().getCompra().getValor())+msg.saida_valores_compra);
										System.out.println("\n"+msg.titulo_contato);
										System.out.println(msg.saida_nome+k.getContrato().getCorretor().getNome());
										System.out.println(msg.saida_telefone+k.getContrato().getCorretor().getTelefone());
										System.out.println(msg.saida_celular+k.getContrato().getCorretor().getCelular());
									}
								loop = false;
								}
								break;
							case 'd':
								do{
									try{
										id = Integer.parseInt(l.entDados(msg.ent_id_ps));
										loop = false;
									}catch(NumberFormatException nfe){
										System.out.println(msg.exnumerformat+"\n");
									}
								}while(loop);
								loop = true;
								Pousada p = new Pousada();
								p = BD.consulIndPs(id);
								if(p == null)
									System.out.println("\n"+msg.id_invalido);
								else{
									BD.exibePs(p);
									System.out.println("\n"+msg.titulo_status);
									if(p.getContrato().getOcupado()){
										System.out.println(msg.saida_ocupado_1);
									}else{
										System.out.println(msg.saida_ocupado_2);
										System.out.println("\n"+msg.titulo_valores);
										if(!p.getContrato().getAluguel().getHabilitado()&&!p.getContrato().getCompra().getHabilitado())
											System.out.println(msg.saida_valores_nenhum);
										if(p.getContrato().getAluguel().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", p.getContrato().getAluguel().getValor())+msg.saida_valores_aluguelPs);
										if(p.getContrato().getCompra().getHabilitado())
											System.out.println("\t|-> R$"+String.format("%.2f", p.getContrato().getCompra().getValor())+msg.saida_valores_compra);
										System.out.println("\n"+msg.titulo_contato);
										System.out.println(msg.saida_nome+p.getContrato().getCorretor().getNome());
										System.out.println(msg.saida_telefone+p.getContrato().getCorretor().getTelefone());
										System.out.println(msg.saida_celular+p.getContrato().getCorretor().getCelular());
									}
								loop = false;
								}
								break;
							case 'x':
								System.out.println(msg.filtro_saida);
								loop = false;
								break;
							default:
								System.out.println(msg.opc_invalida);
								break;
						}
					}while(loop);
					break;

				case 'b':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_bus_corretor+"\n");

					String nome = l.entDados(msg.ent_nome_corretor);
					
					Apartamento aNome = new Apartamento();
					aNome.getContrato().getCorretor().setNome(nome);
					List<Apartamento> ap = new ArrayList<Apartamento>();
					ap = BD.consulNomeAp(aNome);

					Casa cNome = new Casa();
					cNome.getContrato().getCorretor().setNome(nome);
					List<Casa> cs = new ArrayList<Casa>();
					cs = BD.consulNomeCs(cNome);

					Kitnet kNome = new Kitnet();
					kNome.getContrato().getCorretor().setNome(nome);
					List<Kitnet> kn = new ArrayList<Kitnet>();
					kn = BD.consulNomeKn(kNome);

					Pousada pNome = new Pousada();
					pNome.getContrato().getCorretor().setNome(nome);
					List<Pousada> ps = new ArrayList<Pousada>();
					ps = BD.consulNomePs(pNome);					

					if(ap != null || cs != null || kn != null || ps != null){
						System.out.println("\n"+msg.imv_titulo_lista);
						System.out.println("\n"+msg.nome+nome);
						if(ap != null){
							System.out.println("\n"+msg.ap_titulo_lista);
							for(Apartamento a : ap){
								BD.exibeAp(a);
								if(a.getContrato().getOcupado()){
									System.out.println(msg.saida_ocupado_1);
								}else{
									System.out.println(msg.saida_ocupado_2);
									System.out.println("\n"+msg.titulo_valores);
									if(!a.getContrato().getAluguel().getHabilitado()&&!a.getContrato().getCompra().getHabilitado())
										System.out.println(msg.saida_valores_nenhum);
									if(a.getContrato().getAluguel().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", a.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
									if(a.getContrato().getCompra().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", a.getContrato().getCompra().getValor())+msg.saida_valores_compra);
								}
							}
						}
						if(cs != null){
							System.out.println("\n"+msg.cs_titulo_lista);
							for(Casa c : cs){
								BD.exibeCs(c);
								if(c.getContrato().getOcupado()){
									System.out.println(msg.saida_ocupado_1);
								}else{
									System.out.println(msg.saida_ocupado_2);
									System.out.println("\n"+msg.titulo_valores);
									if(!c.getContrato().getAluguel().getHabilitado()&&!c.getContrato().getCompra().getHabilitado())
										System.out.println(msg.saida_valores_nenhum);
									if(c.getContrato().getAluguel().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", c.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
									if(c.getContrato().getCompra().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", c.getContrato().getCompra().getValor())+msg.saida_valores_compra);
								}
							}
						}
						if(kn != null){
							System.out.println("\n"+msg.kn_titulo_lista);
							for(Kitnet k : kn){
								BD.exibeKn(k);
								if(k.getContrato().getOcupado()){
									System.out.println(msg.saida_ocupado_1);
								}else{
									System.out.println(msg.saida_ocupado_2);
									System.out.println("\n"+msg.titulo_valores);
									if(!k.getContrato().getAluguel().getHabilitado()&&!k.getContrato().getCompra().getHabilitado())
										System.out.println(msg.saida_valores_nenhum);
									if(k.getContrato().getAluguel().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", k.getContrato().getAluguel().getValor())+msg.saida_valores_aluguel);
									if(k.getContrato().getCompra().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", k.getContrato().getCompra().getValor())+msg.saida_valores_compra);
								}
							}
						}
						if(ps != null){
							System.out.println("\n"+msg.ps_titulo_lista);
							for(Pousada p : ps){
								BD.exibePs(p);
								if(p.getContrato().getOcupado()){
									System.out.println(msg.saida_ocupado_1);
								}else{
									System.out.println(msg.saida_ocupado_2);
									System.out.println("\n"+msg.titulo_valores);
									if(!p.getContrato().getAluguel().getHabilitado()&&!p.getContrato().getCompra().getHabilitado())
										System.out.println(msg.saida_valores_nenhum);
									if(p.getContrato().getAluguel().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", p.getContrato().getAluguel().getValor())+msg.saida_valores_aluguelPs);
									if(p.getContrato().getCompra().getHabilitado())
										System.out.println("\t|-> R$"+String.format("%.2f", p.getContrato().getCompra().getValor())+msg.saida_valores_compra);
								}
							}
						}
						loop = false;
					}else{
						System.out.println(msg.corretor_invalido);
					}
					break;
	
				case 'x':
					System.out.println(msg.filtro_saida);
					loop = false;
					break;

				default:
					System.out.println(msg.opc_invalida);
					break;

			}
			System.out.println("\n" + msg.separador);
		}while(loop);
	}

	public static void listar(){
		boolean loop = false;
		do{
			loop = false;
			switch(filtro("listar", msg.filtro_list)){
				case 'a':
					if(BD.ap.size() > 0 || BD.cs.size() > 0 || BD.kn.size() > 0 || BD.ps.size() > 0){
						System.out.println("\n"+msg.imv_titulo_lista);
						if(BD.ap.size() > 0){
							System.out.println("\n"+msg.ap_titulo_lista);
							BD.exibeAllAp();
						}
						if(BD.cs.size() > 0){
							System.out.println("\n"+msg.cs_titulo_lista);
							BD.exibeAllCs();
						}
						if(BD.kn.size() > 0){
							System.out.println("\n"+msg.kn_titulo_lista);
							BD.exibeAllKn();
						}
						if(BD.ps.size() > 0){
							System.out.println("\n"+msg.ps_titulo_lista);
							BD.exibeAllPs();
						}			

					}else{
						System.out.println(msg.lista_vazia);
						loop = true;
					}
					break;

				case 'b':
					if(BD.ap.size() > 0){
							System.out.println("\n"+msg.ap_titulo_lista);
							BD.exibeAllAp();
					}else{
						System.out.println(msg.ap_vazia);
						loop = true;
					}
					break;

				case 'c':
					if(BD.cs.size() > 0){
							System.out.println("\n"+msg.cs_titulo_lista);
							BD.exibeAllCs();
					}else{
						System.out.println(msg.cs_vazia);
						loop = true;
					}
					break;

				case 'd':
					if(BD.kn.size() > 0){
							System.out.println("\n"+msg.kn_titulo_lista);
							BD.exibeAllKn();
					}else{
						System.out.println(msg.kn_vazia);
						loop = true;
					}
					break;

				case 'e':
					if(BD.ps.size() > 0){
							System.out.println("\n"+msg.ps_titulo_lista);
							BD.exibeAllPs();
					}else{
						System.out.println(msg.ps_vazia);
						loop = true;
					}
					break;

				case 'x':
					System.out.println(msg.filtro_saida);
					break;

				default:
					System.out.println(msg.opc_invalida);
					loop = true;
					break;
			}
		System.out.println("\n" + msg.separador);
		}while(loop);
	}

	public static void parcelar(){
		int id = 0;
		boolean loop = true;
		int parcelas = 0;
		do{
			loop = true;
			switch(filtro("simular", msg.filtro_simu)){
				case 'a':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_simu_ap+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_ap));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
									}
					}while(loop);
					loop = true;
					if(BD.ap.size()>id){
						if(BD.ap.get(id).getContrato().getCompra().getHabilitado()){
							do{
								try{
									parcelas = Integer.parseInt(l.entDados(msg.ent_parcelas));
									loop = false;
								}catch(NumberFormatException nfe){
									System.out.println(msg.exnumerformat+"\n");
								}
							}while(loop);
							BD.ap.get(id).calcParcelar(parcelas);
						}else{
							System.out.println(msg.compra_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'b':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_simu_cs+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_cs));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
									}
					}while(loop);
					loop = true;
					if(BD.cs.size()>id){
						if(BD.cs.get(id).getContrato().getCompra().getHabilitado()){
							do{
								try{
									parcelas = Integer.parseInt(l.entDados(msg.ent_parcelas));
									loop = false;
								}catch(NumberFormatException nfe){
									System.out.println(msg.exnumerformat+"\n");
								}
							}while(loop);
							BD.cs.get(id).calcParcelar(parcelas);
						}else{
							System.out.println(msg.compra_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'c':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_simu_kn+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_kn));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
									}
					}while(loop);
					loop = true;
					if(BD.kn.size()>id){
						if(BD.kn.get(id).getContrato().getCompra().getHabilitado()){
							do{
								try{
									parcelas = Integer.parseInt(l.entDados(msg.ent_parcelas));
									loop = false;
								}catch(NumberFormatException nfe){
									System.out.println(msg.exnumerformat+"\n");
								}
							}while(loop);
							BD.kn.get(id).calcParcelar(parcelas);
						}else{
							System.out.println(msg.compra_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'x':
					System.out.println(msg.filtro_saida);
					loop = false;
					break;

				default:
					System.out.println(msg.opc_invalida);
					break;
			}
		System.out.println("\n" + msg.separador);
		}while(loop);
	}

	public static void gerar_comissao(){
		int id = 0;
		boolean loop = true;
		do{
			loop = true;
			switch(filtro("geral", msg.filtro_comi)){
				case 'a':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_comi_ap+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_ap));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					if(BD.ap.size()>id){
						if(BD.ap.get(id).getContrato().getCompra().getHabilitado() || BD.ap.get(id).getContrato().getAluguel().getHabilitado()){
							BD.ap.get(id).calcComissao();
							loop=false;
						}else{
							System.out.println(msg.compra_aluguel_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'b':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_comi_cs+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_cs));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					if(BD.cs.size()>id){
						if(BD.cs.get(id).getContrato().getCompra().getHabilitado() || BD.cs.get(id).getContrato().getAluguel().getHabilitado()){
							BD.cs.get(id).calcComissao();
							loop=false;
						}else{
							System.out.println(msg.compra_aluguel_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'c':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_comi_kn+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_kn));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					if(BD.kn.size()>id){
						if(BD.kn.get(id).getContrato().getCompra().getHabilitado() || BD.kn.get(id).getContrato().getAluguel().getHabilitado()){
							BD.kn.get(id).calcComissao();
							loop=false;
						}else{
							System.out.println(msg.compra_aluguel_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'd':
					System.out.println("\n"+msg.separador);
					System.out.println(msg.menu_comi_ps+"\n");
					do{
						try{
							id = Integer.parseInt(l.entDados(msg.ent_id_ps));
							loop = false;
						}catch(NumberFormatException nfe){
							System.out.println(msg.exnumerformat+"\n");
						}
					}while(loop);
					loop = true;
					if(BD.ps.size()>id){
						if(BD.ps.get(id).getContrato().getCompra().getHabilitado() || BD.ps.get(id).getContrato().getAluguel().getHabilitado()){
							BD.ps.get(id).calcComissao();
							loop=false;
						}else{
							System.out.println(msg.compra_aluguel_invalida);
						}
					}else{
						System.out.println(msg.id_invalido);
					}
					break;

				case 'x':
					System.out.println(msg.filtro_saida);
					loop = false;
					break;

				default:
					System.out.println(msg.opc_invalida);
					break;
			}
		System.out.println("\n" + msg.separador);
		}while(loop);
	}
}