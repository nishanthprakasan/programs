public class q1a
{
    public void volume(int side)
    {
        int areaOfcube = side * side * side;
        System.out.println("Area of cube is " + areaOfcube);
    }
    public void volume(int length , int breadth , int height)
    {
        int areaOfcuboid = length * breadth * height;
        System.out.println("Area of cuboid is " + areaOfcuboid);
    }
    public void volume(int radius , double PI)
    {
         double areaOfsphere = (4 / 3.0 )* PI * radius * radius * radius;
         System.out.println("Area of sphere is " + areaOfsphere);
    }
    public static void main(String args[])
    {   q1a obj = new q1a();
        obj.volume(3);
        obj.volume(4 , Math.PI);
        obj.volume(4 , 4 , 5);
    }
}