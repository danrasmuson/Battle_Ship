// STRAGETY
// Two functions
// ship hunt.
// Parries the board like a checkerboard until it hits something. Also takes into consideration square probabilities. Wanting to hit open space more because they are more chances to hit a ship. Once something is hit used sinkShip. Marks squares as impossible as it goes along.
// Sink ship.
// Looks at ships that are already sunk and takes the largest length. Then picks  a square adjacent to it.
// Note. I should make a move history thing.
import java.util.Arrays;
public class main_DAN {
    public static void main(String[] args) {
        System.out.println("hello");

<<<<<<< HEAD
        Board board = new Board("1000Boards\\1.txt");

        // PREVIOUS SOLUTION
        // // int numOfBoards = 9;
        // int boardNum = 8;
        // int total = 0;
        // // for (int i = 1; i < numOfBoards+1; i++){
        // for (int i = boardNum; i < boardNum+1; i++){
        //     Board board = new Board("1000Boards\\"+Integer.toString(i)+".txt");
=======
        // int numOfBoards = 9;
        int boardNum = 10;
        int total = 0;
        // for (int i = 1; i < numOfBoards+1; i++){
        for (int i = boardNum; i < boardNum+1; i++){
            Board board = new Board("1000Boards\\"+Integer.toString(i)+".txt");
>>>>>>> parent of 8d9fcda... About to redo abstraction, and remove uneeded code, good bye next 2 hours
            
        //     for (int z = 0; z < 60; z++){
        //     // while (!board.isGameDone()){
        //         int[] coord = board.getBestGuess();
        //         String result = board.fireShot(coord[0], coord[1]);
        //         if (result.equals("hit")){
        //             board.sinkShip();
        //         }
                
<<<<<<< HEAD
        //         // System.out.println("");
        //         // System.out.println("");
        //     }
        //     // board.getMoves().print();
        //     // System.out.println(board.getMoves().getHighestMoveNum());    
        //     board.print();
        //     total += board.getMoves().getHighestMoveNum();
        // }
        // System.out.print("Average Moves:");
        // System.out.println(total);
=======
                board.print();
                System.out.println("");
                System.out.println("");
            }
            // board.getMoves().print();
            // System.out.println(board.getMoves().getHighestMoveNum());    
            total += board.getMoves().getHighestMoveNum();
        }
        System.out.print("Average Moves:");
        System.out.println(total);
>>>>>>> parent of 8d9fcda... About to redo abstraction, and remove uneeded code, good bye next 2 hours
    }
}