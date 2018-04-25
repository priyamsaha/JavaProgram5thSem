import pack.*;
class Area extends Test{
	int a;
	Area(int aa)
	{
		a=aa;
	}
	public void area()
	{
		System.out.println("AREA OF THE SQUARE::"+(a*a));
		System.out.println("Binary equivalent::"+Bin.toString(101,10));
	}
} 
class Sample{
	public static void main(String args[]){
		Area a=new Area(5);
		a.area();
	}
}	
