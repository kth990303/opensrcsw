package ramanujanPI;

class RamanujanPI {
	public static double factorial(double n) {
		if(n==1)
			return n;
		else if (n==0)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		double ans=0;
		for(int i=0;i<40;i++) {
			ans+=(factorial(4*i)*(1103+26390*i))/(double)(factorial(i)*Math.pow(396, 4*i));
		}
		ans*=Math.pow(8, (double)1/2);
		ans/=9801;
		ans=1/ans;
		System.out.println(ans);
	}
}
