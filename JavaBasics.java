// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Hello World!");
//         System.out.println("Hello World!");
//         System.out.print("Hello \nWorld!");
//     }
// }

// PRINT STAR PATTREN
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
   
//     }
// }


// VARIABLE
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int a = 10;
//         int b = 5;
//         System.out.println(a);
//         System.out.println(b);

//         String name = "Ankit Sharma";
//         System.out.println(name);

//         float pi = 3.14f;
//         System.out.println(pi);

//         // can update value
//         name = "Sahana Sharma";
//         System.out.println(name);

//         a = 50;
//         System.out.println(a);

//         pi = 2.234f;
//         System.out.println(pi);
//     }
// }


// DATATYPES
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int a = 5;
//         System.out.println(a);

//         byte b = 10;
//         System.out.println(b);

//         short c = 25;
//         System.out.println(c);

//         float d = 2.3f;
//         System.out.println(d);

//         long e = 39933;
//         System.out.println(e);

//         double f = 304430300;
//         System.out.println(f);

//         String g = "Ankit Sharma";
//         System.out.println(g);

//         char  h = '@';
//         System.out.println(h);

//     }
// }


//SUM OF A AND B
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int sum = a+b;
//         System.out.println("sum : " + sum);
//     }
// }


//PRODUCT OF A AND B
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         int product = a * b;
//         System.out.println("product : " + product);
//     }
// }

// AREA OF CIRCLE
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         float radius = sc.nextFloat();
//         float area = 3.14f * radius * radius;

//         System.out.println(area);
//     }
// }


// OPERATOR

//ARITHMETIC OPERATOR
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int A = 10;
//         int B = 5;

//         System.out.println("Addition : " + (A+B));
//         System.out.println("Subtract : " + (A-B));
//         System.out.println("Multiply : " + (A * B));
//         System.out.println(("Divide : " + (A / B)));
//         System.out.println("Modulo : " + (A % B));
//     }
// }


// UNARY OPERATOR
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int A = 5;
//         int B = ++A;

//         System.out.println(B);
//         System.out.println(A);
//     }
// }


// LOGICAL OPERATOR
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println((5>1) && (5>1));
//         System.out.println((7>= 5) || 8>7);
//         System.out.println(!(5>2));
//     }
// }


// CONDITONAL STATEMENTS

// if-else
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int age = sc.nextInt();
//         if(age >= 18) {
//            System.out.println("Persion : Vote, Drive, College");
//         } else {
//             System.out.println("Not Adult!");
//         }
//     }
// }


// else-if
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         int student = sc.nextInt();

//         if(student >= 18) {
//             System.out.println("Adult!");
//         } 
//         else if(student >= 12 && student <= 17) {
//             System.out.println("Teenager");
//         } else {
//             System.out.println("Child");
//         }
//     }
// }


// Print the largest of 2 numbers
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int A = 5;
//         int B = 4;
//         if(A > B) {
//             System.out.println("A is largest");
//         } else {
//             System.out.println("B is largest");
//         }
//     }
// }


// Print if number is ODD & EVEN
import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("ODD");
        }
    }
}