//Nome: Leonardo Canuto Junior -  RA: 2453533
package com.mycompany.lista5;

import java.util.List;
import java.util.ArrayList;

public class BancoVeic {
    
    private static List<Passeio> bdPasseio;
    private static Passeio p;
    private static List<Carga> bdCarga;
    private static Carga c;
    
    private static BancoVeic bancoVeicUnico;
    
    private BancoVeic(){
        bdPasseio = new ArrayList<Passeio>();
        bdCarga = new ArrayList<Carga>();
    }
    
    public static BancoVeic getBancoVeic(){
	if(bancoVeicUnico == null)
		bancoVeicUnico = new BancoVeic();
	return bancoVeicUnico;
    }
    
    // GETTERS
    public static List<Passeio> getBdPasseio(){
        return bdPasseio;
    }
    public static List<Carga> getBdCarga(){
        return bdCarga;
    }
    
    // CONSULTA
    public static Passeio consPasseioPlaca(Passeio p){
	for(int i = 0; i < bdPasseio.size(); i++){
            if(p.getPlaca().equals(bdPasseio.get(i).getPlaca())){
		return bdPasseio.get(i);
            }
	}
	return null;
    }
    public static Carga consCargaPlaca(Carga c){
	for(int i = 0; i < bdCarga.size(); i++){
            if(c.getPlaca().equals(bdCarga.get(i).getPlaca())){
		return bdCarga.get(i);
            }
	}
	return null;
    }

    // CADASTRA
    public static Passeio cadPasseio(Passeio p){
        if(consPasseioPlaca(p)== null){
            bdPasseio.add(p);
            return p;
        }
        return null;
    }
    public static Carga cadCarga(Carga c){
        if(consCargaPlaca(c)== null){
            bdCarga.add(c);
            return c;
        }
        return null;
    }
    
    // ALTERA
    public static Passeio altPasseio(Passeio p){
	for(int i = 0; i < bdPasseio.size(); i++){
            if(p.getPlaca().equals(bdPasseio.get(i).getPlaca())){
		bdPasseio.set(i, p);
		return bdPasseio.get(i);
            }
	}
	return null;
    }
    public static Carga altCarga(Carga c){
	for(int i = 0; i < bdCarga.size(); i++){
            if(c.getPlaca().equals(bdCarga.get(i).getPlaca())){
		bdCarga.set(i, c);
		return bdCarga.get(i);
            }
	}
	return null;
    }

    // DELETA
    public static Passeio delPasseio(Passeio p){
	for(int i = 0; i < bdPasseio.size(); i++){
            if(p.getPlaca().equals(bdPasseio.get(i).getPlaca())){
		bdPasseio.remove(bdPasseio.get(i));
		return null;
            }
	}
	return p;	
    }
    public static Carga delCarga(Carga c){
	for(int i = 0; i < bdCarga.size(); i++){
            if(c.getPlaca().equals(bdCarga.get(i).getPlaca())){
		bdCarga.remove(bdCarga.get(i));
		return null;
            }
	}
	return c;	
    }
 
}
