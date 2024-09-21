class LowerTriangle
{
static void sum(int mat[][], int r, int c)
{
int i, j;
int lowerright_sum = 0; int lowerleft_sum = 0;
/*calculate sum of lowerright triangle*/

for (i = 0; i < c; i++) for (j = 0; j < r; j++)
{
if (i <= j)
{
lowerright_sum += mat[i][j];
}
}
System.out.println("Lowerright sum is " + lowerright_sum);
/*calculate sum of lowerleft triangle*/ for (i = 0; i < c; i++)
for (j = 0; j < r; j++)
{
if (j <= i)
{
lowerleft_sum += mat[i][j];
}
}
System.out.print("Lowerleft sum is " + lowerleft_sum);
}
public static void main (String[] args)
{
int c = 3; int r = 3;
int mat[][] = {{ 14, 45, 58 },
{ 71, 22, 65 },
{ 70, 54, 83}};
sum(mat, c, r);
}
}