import java.util.*;
class Box
{
	double width,height,depth;  //instance variable
	Box()
	{
		width =height=depth = -1;
		
	}
	Box(double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	void print()
	{
		System.out.println("Width: "+width);
		System.out.println("Height: "+height);
		System.out.println("Depth: "+depth);
	}	

	void setDimension(double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	double volume()
	{
		return width*height*depth;
	}
	void printVolume()
	{
		System.out.println("Volume print by volume method: "+volume());
	}

}


class BoxDemo8
{
	public static void main(String args[])
	{
		Box mybox = new Box(1.5,2.5,3.5);
		//mybox.setDimension();
		mybox.print();
		mybox.printVolume();
		
		Box mybox2 = new Box();
		mybox2.print();
		mybox2.printVolume();
		mybox2.setDimension(3.95,3.94,3.93);
		mybox2.print();
		mybox2.printVolume();
		//double vol = mybox2.volume();
		
		
	}

}