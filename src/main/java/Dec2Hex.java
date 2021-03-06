import java.util.Scanner;

class Dec2Hex {
    public static int Arg1;

    public static void main(String args[])
    {
        convertToHex(args);
    }

    public static String convertToHex(String args[])
    {
        try
        {
            if(args.length == 0)
            {
                throw new ArrayIndexOutOfBoundsException("No input argument has been provided!");
            }
            Arg1 = Integer.parseInt(args[0]);
            char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
            int rem, num;
			if(Arg1 < 0) 
			{
                throw new IllegalArgumentException("Only positive numbers are allowed!");
            }
            num = Arg1;
            String hexadecimal="";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while(num != 0)
            {
                rem=num%16;
                hexadecimal= ch[rem] + hexadecimal;
                num= num/16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);
            return hexadecimal;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            String message = e.getMessage();
            System.out.println(message);
            return message;
        }
        catch(NumberFormatException e)
        {
            String message = "Argument not an integer";
            System.out.println(message);
            return message;
        }
		catch(IllegalArgumentException e)
        {
            String message = e.getMessage();
            System.out.println(message);
            return message;
        }
    }
}
