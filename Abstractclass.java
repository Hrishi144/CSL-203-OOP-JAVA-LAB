abstract class shape{
    abstract void numberofsides();
}  class triangle extends  shape{
    int side;
    triangle(int side){
        this.side=side;
    } void numberofsides(){
        System.out.println("The number of sides of a triangle is "+side);
    }
}      class rectangle extends  shape{
    int side;
    rectangle(int side){
        this.side=side;
    } void numberofsides(){
        System.out.println("The number of sides of a rectangle is "+side);
    }
}       class hexagon extends  shape{
    int side;
    hexagon(int side){
        this.side=side;
    } void numberofsides(){
        System.out.println("The number of sides of a hexagon is "+side);
    }
} public class Abstractclass{
    public static void main(String args []){
        triangle tri = new triangle(3);
        tri.numberofsides();
        rectangle rec=new rectangle(4);
        rec.numberofsides();
        hexagon hex =new hexagon(6);
        hex.numberofsides();
    }
}
    

