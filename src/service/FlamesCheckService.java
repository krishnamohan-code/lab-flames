package service;
public class FlamesCheckService {

	
	public char findFlames(String name1, String name2) {
		String temp1 = name1;
		String temp2 = name2;
		int l1=temp1.length();
		int l2=temp2.length();
		char n1[]=temp1.toCharArray();
		char n2[]=temp2.toCharArray();
		for(int i=0;i<l1;i++)
		{
			for(int j=0;j<l2;j++)
			{
				if(n1[i]==n2[j])
			    {
			     n1[i]='*';
			     n2[j]='*';
			     break;
			    }
			}
		}
		String tname=new String(n1);
		  tname=tname+(new String(n2));
		  tname=tname.replace("*","");
		  int tl=tname.length();
		  int num=0;
		  String flm="flames";
		  System.out.println(tl);

		  for(int s=6;s>=2;s--)
		  {
		   if(tl>s)
		     num=tl-s;
		   else
		     num=tl;
		   while(num>s)
		   {
		     num=num-s;
		   } 
		   flm=flm.substring(num,flm.length())+(flm.substring(0,num-1)); 
		  }
		  switch(flm.charAt(0))
		  {
		  case 'f':  System.out.println("friend");
		               break;
		  case 'l':  System.out.println("love");
		     break;
		  case 'a': System.out.println("Affection");
		    break;
		  case 'm': System.out.println("Marriage");
		    break;
		  case 'e': System.out.println("Enemy");
		  break;                                    
		  case 's': System.out.println("Sister");
		  break;
		  }
		  return flm.charAt(0);
	}
}	
// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

