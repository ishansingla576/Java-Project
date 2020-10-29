class r
{
static void merge(int x, int y)
{
int c = 10;
int temp = x;
while(x>0){
int d = x%10;
c = c*10;
x=x/10;
}
c=c/10;
y = (y*c) + temp;
System.out.println(y);
}
}