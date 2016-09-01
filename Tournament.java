import java.io.*;

import java.util.Scanner;
public class Tournament extends Algorytm {
	static int NumAlgorytmes=373248;
	public Algorytm TournamPlayers[]=new Algorytm[NumAlgorytmes];
	public Tournament()
	{

		Generate();
		 //Этот массив алгоритмов соревновать друг с другом по швейц.системе. Данные писатьв файл
	}
	public void Generate()//генерация алгоритмов
	{
		int i,j,k;
		File gamesbots=new File("bots.txt");
		
		try
		{
			if(!gamesbots.exists())
			{
	            gamesbots.createNewFile();
	        }
		
		

		
		PrintWriter out = new PrintWriter(gamesbots);
		System.out.print("Printwriter created");
		int NumAlgorytmes=373248;//осторожно с числом алгоритмов и методами генерации - они заточены конкретно на эти ссловия!
		Algorytm[] TournPlayers=new Algorytm[NumAlgorytmes];
		for(i=0;i<NumAlgorytmes/2;i++)
		{
			TournPlayers[i].one=0;
			TournPlayers[i].Name=i;
		}
		System.out.print("1st massive half\n");
		for(i=NumAlgorytmes/2;i<NumAlgorytmes;i++)
		{
			TournPlayers[i].one=1;
			TournPlayers[i].Name=i;
		}
		System.out.print("2nd massive half\n");
		//we divide these 2 massive to 4 parts, 2nd figure is from 0 to 3
		for(i=0;i<NumAlgorytmes/8;i++)//от 0 до 555555 в шестеричной
		{
			TournPlayers[i].two=0;
			//дальше у нас NumAlgorytmes/8 разных перестановок чисел от 0 до 6 на 6 позициях
			//и эту 1/8 часть массива, а именно часть от 0 до 6 как раз ими и заполним
			//аналогично и в остальных частях массива
			
			
				TournPlayers[i].Algorytm=Integer.toString(i,6);
				//заполнить недостающие элементы строки нулями!! важно!!

				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="0"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
				
		}		
			
		
		System.out.print("1st massive octave\n");
		for(i=NumAlgorytmes/8;i<NumAlgorytmes/4;i++)
		{
			TournPlayers[i].two=1;
				j=i-NumAlgorytmes/8;
				TournPlayers[i].Algorytm=Integer.toString(j,6);
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="0"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("2nd massive octave\n");
		for(i=NumAlgorytmes/4;i<3*NumAlgorytmes/8;i++)
		{
			TournPlayers[i].two=2;
			
				TournPlayers[i].Algorytm=Integer.toString(i-NumAlgorytmes/4,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="0"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("3rd massive octave\n");
		for(i=3*NumAlgorytmes/8;i<NumAlgorytmes/2;i++)
		{
			TournPlayers[i].two=3;
			
				TournPlayers[i].Algorytm=Integer.toString(i-3*NumAlgorytmes/8,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="0"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("4th massive octave\n");
		for(i=NumAlgorytmes/2;i<5*NumAlgorytmes/8;i++)
		{
			TournPlayers[i].two=0;
			
				TournPlayers[i].Algorytm=Integer.toString(i-NumAlgorytmes/2,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="1"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("5th massive octave\n");
		for(i=5*NumAlgorytmes/8;i<3*NumAlgorytmes/4;i++)
		{
			TournPlayers[i].two=1;
			
				TournPlayers[i].Algorytm=Integer.toString(i-5*NumAlgorytmes/8,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="1"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("6th massive octave\n");
		for(i=3*NumAlgorytmes/4;i<7*NumAlgorytmes/8;i++)
		{
			TournPlayers[i].two=2;
			
				TournPlayers[i].Algorytm=Integer.toString(i-3*NumAlgorytmes/4,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="1"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
		}
		System.out.print("7th massive octave\n");
		for(i=7*NumAlgorytmes/8;i<NumAlgorytmes;i++)
		{
			TournPlayers[i].two=3;
			
				TournPlayers[i].Algorytm=Integer.toString(i-7*NumAlgorytmes/8,6);
				//заполнить недостающие элементы строки нулями!! важно!!
				if(TournPlayers[i].Algorytm.length()==7)
				{
					break;
				}
				if(TournPlayers[i].Algorytm.length()==5)
				{
					TournPlayers[i].Algorytm="0"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==4)
				{
					TournPlayers[i].Algorytm="00"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==3)
				{
					TournPlayers[i].Algorytm="000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==2)
				{
					TournPlayers[i].Algorytm="0000"+TournPlayers[i].Algorytm;
				}
				if(TournPlayers[i].Algorytm.length()==1)
				{
					TournPlayers[i].Algorytm="000000"+TournPlayers[i].Algorytm;
				}
				TournPlayers[i].Algorytm="1"+Integer.toString(TournPlayers[i].two)+TournPlayers[i].Algorytm;
				TournPlayers[i].one=TournPlayers[i].Algorytm.charAt(0);
				//System.out.printf("%d %s \n",i,TournPlayers[i].Algorytm);
				out.printf("Name %d Algorytm %s \n",i,TournPlayers[i].Algorytm);
				for(k=0;k<6;k++)
				{
				TournPlayers[i].anothers[k]=TournPlayers[i].Algorytm.charAt(k);
				}
			}
		System.out.print("8th massive octave\n");
		 for(i=0;i<NumAlgorytmes;i++)
         {
         	TournamPlayers[i]=TournPlayers[i];
         }
		 out.close();
		}
			catch(IOException e)
		{
				System.out.println("Exception");

	
		}
				finally
				{

		           
		            System.out.print("End");
		           
		        }
		
	

			

	}
	public static int invert(int a)//special function for convenience
	{
		if(a==0) return 1;
		if(a==1) return 0;
		else throw  new NumberFormatException();
	}


	
	public static void Round(int NumTour,Algorytm First,Algorytm Second,File file) throws IOException//competition of two algorytms - record to file and record table. 
	//You NEED file bots.txt which should be randomly generated by Generate() before starting the function
	{
		FileWriter writer = new FileWriter(file,true);
		int WinWin=5;//both cooperate
		int LoseLose=-5;//both betray
		int WinLose=10;//1th betrays and 2nd cooperates
		int LoseWin=-10;//1th cooperates and 2nd betrays;
		int[] FirstActions=new int[8];
		int[] SecondActions=new int[8];
		int i;
		for(i=0;i<8;i++)
		{
		FirstActions[i]=First.Algorytm.charAt(i);
		SecondActions[i]=Second.Algorytm.charAt(i);
		}//imported algorythms
		//when program says "4" it repeats the pre-previous opponent's turn
		//when program says "5" it makes turn opposite to the pre-previous opponent's turn
		//when program says "2" it repeats the previous opponent's turn
		//when program says "3" it makes turn opposite to the pre-previous opponent's turn
		//when program says "1" it cooperates
		//when program says "0" it betrays
		for(i=1;i<8;i++)
		{
			if(FirstActions[i]==2)
			{
				FirstActions[i]=SecondActions[i-1];
			}
			if(SecondActions[i]==2)
			{
				SecondActions[i]=FirstActions[i-1];
			}
			if(FirstActions[i]==3)
			{
				FirstActions[i]=invert(SecondActions[i-1]);
			}
			if(SecondActions[i]==3)
			{
				SecondActions[i]=invert(FirstActions[i-1]);
			}
			if(FirstActions[i]==4)
			{
				FirstActions[i]=SecondActions[i-2];
			}
			if(SecondActions[i]==4)
			{
				SecondActions[i]=FirstActions[i-2];
			}
			if(FirstActions[i]==5)
			{
				FirstActions[i]=invert(SecondActions[i-2]);
			}
		}
		//now we transformed each algorythm to an array of "1"s and "0"s if will actually give
		//so it's time to find out what score it will give to each program
		int firstscore=0;
		int secondscore=0;
		for(i=0;i<8;i++)
		{
			
			if((FirstActions[i]==0)&&(SecondActions[i]==0))
			{
				firstscore-=5;
				secondscore-=5;
			}
			if((FirstActions[i]==1)&&(SecondActions[i]==1))
			{
				firstscore+=5;
				secondscore+=5;
			}
			if((FirstActions[i]==1)&&(SecondActions[i]==0))
			{
				firstscore+=10;
				secondscore-=10;
			}
			if((FirstActions[i]==0)&&(SecondActions[i]==1))
			{
				firstscore-=10;
				secondscore+=10;
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
	Tournament a=new Tournament();
	//a.Generate();//it's already used
	try
	{
	File robots = new File("bots.txt");
	
		for(i=1;i<1000;i++)
		{
			System.out.printf("Name %d Alg %d /n",a.TournamPlayers[i].Name,a.TournamPlayers[i].Algorytm);
		}
		Round(1,a.TournamPlayers[0],a.TournamPlayers[55],robots);//ТЕПЕРЬ ОСТАЛОСЬ ПЕРЕДАТЬ ЭЛЕМЕНТЫ МАССИВА В ФУНКЦИЮ - И ВСЁ
	}
	catch(IOException e)
	{
		System.out.println("Exception");
	}
	}
}