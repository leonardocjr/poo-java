// Nome: Leonardo Canuto Junior - RA: 2453533
package com.mycompany.poo.projetofinal;
import java.util.List;
import java.util.ArrayList;

public class Banco{

	private static List<Apartamento> bdAp;
	private static List<Casa> bdCs;
	private static List<Kitnet> bdKn;
	private static List<Pousada> bdPs;
	private static Banco bUnico;
        
        private String[] ufs = {"AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"};
        private String[] paredes = {"MADEIRA", "CONCRETO", "TIJOLO"};
        private String[] lazer = {"PRAIA", "RESORT", "FESTAS"};
        
	private Banco(){
            bdAp = new ArrayList<Apartamento>();
            bdCs = new ArrayList<Casa>();
            bdKn = new ArrayList<Kitnet>();
            bdPs = new ArrayList<Pousada>();
	}

	public static Banco getBanco(){
            if(bUnico == null)
                    bUnico = new Banco();
            return bUnico;
	}
        public static List<Apartamento> getBdAp(){
            return bdAp;
        }
        public static List<Casa> getBdCs(){
            return bdCs;
        }
        public static List<Kitnet> getBdKn(){
            return bdKn;
        }
        public static List<Pousada> getBdPs(){
            return bdPs;
        }
        
	public Apartamento cadAp(Apartamento a){
            if(consApMatricula(a) == null){
  		bdAp.add(a);
		return a;
            }
            return null;
	}
        public Casa cadCs(Casa c){
            if(consCsMatricula(c) == null){
  		bdCs.add(c);
		return c;
            }
            return null;
	}
        public Kitnet cadKn(Kitnet k){
            if(consKnMatricula(k) == null){
  		bdKn.add(k);
		return k;
            }
            return null;
	}
        public Pousada cadPs(Pousada p){
            if(consPsMatricula(p) == null){
  		bdPs.add(p);
		return p;
            }
            return null;
	}
        
	public Apartamento consApMatricula(Apartamento a){
            for(int i = 0; i < bdAp.size(); i++){
                if(bdAp.get(i).getContrato().getMatricula().equals(a.getContrato().getMatricula())){
                    return bdAp.get(i);
                }
            }
            return null;
	}
        public Casa consCsMatricula(Casa c){
            for(int i = 0; i < bdCs.size(); i++){
                if(bdCs.get(i).getContrato().getMatricula().equals(c.getContrato().getMatricula())){
                    return bdCs.get(i);
                }
            }
            return null;
	}
	public Kitnet consKnMatricula(Kitnet k){
            for(int i = 0; i < bdKn.size(); i++){
                if(bdKn.get(i).getContrato().getMatricula().equals(k.getContrato().getMatricula())){
                    return bdKn.get(i);
                }
            }
            return null;
	}
        public Pousada consPsMatricula(Pousada p){
            for(int i = 0; i < bdPs.size(); i++){
                if(bdPs.get(i).getContrato().getMatricula().equals(p.getContrato().getMatricula())){
                    return bdPs.get(i);
                }
            }
            return null;
	}
        
        public Apartamento consApCorretor(Apartamento a){
            for(int i = 0; i < bdAp.size(); i++){
                if(bdAp.get(i).getContrato().getCorretor().getNome().equals(a.getContrato().getCorretor().getNome())){
                    return bdAp.get(i);
                }
            }
            return null;
	}
        public Casa consCsCorretor(Casa c){
            for(int i = 0; i < bdCs.size(); i++){
                if(bdCs.get(i).getContrato().getCorretor().getNome().equals(c.getContrato().getCorretor().getNome())){
                    return bdCs.get(i);
                }
            }
            return null;
	}
        public Kitnet consKnCorretor(Kitnet k){
            for(int i = 0; i < bdKn.size(); i++){
                if(bdKn.get(i).getContrato().getCorretor().getNome().equals(k.getContrato().getCorretor().getNome())){
                    return bdKn.get(i);
                }
            }
            return null;
	}
        public Pousada consPsCorretor(Pousada p){
            for(int i = 0; i < bdPs.size(); i++){
                if(bdPs.get(i).getContrato().getCorretor().getNome().equals(p.getContrato().getCorretor().getNome())){
                    return bdPs.get(i);
                }
            }
            return null;
	}
        
