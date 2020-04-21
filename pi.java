package Oss0421;

public class pi {

	public static void main(String[] args) {
		double num;
		
		int calc=10000000;
		double ans=0;
		for(int i=0;i<calc;i++) {
			double cal=Math.pow(-1, i)*(1/(double)(2*i+1));
			ans+=cal;
		}
		System.out.println(ans);
	}

}
