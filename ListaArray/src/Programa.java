import java.util.ArrayList;
//google: API String ou ArrayList java 8
public class Programa {
	public static void main(String[] args) {
		ArrayList<String> times = new ArrayList<String>();
		
		//Adiciona elementos no Array List
		times.add("Palmeiras");
		times.add("São Paulo");
		times.add("Corinthians");
		times.add("Santos");
		
		String time = times.get(3);// inicia de Zero
		System.out.println(time);
		
		int indice = times.indexOf("Santos");
		System.out.println(indice);
		
		boolean isExist = times.contains("Palmeiras");
		System.out.println(isExist);
		
		System.out.println(times.size());
		
		for (String elemento : times) { //foreach - interar uma coleção
			System.out.println(elemento);
		}
	}
}
