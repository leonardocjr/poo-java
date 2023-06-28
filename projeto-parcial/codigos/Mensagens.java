// Nome: Leonardo Canuto Junior - RA: 2453533

public class Mensagens{

	private static Mensagens m_Unic;

	private Mensagens(){}

	public static Mensagens getMensagens(){
		if(m_Unic == null)
			m_Unic = new Mensagens();
		return m_Unic;
	}

	// MENU PRINCIPAL
	public final String separador = "|--------------------------------------------|";
	public final String apontador = "\t|-> ";
	public final String sistema = "|------------ SISTEMA DE IMOVEIS ------------|";
	public final String menu = "|------------------- MENU -------------------|";

	public final String menu_escopo = "\t1. Cadastrar um novo imovel\n\t2. Remover um imovel\n\t3. Buscar imoveis\n\t4. Listar imoveis\n\t5. Simular parcelamento\n\t6. Simular comissao\n\tX. Sair";
	public final String menu_saida = "\t|-> Saindo do sistema...";

	// MENUS SECUNDARIOS
	public final String filtro_geral = "\ta. Apartamento\n\tb. Casa\n\tc. Kitnet\n\td. Pousada\n\tX. Voltar para menu anterior";
	public final String filtro_listar = "\ta. Todos\n\tb. Apartamentos\n\tc. Casas\n\td. Kitnets\n\te. Pousadas\n\tX. Voltar para menu anterior";
	public final String filtro_simular = "\ta. Apartamento\n\tb. Casa\n\tc. Kitnet\n\tX. Voltar para menu anterior";
	public final String filtro_buscar = "\ta. Buscar por ID\n\tb. Buscar por corretor\n\tX. Voltar para menu anterior";
	public final String filtro_saida = "\t|-> Retornando ao menu anterior...";

	// CADASTRO
	public final String filtro_cad = "|------------- MENU -> CADASTRO -------------|";
	public final String menu_cad_ap = "|----- MENU -> CADASTRO -> APARTAMENTO ------|";
	public final String menu_cad_cs = "|--------- MENU -> CADASTRO -> CASA ---------|";
	public final String menu_cad_kn = "|-------- MENU -> CADASTRO -> KITNET --------|";
	public final String menu_cad_ps = "|------- MENU -> CADASTRO -> POUSADA --------|";

	// REMOVER
	public final String filtro_rem = "|------------- MENU -> REMOVER --------------|";
	public final String menu_rem_ap = "|------ MENU -> REMOVER -> APARTAMENTO ------|";
	public final String menu_rem_cs = "|--------- MENU -> REMOVER -> CASA ----------|";
	public final String menu_rem_kn = "|-------- MENU -> REMOVER -> KITNET ---------|";
	public final String menu_rem_ps = "|-------- MENU -> REMOVER -> POUSADA --------|";

	// BUSCAR
	public final String filtro_bus = "|-------------- MENU -> BUSCAR --------------|";
	public final String menu_bus_ap = "|------ MENU -> BUSCAR -> APARTAMENTO -------|";
	public final String menu_bus_cs = "|---------- MENU -> BUSCAR -> CASA ----------|";
	public final String menu_bus_kn = "|--------- MENU -> BUSCAR -> KITNET ---------|";
	public final String menu_bus_ps = "|-------- MENU -> BUSCAR -> POUSADA ---------|";
	public final String menu_bus_corretor = "|-------- MENU -> BUSCAR -> CORRETOR --------|";	

	// LISTAR
	public final String filtro_list = "|-------------- MENU -> LISTAR --------------|";
	public final String menu_list_todos = "|--------- MENU -> LISTAR -> TODOS ----------|";
	public final String menu_list_ap = "|------ MENU -> LISTAR -> APARTAMENTO -------|";
	public final String menu_list_cs = "|---------- MENU -> LISTAR -> CASA ----------|";
	public final String menu_list_kn = "|--------- MENU -> LISTAR -> KITNET ---------|";
	public final String menu_list_ps = "|-------- MENU -> LISTAR -> POUSADA ---------|";

