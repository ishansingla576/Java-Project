public class Q4_364
{
   public static void main()
   {
       int  ar[]={4,54,31,32,45,67,78};
       int m1_30=0;int m31_50=0;int m51_70=0;
      
       for(int a=0;a<ar.length;a++)
       {
           if(ar[a]>=1&&ar[a]<=30)
           m1_30++;
           if(ar[a]>=31&&ar[a]<=50)
           m31_50++;
           if(ar[a]>=51&&ar[a]<=70)
           m51_70++;
        }
System.out.println("Number of Student obtained between 1 to 30="+ m1_30); 
System.out.println("Number of Student obtained between 31 to 50="+ m31_50);
System.out.println("Number of Student obtained between 51 to 70="+ m51_70);
}}