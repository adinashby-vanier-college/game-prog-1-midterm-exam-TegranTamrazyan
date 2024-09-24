// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * //This put everything into action at once and also if we win the game , it will transition to our Winner screen.
     */
    public void act()
    {
        move();
        eat();
        if (isGameWon()) {
            transitionToGameWonWorld();
            Greenfoot.playSound("win.wav");
        }
    }

    /**
     * // We use this to control how the pig moves.
     */
    public void move()
    {
        if (Greenfoot.isKeyDown("w")) {
            move(3);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(3);
        }
    }

    /**
     * // This will make it so if a burger comes into contact with a pig, the burger will disappear and it will play an eating noise.
     */
    public void eat()
    {
        Actor Burger = getOneIntersectingObject(Burger.class);
        if (Burger != null) {
            World world = getWorld();
            world.removeObject(Burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * //  This tells us how we win the game, so if there are no burgers left on the map then we win.
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * //  Sets the map to the winner screen when we win 
     */
    public void transitionToGameWonWorld()
    {
        World Winner =  new Winner();
        Greenfoot.setWorld(Winner);
    }
}