	// SIMULAR
	public final String filtro_simu = "|------------- MENU -> PARCELAR -------------|";
	public final String menu_simu_ap = "|----- MENU -> PARCELAR -> APARTAMENTO ------|";
	public final String menu_simu_cs = "|--------- MENU -> PARCELAR -> CASA ---------|";
	public final String menu_simu_kn = "|-------- MENU -> PARCELAR -> KITNET --------|";

	//LISTAS
	public final String imv_titulo_lista = "| ---------- IMOVEIS DISPONIVEIS ----------- |";
	public final String ap_titulo_lista = "\t| ------- APARTAMENTOS ------- |";
	public final String cs_titulo_lista = "\t| ---------- CASAS ----------- |";
	public final String kn_titulo_lista = "\t| --------- KITNETS ---------- |";
	public final String ps_titulo_lista = "\t| --------- POUSADAS --------- |";

	// COMISSAO
	public final String filtro_comi = "|------------- MENU -> COMISSAO -------------|";
	public final String menu_comi_ap = "|----- MENU -> COMISSAO -> APARTAMENTO ------|";
	public final String menu_comi_cs = "|--------- MENU -> COMISSAO -> CASA ---------|";
	public final String menu_comi_kn = "|-------- MENU -> COMISSAO -> KITNET --------|";
	public final String menu_comi_ps = "|------- MENU -> COMISSAO -> POUSADA --------|";
	
	// ENTRADA DE DADOS NO SISTEMA
	// LOCALIZACAO
	public final String local_titulo = "\t| ---- LOCALIZACAO ---- |";
	public final String uf = "\t|-> UF....: ";
	public final String cidade = "\t|-> Cidade: ";
	public final String bairro = "\t|-> Bairro: ";
	public final String cep = "\t|-> CEP...: ";
	public final String rua = "\t|-> Rua...: ";
	public final String numero = "\t|-> Numero: ";

	// IMOVEL GERAL
	public final String imv_titulo = "\t| ---- IMOVEL ---- |";
	public final String id = "\t|-> ID cadastrado: ";
	public final String area = "\t|-> Area (em m2)...............: ";
	public final String quarto = "\t|-> Quantidade de quartos......: ";
	public final String banheiro = "\t|-> Quantidade de banheiros....: ";
	public final String mobilia = "\t|-> Possui mobilia........<s/n>: ";

	// APARTAMENTO
	public final String ap_titulo = "\t| ---- APARTAMENTO ---- |";
	public final String ap_titulo_id = "\t| ---> APARTAMENTO <--- | ID: ";
	public final String andar = "\t|-> Andar......................: ";
	public final String salaFesta = "\t|-> Possui sala de festa..<s/n>: ";
	public final String academia = "\t|-> Possui academia.......<s/n>: ";

	// CASA
	public final String cs_titulo = "\t| ------- CASA -------- |";
	public final String cs_titulo_id = "\t| -------> CASA <------ | ID: ";
	public final String paredes = "\t| TIPOS DISPONIVEIS: 'MADEIRA', 'CONCRETO' E 'TIJOLO'.\n\t|-> Estrutura das paredes......: ";
	public final String jardim = "\t|-> Possui jardim.........<s/n>: ";
	public final String esquina = "\t|-> Esta em uma esquina...<s/n>: ";

	// KITNET
	public final String kn_titulo = "\t| ------ KITNET ------- |";
	public final String kn_titulo_id = "\t| ------> KITNET <----- | ID: ";
	public final String compartilhada = "\t|-> Eh compartilhada......<s/n>: ";
	public final String moradores = "\t|-> Quantos moram..............: ";

