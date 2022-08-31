package com.teste.rodandoTeste;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RodandoTesteApplication {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite o seu CPF");
		
		BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
 
        String cpf = reader.readLine();

		System.out.println("O CPF digitado é: " + 
			( ValidadorCpf.validar(cpf) ? "Verdadeiro" : "Falso" )
		);
	}

}
