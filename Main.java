package StackPeople;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// stack�� ����ִ� ���� Ű.
		// ������ �־��� ���� �ڽ� ������ ������ ++
		// ū ���� �����ϸ� ++ ���.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyStack stack=new MyStack(n);
		
		int sum=0;
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			stack.doPush(k);
		}
		// �ð� üũ
		long ms1=System.currentTimeMillis();
		for(int i=0;i<n;i++) {
			MyStack tempStack=new MyStack(n-i-1);
			int next, cnt=0;
			int c=stack.doPop();
			// �� �̻� ����� ���� ��� break
			if(c==-1)
				break;
			for(int j=i+1;j<n;j++) {
				// �ջ�� Ű�� ���غ���
				next=stack.doPop();
				// �ջ���� ���� ��� break
				if(next==-1)
					break;
				// ���� �ջ��, �վվջ�� �񱳵� �ؾߵǹǷ� �ӽ� ���ÿ� ����
				tempStack.doPush(next); cnt++;
				// ���� ��� Ű�� �� ������ sum++
				if(next<c)
					sum++;
				else
					break;	
			}
			// �ӽ� ���ÿ� ������ �͵� �ٽ� ����
			for(int j=0;j<cnt;j++)
				stack.doPush(tempStack.doPop());
		}
		long ms2=System.currentTimeMillis();
		System.out.println();
		System.out.println("ans: "+sum);
		System.out.println("time: "+(ms2-ms1)+"ms");
	}
}
