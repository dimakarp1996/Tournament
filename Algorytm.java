
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
	
	void one(int x)
	{
		one=x;
	}
	void two(int x)
	{
		two=x;
	}
	void Algorytm(String x)
	{
		Algorytm=x;
	}
	void numwins(int x)
	{
		numwins=x;
	}
	void numlosses(int x)
	{
		numlosses=x;
	}
	void numdraws(int x)
	{
		numdraws=x;
	}
	void score(int x)
	{
		score=x;
	}
	void rank(int x)
	{
		rank=x;
	}
	void Name(int x)
	{
		Name=x;
	}
	void HavePlayed(boolean x)
	{
		HavePlayed=x;
	}
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
