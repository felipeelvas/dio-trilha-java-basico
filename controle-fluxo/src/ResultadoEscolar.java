public class ResultadoEscolar {
	public static void main(String[] args) {
		int  nota = 7;

		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";//condição ternária
		System.out.println(resultado);
	}
}

// 	int  nota = 5;

	// 	String resultado = nota >=7 ? "Aprovado" : "Reprovado";//condição ternária
	// 	System.out.println(resultado);
	// }
	// int  nota = ?;

	// 	if(nota>= 7)
	// 	System.out.println("Aprovado");
		
	// 	else if(nota >= 5 && nota < 7)
	// 	System.out.println("Prova Recuperação"); condição encadeada
		
	// 	else
	// 	System.out.println("Reprovado");

	// }
