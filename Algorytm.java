
public class Algorytm {

	static int one;
	static int two;
	static int[] anothers=new int[6]; //���� 3-8
	static String Algorytm;//8 ���� �� 0 �� 1 1�, �� 0 �� 3 ������ � �� 0 �� 5 3-8 �����
	static int numwins=0;//����� �����
	static int numlosses=0;
	static int numdraws=0;
	static int score=0;//����� �����
	static int rank=0;//����� � ��������
	static int Name; //����������� ����� ���������, ���������� � ������������
	static Boolean HavePlayed=false;//����� �� �� � ���� ������;
	static int writeone(int arg)
	{
		one=arg;
		return 0;
	}
	static int writetwo(int arg)
	{
		two=arg;
		return 0;
	}
	static int writeanothers(int arg,int i)
	{
		anothers[i]=arg;
		return 0;
	}
	
	 //toString(i,6) 
	public Algorytm() {
		
		
	}
}
