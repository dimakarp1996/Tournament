
public class Algorytm {

	int one;
	int two;
	//static int[] anothers=new int[5]; //���� 3-8
	String Algorytm;//7 ���� �� 0 �� 1 1�, �� 0 �� 5 ������ � �� 0 �� 9 3-7 �����
	int numwins;//����� �����
	int numlosses;
	 int numdraws;
	int score;//����� �����
	int rank;//����� � ��������
	int Name; //����������� ����� ���������, ���������� � ������������
	Boolean HavePlayed;//����� �� �� � ���� ������;
	/*static int one()
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
	}*/
	 //toString(i,6) 
	public Algorytm(int Nam,String Alg) 
	{

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
