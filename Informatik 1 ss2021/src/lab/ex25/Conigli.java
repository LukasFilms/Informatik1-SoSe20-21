package lab.ex25;

public class Conigli {
	
	public static void main(String[] args) {
		
		int [] f = new int[14];
		f[0] = 1;
		f[1] = 1;
		f[2] = f[1] + f[2];
		for(int i=2; i<f.length; i++ ) {
			f[i] = f[i-1] + f[i-2];
			System.out.println("fibo_"+i+" = "+f[i]+" gold. Schnitt: "+ f[i]/(double)f[i-1]);
		}
		
	}
}
