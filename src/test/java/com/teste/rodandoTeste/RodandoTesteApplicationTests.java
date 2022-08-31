package com.teste.rodandoTeste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RodandoTesteApplicationTests {

	@Test
	void validandoCPFValido() {
		var verdadeiro = ValidadorCpf.validar("019.150.780-67");
		assertEquals(true, verdadeiro);
	}

	@Test
	void validandoCPFInvalido() {
		var verdadeiro = ValidadorCpf.validar("019.150.780-65");
		assertEquals(false, verdadeiro);
	}

}
