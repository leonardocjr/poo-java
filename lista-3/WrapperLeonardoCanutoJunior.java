//Nome: Leonardo Canuto Junior -  RA: 2453533;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperLeonardoCanutoJunior{
	
	public static void main(String args[]){

		int opc=0;

		do{
			opc = lerInt("\n\t\t\tUSO DE CLASSES WRAPPERS - MENU DE OPCOES\n1) INTEGER\n2) BOOLEAN\n3) CHARACTER\n4) DOUBLE\n5) BYTE\n6) SHORT\n7) FLOAT\n8) LONG\n0) SAIR\n\nESCOLHA UMA OPCAO:");
			switch(opc){
				case 1:
					convertInt_HexBinStr(lerInt("\nDigite um numero inteiro:")); 
					// Chama o metodo de conversao para a entrada dos valores;
				break;
				
				case 2:
					compareBoolean(ler("\nDigite uma entrada booleana:"), ler("\nDigite mais uma entrada booleana:"));
					// Chama o metodo de comparacao para a entrada dos valores;
				break;

				case 3:
					analiseChar(ler("\nDigite um caractere:"));
				break;

				case 4:
					analisaDouble(lerDouble("\nDigite um numero:"), lerDouble("\nDigite outro numero: "));
					// Chama o metodo de analise para a entrada dos valores;
				break;

				case 5:
					decHexOct("0x01a", "00022");
					// Chama o metodo de decodificacao para a entrada dos valores;
				break;

				case 6:
					convertShrt_Bt(lerShort("\nDigite um numero inteiro: (-128 > x > 127)"));
					// Chama o metodo de conversao para a entrada dos valores;
				break;
		
				case 7:
					convertFloat_Hex(lerFloat("\nDigite um numero:"), lerFloat("\nDigite outro numero:"));
					// Chama o metodo de conversao para a entrada dos valores;
				break;

				case 8:
					convertLong_Bin(lerLong("\nDigite um numero:"));
					// Chama o metodo de conversao para a entrada dos valores;
				break;

				case 0:
					System.out.println("-> Voce saiu, ate mais!");
				break;

				default:
					System.out.println("-> Opcao invalida!\n");
				break;
			}
		}while(opc!=0);
	}

//---------------------------------------------------------------------------------------
// METODOS DE ENTRADA

// i) Metodo ler()
// ii) Recebe uma string texto que apresentara para o usuario e retorna uma string
// que foi recebida pela entrada do teclado
	public static String ler(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		System.out.println(texto);
		try{
			leitura = cd.readLine();
		}catch(IOException e){
			System.out.println("Erro de entrada.");
		}
		return leitura;
	}

