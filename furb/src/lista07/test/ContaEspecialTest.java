package lista07.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import lista07.ContaEspecial;

class ContaEspecialTest {

	@Test
	public void testPermiteSacarSuperiorSaldo() {
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setLimiteCredito(100);
		contaEspecial.depositar(20);
		contaEspecial.sacar(50);
		
		assertEquals(-30, contaEspecial.getSaldo());
	}

	
	@Test
	public void testPermiteSAcarSuperiorSaldoInferiorLimite() {
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setLimiteCredito(100);
		contaEspecial.depositar(20);
		contaEspecial.sacar(120);
		
		assertEquals(-100, contaEspecial.getSaldo());
	}
	
	
	@Test
	public void testPermiteSacarValorSuperiorSaldoInferiorLimite() {
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setLimiteCredito(100);
		contaEspecial.depositar(20);
		contaEspecial.sacar(120.01);
		
	}
	
}
