//java program  to print triangular pattern 7




    /*    1
          3 2
          6 5 4
          10 9 8 7
          15 14 13 12 11    */



          class TrianglePattern7
          {
          	public static void main(String[] args) 
          	{
          		int num = 1 ;
          		for(int i = 1 ; i<=5 ; i++)
          		{
          			for(int j = 1 ; j<=i ; j++)
          			{
          				System.out.print(num+ " ");
          				num++;
          			}
          			System.out.println();
          		}
          	}
          }