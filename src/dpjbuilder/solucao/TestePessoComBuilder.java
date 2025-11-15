package dpjbuilder.solucao;

import java.time.LocalDate;

import dpjbuilder.Pessoa;

public class TestePessoComBuilder {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.PessoaBuilder()
			.nome("Anderson")
			.sobreNome("José")
			.documento("12312312312")
			.email("teste@teste.com.br")
			.apelido("careca")
			.dataNascimento(LocalDate.of(2010, 10, 22))
			.build();
		
		
		
		System.out.println(pessoa);
		
		StringBuilder sb = new StringBuilder().append("palavra1").append("palavra2");
		System.out.println(sb);
	}

}
