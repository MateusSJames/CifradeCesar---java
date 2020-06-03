import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String cifra = "";
		
		
		for(int i = 0; i < n; i ++) {
			
			String a = sc.next();
			int chave = sc.nextInt();
			
			for(int j = 0; j < a.length(); j++) {
				
				int cont = 0;
				while(cont < alfabeto.length() && a.charAt(j) != alfabeto.charAt(cont)) {
					cont ++;
				}
				int value = cont - chave;
				if(value < 0) {
					value += 26;
				}
				char letra = alfabeto.charAt((value)%26);
				
				cifra += letra;
				
			}
			
			System.out.println(cifra);
			chave = 0;
			a = null;
			cifra = "";
		}
		
	}
}	