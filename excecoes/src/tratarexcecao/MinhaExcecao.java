package tratarexcecao;


public class MinhaExcecao {

	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		} else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Excecao desconhecida";
		}
	
	}//fecha o m�todo
	
}// fecha a classe