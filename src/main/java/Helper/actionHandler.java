package Helper;

import BaseClass.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionHandler extends baseClass
{
    public static Actions builder = new Actions(driver);
    public static void click(WebElement element)
    {
        builder.click(element).perform();
    }
    public static void clickAndHold(WebElement element)
    {
        builder.clickAndHold(element).perform();
    }
    public static void doubleClick(WebElement element)
    {
        builder.doubleClick(element).perform();
    }
    public static void dragAndDrop(WebElement source,WebElement target)
    {
        builder.dragAndDrop(source,target).perform();
    }
    public static void dragAndDropBy(WebElement element,int xOffset,int yOffset)
    {
        builder.dragAndDropBy(element,xOffset,yOffset).perform();
    }
    public static void moveToElement(WebElement element)
    {
        builder.moveToElement(element).perform();
    }
    public static void rightClick(WebElement element)
    {
        builder.contextClick(element).perform();
    }
    public static void keyDown(WebElement element,String value)
    {
        builder.keyDown(element,value);
    }
    public static void keyUp(WebElement element,String value)
    {
        builder.keyUp(element,value);
    }
    public static void moveByOffset(int xOffset,int yOffset)
    {
        builder.moveByOffset(xOffset, yOffset);
    }

    public static void moveToElement(WebElement element,int xOffset,int yOffset)
    {
        builder.moveToElement(element,xOffset, yOffset);
    }
    public static void sendKeys(WebElement element,String value)
    {
        builder.sendKeys(element,value).perform();
    }
    public static void sendKeys(String value)
    {
        builder.sendKeys(value).perform();
    }
    public static void tick(Action action)
    {
        builder.tick(action).perform();
    }

    /*public static void scrollByAmount(int deltaX,int deltaY)
    {
        builder.scrollByAmount(deltaX,deltaY).perform();
    }*/

    /*public static void scrollToElement(WebElement element)
    {
        builder.scrollToElement(element).perform();
    }*/
    public static void chainOfActions(WebElement element,WebElement element1)
    {
        Actions seriesOfActions;
        seriesOfActions = builder
                .click(element)
                .click(element1);
        seriesOfActions.perform();
    }
}