package DesignPatterns.FactoryPattern.AbstractFactoryPattern.Demo1;

public class MediaFan implements Fan{
    @Override
    public void fanInfo() {
        System.out.println("美的风扇");
    }
}
