import java.util.*;
class Box
{
	double width,height,depth;  //instance variable
	String name;
	Box()
	{
		width =height=depth = -1;
		
	}
	Box(String name,double width,double height,double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.name = name;
	}
	Box (Box obj)
	{
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
		this.name = obj.name;
	}
	Box(double x)
	{
		width = height = depth = x;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void print()
	{
		System.out.println("Name: "+name);
		System.out.println("Width: "+width+",Height: "+height+",Depth: "+depth);
		
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
	
	void changeIt(Box box){
		box.width = 100;
	}

}


class BoxDemo9
{
	public static void main(String args[])
	{
		Box mybox = new Box("Box1",1.5,2.5,3.5);
		//mybox.setDimension();
		mybox.print();
		mybox.printVolume();
		
		Box mybox2 = new Box();
		mybox2.setName("Box2");
		mybox2.print();
		mybox2.printVolume();
		mybox2.setDimension(3.95,3.94,3.93);
		mybox2.print();
		mybox2.printVolume();
		//double vol = mybox2.volume();
		
		Box mybox3 = new Box(mybox);
		mybox3.print();
		mybox3.printVolume();
		
		Box cube = new Box(1.1010);
		cube.setName("Cube");
		cube.print();
		cube.printVolume();
		
		cube.changeIt(mybox2);
		mybox2.print();
		mybox2.printVolume();
		
		
		
	}

}
