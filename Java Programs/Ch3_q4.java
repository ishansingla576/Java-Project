import java.util.*;
class Ch3_q4
{
static void main()
{
Scanner sc = new Scanner(System.in);
System.out.println("Product Name");
String pname = sc.nextLine();
System.out.println("Product Price");
float pr = sc.nextFloat();
System.out.println("Product Quantity");
int qty = sc.nextInt();
System.out.print('\u000C');
printDetails(pname,pr,qty);
}
static void printDetails(String pname, float pr, int qty)
{
float tp = pr*qty;
float np;
if(tp>10000){
np = tp-(tp*0.20f);
}
else
np = tp;

System.out.println("Product:                " + pname);
System.out.println("Product price           " + pr);
System.out.println("Quantity:               " + qty);
System.out.println("Total Price             " + tp);
if(tp>10000){
System.out.println("Discount:               " +tp*0.20f);
}
System.out.println("Net Price to be paid    " +np);
}
}