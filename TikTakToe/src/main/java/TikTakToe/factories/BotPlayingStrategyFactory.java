package TikTakToe.factories;

import TikTakToe.models.BotDifficultyLevel;
import TikTakToe.strategies.BotPlayingStrategies.BotPlayingStrategy;
import TikTakToe.strategies.BotPlayingStrategies.*;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        BotPlayingStrategy bps = null;

        switch (botDifficultyLevel) {
            case Easy:
                bps = new EasyPlayingStrategy();
                break;
            case Medium:
                bps = new MediumPlayingStrategy();
                break;
            case Hard:
                bps = new HardPlayingStrategy();
                break;
            default:
                return null;
        }

        return bps;
    }
}