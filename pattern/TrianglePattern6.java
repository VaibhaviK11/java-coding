// java program to print triangular pattern 6



/*       a
         b c
         d e f
         g h i j
         k l m n o    */




         class TrianglePattern6
         {
         	public static void main(String[] args)
         	 {
         	 	char ch = 'a';
         		for( int i = 1 ; i<=5 ; i++)
         		{
         			for (int j = 1 ; j<=i ; j++)
         			{
         				System.out.print( ch+++ " ");
         			}
         			System.out.println();
         		}
         	}
         }