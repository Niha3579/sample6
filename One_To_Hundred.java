public class One_To_Hundred{
	public static void main(String args[])	
	{
	int count;
    //for second commit
    //for third commit
    //for fourth commit
    //for fifth commit 
	for(int i=2;i<=100;i++)
	{
	count=0;
	for(int j=1;j<=i;j++)
	{
	   if(i%j==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(i+"  ");     
	}
	}
}