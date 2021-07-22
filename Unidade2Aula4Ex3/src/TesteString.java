
public class TesteString {
	public static void main(String[] args) {
		String a = "teste";
		a = a + " outro teste";
		
		StringBuffer sbuf = new StringBuffer();
		sbuf.append("teste");
		sbuf.append(" outro teste");
		System.out.println(sbuf);
		
		StringBuilder sb = new StringBuilder();
		sb.append("teste");
		sb.append(" outro teste");
		System.out.println(sb);

	}
}