	// POUSADA
	public final String ps_titulo = "\t| ------ POUSADA ------ |";
	public final String ps_titulo_id = "\t| -----> POUSADA <----- | ID: ";
	public final String lazer = "\t| TIPOS DISPONIVEIS: 'PRAIA', 'RESORT' E 'FESTAS'.\n\t|-> Qual o lazer...............: ";
	public final String horaCheckin = "\t|-> Hora de CheckIn............: ";
	public final String cafeM = "\t|-> Possui cafe da manha..<s/n>: ";
	public final String almoco = "\t|-> Possui almoco.........<s/n>: ";
	public final String cafeT = "\t|-> Possui cafe da tarde..<s/n>: ";
	public final String janta = "\t|-> Possui janta..........<s/n>: ";
	public final String ceia = "\t|-> Possui ceia...........<s/n>: ";
	public final String qtdRef = "\t|-> Refeicoes disponiveis......: ";

	// CONTRATO
	public final String contrato_titulo = "\t| ---- CONTRATO ---- |";
	public final String ocupado = "\t|-> Imovel esta ocupado..<s/n>: ";
	public final String impostos = "\t|-> IPTU......................: ";
	
	// CORRETOR
	public final String corretor_titulo = "\t| ---- CORRETOR ---- |";
	public final String nome = "\t|-> Nome do corretor.........: ";
	public final String telefone = "\t|-> Telefone fixo do corretor: ";
	public final String celular = "\t|-> Celular do corretor......: ";

	// OPERACOES
	public final String operacao_titulo = "\t| ---- OPERACOES ---- |";
	public final String valorAluguel = "\t|-> Valor aluguel mensal: R$";
	public final String valorAluguelPs = "\t|-> Valor da diária: R$";
	public final String valorAluguel_ps = "\t|-> Valor aluguel diario: R$";
	public final String valorCompra = "\t|-> Valor compra total..: R$";
	public final String habilitaCompra = "\t|-> Imovel habilita compra...<s/n>: ";
	public final String habilitaAluguel = "\t|-> Imovel habilita aluguel..<s/n>: ";

	// ENTRADA DE OPCOES
	public final String ent_opc = "\tDigite a opcao desejada: ";
	public final String ent_id_ap = "\t|-> Digite o ID do APARTAMENTO: ";
	public final String ent_id_cs = "\t|-> Digite o ID da CASA: ";
	public final String ent_id_kn = "\t|-> Digite o ID da KITNET: ";
	public final String ent_id_ps = "\t|-> Digite o ID da POUSADA: ";
	public final String ent_nome_corretor = "\t|-> Digite o NOME do CORRETOR: ";
	public final String ent_parcelas = "\t|-> Digite em quantas parcelas: ";
	public final String ent_confirm_rem = "\t|-> Tem certeza que deseja remover? <s/n>\n\t";
	public final String ent_confirm_cad = "\t|-> Quer cadastrar mais imoveis? <s/n>\n\t";
	
	//SAIDA DE DADOS DO SISTEMA
	public final String titulo_id = "\t| ID: ";
		// LOCALIZACAO
	public final String titulo_local = "\t| LOCALIZACAO";
	public final String saida_rua = "\t|-> Rua...: ";
	public final String saida_bairro = "\t|-> Bairro: ";
	public final String saida_cep = "\t|-> CEP...: ";

		// GERAL
	public final String titulo_info = "\t| INFORMACOES";
	public final String saida_area = "m^2";
	public final String saida_quarto = " quarto(s)";
	public final String saida_banheiro = " banheiro(s)";
	public final String saida_mobilia_1 = "\t|-> ja possui mobilia";
	public final String saida_mobilia_2 = "\t|-> nao possui mobilia";

		// APARTAMENTO
	public final String saida_andar = "* andar";
	public final String saida_salafesta_1 = "\t|-> tem salao de festa";
	public final String saida_salafesta_2 = "\t|-> nao tem salao de festa";
	public final String saida_academia_1 = "\t|-> tem academia";
	public final String saida_academia_2 = "\t|-> nao tem academia";

		// CASA
	public final String saida_paredes = "\t|-> paredes sao de ";
	public final String saida_jardim_1 = "\t|-> possui jardim";
	public final String saida_jardim_2 = "\t|-> nao possui jardim";
	public final String saida_esquina = "\t|-> fica em uma esquina";

