package mavenNewYearGift;

import java.util.*;
public class ChocolateDetails 
{
	public static void main(String args[])
	{
	   int i=0,j=0,k=0;
	   System.out.println("enter how many sweets");
	   Scanner s= new Scanner(System.in);
	   int n=s.nextInt();
	   Chocolate c[]=new Chocolate[n];
	   for(i=0;i<n;i++)
	      {
	   System.out.println("enter ChocolateName,Weight,No of units"+(i+1));
	   String cname=s.next();
	   s.nextLine();
	   float w=s.nextFloat();
	   int u=s.nextInt();
	   c[i]=new Chocolate(cname,w,u);
	       }

	   for(i=0;i<n-1;i++)
	       {
	   for(j=0;j<n-i-1;j++)
		   {
	   if(c[j].getWeight()>c[j+1].getWeight())
	       {
	          Chocolate temp[]=new Chocolate[n];
		      temp[k]=c[j];
		      c[j]=c[j+1];
		      c[j+1]=temp[k];
		   }
		}
	}
	  Candies  obj = new Candies();
	  obj.display();
	  for(i=0;i<n;i++)
	    {
      System.out.println("Chocolate_type:-"+c[i].getType()+"    "+"weight:-"+c[i].getWeight()+"    "+"no of units:-"+c[i].getUnits());
		}
      }
}
