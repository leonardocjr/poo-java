// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import javax.swing.JOptionPane;

public class Pousada extends Imovel implements Calculos{

	private String lazer;
	private Refeicoes ref;

	public Pousada(){
            lazer = "";
            ref = new Refeicoes();
	}

// ============= SOBRECARGA ==============
	public Pousada(String lazer, Refeicoes ref){
            this.lazer = lazer;
            this.ref = ref;
	}

	public Pousada(Pousada pos){
            super(pos);
            this.lazer = pos.getLazer();
            this.ref = pos.getRef();
	}

// =============== INTERFACE =============
	public final double contAluguel(){
            double base = 250.0;
            base+=(getQuarto()*350.0);
            base+=(getBanheiro()*250.0);
            base+=(getArea()*15.0);
            if(getMobilia())
                base+=350.0;
            base+=(getRef().getQtdRef()*350.0);
            if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC"))
                base*=2;
            else if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM"))
                base*=1.5;
            else
                base*=1.25;
            return (base/30)*2;
	}
	public final double contCompra(){
            double base = 50000.0;
            base+=(getQuarto()*25000.0);
            base+=(getBanheiro()*12500.0);
            base+=(getArea()*1000.0);
            if(getMobilia())
                base+=12500.0;
            if(getLocal().getReg().getUf().equals("SP") || getLocal().getReg().getUf().equals("RJ") || getLocal().getReg().getUf().equals("BA") || getLocal().getReg().getUf().equals("DF") || getLocal().getReg().getUf().equals("RS") || getLocal().getReg().getUf().equals("SC"))
                base*=3;
            else if(getLocal().getReg().getUf().equals("MG") || getLocal().getReg().getUf().equals("ES") || getLocal().getReg().getUf().equals("MS") || getLocal().getReg().getUf().equals("GO") || getLocal().getReg().getUf().equals("SE") || getLocal().getReg().getUf().equals("PR") || getLocal().getReg().getUf().equals("CE") || getLocal().getReg().getUf().equals("PE") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM") || getLocal().getReg().getUf().equals("AM"))
                base*=2;
            else
                base*=1.5;
            return (base+getContrato().getImposto());
	}

// ============= SOBRESCRITA =============
	public final void calcComissao(){
            double valorCompra = getContrato().getCompra().getValor();
            double valorAluguel = getContrato().getAluguel().getValor();
            String texto = "Esse imovel ja esta ocupado ou não habilita compra e aluguel.";
            if((getContrato().getCompra().getHabilitado() || getContrato().getAluguel().getHabilitado()) && !getContrato().getOcupado())
                texto = "Comissao de "+getContrato().getCorretor().getNome()+"\n";
            if(getContrato().getCompra().getHabilitado() && !getContrato().getOcupado())
                texto += "\nComissao de venda: R$"+String.format("%.2f", (valorCompra*0.01));
            if(getContrato().getAluguel().getHabilitado() && !getContrato().getOcupado())
                texto += "\nComissao da diaria: R$"+String.format("%.2f", (valorAluguel*0.03));
            JOptionPane.showMessageDialog(
                        null,
                        texto,
                        "Verificando comissao",
                        1
            );
	}
	public final double calcParcelar(int parcelas){
            double valor = getContrato().getCompra().getValor();
            return (((valor/parcelas)*1.0114)*parcelas);
	}
        
	public String getLazer(){
            return lazer;
	}
	public Refeicoes getRef(){
            return ref;
	}
	public final void setLazer(String lazer){
            this.lazer = lazer;
	}
	public final void setRef(Refeicoes ref){
            this.ref = ref;
	}
}