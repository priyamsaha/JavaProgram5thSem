package MyPack;
import java.util.Scanner;
public class Complex{
	int real,img;
	public Complex(int r,int i)
	{
		real=r;
		img=i;
	}
	public Complex addComplex(Complex t)
	{
		t.real=real+t.real;
		t.img=img+t.img;
		return t;
	}
	public void show()
	{
		System.out.println(real+"+"+img+"i");
	}
}

		
	
