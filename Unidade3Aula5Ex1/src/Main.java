import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Professor p  = new Professor();
		
		p.setNome("Michael");
		p.setCpf("123");
		p.setSalario(1500);
		p.setTitulacao("MESTRE");
		
		System.out.println(p.getImpostoDeRenda());
		System.out.println(p.getGratificao());
			
		
		Calendar dtAdmissao = Calendar.getInstance();
		dtAdmissao.set(Calendar.DAY_OF_MONTH, 1);
		dtAdmissao.set(Calendar.MONTH, Calendar.MARCH);
		dtAdmissao.set(Calendar.YEAR, 2000);
		
		
		Administrativo a = new Administrativo();
		
		
		a.setNome("Fumano");
		a.setDependentes(2);
		a.setCpf("123");
		a.setSalario(50000);
		a.setDtAdimissao(dtAdmissao);
		
		
		System.out.println("Sindicato: "+a.getContribuicaoSindical());
		System.out.println("Dias trabalhados: "+a.getDiasTrabalhados());
		System.out.println("Gratificação: "+a.getGratificao());
	}
}
