//Nome: Leonardo Canuto Junior -  RA: 2453533
import java.util.GregorianCalendar;

public class Data{
	public static void main(String args[]){
		GregorianCalendar data = new GregorianCalendar();

		int dia = data.get(data.DAY_OF_MONTH);
		int mes = data.get(data.MONTH)+1;
		int ano = data.get(data.YEAR);
		System.out.println("\nDATA ATUAL DO SISTEMA: "+dia+"/"+mes+"/"+ano+"\n\n");
		System.out.println("\nDATA ATUAL DO DATA.GET: "+data.get(data.DAY_OF_MONTH)+"/"+data.get(data.MONTH)+"/"+data.get(data.YEAR)+"\n\n");
	}
}