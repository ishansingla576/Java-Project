import java.util.*;
class Ch3_q3
{
static void main()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter  + or - or * or / ");
char ar = sc.next().charAt(0);
System.out.println("First Integer");
int a = sc.nextInt();
System.out.println("Second Integer");
int b = sc.nextInt();
process(ar,a,b);

}
static void process(char ch, int x, int y)
{
int r = 0;
switch(ch)
{
case '+' :
r = x+y;
break;

case '-' :
r = x-y;
break;

case '*':
r = x*y;
break;

case '/':
r = x/y;
break;

default:
System.out.println("Wrong Input");
break;
}
System.out.println("Result: " + r);
}
}