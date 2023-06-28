//Nome: Leonardo Canuto Junior -  RA: 2453533
public class Stringe {
	public static void main(String args[]){
		String frase = "Eis-me aqui SENHOR, envia-me a mim";
		System.out.println("\t"+frase);
		System.out.println("\t-> A frase anterior tem "+frase.length()+" caracteres");
		System.out.println("\n\n\tTRANSFORMANDO-A TODA em minuscula: ");
		System.out.println("\t-> "+ frase.toLowerCase());
		System.out.println("\n\n\tTRANSFORMANDO-A TODA em maiuscula: ");
		System.out.println("\t-> "+frase.toUpperCase());
		System.out.println("\n\n\tProcurando a letra da posição 10:");
		System.out.println("\t-> "+frase.charAt(13));
		System.out.println("\n\n\tRetornando a substring dentro da frase");
		System.out.println("\t-> "+frase.substring(0,11));
		System.out.println("\n\n\t1° Vez que encontrou a letra 'O' na frase: ");
		System.out.println("\t-> "+frase.indexOf('O'));
		System.out.println("\n\n\tTirando os espaços em branco: ");
		System.out.println("\t-> "+frase.trim());
		System.out.println("\n\n\tTrocando as letras 'm' por 'M': ");
		System.out.println("\t-> "+frase.replace('m','M'));
	}
}