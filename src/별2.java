import java.util.Scanner;

public class ��2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
Scanner sc = new Scanner(System.in);
System.out.println("���ڸ� �Է��ϼ���.");
int a = sc.nextInt();

//���� ���� �κ�.

for (int n=0; n<=a; n++) {
	
	for (int y=0; y<a*2-n+2; y++) {
	System.out.print(" ");
				}
	
	for (int x=0; x<n*2+1; x++) {
		System.out.print("*");
	}

System.out.println("");

}

// ����  �߻��� �κ�.
	
	for(int i=0; i<(a+1)*4+1; i++) {
		System.out.print("*");
			}
	System.out.println("");

	//���� ������ �κ�.
	
	for (int n=0; n<a; n++) {
		
		for (int y=0; y<n+2; y++) {
		System.out.print(" ");
					}
		
		
		for (int x=0; x+2*n<a*4+1; x++) {
			System.out.print("*");
		}

	System.out.println("");

	}
	
// ���� �ٸ�
	int b , s;
	for(int i=1; i<=a; i++) {
	
		for( s = 0; s-1<=a-i; s++) {
			System.out.print(" ");  			
		} 
			for(b=0; b<=a-i; b++) {
			System.out.print("*");
		}
			for(int c = 0; c<4*i-1; c++) {
				
				System.out.print(" ");
					}
			for(int d=0; d<=a-i; d++) {
				System.out.print("*");
			}
			
		System.out.println("");
	}
	}}
