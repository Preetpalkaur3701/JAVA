public class Pat3
{
public static void main(String [] args)
{
for(int i=0;i<4;i++)
{
  for(int j=3;j>=i;j--)
    { 
                    System.out.print(" * ");
	}
	System.out.print("\n");
for(int k=0;k<=i;k++)
{ 
     System.out.print("   ");
}
}
}
}