import java.util.Scanner;

public class EntendendoFor {

	public static void main(String[] args) {
        int x=0;
        while(x<=10) {
		System.out.println(x);
		x++;
        }	
		System.out.println(x);
		
		
	Scanner leitor = new Scanner(System.in);	
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			i=leitor.nextInt();
			System.out.println("O" + i);
		}

	}

}
