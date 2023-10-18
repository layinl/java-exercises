package trafficlights;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int lightNum = new Scanner(System.in).nextInt();
		System.out.println((lightNum == 1)? "Pare! O sinal esta vermelho."
			: (lightNum == 2)? "Atencao! O sinal esta amarelo."
			: (lightNum == 3)? "Siga em frente! O sinal esta verde."
			: "Valor invalido! Digite 1, 2 ou 3 para indicar a cor do semaforo."
		);
	}

}
