/**
 * 
 * This class provides a method to analyze if a move is valid in a given maze.
 * It checks if the target space is within the bounds of the maze, unoccupied,
 * and
 * if the hero can jump over an enemy if necessary. It returns true if the move
 * is valid
 * and false otherwise.
 * 
 * @author Omar Habib ID:3742418
 */
public class MoveAnalyzer {
    /**
     * Analyze if a move is valid in a given maze.
     * 
     * @param maze      2D char array representing the maze.
     * @param direction char representing the direction of the move
     * @return boolean value indicating whether the move is valid or not.
     */
    public static boolean checkMove(char[][] maze, char direction) {
        int row = 0;
        int col = 0;

        // Find the current location of the hero
        boolean heroFound = false;
        for (int i = 0; i < maze.length && !heroFound; i++) {
            for (int j = 0; j < maze[i].length && !heroFound; j++) {
                if (maze[i][j] == 'H') {
                    row = i;
                    col = j;
                    heroFound = true;
                }
            }
        }

        // Determine the coordinates of the space the hero is trying to move to
        int targetRow = 0;
        int targetCol = 0;
        int jumpTargetRaw = 0;
        int jumpTargetCol = 0;
        if (direction == 'D') {
            targetRow = row + 1;
            targetCol = col;
            jumpTargetRaw = row + 2;
            jumpTargetCol = col;
            // System.out.println("TargetRow: " + targetRow);
            // System.out.println("TargetCol" + targetCol);
        } else if (direction == 'L') {
            targetRow = row;
            targetCol = col - 1;
            jumpTargetRaw = row;
            jumpTargetCol = col - 2;
            // System.out.println("TargetRow: " + targetRow);
            // System.out.println("TargetCol" + targetCol);
        } else {
            return false;
        }

        // Check if the target space is within the bounds of the maze
        if (targetRow < 0 || targetRow >= maze.length || targetCol < 0 || targetCol >= maze[0].length) {
            return false;
        }

        // Check if the target space is unoccupied
        if ((maze[targetRow][targetCol] != 'U') && (maze[jumpTargetRaw][jumpTargetCol] != 'U')) {
            return false;
        }

        // If the hero is walking, return true
        if (direction == 'D' && row + 1 < maze.length && maze[row + 1][col] == 'U') {
            return true;
        } else if (direction == 'L' && col - 1 >= 0 && maze[row][col - 1] == 'U') {
            return true;
        }

        // If the hero is jumping, check if they can jump over an enemy
        if (direction == 'D' && row + 2 < maze.length && maze[row + 1][col] == 'E' && maze[row + 2][col] == 'U') {
            return true;
        } else if (direction == 'L' && col - 2 >= 0 && maze[row][col - 1] == 'E' && maze[row][col - 2] == 'U') {
            return true;
        }

        // If none of the above conditions are true, the move is invalid
        return false;
    }
}