// Nome: Leonardo Canuto Junior - RA: 2453533

public abstract class Imovel{

	private int id;
	private int area;
	private int quarto;
	private int banheiro;
	private boolean mobilia;
	private Localizacao local;
	private Contrato contrato;

// =======================================

// ============ CONSTRUTORES =============

	public Imovel(){

		id = 0;
		area = 0;
		quarto = 0;
		banheiro = 0;
		mobilia = false;
		local = new Localizacao();
		contrato = new Contrato();

	}

// ============= SOBRECARGA ==============

	public Imovel(int id, int area, int quarto, int banheiro, boolean mobilia, Localizacao local, Contrato contrato){

		this.id = id;
		this.area = area;
		this.quarto = quarto;
		this.banheiro = banheiro;
		this.mobilia = mobilia;
		this.local = local;
		this.contrato = contrato;

	}

	public Imovel(Imovel imv){

		this.id = imv.getId();
		this.area = imv.getArea();
		this.quarto = imv.getQuarto();
		this.banheiro = imv.getBanheiro();
		this.mobilia = imv.getMobilia();
		this.local = imv.getLocal();
		this.contrato = imv.getContrato();

	}

// =======================================

// ============ METODOS ==================

	public abstract double contAluguel();

	public abstract double contCompra();

// ============ GETTERS ==================

	public int getId(){
		return id;
	}

	public int getArea(){
		return area;
	}

	public int getQuarto(){
		return quarto;
	}

	public int getBanheiro(){
		return banheiro;
	}

	public boolean getMobilia(){
		return mobilia;
	}

	public Localizacao getLocal(){
		return local;
	}

	public Contrato getContrato(){
		return contrato;
	}

// ============ SETTERS ==================

	public final void setId(int id){
		this.id = id;
	}

	public final void setArea(int area) throws NegativoException{
		if(area > 0)
			this.area = area;
		else
			throw new NegativoException();
	}

	public final void setQuarto(int quarto) throws NegativoException{
		if(quarto > 0)
			this.quarto = quarto;
		else
			throw new NegativoException();
	}

	public final void setBanheiro(int banheiro) throws NegativoException{
		if(banheiro > 0)
			this.banheiro = banheiro;
		else
			throw new NegativoException();
	}

	public final void setMobilia(boolean mobilia){
		this.mobilia = mobilia;
	}

	public final void setEnd(Localizacao local){
		this.local = local;
	}

	public final void setContrato(Contrato contrato){
		this.contrato = contrato;
	}

}