// i) Metodo lerInt()
// ii) Recebe uma string texto que apresentara para o usuario e retorna um valor inteiro
// convertido da entrada do teclado pelo usuario.
	public static int lerInt(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		boolean valida = false;
		do{
			System.out.println(texto);
			try{
				leitura = cd.readLine();
				valida = (leitura != null && leitura.matches("[0-9]+"));
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			if(valida == false){
				System.out.println("-> Entrada invalida.");
			}
		}while(valida == false);
		return Integer.parseInt(leitura);
	}

// i) Metodo lerDouble()
// ii) Recebe uma string texto que apresentara para o usuario e retorna um valor em double
// convertido da entrada do teclado pelo usuario.
	public static Double lerDouble(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		boolean valida = false;
		do{
			System.out.println(texto);
			try{
				leitura = cd.readLine();
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			valida = true;
			try{
				Double.parseDouble(leitura);
			}catch(Exception e){
				valida = false;
				System.out.println("-> Entrada invalida.");
			}
		}while(valida == false);
		return Double.parseDouble(leitura);
				
	}

// i) Metodo lerShort()
// ii) Recebe uma string texto que apresentara para o usuario e retorna um valor em short
// convertido da entrada do teclado pelo usuario.
	public static Short lerShort(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		boolean valida = false;
		do{
			System.out.println(texto);
			try{
				leitura = cd.readLine();
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			valida = true;
			try{
				Short.parseShort(leitura);
			}catch(Exception e){
				valida = false;
				System.out.println("-> Entrada invalida.");
			}
		}while(valida == false);
		return Short.parseShort(leitura);
	}

// i) Metodo lerFloat()
// ii) Recebe uma string texto que apresentara para o usuario e retorna um valor em float
// convertido da entrada do teclado pelo usuario.
	public static Float lerFloat(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		boolean valida = false;
		do{
			System.out.println(texto);
			try{
				leitura = cd.readLine();
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			valida = true;
			try{
				Float.parseFloat(leitura);
			}catch(Exception e){
				valida = false;
				System.out.println("-> Entrada invalida.");
			}
		}while(valida == false);
		return Float.parseFloat(leitura);
	}

// i) Metodo lerLong()
// ii) Recebe uma string texto que apresentara para o usuario e retorna um valor em long
// convertido da entrada do teclado pelo usuario.
	public static Long lerLong(String texto){
		InputStreamReader c = new InputStreamReader(System.in);
		BufferedReader cd = new BufferedReader(c);
		String leitura="";
		boolean valida = false;
		do{
			System.out.println(texto);
			try{
				leitura = cd.readLine();
			}catch(IOException e){
				System.out.println("Erro de entrada.");
			}
			valida = true;
			try{
				Long.parseLong(leitura);
			}catch(Exception e){
				valida = false;
				System.out.println("-> Entrada invalida.");
			}
		}while(valida == false);
		return Long.parseLong(leitura);
	}

//---------------------------------------------------------------------------------------
// CLASSES WRAPPERS

// i) Classe Integer: métodos toHexString(), toBinaryString() e toString();
// ii) O método convertInt_HexBinStr() irá realizar a conversao
// decimal para hexadecimal e binário;
// iii) Referência: <https://acervolima.com/classe-java-lang-integer-em-java/>
	public static void convertInt_HexBinStr(int i){
		String str = Integer.toString(i);
		String hex = Integer.toHexString(i);
		String bin = Integer.toBinaryString(i);
		System.out.println("\nOPCAO 1: CLASSE INTEGER");
		System.out.println("-----------------------");
		System.out.println("INTEIRO     | " + i);
		System.out.println("STRING      | " + str);
		System.out.println("HEXADECIMAL | " + hex.toUpperCase());
		System.out.println("BINARIO     | " + bin);
	}

// i) Classe Boolean: metodos valueOf(), equals() e toString();
// ii) O metodo compareBoolean ira receber duas strings distintas transforma-las em
// objetos boolean realizar um equal entre elas e retornar pra bool seu resultado em string;
// iii) Referencia: <https://www.javaguides.net/2018/08/boolean-wrapper-class-in-java.html>
	public static void compareBoolean(String x, String y){
		Boolean a = Boolean.valueOf(x);
		Boolean b = Boolean.valueOf(y);
		Boolean c = a.equals(b);
		String bool = c.toString();
		System.out.println("\nOPCAO 2: CLASSE BOOLEAN");
		System.out.println("-----------------------");
		System.out.println("Operacao: " + x + " + " + y + " = " + bool.toUpperCase() + " ("+a+" + "+b+")");
		System.out.println(bool == "true" ? "Resultado: " + bool.toUpperCase() + " | Entradas iguais!"  : "Resultado: " + bool.toUpperCase() + " | Entradas diferentes!");
	}

// i) Classe Character: metodos isDigit(), isLetter(), isUpperCase(), isLowerCase() e isWhitespace();
// ii) O metodo compareBoolean ira receber duas strings distintas transforma-las em
// objetos boolean realizar um equal entre elas e retornar pra bool seu resultado em string;
// iii) Referencia: <https://www.javaguides.net/2018/08/boolean-wrapper-class-in-java.html>
	public static void analiseChar(String a){
		Character ch = a.charAt(0);
		System.out.println("\nOPCAO 3: CLASSE CHARACTER");
		System.out.println("-----------------------");
		System.out.println("Caractere analisado: " + ch);
		System.out.println("Em ASCII: " + (int)ch);
		if(Character.isDigit(ch) == true){
			System.out.println("-> E um digito.");
		}else if(Character.isLetter(ch) == true){
			System.out.println("-> E uma letra.");
			if(Character.isUpperCase(ch) == true){
				System.out.println("--> E uma letra maiuscula.");
			}else if(Character.isLowerCase(ch) == true){
				System.out.println("--> E uma letra minuscula.");
			}
		}else if(Character.isWhitespace(ch) == true){
			System.out.println("-> E um espaco em branco.");
		}else{
			System.out.println("-> Caractere especial.");
		}
	}

// i) Classe Double: metodos parseDouble(), valueOf(), sum(), max(), min(), intValue();
// ii) O metodo validaDouble ira receber uma string e verifica-la se é passivel de 
// conversao para um double, retornando verdadeiro ou falso
// iii) Referencia: <https://www.javaguides.net/2018/08/boolean-wrapper-class-in-java.html>
	public static void analisaDouble(Double x, Double y){
		System.out.println("\nOPCAO 4: CLASSE DOUBLE");
		System.out.println("-----------------------");
		Double z = Double.sum(x, y);
		System.out.println("Equacao: " + x + " + " + y + " = " + z);
		System.out.println("O produto da soma EXATA: " + z);
		System.out.println("O produto da soma INTEIRO: " + z.intValue());
		System.out.println("O maior valor: " + Double.max(x, y));
		System.out.println("O menor valor: " + Double.min(x, y));
	}

// i) Classe Byte: metodos decode();
// ii) O metodo decHexOct ira receber duas strings e decodifica-las de hexadecimal
// e octal para decimal.
// iii) Referencia: <https://www.javaguides.net/2018/08/byte-wrapper-class-in-java.html>
	public static void decHexOct(String hex, String oct){
		System.out.println("\nOPCAO 5: CLASSE BYTE");
		System.out.println("-----------------------");
		System.out.println("Decodificando HEX/OCT para DECIMAL");
		System.out.println("HEX: " + hex + " | " + "DEC: " + Byte.decode(hex));
		System.out.println("OCT: " + oct + " | " + "DEC: " + Byte.decode(oct));
	}

// i) Classe Short: metodos valueOf(), byteValue();
// ii) O metodo convertShrt_Bt ira receber uma string e converte-la em byte
// iii) Referencia: <https://www.javaguides.net/2018/08/short-wrapper-class-in-java.html>
	public static void convertShrt_Bt(Short shrt){
		System.out.println("\nOPCAO 6: CLASSE SHORT");
		System.out.println("-----------------------");
		System.out.println("Valor em short: " + shrt);
		System.out.println("Valor em byte: " + shrt.byteValue());
	}

// i) Classe Float: metodos valueOf(), sum(), toHexString(), max(), min();
// ii) O metodo convertFloat_Hex ira receber duas string e realizar a
// conversao para um Float, depois realizando operacoes e conversoes para hexadecimal
// iii) Referencia: <https://www.javaguides.net/2018/08/float-wrapper-class-in-java.html>
	public static void convertFloat_Hex(Float x, Float y){
		System.out.println("\nOPCAO 7: CLASSE FLOAT");
		System.out.println("-----------------------");
		Float z = Float.sum(x, y);
		System.out.println("1. Valor em float: " + x + " | HEX: " + Float.toHexString(x).toUpperCase());
		System.out.println("2. Valor em float: " + y + " | HEX: " + Float.toHexString(y).toUpperCase());
		System.out.println("*. Produto da soma: " + z + " | HEX: " + Float.toHexString(z).toUpperCase());
		System.out.println("MAX: " + Float.max(x, y) + " | MIN: " + Float.min(x, y));
	}

// i) Classe Long: metodos valueOf(), toBinaryString(), rotateLeft();
// ii) O metodo convertLong_Bin ira receber uma string e realizar a conversao para um
// Long, apos isso realizar conversao para binario e fazer uma rotacao de casas binarias;
// iii) Referencia: <https://www.javaguides.net/2018/08/long-wrapper-class-in-java.html>
	public static void convertLong_Bin(Long lng){
		System.out.println("\nOPCAO 8: CLASSE LONG");
		System.out.println("-----------------------");
		System.out.println("Valor: " + lng + " | BIN: " + Long.toBinaryString(lng));
		Long lngr = Long.rotateLeft(lng, 1);
		System.out.println("Rotacionando uma casa binaria: (para esquerda)"); //Vai ser adicionado 0 a direita do cod. binario;
		System.out.println("Valor: " + lngr + " | BIN: " + Long.toBinaryString(lngr));
	}

}