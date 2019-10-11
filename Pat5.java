public class Pat5
{
public static void main(String [] args)
{
 int x=0; 
 for(int row=0;row<5;row++)
{
   for(int col=4;col>row;col--)
   {
    System.out.print(" ");
   } 	
    for(int k=0;k<=row;k++)
     {
          System.out.print("*");
     }
   
System.out.println("\n ");
}
}
}	