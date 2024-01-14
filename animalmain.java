package polym;

import constuctorcalling.demo1;

public class animalmain {

	public static void main(String[] args) {
		
	
		cat c1  = new cat();
		dog d1  = new dog();
		snake s1 = new snake();
		animal a1 = new animal();
		
		
//	
//		c1.noise();
//		d1.noise();
//		s1.noise();
//		a1.noise();
		
		animalsimulator as = new animalsimulator();
		
		as.noise(c1);
		
		
		
//		as.noise(d1);
//		as.noise(s1);
//		as.noise(a1);
		
		
		
		
		
		
		 
		
		
		
		
		
	}

}
