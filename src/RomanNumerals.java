
public class RomanNumerals 
{
	public String toRoman(int number)
	{
		String res ="";
		if(number>3000 || number<0)
			return res;
		for(int i=number; i>0 ;i--)
		{
			if(i>=1000)
			{
				res+='M';
				i-=1000;
			}
			else if(i>=900 )
			{
				res+='C';
				res+='M';
				i-=900;
			}
			else if(i>=500)
			{
				res+='D';
				i-=500;
			}
			else if(i>=400)
			{
				res+='C';
				res+='D';
				i-=400;
			}
			else if(i>=100)
			{
				res+='C';
				i-=100;
			}
			else if(i>=90)
			{
				res+='X';
				res+='C';
				i-=90;
			}
			else if(i>=50)
			{
				res+='L';
				i-=50;
			}
			else if(i>=40)
			{
				res+='X';
				res+='L';
				i-=40;
			}
			else if(i>=10)
			{
				res+='X';
				i-=10;
			}
			else if(i>=9)
			{
				res+='I';
				res+='X';
				i-=9;
			}
			else if(i>=5)
			{
				res+='V';
				i-=5;
			}
			else if(i>=4)
			{
				res+='I';
				res+='V';
				i-=4;
			}
			else if(i>=1)
			{
				res+="I";
				i-=1;
			}
		}
		return res;
	}
}