		// KITNET
	public final String saida_compartilhada_1 = "\t|-> nao e compartilhada";
	public final String saida_compartilhada_2 = "\t|-> e compartilhada";
	public final String saida_moradores = " morador(es) compartilhado(s)";

		// POUSADA
	public final String saida_lazer = "\t|-> lazer da pousada: ";
	public final String saida_checkin = "\t|-> checkin as ";
	public final String saida_qtdref_1 = " refeicoes diarias inclusas";
	public final String saida_qtdref_2 = "\t|-> nao tem refeicoes inclusas";

		// STATUS
	public final String titulo_status = "\t| STATUS DO IMOVEL";
	public final String saida_ocupado_1 = "\t|-> Imovel encontra-se ocupado";
	public final String saida_ocupado_2 = "\t|-> Imovel encontra-se desocupado";

		// VALORES
	public final String titulo_valores = "\t| VALORES";
	public final String saida_valores_nenhum = "\t|-> O imovel nao esta disponivel para negociacao.";
	public final String saida_valores_aluguel = " mensal de aluguel";
	public final String saida_valores_aluguelPs = " diaria de aluguel";
	public final String saida_valores_compra = " comprando a vista";

		// CONTATO
	public final String titulo_contato = "\t| CONTATO";
	public final String saida_nome = "\t|-> Falar com: ";
	public final String saida_telefone = "\t|-> Ligar: +";
	public final String saida_celular = "\t|-> Whatsapp: +";


	// INTERFACE
	public final String valorParcela = "\t|-> Cada parcela ficara: ";
	public final String totalVista = "\t|-> Total a vista: ";
	public final String totalParcelado = "\t|-> Total parcelado: ";

	// ERROS E EXCECOES
	public final String opc_invalida = "\t[ALERTA] OPCAO INVALIDA!";
	public final String filtro_invalido = "\t[ALERTA] FILTRO NAO ENCONTRADO!\n\n\t< ENVIE X PARA SAIR >\n";
	public final String espaco_vazio = "\t[ALERTA] O ID INDICADO JA ESTA VAZIO.";
	public final String array_lotado = "\t[ALERTA] TODOS SLOTS JA FORAM PREENCHIDOS.";
	public final String id_fora = "\t[ALERTA] O ID DIGITADO ESTA FORA DO LIMITE DE SLOTS.";
	public final String id_invalido = "\t[ALERTA] O ID DIGITADO NAO FOI ENCONTRADO.";
	public final String corretor_invalido = "\t[ALERTA] CORRETOR DIGITADO NAO FOI ENCONTRADO.";
	public final String lista_vazia = "\t[ALERTA] NENHUM IMOVEL REGISTRADO.";
	public final String ap_vazia = "\t[ALERTA] NENHUM APARTAMENTO REGISTRADO.";
	public final String cs_vazia = "\t[ALERTA] NENHUMA CASA REGISTRADA.";
	public final String kn_vazia = "\t[ALERTA] NENHUMA KITNET REGISTRADA.";
	public final String ps_vazia = "\t[ALERTA] NENHUMA POUSADA REGISTRADA.";
	public final String compra_invalida = "\t[ALERTA] ESTE IMOVEL NAO HABILITA COMPRA.";
	public final String compra_aluguel_invalida = "\t[ALERTA] ESTE IMOVEL NAO HABILITA COMPRA E NEM VENDA.";
	
	// REMOCAO
	public final String removido_info = "\t|-> Desvinculado ao corretor ";
	public final String removido_sucesso = "\t|-> Removido com sucesso.\n\t|-> Os IDs foram atualizados.";
	public final String removido_cancelado = "\t|-> Remocao interrompida.\n\t|-> Retornando ao menu.";

	//EXCECOES
	public final String exnumerformat = "\t[ALERTA] FORMATO DE NUMERO DIGITADO INVALIDO.\n\t|-> Tente novamente.";
	public final String exinservazia = "\t[ALERTA] A ENTRADA REALIZADA FOI VAZIA.\n\t|-> Tente novamente.";
	public final String exboolean = "\t[ALERTA] DIGITE APENAS <S/N>.\n\t|-> Tente novamente.";

}