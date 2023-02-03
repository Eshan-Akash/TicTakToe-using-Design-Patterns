package TikTakToe.strategies.BotPlayingStrategies;

import TikTakToe.models.Board;
import TikTakToe.models.Move;
import TikTakToe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
