package wallisPI;

class WallisPI {

	public static void main(String[] args) {
		double ans=1;
		for(int i=1;i<999999999;i++) {
			ans*=(1-1/(4*Math.pow(i, 2)));
		}
		// ans�� 2/�����̹Ƿ�, ������ ���� ��, 2�� �����ش�.
		ans=1/ans;
		ans*=2;
		System.out.println(ans);
	}

}
