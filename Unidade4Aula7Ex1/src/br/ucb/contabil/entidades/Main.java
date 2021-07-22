package br.ucb.contabil.entidades;

public class Main {
	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("BB");
		pj.setCnpj("3000");
		pj.setLucroBruto(400000);
		System.out.println(pj.getImposto());
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Fulano");
		pf.setCpf("32165");
		pf.setSalario(1500);
		System.out.println(pf.getImposto());
		
		contabilidade(pf);
	}
	
	public static void contabilidade(Pessoa p) {
		System.out.println(p.getNome());
		System.out.println(p.getImposto());
	}
}
