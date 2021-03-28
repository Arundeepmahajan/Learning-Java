import java.util.Scanner;

public class JavaRecursion {
public static void main(String[] args) {
    int something=sum(20);
    System.out.println(something);
}
public static int sum(int num)
{
    if(num>0)
    {
        return num+sum(num-1);
    }
    else{
        return 0;
    }
}
/*If you want to see for factorial you can do this 

public static void main(String args[])
{
    int num;
    Scanner sc=new Scanner(System.in);
    int fact=factorial(num);
    System.out.println(fact);
}
public static int factorial(int number);
{
    int factr=1;
    while(number>0)
    {
        factr=factr*number+factr(number-1);
    }
}*/
    
}
