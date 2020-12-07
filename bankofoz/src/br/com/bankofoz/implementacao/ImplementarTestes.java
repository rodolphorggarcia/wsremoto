package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.execicioVenda.utils.Magic;


public class ImplementarTestes {

	public static void main(String[] args) {
		
		int opcao = Magic.i("Digite <1> para conta corrente ou qualquer outro valor para poupança");
		Conta conta = null;
		if(opcao==1) {
			conta = new Corrente(
					(short) 05473,
					(byte) 0,
					(short) 6548,
					0,
					new Cliente(123, "Rodolpho", "rodolphorggarcia@gmail.com", false),
					100,
					50);
		}
		else {
			conta = new Poupanca();
				conta.setAgencia(Short.parseShort("Agencia"));
			}
		
		System.out.println(conta.verificarSaldo());
		

	}

}
