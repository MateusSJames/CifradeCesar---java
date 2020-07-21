import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
   
    	Scanner sc = new Scanner(System.in);
    	String d = sc.nextLine();
    	String[] day = d.split(" ");
    	int dia = Integer.parseInt(day[1]);
    	String hora = sc.nextLine();
    	String [] horario = hora.split(" : ");
    	String df = sc.nextLine();
    	String[] dayf = df.split(" ");
    	int diaf = Integer.parseInt(dayf[1]);
    	String horaf = sc.nextLine();
    	String [] horariof = horaf.split(" : ");
    	
    	int x = dia*86400 + Integer.parseInt(horario[0])*3600 + Integer.parseInt(horario[1])*60 + Integer.parseInt(horario[2]);
    	int y = diaf*86400 + Integer.parseInt(horariof[0])*3600 + Integer.parseInt(horariof[1])*60 + Integer.parseInt(horariof[2]);
    	int result = y - x;
    	System.out.println(result/86400 + " dia(s)");
    	result %= 86400;
    	System.out.println(result/3600 + " hora(s)");
    	result %= 3600;
    	System.out.println(result/60 + " minuto(s)");
    	System.out.println(result%60 + " segundo(s)");
    }

}    