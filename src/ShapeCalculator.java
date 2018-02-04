public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {
    private Circle circle;


    public  double cirecleArea(Circle circle){
        return Math.PI*Math.pow(circle.getR(),2.0);
    }

    public double rectArea(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    public double ballVolume (Ball ball){
        return (Math.PI*Math.pow(ball.getR(),3.0)*4/3);

    }

    public double cubeVolume (Cube cube){
        return Math.pow(cube.getA(),3.0);
    }
}
