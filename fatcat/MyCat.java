import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MyCat is your own cat. Get it to do things by writing code in its act method.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyCat extends Cat
{
    /**
     * Act - do whatever the MyCat wants to do.
     */
    public void act()
    {
        eat();
        wait(1);
        dance();
        wait(1);
        sleep(2);
        wait(1);
        walkLeft(3);
        wait(1);
        walkRight(6);
        wait(1);
        walkLeft(3);
        wait(1);
        shoutHooray();
    }    
}
