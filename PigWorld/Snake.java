// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Snake extends Actor
{

    /**
     * //This put everything into action at once and also if we lost the game , it will transition to our Loser screen.
     */
    public void act()
    {
        MoveAndTurn();
        eat();
        if (isGameLost()) {
            transitionToGameOverWorld();
            Greenfoot.playSound("lose.wav");
        }
    }

    /**
     * // This so the snake move sinto random directions in order to catch the pig.
     */
    public void MoveAndTurn()
    {
        move(4);
        if (Greenfoot.getRandomNumber(25) == 1) {
            turn(Greenfoot.getRandomNumber(360) - 45);
        }
    }

    /**
     * // This will make it so if a pig comes into contact with our snake, the pig will disappear.
     */
    public void eat()
    {
        Actor Pig = getOneIntersectingObject(Pig.class);
        if (Pig != null) {
            World world = getWorld();
            world.removeObject(Pig);
        }
    }

    /**
     * //  This tells us how we lose the game, so if there are no pigs left on the map then we lose.
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * //  Sets the map to the Loser screen when we lose.
     */
    public void transitionToGameOverWorld()
    {
        World Loser =  new Loser();
        Greenfoot.setWorld(Loser);
    }
}
