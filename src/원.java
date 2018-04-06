import java.util.Scanner;

public class 원 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();   
		int c;
		// 원의 수학정 정의 한 정점으로부터 같은 거리만큼 떨어진 점들의 자취'라고 할 수 있습니다.
//원의 방정식  x^ + y^ = r^
//지름 = 반지름*2 그치만 콘솔창에서 다르게나온다. 그래서 원의 모양이 이쁘게 나오지 않는다.
//원의 반지름 공식으로 만들어내었더니 . 사각형모양이 되어버린다. 그래서  지름안에 들어오는 숫자만 별을 표시.

		 for(int i =- a; i <= a; i++) {
		  
		   for(int j = -a; j <= a; j++) {
		 
			   
		  
			   if( (i * i) *4    + (j * j)   <= a * a)
		   
		    
		    {
		     System.out.print("*");  }
		    
		    else
		    {
		     System.out.print(" ");  }
		    
		   }
		   System.out.println("");
		  }



	 	
	}}

