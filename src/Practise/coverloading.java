package Practise;

public class coverloading
{
    double width;
    double height;
    double depth;

    coverloading()
    {
        width=height=depth=0;
    }

    coverloading(double w, double h, double d)
    {

        width=w;
        height=h;
        depth=d;
    }

    coverloading(double length)
    {
        width=height=depth=length;
    }

    double volume()
    {
        return(width*height*depth);
    }

}
