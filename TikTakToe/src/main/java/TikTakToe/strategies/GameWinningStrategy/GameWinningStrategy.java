package TikTakToe.strategies.GameWinningStrategy;

import TikTakToe.models.Board;
import TikTakToe.models.Cell;
import TikTakToe.models.GameState;
import TikTakToe.models.Player;

public interface GameWinningStrategy {
    GameState checkForWinner(Board board, Player player, Cell cell);

}
