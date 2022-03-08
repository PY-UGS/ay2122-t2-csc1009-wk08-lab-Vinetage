/*---------------------------------------------*/
/*Question 01*/
/*---------------------------------------------*/
public class CircleWithException
{
    //Data container
    private double radius = 0;
    private double area = 0;
    private double diameter = 0;

    //Constructor
    public CircleWithException(){}

    //Getter
    public double getRadius(){return this.radius;}
    public double getArea()
    {
        this.area = Math.PI * Math.pow(this.radius,2);
        if(this.area > 1000)
        {
            throw new IllegalArgumentException("Area is over 1000");
        }
        else
        {
            return this.area;
        }
    }
    public double getDiameter()
    {
        this.diameter = 2 * Math.PI * this.radius;
        return this.diameter;
    }
    //Setter
    public void setRadius(double radius)
    {
        if(radius < 0)
            throw new IllegalArgumentException("Value cannot be negative");
        if(radius > 1000)
            throw new IllegalArgumentException("Number is too large");
        this.radius = radius;
    }
}
