package com.sist.exception;
import java.util.Scanner;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			//int[] arr=new int[2];
			int a=10;
			int b=0;
			System.out.println("a="+a+", b="+b);
			int c=a/b;
			System.out.println("c="+c);
		}
		/*
		 * catch(RuntimeException ex) 
		 * { 
		 * //���� �̰� ������, �Ʒ���5���� ������.
		 * //RuntimeException�� �ٸ� �ֵ麸�� ������ �ٸ� �ֵ��� �����ϰ� �ֱ� ����.   
		 * //�׷��Ƿ�, ������ �ֵ��� �������� ���. 
		 * }
		 */
		catch(NumberFormatException ex) 
		{
			System.out.println("NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException ex) 
		{
			System.out.println("ArrayIndexOutOfBoundsException");	
		}
		/*
		 * catch(ArithmeticException ex) { System.out.println("ArithmeticException"); }
		 */
		catch(NullPointerException ex) 
		{
			System.out.println("NullPointerException");	
		}
		catch(ClassCastException ex) 
		{
			System.out.println("ClassCastException");	
		}
		catch(RuntimeException ex) {
			System.out.println("RuntimeException"); 
			//�������� ���� ���ܰ� �߻��� �� �����Ƿ� �������� ū �� ���´�. 
		}
		System.out.println("���α׷� ����");

	}

}
