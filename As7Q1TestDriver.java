public class As7Q1TestDriver {

   public static void main(String[] args) {
      char[][] arr1 = { { 'E', 'U', 'E', 'U', 'U', 'E' },
            { 'U', 'U', 'E', 'U', 'E', 'U' },
            { 'U', 'U', 'U', 'H', 'U', 'U' },
            { 'E', 'U', 'E', 'U', 'U', 'U' },
            { 'E', 'E', 'E', 'U', 'U', 'E' },
            { 'U', 'U', 'U', 'U', 'E', 'U' } };

      char[][] arr2 = { { 'E', 'U', 'U', 'E', 'U' },
            { 'U', 'E', 'U', 'H', 'E' },
            { 'E', 'E', 'E', 'U', 'U' },
            { 'U', 'U', 'U', 'E', 'E' } };

      char[][] arr3 = { { 'E', 'E', 'E', 'U' },
            { 'U', 'E', 'H', 'E' },
            { 'E', 'E', 'E', 'E' },
            { 'E', 'U', 'U', 'U' },
            { 'E', 'U', 'E', 'E' } };

      char[][] arr4 = { { 'U', 'U', 'U', 'U' },
            { 'E', 'E', 'H', 'U' },
            { 'U', 'U', 'E', 'U' },
            { 'U', 'U', 'E', 'U' } };

      char[][] arr5 = { { 'U', 'U', 'U' },
            { 'U', 'U', 'U' },
            { 'H', 'U', 'U' } };

      // both walking and jumping OK:
      System.out.println("arr1, Down direction (should be true): "
            + MoveAnalyzer.checkMove(arr1, 'D'));
      System.out.println("arr1, Left direction (should be true): "
            + MoveAnalyzer.checkMove(arr1, 'L'));

      // walking OK, but jumping is blocked by an enemy:
      System.out.println("\narr2, Down direction (should be true): "
            + MoveAnalyzer.checkMove(arr2, 'D'));
      System.out.println("arr2, Left direction (should be true): "
            + MoveAnalyzer.checkMove(arr2, 'L'));

      // walking blocked by an enemy, but jumping OK:
      System.out.println("\narr3, Down direction (should be true): "
            + MoveAnalyzer.checkMove(arr3, 'D'));
      System.out.println("arr3, Left direction (should be true): "
            + MoveAnalyzer.checkMove(arr3, 'L'));

      // enemies prevent both walking and jumping:
      System.out.println("\narr4, Down direction (should be false): "
            + MoveAnalyzer.checkMove(arr4, 'D'));
      System.out.println("arr4, Left direction (should be false): "
            + MoveAnalyzer.checkMove(arr4, 'L'));

      // walking & jumping both go out of bounds:
      System.out.println("\narr5, Down direction (should be false): "
            + MoveAnalyzer.checkMove(arr5, 'D'));
      System.out.println("arr5, Left direction (should be false): "
            + MoveAnalyzer.checkMove(arr5, 'L'));
   }

}