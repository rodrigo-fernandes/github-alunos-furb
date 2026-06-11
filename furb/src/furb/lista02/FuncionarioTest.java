package furb.lista02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncionarioTest {

	
	@Test
	void testImpostoCalculadoComoPrimeiraFaixa() {
		Funcionario funcionario = new Funcionario("Robson", 850);
		assertEquals(0.00, funcionario.calcularIrpf());
	}

}
