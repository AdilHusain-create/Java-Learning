import java.util.Scanner;

public class ReverseInteger {
    
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // taking input from User
        
        System.out.println(getReverse(n));
        
    }

    public static int getReverse(int x) {   // I use static to access it directly from anywhere in class :)
        int result = 0; // Initialize the result.

        while (x != 0)
        {
            int remainder = x % 10; //Dividing the value by % gives us remainder back so. We can get the last value
            
            int newResult = result * 10 + remainder;       //n the newresult adding the remainder value which we got because let say we have something like 
			                                                    //this 123, and from tail we got 3. Now what will happen when we add 2 after 3 when we come back we have something like 
			                                                    //30 + 2 = 32 and again we come back with carrying 1 we have 320 + 1 = 321, Integer is reversed.

            if ((newResult - remainder) / 10 != result)   // if it is invaid we have to return Zero;
            {
                return 0;
            }
            result = newResult; //// dumping the newResult value in result
            
            x = x / 10;  // updating our x integer
        }

        return result; // as our method is int type so we need rerturn
    }

    }
