package TikTakToe.strategies.BotPlayingStrategies;

import TikTakToe.models.Board;
import TikTakToe.models.Cell;
import TikTakToe.models.Move;
import TikTakToe.models.Player;

public class EasyPlayingStrategy implements BotPlayingStrategy{
    public Move decideMove(Player player, Board board){
        Cell[][] cells = board.getCells();
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells.length; j++){
                if(cells[i][j].getPlayer() == null){
                    Move move = new Move(player, i, j);
                    return move;
                }
            }
        }

        return null;
    }
}
