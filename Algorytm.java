
public class Algorytm {

	int one;
	int two;
	//static int[] anothers=new int[5]; //поля 3-8
	String Algorytm;//7 цифр от 0 до 1 1я, от 0 до 5 вторая и от 0 до 9 3-7 цифры
	int numwins;//число побед
	int numlosses;
	 int numdraws;
	int score;//число очков
	int rank;//место в рейтинге
	int Name; //собственный номер программы, уникальный и неповторимый
	Boolean HavePlayed;//играл ли он в этом раунде;
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
