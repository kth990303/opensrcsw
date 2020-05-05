package wallisPI;

class WallisPI {

	public static void main(String[] args) {
		double ans=1;
		for(int i=1;i<999999999;i++) {
			ans*=(1-1/(4*Math.pow(i, 2)));
		}
		// ans는 2/파이이므로, 역수를 취한 후, 2를 곱해준다.
		ans=1/ans;
		ans*=2;
		System.out.println(ans);
	}

}
