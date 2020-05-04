package StackPeople;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// stack에 집어넣는 값은 키.
		// 이전에 넣어진 값이 자신 값보다 작으면 ++
		// 큰 값이 등장하면 ++ 취소.
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyStack stack=new MyStack(n);
		
		int sum=0;
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			stack.doPush(k);
		}
		// 시간 체크
		long ms1=System.currentTimeMillis();
		for(int i=0;i<n;i++) {
			MyStack tempStack=new MyStack(n-i-1);
			int next, cnt=0;
			int c=stack.doPop();
			// 더 이상 사람이 없을 경우 break
			if(c==-1)
				break;
			for(int j=i+1;j<n;j++) {
				// 앞사람 키와 비교해보자
				next=stack.doPop();
				// 앞사람이 없을 경우 break
				if(next==-1)
					break;
				// 앞의 앞사람, 앞앞앞사람 비교도 해야되므로 임시 스택에 보관
				tempStack.doPush(next); cnt++;
				// 앞의 사람 키가 더 작으면 sum++
				if(next<c)
					sum++;
				else
					break;	
			}
			// 임시 스택에 보관된 것들 다시 복귀
			for(int j=0;j<cnt;j++)
				stack.doPush(tempStack.doPop());
		}
		long ms2=System.currentTimeMillis();
		System.out.println();
		System.out.println("ans: "+sum);
		System.out.println("time: "+(ms2-ms1)+"ms");
	}
}
