package Constructor;

//example of wiidtbh of box

public class constructor_overloading
{
    double width;
    double height;
    double depth;


    constructor_overloading()    //1st >>>>default c: 0 para
    {

        width=height=depth=0;

    }

    constructor_overloading(double w,double h,double d )//2nd>>>>>3 para
    {

        width=w;
        height=h;
        depth=d;
    }

    constructor_overloading(double len)    // 3rd ><>>>>>>>>>>>>1 para
    {
        width=height=depth=len;
    }


    //method to get volume as we cant use constructor for initialising

    double volume()
    {
        return (height*width*depth);
    }

}
