package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "rodolpho.garcia@itau-unibanco.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " +email.toLowerCase());
		System.out.println("Maiusculo: " +email.toUpperCase());
		System.out.println("comprimento do email: " + email.length());
		System.out.println("Tem @ ??? " + email.contains("@"));
		System.out.println("Qual posicao ??  " + email.indexOf("@"));
		System.out.println("Exibindo parte da string " + email.substring(0,4));
		System.out.println(email.substring(0, email.length()/2) + "\n\n");
		
		if(email.indexOf("@") == -1) { //or contains("@")==false
			
			System.out.println("email nao tem @");
			
		}
		else {
			System.out.println("Exibir usuario do email: " + email.substring(0,(email.indexOf("@"))));
			System.out.println("Exibir servidor do email: " + email.substring(email.indexOf("@")+1, email.length()) + "\n"); //se nao colocar o final ele vai ate o final do email
			
		}
		
		

	}

}

