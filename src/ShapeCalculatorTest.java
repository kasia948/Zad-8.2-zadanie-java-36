public class ShapeCalculatorTest{
    public static void main(String[] args) {
        ShapeCalculator calc1 = new ShapeCalculator();

        Circle circle1=new Circle(4.0);
        System.out.println("Pole powierzchni koła o promieniu "+circle1.getR()+" wynosi "+calc1.cirecleArea(circle1));

        Rectangle rect1 = new Rectangle(5.0,8.0);
        System.out.println("Pole prostokąta o bokacg a="+rect1.getA()+" i b="+rect1.getB()+" wynosi "+calc1.rectArea(rect1));

        Line2D line1= new Line2D(9,7);
        System.out.println("Długość linii 2D o parametrach X="+line1.getX()+", Y="+line1.getY()+" wynosi "+calc1.lineLength(line1));

        Ball ball1= new Ball(6);
        System.out.println("Objętość kuli o promieniu "+ball1.getR()+" wynosi "+calc1.ballVolume(ball1));

        Cube cube1= new Cube(6);
        System.out.println("Objętość szceścianu o boku "+cube1.getA()+" wynosi "+calc1.cubeVolume(cube1));
    }
}


