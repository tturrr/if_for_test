import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
Scanner sc = new Scanner(System.in);
System.out.print("���ڸ� �Է��ϼ���.");
int a = sc.nextInt();

	//�������� ��ü �κ�		
		for (int n=0; n<a; n++) {
		// �����Է��� ���� ó�� ���鿡 ������ �״��� ��ĭ�� �پ������Ͽ� .
				for (int y=0; y<a-n; y++) {
				System.out.print(" ");
		
				}
//2�� �����ϸ� ó�� Ȧ���� ���Ͽ� +1�� �Ͽ���.
				for (int x=0; x<n*2+1; x++) {
					System.out.print("*");
				}
			
		System.out.println("");
		
		}
		//�������� �߰� �κ�
		// 2�� ������ ó�� Ȧ�������߱����� +1 �� �Ͽ���.
		for (int n=0; n<a*2+1; n++) {
			System.out.print("*");
		}
		//������ �߰��κ��Ŀ� ��ĭ �پ��.
 System.out.println("");
 
 //�������� ��ü �κ�
 for (int n=0; n<a; n++) { 
		
	 //������ ��ĭ�� �����ϱ� ���Ͽ� n=0 �ϴ���� 1ĭ�� �����ϰ� ����.
		for (int y=0; y<n+1; y++) {
		System.out.print(" ");
					}
	//�����𿡼� �پ��� �κ��̰�,  x+2*n�� �������� 2�� �پ����ְ����ָ�, a*2-1 �� �Է��Ѽ����� �ι迡�� �ϳ��� ���� Ȧ���� ���߾��ش�.
		for (int x=0; x+2*n<a*2-1; x++) {
			System.out.print("*");
		}
	
System.out.println("");

}
 



 
		
		
	}
}
