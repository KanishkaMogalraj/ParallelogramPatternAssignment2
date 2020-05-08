
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner sc=new Scanner(System.in);
        int n,i=1;
        n=sc.nextInt();
        if(n>=0 && n<=50)
        {
            while(i<=n)
            {
                
            
            int space=1;
            while(space<i)
            {
               System.out.print(" "); 
                space++;
            }
                int j=1;
                while(j<=n)
                {
                    System.out.print("*");
                    j++;
                    
                }
                
                
                i++;
                System.out.println();
            }
        }

	}
}
