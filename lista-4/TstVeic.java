//Nome: Leonardo Canuto Junior -  RA: 2453533

public class TstVeic{


//===============	DECLARACOES	==================

	private static final int TAMp = 2;
	private static final int TAMc = 2;
	private static int qtdPasseio = 0;
	private static int qtdCarga = 0;

	private static Leitura r = Leitura.getLeitura();	
	private static Passeio vPasseio[] = new Passeio[TAMp];
	private static Carga vCarga[] = new Carga[TAMc];

//========== DECLARACOES DE METODOS ============
/*
	public static int menu();
	public static int filtro();
	public static void cadastraPasseio();
	public static void cadastraCarga();
	public static void busca(String placa);
	public static void exibePasseio(int id);
	public static void exibeCarga(String idS);
*/
//===============================================

	public static void main(String args[]){
		
		boolean loop = true;
		int tipo = 0;

		do{
			switch(menu()){
			
				//Cadastro de novos veiculos
				case 1:
					switch(filtro()){
						case 1:
							cadastraPasseio();
							System.out.println("\tDIGITE < ENTER > PARA CONTINUAR.");
							r.entDados("");
							break;

						case 2:
							cadastraCarga();
							System.out.println("\tDIGITE < ENTER > PARA CONTINUAR.");
							r.entDados("");
							break;
						case 3:
							System.out.println("|--> Retornando para menu...");
							break;
					}
					break;
	
				//Busca por veiculos pela placa
				case 2:
					System.out.println("\n|\tBUSCA POR PLACA:");
					busca(r.entDados("|--> Digite a placa que deseja buscar: "));
					System.out.println("\n\tDIGITE < ENTER > PARA CONTINUAR.");
					r.entDados("");
					break;

				//Exibe todos carros de uma categoria
				case 3:
					switch(filtro()){
						case 1:
							exibePasseio(null); /* O valor null é usado para sinalizar que 
							o metodo nao tem indice para exibir, logo deve exibir todo o array. */

							System.out.println("\n\tDIGITE < ENTER > PARA CONTINUAR.");
							r.entDados("");
							break;
						case 2:
							exibeCarga(null); /* O valor null é usado para sinalizar que 
							o metodo nao tem indice para exibir, logo deve exibir todo o array. */

							System.out.println("\n\tDIGITE < ENTER > PARA CONTINUAR.");
							r.entDados("");
							break;

						case 3:
							System.out.println("|--> Retornando para menu...");
							break;
					}
					break;

				//Saida do sistema
				case 4:
					System.out.println("|\t SAINDO DO SISTEMA...\n");
					loop = false;
					break;

				//Caso entrada de valores invalidos
				default:
					System.out.println("|--> Digite um valor de 1 a 4.");
					System.out.println("\n\tDIGITE < ENTER > PARA CONTINUAR.");
					r.entDados("");
					break;
			}

		}while(loop);
	}

//===============================================

//===============		MÉTODOS	=============

	//==> Metodo int menu():
	//==> Exibe menu na tela e retorna pelo método o valor (opcao) que o usuario escolher.

	public static int menu(){

		boolean verif = false;
		int id = 0;

		System.out.println("\n|\tSISTEMA DE VEICULOS:\n");
		System.out.println("|-> 1 - para cadastrar um novo veiculo");
		System.out.println("|-> 2 - para buscar um veiculo pela placa");
		System.out.println("|-> 3 - para ver todos veiculos cadastrados");
		System.out.println("|-> 4 - para sair");

		do{
			verif = true;
			try{
				id = Integer.parseInt(r.entDados("\n|--> Digite uma opcao: "));
			}catch(NumberFormatException nfe){
				System.out.println("|\tNUMERO INVALIDO.\n");
				verif = false;
			}
		}while(verif == false);

		return id;
	}

	//==> Metodo int filtro():
	//==> Exibe menu de filtros na tela e retorna pelo método o valor (opcao) que o usuario escolher.

