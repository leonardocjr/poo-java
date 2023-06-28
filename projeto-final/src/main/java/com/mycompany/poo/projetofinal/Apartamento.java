// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class Apartamento extends Imovel implements Calculos{

	private int andar;
	private boolean salaFesta;
	private boolean academia;

	public Apartamento(){
            andar = 0;
            salaFesta = false;
            academia = false;
	}

// ============= SOBRECARGA ==============
	public Apartamento(int andar, boolean salaFesta, boolean academia){
            this.andar = andar;
            this.salaFesta = salaFesta;
            this.academia = academia;

	}
	public Apartamento(Apartamento apto){
            super(apto);
            this.andar = apto.getAndar();
            this.salaFesta = apto.getSalaFesta();
            this.academia = apto.getAcademia();
	}

// ============= SOBRESCRITA =============
	public final double contAluguel(){
            double base = 250.0;
            base+=(getQuarto()*350.0);
            base+=(getBanheiro()*250.0);
            base+=(getArea()*15.0);
            if(getMobilia())
                base+=250.0;
            if(getAcademia())
                base+=100.0;
            if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC"))
                base*=1.5;
            else if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM"))
                base*=1.25;
            else
                base*=1;
            return base+getContrato().getImposto();
	}
	public final double contCompra(){
            double base = 50000.0;
            base+=(getQuarto()*25000.0);
            base+=(getBanheiro()*12500.0);
            base+=(getArea()*1000.0);
            if(getMobilia())
                base+=10000.0;
            if(getAcademia())
                base+=2500.0;
            if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC"))
                base*=2.5;
            else if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM"))
                base*=2;
            else
                base*=1.5;
            return (base+getContrato().getImposto());
	}

// =============== INTERFACE =============
	public final void calcComissao(){
            double valorCompra = getContrato().getCompra().getValor();
            double valorAluguel = getContrato().getAluguel().getValor();
            String texto = "Esse imovel ja esta ocupado ou não habilita compra e aluguel.";
            if((getContrato().getCompra().getHabilitado() || getContrato().getAluguel().getHabilitado()) && !getContrato().getOcupado())
                texto = "Comissao de "+getContrato().getCorretor().getNome()+"\n";
            if(getContrato().getCompra().getHabilitado() && !getContrato().getOcupado())
                texto += "\nComissao de venda: R$"+String.format("%.2f", (valorCompra*0.01));
            if(getContrato().getAluguel().getHabilitado() && !getContrato().getOcupado())
                texto += "\nComissao de aluguel: R$"+String.format("%.2f", (valorAluguel*0.05));
            JOptionPane.showMessageDialog(
                        null,
                        texto,
                        "Verificando comissao",
                        1
            );
	}
	public final double calcParcelar(int parcelas){
            return (((getContrato().getCompra().getValor()/parcelas)*1.0114)*parcelas);
	}

	public int getAndar(){
            return andar;
	}
	public boolean getSalaFesta(){
            return salaFesta;
	}
	public boolean getAcademia(){
            return academia;
	}
	public final void setAndar(int andar) throws ZeroNegException{
            if(andar >= 0)
                this.andar = andar;
            else
                throw new ZeroNegException();
	}
	public final void setSalaFesta(boolean salaFesta){
            this.salaFesta = salaFesta;
	}
	public final void setAcademia(boolean academia){
            this.academia = academia;
	}
}