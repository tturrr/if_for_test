import java.util.Scanner;

public class �� {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();   
		int c;
		// ���� ������ ���� �� �������κ��� ���� �Ÿ���ŭ ������ ������ ����'��� �� �� �ֽ��ϴ�.
//���� ������  x^ + y^ = r^
//���� = ������*2 ��ġ�� �ܼ�â���� �ٸ��Գ��´�. �׷��� ���� ����� �̻ڰ� ������ �ʴ´�.
//���� ������ �������� ���������� . �簢������� �Ǿ������. �׷���  �����ȿ� ������ ���ڸ� ���� ǥ��.

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

