package c2controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				continue;//Serve para ignorar a linha atual!
			}
			System.out.println(i);
		}
	}

}
