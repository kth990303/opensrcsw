package eulerPI;

class EulerPI {

	public static void main(String[] args) {
		double ans=0;
		// ���Ϸ� ����
		for(int i=1;i<99999999;i++) {
			ans+=1/(double)(Math.pow(i, 2));
		}
		// ���� ���� ����� 6�� ������ �� 1/2���� ���ֱ�
		ans=Math.pow(ans*6,(double)1/2);
		System.out.println("PI: "+ans);
	}

}
