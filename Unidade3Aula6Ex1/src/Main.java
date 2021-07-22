
public class Main {
	public static void main(String[] args) {
		Professor p = new Professor("Vandor", "Doutor", 8000, "UC3232");
		
		Professor p2 = new Professor("Vandor", "DOUTOR", 800, "UC3232");
		
		if(p.equals(p2)) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
		
	}
}
