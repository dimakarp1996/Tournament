import java.io.*;
import java.lang.Integer;
import java.util.Scanner;
public class Tournament /*extends Algorytm*/ {
	static int NumAlgorytmes=1200000;
	public  Algorytm TournPlayers[]=new Algorytm[NumAlgorytmes];
	 void equal(Algorytm a,Algorytm b)
	
	{

		a.one=b.one;
		a.two=b.two;
		a.Algorytm=b.Algorytm;
		a.numwins=b.numwins;
		a.numlosses=b.numlosses;
		a.numdraws=b.numdraws;
		a.score=b.score;
		a.rank=b.rank;
		a.Name=b.Name;
		a.HavePlayed=b.HavePlayed;

	}
	
	static String addnulls(String a,int length)//service function increasing length of string by adding zeros
	{
		int numnulls;
		int i;
		String nulls="";

			numnulls=length-a.length();
			if(numnulls==0)
			{
				return a;
			}
			if(numnulls<0)
			{
				System.out.print("Error");
				return null;
			}
			if(numnulls>0)
			for(i=0;i<numnulls;i++)
			{
				nulls=nulls+"0";
			}
			a=nulls+a;
			if(a.length()!=length)
			{
				System.out.print("Error");
				return null;
			}
			else return a;
	}
	public Tournament()
	{
	/*try
		{
			Generate();	
			
		}
		catch(IOException e)
		{
		System.out.print("Exception");
		}*/

		 //���� ������ ���������� ����������� ���� � ������ �� �����.�������. ������ ������� ����
	}
	
