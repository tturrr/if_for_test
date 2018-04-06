import java.util.Scanner;

public class 마름모 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
Scanner sc = new Scanner(System.in);
System.out.print("숫자를 입력하세요.");
int a = sc.nextInt();

	//마름모의 상체 부분		
		for (int n=0; n<a; n++) {
		// 내가입력한 수가 처음 공백에 나오고 그다음 한칸씩 줄어들기위하여 .
				for (int y=0; y<a-n; y++) {
				System.out.print(" ");
		
				}
//2씩 증가하며 처음 홀수를 위하여 +1을 하였다.
				for (int x=0; x<n*2+1; x++) {
					System.out.print("*");
				}
			
		System.out.println("");
		
		}
		//마름모의 중간 부분
		// 2씩 증가와 처음 홀수를맞추기위해 +1 을 하였다.
		for (int n=0; n<a*2+1; n++) {
			System.out.print("*");
		}
		//마름모 중간부분후에 한칸 뛰어쓰기.
 System.out.println("");
 
 //마름모의 하체 부분
 for (int n=0; n<a; n++) { 
		
	 //공백이 한칸씩 증가하기 위하여 n=0 일대부터 1칸씩 증가하게 설게.
		for (int y=0; y<n+1; y++) {
		System.out.print(" ");
					}
	//마름모에서 줄어드는 부분이고,  x+2*n은 마름모의 2씩 줄어들수있게해주며, a*2-1 은 입력한숫자의 두배에서 하나씩 빼서 홀수를 맞추어준다.
		for (int x=0; x+2*n<a*2-1; x++) {
			System.out.print("*");
		}
	
System.out.println("");

}
 



 
		
		
	}
}
