
public class ������_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//����1 - 65430���� ����� ���� ȭ���� ����
		int money=65430;
		int h10000=money/10000;
		int h1000=(money%10000)/1000;
		int h100=(money%1000)/100;
		int h10=(money%100)/10;
		System.out.println("����¥��:"+h10000);
		System.out.println("õ��¥��:"+h1000);
		System.out.println("���¥��:"+h100);
		System.out.println("�ʿ�¥��:"+h10);
		
		String s=100+10.5+""+'A'+10f+100L;
		//110.5+A+10.0+100 -->110.5A10.0100 
		System.out.println("s��"+s);
		
		//����2 - �޿����� �ۼ�
		int basic=1500000;
		int bonus=55000;
		int tax=basic/10;
		int real_pay=basic+bonus-tax;
		System.out.println("�Ǽ��ɾ�: "+real_pay+" ��");
		

	}

}
