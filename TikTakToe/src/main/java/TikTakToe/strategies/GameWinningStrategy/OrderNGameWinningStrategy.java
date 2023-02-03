package TikTakToe.strategies.GameWinningStrategy;

import TikTakToe.models.Board;
import TikTakToe.models.Cell;
import TikTakToe.models.GameState;
import TikTakToe.models.Player;

public class OrderNGameWinningStrategy implements  GameWinningStrategy{
    @Override
    public GameState checkForWinner(Board board, Player player, Cell cell) {
        Cell[][] cells = board.getCells();

        // check the row
        int row_of_curr_cell = cell.getRow();
        boolean flag = true;
        for(int j = 0; j < cells.length; j++){
            if(cells[row_of_curr_cell][j].getPlayer() != player){
                flag = false;
                break;
            }
        }
        if(flag){
            return GameState.End_In_Result;
        }

        // check the col
        int col_of_curr_cell = cell.getCol();
        flag = true;
        for(int i = 0; i < cells.length; i++){
            if(cells[i][col_of_curr_cell].getPlayer() != player){
                flag = false;
                break;
            }
        }
        if(flag){
            return GameState.End_In_Result;
        }

        // check the diagnols -> skip


        // check for draw
        flag = true;
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                if(cells[i][j].getPlayer() == null){
                    flag = false;
                    break;
                }
            }
        }
        if(flag){
            return GameState.End_In_Draw;
        }


        return GameState.InProgress;
    }
}
