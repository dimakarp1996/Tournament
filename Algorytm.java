
public class Algorytm {

	static int one;
	static int two;
	//static int[] anothers=new int[5]; //���� 3-8
	static String Algorytm;//7 ���� �� 0 �� 1 1�, �� 0 �� 5 ������ � �� 0 �� 9 3-7 �����
	static int numwins;//����� �����
	static int numlosses;
	static int numdraws;
	static int score;//����� �����
	static int rank;//����� � ��������
	static int Name; //����������� ����� ���������, ���������� � ������������
	static Boolean HavePlayed;//����� �� �� � ���� ������;
	static int one()
	{
		return one;
	}
	static int two()
	{
		return two;
	}
	static String getAlgorytm()
	{
		return Algorytm;
	}
	static int numwins()
	{
		return numwins;
	}
	static int numlosses()
	{
		return numlosses;
	}
	static int numdraws()
	{
		return numdraws;
	}
	static int score()
	{
		return score;
	}
	static int rank()
	{
		return rank;
	}
	static int Name()
	{
		return Name;
	}
	static boolean HavePlayed()
	{
		return HavePlayed;
	}
	 //toString(i,6) 
	public  Algorytm(String Alg,int Nam) {

		Algorytm=Alg;
		Name=Nam;
		one=Alg.charAt(0);
		two=Alg.charAt(1);
		HavePlayed=false;
		numwins=0;
		numlosses=0;
		numdraws=0;
		score=0;
		rank=0;
		
		
	}
	
		
	
}
