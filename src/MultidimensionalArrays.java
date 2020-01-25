public class MultidimensionalArrays {
    public static void main(String[] args) {
 /*
   int[][] rowsAndColumns = new int[10][5];

   for(int i = 0; i < rowsAndColumns.length; i++){
       for(int j = 0; j < 5; j++){
           rowsAndColumns[i][j] = j;
       }
   }
   for(int i = 0; i < 10; i++){
       for(int j = 0; j < 5; j++){
           System.out.print("row " + i + " col " + rowsAndColumns[i][j] + " " );
       }
       System.out.println();
   }
*/

   int[][] multiplication = new int[12][12];

   for(int i = 1; i < 13; i++){
       for(int j = 1; j < 13; j++){
           multiplication[i - 1][j - 1] = j;
       }
   }

   for(int i = 1; i < 13; i++){
       for(int j = 1; j < 13; j++){
           System.out.print(i * multiplication[i - 1][j - 1] + "\t");
       }
       System.out.println();
   }




}
}