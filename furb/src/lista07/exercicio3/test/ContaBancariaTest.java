package lista07.exercicio3.test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lista07.exercicio3.ContaBancaria;
import lista07.exercicio3.ContaEspecial;
import lista07.exercicio3.Movimento;
import lista07.exercicio3.TipoMovimento;

class ContaBancariaTest {

	@Test
	void testSacarGeraMovimentoCreditoDebitoContaBancaria() {
		ContaBancaria conta = new ContaEspecial();
		conta.depositar(1000);
		conta.sacar(250);


		/* pegando o primeiro objeto movimento do arraylist movimentos da conta */
		Movimento movimento1 = conta.getMovimentos().get(0);
		assertEquals(TipoMovimento.CREDITO, movimento1.getTipoMovimento());
		assertEquals(1000, movimento1.getValor(), 0.00);
		
//		/* pegando o segundo objeto movimento do arraylist movimentos da conta */
		conta.incluirMovimento(new Movimento(250.00, TipoMovimento.DEBITO));
		Movimento movimento2 = conta.getMovimentos().get(1);
		conta.incluirMovimento(movimento2);
		
		assertEquals(TipoMovimento.DEBITO, movimento2.getTipoMovimento());
		assertEquals(250, movimento2.getValor(), 0.00);
		

	}

}
