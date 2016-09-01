
public class Algorytm {

	static int one;
	static int two;
	static int[] anothers=new int[6]; //поля 3-8
	static String Algorytm;//8 цифр от 0 до 1 1я, от 0 до 3 вторая и от 0 до 5 3-8 цифры
	static int numwins=0;//число побед
	static int numlosses=0;
	static int numdraws=0;
	static int score=0;//число очков
	static int rank=0;//место в рейтинге
	static int Name; //собственный номер программы, уникальный и неповторимый
	static Boolean HavePlayed=false;//играл ли он в этом раунде;
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
