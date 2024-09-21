class UpperTriangle
{
static void sum(int mat[][], int r, int c)
{
int i, j;
int upperright_sum = 0; int upperleft_sum = 0;
/*calculate sum of upperright triangle*/ for (i = 0; i < c; i++)
for (j = 0; j < r; j++)
{
if (i >= j)
{
upperright_sum += mat[i][j];
 
}
}
System.out.println("Upperright sum is " + upperright_sum);
/*calculate sum of upperleft triangle*/ for (i = 0; i < r; i++)
for (j = 0; j < c; j++)
{
if (i <= j)
{
upperleft_sum += mat[i][j];
}
}
System.out.println("Upperleft sum is " + upperleft_sum);
}
public static void main (String[] args)
{
int r = 3; int c = 3;
int mat[][] = {{45, 30, 40},
{ 25, 20, 15 },
{ 10, 9, 5}};
sum(mat, r, c);
}
}