package dasafio1;

public class Anagrama {
	
	public static void main(String[] args) {
		
		String s1 = "RUMO";
		String s2 = "MURO";
		
		System.out.println("palavra 1: " + s1);
		System.out.println("palavra 2: " + s2);
		System.out.println("------------------");
		
		System.out.println(validarAnagrama(s1,s2)? "É um anagrama" : "Não é um anagrama");

		
	}

	private static boolean validarAnagrama(String s1, String s2) {
		boolean resultado = false;
		int valor1 = 0;
		int valor2= 0;
		
		if (s1.length() != s2.length()) {
			return resultado;
		}else {
			for(int i = 0; i < s1.length(); i++ ) {
				valor1 = s1.charAt(i);
				valor2 = s2.charAt(i);
				
			}
			resultado = (valor1 == valor2);
		}
		return resultado;
	}
	
}
