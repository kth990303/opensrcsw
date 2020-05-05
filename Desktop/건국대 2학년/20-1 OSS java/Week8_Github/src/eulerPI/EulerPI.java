package eulerPI;

class EulerPI {

	public static void main(String[] args) {
		double ans=0;
		// 오일러 공식
		for(int i=1;i<99999999;i++) {
			ans+=1/(double)(Math.pow(i, 2));
		}
		// 위의 공식 결과에 6을 곱해준 후 1/2제곱 해주기
		ans=Math.pow(ans*6,(double)1/2);
		System.out.println("PI: "+ans);
	}

}
