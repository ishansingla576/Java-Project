public class check
{
    public static void main(double a,double b)
{   
            //passed the values using checkEqual function
            System.out.println(checkEqual(a,b));
        }
        public static boolean checkEqual(double aa, double bb){
        
            //Convert double into int
            int a = (int)aa*1000;
            int b = (int)bb*1000;
            
            //check if the values are equal
            if (a==b){
                return true;
            }
            else {
                return false;
            }
            
        }
}