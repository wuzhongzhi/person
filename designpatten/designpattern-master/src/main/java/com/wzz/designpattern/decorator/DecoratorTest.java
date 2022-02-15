package com.wzz.designpattern.decorator;


public class DecoratorTest {
    public static void main(String[] args) {
          Component component=  new ConreteDecorator1( new ConreteDecorator2(new ConcreteComponent() ) );
          component.operation();
    }
}

interface Component{
    void operation();
}
class ConcreteComponent implements Component{

    @Override
    public void operation() {
        System.out.println("拍照.");
    }
}
abstract class Decorator implements Component{
    Component component;

    public Decorator(Component component) {
        this.component=component;
    }
}

class ConreteDecorator1 extends Decorator{

    public ConreteDecorator1(Component component) {
        super( component );
    }

    @Override
    public void operation() {
        System.out.println("添加美颜.");
        component.operation();
    }
}

class ConreteDecorator2 extends Decorator{


    public ConreteDecorator2(Component component) {
        super( component );
    }

    @Override
    public void operation() {
        System.out.println("添加滤镜.");
        component.operation();
    }
}











































































