package View;

import Controler.Mult;

public class Principal {

	public static void main (String [] args) {
		Mult Mt = new Mult();
		
		int A = 5;
		int B = 2;
		
		int  multiplica = Mt.multiplica(A, B);
		System.out.println("O resultado da multiplicacao e:" + multiplica);
				
	}
}