	public static int filtro(){
		int tipo = 0;
		boolean verif = false;
		do{
			System.out.println("\n|\tTIPOS DE VEICULOS DISPONIVEIS: \n|-> 1. passeio\n|-> 2. carga\n|-> 3. voltar para menu");
			try{
				tipo = Integer.parseInt(r.entDados("\n|--> Digite um tipo de veiculo: "));
			}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
			}
		}while(tipo != 1 && tipo != 2 && tipo != 3);
		return tipo;
	}

	//==> Metodo void cadastraPasseio():
	//==> Faz a entrada de todos os atributos da classe Passeio atribuindo-o para uma posicao na array de objeto.

	public static void cadastraPasseio(){
		boolean verif = false;
		if(qtdPasseio >= TAMp){
			System.out.println("\n|-> Limite de slots preenchido.["+qtdPasseio+"/"+TAMp+"]");
		}else{
			// DEFININDO VEICULOS DE PASSEIO
			vPasseio[qtdPasseio] = new Passeio();
			System.out.println("\n|\tNOVO VEICULO DE PASSEIO ["+(qtdPasseio+1)+"/"+TAMp+"]\n");			

			// VEICULO DE PASSEIO
			// CLASSE MAE
			vPasseio[qtdPasseio].setDataCadastro(r.entDados("|-> Digite a data de cadastro: "));
			vPasseio[qtdPasseio].setPlaca(r.entDados("|-> Digite a placa: "));
			vPasseio[qtdPasseio].setMarca(r.entDados("|-> Digite a marca: "));
			vPasseio[qtdPasseio].setModelo(r.entDados("|-> Digite o modelo: "));
			vPasseio[qtdPasseio].setCor(r.entDados("|-> Digite a cor: "));
			do{
				verif = true;
				try{
					vPasseio[qtdPasseio].setQtdRodas(Integer.parseInt(r.entDados("|-> Digite a qtd de rodas: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			do{
				verif = true;
				try{
					vPasseio[qtdPasseio].setVelocMax(Integer.parseInt(r.entDados("|-> Digite a velocidade max: ")));
				}catch(VelocMaxLimitException vle){
					vle.msgVelocMaxLimitException();
					verif = false;
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			
			// REFLEXIVIDADE
			do{
				verif = true;
				try{
					vPasseio[qtdPasseio].getMotor().setQtdPistoes(Integer.parseInt(r.entDados("|-> Digite a qtd de pistoes do motor: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			do{
				verif = true;
				try{
					vPasseio[qtdPasseio].getMotor().setPotencia(Integer.parseInt(r.entDados("|-> Digite a potencia do motor: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);

			//CLASSE FILHA
			do{
				verif = true;
				try{
					vPasseio[qtdPasseio].setQtdePassageiro(Integer.parseInt(r.entDados("|-> Digite a qtd de passageiros: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			qtdPasseio+=1;
			System.out.println("\n|\tVEICULO DE PASSEIO CRIADO COM SUCESSO!");
			}
		}

	//==> Metodo void cadastraCarga():
	//==> Faz a entrada de todos os atributos da classe Carga atribuindo-o para uma posicao na array de objeto.

	public static void cadastraCarga(){
		boolean verif = false;
		if(qtdCarga >= TAMc){
			System.out.println("\n|-> Limite de slots preenchido. ["+qtdCarga+"/"+TAMc+"]");
		}else{
			// DEFININDO VEICULOS DE CARGA
			vCarga[qtdCarga] = new Carga();
			System.out.println("\n|\tNOVO VEICULO DE CARGA ["+(qtdCarga+1)+"/"+TAMc+"]\n");

			// VEICULO DE CARGA
			// CLASSE MAE
			vCarga[qtdCarga].setDataCadastro(r.entDados("|-> Digite a data de cadastro: "));
			vCarga[qtdCarga].setPlaca(r.entDados("|-> Digite a placa: "));
			vCarga[qtdCarga].setMarca(r.entDados("|-> Digite a marca: "));
			vCarga[qtdCarga].setModelo(r.entDados("|-> Digite o modelo: "));
			vCarga[qtdCarga].setCor(r.entDados("|-> Digite a cor: "));
			do{
				verif = true;
				try{
					vCarga[qtdCarga].setQtdRodas(Integer.parseInt(r.entDados("|-> Digite a qtd de rodas: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			do{
				verif = true;
				try{
					vCarga[qtdCarga].setVelocMax(Integer.parseInt(r.entDados("|-> Digite a velocidade max: ")));
				}catch(VelocMaxLimitException vle){
					vle.msgVelocMaxLimitException();
					verif = false;
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			
			// REFLEXIVIDADE
			do{
				verif = true;
				try{
					vCarga[qtdCarga].getMotor().setQtdPistoes(Integer.parseInt(r.entDados("|-> Digite a qtd de pistoes do motor: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			do{
				verif = true;
				try{
					vCarga[qtdCarga].getMotor().setPotencia(Integer.parseInt(r.entDados("|-> Digite a potencia do motor: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);

			//CLASSE FILHA
			do{
				verif = true;
				try{
					vCarga[qtdCarga].setTara(Integer.parseInt(r.entDados("|-> Digite a tara da carga: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			do{
				verif = true;
				try{
					vCarga[qtdCarga].setCargaMax(Integer.parseInt(r.entDados("|-> Digite a carga max do veiculo: ")));
				}catch(NumberFormatException nfe){
					System.out.println("|\tNUMERO INVALIDO.\n");
					verif = false;
				}
			}while(verif == false);
			qtdCarga+=1;
			System.out.println("\n|\tVEICULO DE CARGA CRIADO COM SUCESSO!");
		}
	}

	//==> Metodo void exibePasseio(String idS):
	//==> Faz a exibicao de um veiculo de passeio na tela a partir de uma entrada tipo String.
	//*=> Caso "null" leva o metodo a exibir todos valores.

	public static void exibePasseio(String idS){
		boolean verif = false;
		if(idS == null){
			/* MOSTRANDO NA TELA VEICULOS DE PASSEIO */
			for(int i=0; i<qtdPasseio; i++){
				verif = true;
				System.out.println("\n|\tVEICULO DE PASSEIO ["+i+"]:");
			/*		CLASSE MAE		*/
				System.out.println("|-> Data da cadastro: "+vPasseio[i].getDataCadastro());
				System.out.println("|-> Modelo: "+vPasseio[i].getModelo());
				System.out.println("|-> Marca: "+vPasseio[i].getMarca());
				System.out.println("|-> Cor: "+vPasseio[i].getCor());
				System.out.println("|-> Placa: "+vPasseio[i].getPlaca());
				System.out.println("|-> Rodas: "+vPasseio[i].getQtdRodas());
				System.out.println("|-> Velocidade max: "+vPasseio[i].calcVel()+" m/h");
	
			/*		CLASSE FILHA		*/
				System.out.println("|-> Limite de passageiros: "+vPasseio[i].getQtdePassageiro());
	
			/*		REFLEXIVIDADE		*/
				System.out.println("\n|\tDADOS DO MOTOR:");
				System.out.println("|-> Pistoes: "+vPasseio[i].getMotor().getQtdPistoes());
				System.out.println("|-> Potencia: "+vPasseio[i].getMotor().getPotencia()+" cavalos");
				vPasseio[i].calcular();
			}
			if(verif==false){
				System.out.println("\n|\tNENHUM VEICULO DE PASSEIO CADASTRADO!");
			}
		}else{
		int id = Integer.parseInt(idS);
		/*		CLASSE MAE		*/
			System.out.println("|-> Data da cadastro: "+vPasseio[id].getDataCadastro());
			System.out.println("|-> Placa: "+vPasseio[id].getPlaca());
			System.out.println("|-> Modelo: "+vPasseio[id].getModelo());
			System.out.println("|-> Marca: "+vPasseio[id].getMarca());
			System.out.println("|-> Cor: "+vPasseio[id].getCor());
			System.out.println("|-> Rodas (com reserva): "+vPasseio[id].getQtdRodas());
			System.out.println("|-> Velocidade max: "+vPasseio[id].calcVel()+" m/h");

		/*		CLASSE FILHA		*/
			System.out.println("|-> Limite de passageiros: "+vPasseio[id].getQtdePassageiro());

		/*		REFLEXIVIDADE		*/
			System.out.println("\n|\tDADOS DO MOTOR:");
			System.out.println("|-> Pistoes: "+vPasseio[id].getMotor().getQtdPistoes());
			System.out.println("|-> Potencia: "+vPasseio[id].getMotor().getPotencia()+" cavalos");
			vPasseio[id].calcular();
		}
	}

	//==> Metodo void exibeCarga(String idS):
	//==> Faz a exibicao de um veiculo de carga na tela a partir de uma entrada tipo String.
	//*=> Caso "null" leva o metodo a exibir todos valores.

	public static void exibeCarga(String idS){
		
		boolean verif = false;
		if(idS == null){
			/* MOSTRANDO NA TELA VEICULOS DE CARGA */
		
			for(int i=0; i<qtdCarga; i++){
				verif = true;
				System.out.println("\n|\tVEICULO DE CARGA ["+i+"]:");
			/*		CLASSE MAE		*/
				System.out.println("|-> Data da cadastro: "+vCarga[i].getDataCadastro());
				System.out.println("|-> Modelo: "+vCarga[i].getModelo());
				System.out.println("|-> Marca: "+vCarga[i].getMarca());
				System.out.println("|-> Cor: "+vCarga[i].getCor());
				System.out.println("|-> Placa: "+vCarga[i].getPlaca());
				System.out.println("|-> Rodas (com reserva): "+vCarga[i].getQtdRodas());
				System.out.println("|-> Velocidade max: "+vCarga[i].calcVel()+" cm/h");
	
			/*		CLASSE FILHA		*/
				System.out.println("|-> Tara em TONELADAS: "+vCarga[i].getTara());
				System.out.println("|-> Carga max. em TONELADAS: "+vCarga[i].getCargaMax());
	
			/*		REFLEXIVIDADE		*/
				System.out.println("\n|\tDADOS DO MOTOR:");
				System.out.println("|-> Pistoes: "+vCarga[i].getMotor().getQtdPistoes());
				System.out.println("|-> Potencia: "+vCarga[i].getMotor().getPotencia()+" cavalos");
				vCarga[i].calcular();
			}
			if(verif==false){
				System.out.println("\n|\tNENHUM VEICULO DE CARGA CADASTRADO!");
			}
		}else{
		int id = Integer.parseInt(idS);
		/*		CLASSE MAE		*/
			System.out.println("|-> Data da cadastro: "+vCarga[id].getDataCadastro());
			System.out.println("|-> Placa: "+vCarga[id].getPlaca());
			System.out.println("|-> Modelo: "+vCarga[id].getModelo());
			System.out.println("|-> Marca: "+vCarga[id].getMarca());
			System.out.println("|-> Cor: "+vCarga[id].getCor());
			System.out.println("|-> Rodas (com reserva): "+vCarga[id].getQtdRodas());
			System.out.println("|-> Velocidade max: "+vCarga[id].calcVel()+" cm/h");

		/*		CLASSE FILHA		*/
			System.out.println("|-> Tara em TONELADAS: "+vCarga[id].getTara());
			System.out.println("|-> Carga max. em TONELADAS: "+vCarga[id].getCargaMax());

		/*		REFLEXIVIDADE		*/
			System.out.println("\n|\tDADOS DO MOTOR:");
			System.out.println("|-> Pistoes: "+vCarga[id].getMotor().getQtdPistoes());
			System.out.println("|-> Potencia: "+vCarga[id].getMotor().getPotencia()+" cavalos");
			vCarga[id].calcular();
		}
	}

	//==> Metodo void busca(String placa):
	//==> Faz a busca da entrada String com uma placa valida dentro dos veiculos.
	//*=> Caso a encontre, ira chamar o metodo exibePasseio(id) ou exibeCarga(id), sendo id o valor de indice do veiculo alvo.

	public static void busca(String placa){
		int id = -1;
		boolean verif = false;
		for(int i=0;i<qtdPasseio;i++){
			if(placa.equals(vPasseio[i].getPlaca())){
				id=i;
				verif = true;
			}
		}
		if(verif == true){
			System.out.println("\n|\tVEICULO DE PASSEIO ENCONTRADO!");
			
			exibePasseio(Integer.toString(id));
		}
		verif = false;
		for(int i=0;i<qtdCarga;i++){
			if(placa.equals(vCarga[i].getPlaca())){
				id=i;
				verif = true;
			}
		}
		if(verif == true){
			System.out.println("\n|\tVEICULO DE CARGA ENCONTRADO!");
			exibeCarga(Integer.toString(id));
		}
		if(id==-1){
			System.out.println("\n|\tPLACA NAO ENCONTRADA!");
		}
	}
}