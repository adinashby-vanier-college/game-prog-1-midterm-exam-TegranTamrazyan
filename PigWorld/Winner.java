// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Winner extends World
{

    /**
     * // This is for the message that will appear when we win the game and this is the place where we control the position of the words.
     */
    public Winner()
    {
        super(560, 560, 1);
        showText("YOU WIN!", 260, 260);
    }

    /**
     * //Describes the message size, font, color.
     */
    public void showTextWithBigWhiteFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
        showTextWithBigWhiteFont("You win", 180, 200);
    }
}
