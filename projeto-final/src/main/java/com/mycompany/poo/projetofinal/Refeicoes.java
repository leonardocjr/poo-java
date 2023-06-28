// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;

public class Refeicoes{

	private boolean cafeM;
	private boolean almoco;
	private boolean cafeT;
	private boolean janta;
	private boolean ceia;
	private int qtdRef;

	public Refeicoes(){
            cafeM = false;
            almoco = false;
            cafeT = false;
            janta = false;
            ceia = false;
            qtdRef = 0;
	}

// ============= SOBRECARGA ==============
	public Refeicoes(boolean cafeM, boolean almoco, boolean cafeT, boolean janta, boolean ceia, int qtdRef){
            this.cafeM = cafeM;
            this.almoco = almoco;
            this.cafeT = cafeT;
            this.janta = janta;
            this.ceia = ceia;
            this.qtdRef = qtdRef;
	}
	public Refeicoes(Refeicoes ref){
            this.cafeM = ref.cafeM;
            this.almoco = ref.almoco;
            this.cafeT = ref.cafeT;
            this.janta = ref.janta;
            this.ceia = ref.ceia;
            this.qtdRef = ref.qtdRef;
	}

	public final int calcRef(){
            int qtdRef=0;
            if(cafeM)
                qtdRef+=1;
            if(almoco)
                qtdRef+=1;
            if(cafeT)
                qtdRef+=1;
            if(janta)
                qtdRef+=1;
            if(ceia)
                qtdRef+=1;
            return qtdRef;
	}

	public boolean getCafeM(){
            return cafeM;
	}
	public boolean getAlmoco(){
            return almoco;
	}
	public boolean getCafeT(){
            return cafeT;
	}
	public boolean getJanta(){
            return janta;
	}
	public boolean getCeia(){
            return ceia;
	}
	public int getQtdRef(){
            return qtdRef;
	}
	public final void setCafeM(boolean cafeM){
            this.cafeM = cafeM;
	}
	public final void setAlmoco(boolean almoco){
            this.almoco = almoco;
	}
	public final void setCafeT(boolean cafeT){
            this.cafeT = cafeT;
	}
	public final void setJanta(boolean janta){
            this.janta = janta;
	}
	public final void setCeia(boolean ceia){
            this.ceia = ceia;
	}
	public final void setQtdRef(int qtdRef){
            this.qtdRef = qtdRef;
	}
}