	public void Generate() throws IOException, FileNotFoundException//������������ �������� - ������ � �����������!
	{
		int i,k;

		File gamesbots=new File("bots.txt");
		
		
			if(!gamesbots.exists())
			
	            gamesbots.createNewFile();
	        
		
		

		
		PrintWriter out = new PrintWriter(gamesbots);
		System.out.print("Printwriter created \n");
		//int NumAlgorytmes=1200000;//��������� � ������ ���������� � �������� ��������� - ��� �������� ��������� �� ��� �������!
		//Algorytm[] TournPlayers=new Algorytm[NumAlgorytmes];
		int beginpoint;
		
		int step=NumAlgorytmes/12;
		for(beginpoint=0;beginpoint<NumAlgorytmes;beginpoint=beginpoint+step)//recording to each part of the massive
		{
			for(i=beginpoint;i<beginpoint+step;i++)//recording into one of parts
			{
				System.out.printf("i is %d",i);
				TournPlayers[i].Name=i;
				for(k=0;k<(NumAlgorytmes/(2*step));k++)
				{
					if((beginpoint==k*step)||(beginpoint==k*step+NumAlgorytmes/2))
					{
						TournPlayers[i].two=k;
					}
					if((beginpoint<NumAlgorytmes/2))
					{
						TournPlayers[i].one=0;
					}
					if((beginpoint>=NumAlgorytmes/2))
					{
						TournPlayers[i].one=1;
					}
				}//we have recorded 2nd element so now we need to record anothers
				TournPlayers[i].Algorytm=Integer.toString(TournPlayers[i].one)+Integer.toString(TournPlayers[i].two)+addnulls(Integer.toString(i-beginpoint),5);
				/*for(j=0;j<5;j++)
				{
					TournPlayers[i].anothers[j]=TournPlayers[i].Algorytm.charAt(j+2);
				}*/
				System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				//TournamPlayers[i].Algorytm(TournPlayers[i].Algorytm,i);//MISTAKE IS HERE - JAVA DOESN'T UNDERSTAND THAT TournPlayers[i].Algorytm(string,int) is a constructor
			}
		}
		out.close();
		//return TournPlayers;
	}
	public static int invert(int a)//special function for convenience
	{
		if(a==0) return 1;
		if(a==1) return 0;
		else throw  new NumberFormatException();
	}


	
	public static void Round(int NumTour,Algorytm First,Algorytm Second,File file) throws IOException//competition of two algorytms - record to file and record table. 
	//You NEED file bots.txt which should be randomly generated by Generate() beforestarting the function
	{//we assume that all algorytms are defined correctly and can't cause mistakes
		if((Second.Algorytm.length()!=7)||(First.Algorytm.length()!=7))
		{
			System.out.print("Exception");
			throw new IOException();
		}
		System.out.printf("First competing algorytm is %s \n", First.Algorytm);
		System.out.printf("Second competing algorytm is %s \n", Second.Algorytm);
		FileWriter writer = new FileWriter(file,true);
		int WinWin=5;//both cooperate
		int LoseLose=-5;//both betray
		int WinLose=10;//1th betrays and 2nd cooperates
		int LoseWin=-10;//1th cooperates and 2nd betrays;
		int[] FirstActions=new int[7];
		int[] SecondActions=new int[7];
		int i;
		char buf;
		for(i=0;i<7;i++)
		{
		buf=First.Algorytm.charAt(i);
		FirstActions[i]=Character.getNumericValue(buf);//��� ������������ ���������
		//System.out.printf("at position %d char %c read as %d", i,buf,FirstActions[i]);
		buf=Second.Algorytm.charAt(i);
		SecondActions[i]=Character.getNumericValue(buf);
		//System.out.printf("at position %d char %c read as %d", i,buf,SecondActions[i]);
		}
		System.out.printf("First competing algorytm interpreted as ");//������������� ���������� ���������!
		for(i=0;i<7;i++)
		{
			System.out.printf("%d",FirstActions[i]);
		}
		System.out.printf("\n");
		System.out.printf("Second competing algorytm interpreted as ", Second.Algorytm);
		for(i=0;i<7;i++)
		{
			System.out.printf("%d",SecondActions[i]);
		}
		String buf;
		System.out.printf("\n");
		//imported algorythms

		//when program says "9" it makes turn opposite to the pre-previous opponent's turn
		//when program says "8" it repeats the pre-previous opponent's turn
		//when program says "7" it makes turn opposite to the pre-previous program's turn
		//when program says "6" it repeats the pre-previous program's turn
		//when program says "5" it makes turn opposite to the previous opponent's turn
		//when program says "4" it repeats the previous opponent's turn
		//when program says "3" it makes turn opposite to the previous program's turn
		//when program says "2" it repeats the previous program's turn
		//when program says "1" it cooperates
		//when program says "0" it betrays
		for(i=1;i<7;i++)
		{
			if(FirstActions[i]==2)
			{
				FirstActions[i]=FirstActions[i-1];
			}
			if(SecondActions[i]==2)
			{
				SecondActions[i]=SecondActions[i-1];
			}
			if(FirstActions[i]==3)
			{
				FirstActions[i]=invert(FirstActions[i-1]);
			}
			if(SecondActions[i]==3)
			{
				SecondActions[i]=invert(SecondActions[i-1]);
			}
			if(FirstActions[i]==4)
			{
				FirstActions[i]=SecondActions[i-1];
			}
			if(SecondActions[i]==4)
			{
				SecondActions[i]=FirstActions[i-1];
			}
			if(FirstActions[i]==5)
			{
				FirstActions[i]=invert(SecondActions[i-1]);
			}
			if(SecondActions[i]==5)
			{
				SecondActions[i]=invert(FirstActions[i-1]);
			}
			if(FirstActions[i]==6)
			{
				FirstActions[i]=FirstActions[i-2];
			}
			if(SecondActions[i]==6)
			{
				SecondActions[i]=SecondActions[i-2];
			}
			if(FirstActions[i]==7)
			{
				FirstActions[i]=invert(FirstActions[i-2]);
			}
			if(SecondActions[i]==7)
			{
				SecondActions[i]=invert(SecondActions[i-2]);
			}
			if(FirstActions[i]==8)
			{
				FirstActions[i]=SecondActions[i-2];
			}
			if(SecondActions[i]==8)
			{
				SecondActions[i]=FirstActions[i-2];
			}
			if(FirstActions[i]==9)
			{
				FirstActions[i]=invert(SecondActions[i-2]);
			}
			if(SecondActions[i]==9)
			{
				SecondActions[i]=invert(SecondActions[i-2]);
			}
			buf=Arrays.toString();
			for(j=0;j<8;j++)
			System.out.printf("First algorytm transformed as %d")
		}
		//now we transformed each algorythm to an array of "1"s and "0"s if will actually give
		//so it's time to find out what score it will give to each program
		int firstscore=0;
		int secondscore=0;
		for(i=0;i<7;i++)
		{
			if(((FirstActions[i]!=0)&&(FirstActions[i]!=1))||((SecondActions[i]!=0)&&(SecondActions[i]!=1)))
			{
				System.out.print("Code didn't work properly");//wasn't read correctly
			}
			if((FirstActions[i]==0)&&(SecondActions[i]==0))
			{
				firstscore-=LoseLose;
				secondscore-=LoseLose;
			}
			if((FirstActions[i]==1)&&(SecondActions[i]==1))
			{
				firstscore+=WinWin;
				secondscore+=WinWin;
			}
			if((FirstActions[i]==1)&&(SecondActions[i]==0))
			{
				firstscore+=WinLose;
				secondscore-=LoseWin;
			}
			if((FirstActions[i]==0)&&(SecondActions[i]==1))
			{
				firstscore-=LoseWin;
				secondscore+=WinLose;
			}
		}
		First.score=First.score+firstscore;
		Second.score=Second.score+secondscore;
		if(firstscore>secondscore)
		{
			First.numwins++;
			Second.numlosses++;
		}
		if(secondscore>firstscore)
		{
			Second.numwins++;
			First.numlosses++;
		}
		if(secondscore>firstscore)
		{
			Second.numdraws++;
			First.numlosses++;
		}

		String s=First.Name+" in tour "+Integer.toString(NumTour)+ " gained "+Integer.toString(firstscore)+" versus "+Second.Name+" total scores "+First.score+" wins "+First.numwins+" loses "+First.numlosses+" draws "+First.numdraws+"\n";

		writer.write(s);
		s=Second.Name+" in tour "+Integer.toString(NumTour)+" gained "+Integer.toString(secondscore)+" versus "+First.Name+" total scores "+Second.score+" wins "+Second.numwins+" loses "+Second.numlosses+" draws "+Second.numdraws+"\n";
		writer.write(s);
		writer.close();
		
	}
	public static void SortByRank()//after each round we sort by total score amount
	{
		
	}
	public static void main(String[] args)
	{
	int i;
	/*Tournament a=new Tournament();
		try
		{
		a.Generate();
		}
		catch(IOException e)
		{
		System.out.print("Exception");
		}
		System.out.print("Pogram running \n");
		for(i=0;i<2000;i++)
		{
			System.out.printf("Name is %d Alg is %s \n",a.TournPlayers[i].Name,a.TournPlayers[i].Algorytm);
		}*/ // FIX "GENERATE" FUNCTION - fields with which it works shouldn't be static (otherwise only one example can be stored) but it they aren't static we get nullpointerexception
		Algorytm first=new Algorytm(834567,"1234567");
		//System.out.printf("First competing algorytm is %s \n", first.Algorytm);
		Algorytm second=new Algorytm(976198 ,"1376198");
		//System.out.printf("Second competing algorytm is %s \n", second.Algorytm);
		try
		{
			File tourney = new File("tourney.txt");
			if(!tourney.exists())
			{	
		        tourney.createNewFile();
			}	
			Round(1,first,second,tourney);//������ �������� �������� �������� ������� � ������� - � �Ѩ
		}
			catch(IOException h)
		{
				System.out.println("Exception");
		}
	}

	
}