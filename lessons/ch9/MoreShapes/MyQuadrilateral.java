/*
  Ethan R. Jones
  2-19-15
  My Quadrilateral
*/
public class MyQuadrilateral extends Point
{
    private p1;
    private p2;
    private p3;
    private p4;

    public MyQuadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
	p1 = new Point(x1, y1);
	p2 = new Point(x2, y2);
	p3 = new Point(x3, y3);
	p4 = new Point(x4, y4);
    }

    // Mutators
    public Point getPoint1()
    {
	return p1;
    }

    public Point getPoint2()
    {
	return p2;
    }

    public Point getPoint3()
    {
	return p3;
    }

    public Point getPoint4()
    {
	return p4;
    }
    
    // Get Functions
    public String toString()
    {
	return "" + p1.toString() + "," + p2.toString() + "," +p3.toString() + "," + p4.toString();
    }   
}