public class MathOperations {
       public static void main(String[] args) {
		
       int a, b, c, d, e , f, g;
       double x, y, z;
       String one ,two, both;
       a = 10;
       b = 27;
       System.out.println("a is "+ a + ", b is " + b);
       
       c = a + b;
       System.out.println("a+b is "+ c);
       d = a - b;
       System.out.println("a-b is "+ d);
       e = a + b*3;
       System.out.println("a+b*3 is "+e);
       f = b/2;
       System.out.println("b/2 is "+ f);
       g = b% 10;
       System.out.print("b%10 is "+g);
       
       
   
       x = 1.1;
       System.out.println("\nx is "+ x); //\n is a newLINE
       y = x*x;
       System.out.println("x*x is "+ y);
       //x*x is 1.2100000000000002
       
       z = b/2;
       System.out.println("b/2 is "+ z);
       System.out.println();
       
       one = "dog";
       two = "house";
       both = one + two;
       System.out.println(both);
  }
}


/*
Note:
Why is 1.1 times 1.1 equal to 1.2100000000000002 instead of just 1.21?
Why is 0.333333 + 0.666666 equal to 0.999999 instead of 1.0? Sometimes with math
we get repeating decimals, and most computers convert numbers into binary before
working with them. It turns out that 1.1 is a repeating decimal in binary.
*/