package Controler;


public class Mult {
	
	public Mult() {
		super();
	}
	public static int multiplica(int A, int B) {
	    if (B == 0) {
	        return 0;
	    } else if (B > 0) {
	        return A + multiplica(A, B-1);
	    } else {
	        return -multiplica(A, -B);
	    }
	}
}


