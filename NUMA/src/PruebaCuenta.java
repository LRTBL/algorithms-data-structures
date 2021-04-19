import java.util.Random;
import java.util.Scanner;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int VTL = 0;
		int VIT = 0;	
		int VT = 0 ;   
		int VI = 0; 
		int M = 0;
		int alea = 0 ; 
		int D = 0 ; 
		int [] DEM = {75,80,85,90,95,100,105,110,115,120};
		Scanner in = new Scanner(System.in);
	    Random r = new Random();
		while (true) {
			int []A = {0,0,0,0,0,0,0,0,0,0};
			int []B = {0,0,0,0,0,0,0,0,0,0};
			int [] C = {0,0,0,0,0,0,0,0,0,0};
		    for (int i = 0 ; i< 10 ; i++) {
		    	System.out.print("Ingrese A["+i+"]:");
		    	A[i] = in.nextInt();
		    	System.out.print("Ingrese B["+i+"]:");
		    	B[i] = in.nextInt();
		        C[i] = B[i] + C[i-1];
		    }
		    while (true) {
		    	System.out.print("Ingrese M");
		    	M = in.nextInt();
		        while (true) {
		        	for (int k = 1 ; k < 90 ; k++) {
		        		alea = r.nextInt(DEM.length);
		        		D = DEM[alea];
		        		if (M<=D) {
		        			VT=6*M;
		                    VI=6*(D-M);
		        		}else {
		        			 VT = ((-2)*M) + (8*D);
		        	         VI = 0;
		        		}
		        		 VTL = VTL + VT;
		        	     VIT = VIT + VI;
		        	}
		        	System.out.print("VTL: "+VTL);
		        	System.out.print("VIT: "+VTL);
		        	System.out.print("M: "+M);
		            VTL=0;
		            VTL=0;
		            break;
		        }
		    }
		}
	}

}