        public Apartamento consApUf(Apartamento a){
            for(int i = 0; i < bdAp.size(); i++){
                if(bdAp.get(i).getLocal().getReg().getUf().equals(a.getLocal().getReg().getUf())){
                    return bdAp.get(i);
                }
            }
            return null;
	}
        public Casa consCsUf(Casa c){
            for(int i = 0; i < bdCs.size(); i++){
                if(bdCs.get(i).getLocal().getReg().getUf().equals(c.getLocal().getReg().getUf())){
                    return bdCs.get(i);
                }
            }
            return null;
	}
        public Kitnet consKnUf(Kitnet k){
            for(int i = 0; i < bdKn.size(); i++){
                if(bdKn.get(i).getLocal().getReg().getUf().equals(k.getLocal().getReg().getUf())){
                    return bdKn.get(i);
                }
            }
            return null;
	}
        public Pousada consPsUf(Pousada p){
            for(int i = 0; i < bdPs.size(); i++){
                if(bdPs.get(i).getLocal().getReg().getUf().equals(p.getLocal().getReg().getUf())){
                    return bdPs.get(i);
                }
            }
            return null;
	}
        
	public Apartamento altAp(Apartamento a){
            for(int i = 0; i < bdAp.size(); i++){
                if(bdAp.get(i).getContrato().getMatricula().equals(a.getContrato().getMatricula())){
                    bdAp.set(i, a);
                    return bdAp.get(i);
                }
            }
            return null;
	}
	public Casa altCs(Casa c){
            for(int i = 0; i < bdCs.size(); i++){
                if(bdCs.get(i).getContrato().getMatricula().equals(c.getContrato().getMatricula())){
                    bdCs.set(i, c);
                    return bdCs.get(i);
                }
            }
            return null;
	}
	public Kitnet altKn(Kitnet k){
            for(int i = 0; i < bdKn.size(); i++){
                if(bdKn.get(i).getContrato().getMatricula().equals(k.getContrato().getMatricula())){
                    bdKn.set(i, k);
                    return bdKn.get(i);
                }
            }
            return null;
	}
	public Pousada altPs(Pousada p){
            for(int i = 0; i < bdPs.size(); i++){
                if(bdPs.get(i).getContrato().getMatricula().equals(p.getContrato().getMatricula())){
                    bdPs.set(i, p);
                    return bdPs.get(i);
                }
            }
            return null;
	}

	public Apartamento delAp(Apartamento a){
            for(int i = 0; i < bdAp.size(); i++){
                if(bdAp.get(i).getContrato().getMatricula().equals(a.getContrato().getMatricula())){
                    bdAp.remove(bdAp.get(i));
                    return null;
                }
            }
            return a;
	}
	public Casa delCs(Casa c){
            for(int i = 0; i < bdCs.size(); i++){
                if(bdCs.get(i).getContrato().getMatricula().equals(c.getContrato().getMatricula())){
                    bdCs.remove(bdCs.get(i));
                    return null;
                }
            }
            return c;
	}
	public Kitnet delKn(Kitnet k){
            for(int i = 0; i < bdKn.size(); i++){
                if(bdKn.get(i).getContrato().getMatricula().equals(k.getContrato().getMatricula())){
                    bdKn.remove(bdKn.get(i));
                    return null;
                }
            }
            return k;
	}
	public Pousada delPs(Pousada p){
            for(int i = 0; i < bdPs.size(); i++){
                if(bdPs.get(i).getContrato().getMatricula().equals(p.getContrato().getMatricula())){
                        bdPs.remove(bdPs.get(i));
                    return null;
                }
            }
            return p;
	}
        public int consulIndexUf(String uf){
            for(int i = 0; i<27; i++){
                if(ufs[i].equals(uf))
                    return (1+i);
            }
            return -1;
        }
        public int consulIndexParedes(String parede){
            for(int i = 0; i<3; i++){
                if(paredes[i].equals(parede))
                    return (1+i);
            }
            return -1;
        }
        public int consulIndexLazer(String laz){
            for(int i = 0; i<3; i++){
                if(lazer[i].equals(laz))
                    return (1+i);
            }
            return -1;
        }
}