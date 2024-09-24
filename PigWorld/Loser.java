// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Loser extends World
{

    /**
     * // This is for the message that will appear when we lose the game and this is the place where we control the position of the words.
     */
    public Loser()
    {
        super(560, 560, 1);
        showText("GAME OVER!", 260, 260);
    }

    /**
     * //This is to describe the font, size, color.
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
        showTextWithBigWhiteFont("YOU LOST", 180, 200);
    }
}
