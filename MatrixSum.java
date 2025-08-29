import java.util.Scanner;

public class MatrixSum {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

int[][] matrix=new int[3][3];

int [] rows=new int[3];

System.out.println("Enter the elements of 3X3 matrix:");

for(int i=0;i<3;i++)

{

for(int j=0;j<3;j++)

{

System.out.println("Elment ["+i+"]["+j+"]:");

matrix[i][j]=sc.nextInt();

}

}


for(int i=0;i<3;i++)

{

int sum=0;

for(int j=0;j<3;j++)

{

sum+=matrix[i][j];

}

rows[i]=sum;

System.out.println("Sum of the row["+(i+1)+"]:"+" "+sum);

}

int max=0;

for(int i=0;i<3;i++)

{

if(rows[i]>rows[max])

{

max=i;

}

}

System.out.println("Highest row is:"+(max+1));

sc.close();
}
}
