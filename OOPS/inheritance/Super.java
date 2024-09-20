package OOPS.inheritance;
class Rectangle00
{
    int length;
    int breadth;
    int x=10;
int y = 50;
    Rectangle00(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

}

class Cuboid00 extends Rectangle00
{
    int height;
    int y=20;

    Cuboid00(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }

    void display()
    {
        System.out.println(super.x);
        System.out.println(super.y);
        System.out.println(y);
    }
}
public class Super {
    public static void main(String[] args) {
        Cuboid00 c=new Cuboid00(10,5,15);
        c.display();
    }
}




