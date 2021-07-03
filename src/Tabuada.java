import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero, res;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, informe o valor do qual voc  deseja a tabuada");
		numero = leitor.nextInt();
		for(int i=1;i<=10;i++) {
			res = numero * i;
			System.out.println(numero + " x " + i + " = " + res);
		}
        leitor.close();
	}

}
