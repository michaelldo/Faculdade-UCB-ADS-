package br.ucb.trabalhoFinal.main;
import br.ucb.trabalhoFinal.entidades.Diretor;
import br.ucb.trabalhoFinal.entidades.Funcionario;
import br.ucb.trabalhoFinal.entidades.Professor;

/**
 * Trabalho Final.
 * @author mic_o
 *
 */
public class Main {
	public static void main(String[] args) {
		Diretor d = new Diretor();
		
		d.setCpf("123");
		d.setNome("michael");
		d.setFuncao("Diretor");
		
		Professor p = new Professor();
		
		p.setCpf("123");
		p.setNome("Teste");
		p.setFuncao("Professor");
		
		System.out.println(p.toString());
		System.out.println(d.toString());
	}
}
