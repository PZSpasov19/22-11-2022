public class Box {
    private double length;
    private double width;
    private double height;


    public Box(double length, double width, double height)
    {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength()
    {
        return this.length;
    }

    public double getWidth()
    {
        return this.width;
    }

    public double getHeight()
    {
        return this.height;
    }
    public void setLength(double length)
    {
        if(height <= 0)
        {
            this.height = 1;
        }
        else {
            this.length = length;
        }
    }

    public void setWidth(double width)
    {
        if(width <= 0)
        {
            this.width = 1;
        }
        else {
            this.width = width;
        }
    }

    public void setHeight(double height)
    {
        if(height <= 0)
        {
            this.height = 1;
        }
        else {
            this.height = height;
        }
    }

    public double calculateSurfaceArea()
    {
        double result = 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
        return result;
    }

    public double calculateLateralSurfaceArea()
    {
        double result = 2 * this.length * this.height + 2 * this.width * this.height;
        return result;
    }

    public double calculateVolume()
    {
        double resutt =  this.height * this.width;
        return result;
    }

}
