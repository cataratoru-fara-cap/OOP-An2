package src;
public class MovableCircle {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public MovableCircle(int radius, MovablePoint center){
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public void moveUp(){
        center.moveUp();

    }


    @Override
    public void moveRight(){
        center.moveRight();

    }

    @Override
    public String toString(){
        return 
    }
}
