package e5;
public class Lap 
{
 String bname;
 String ram;
 int price;
public Lap(String bname, String ram, int price) {
	super();
	this.bname = bname;
	this.ram = ram;
	this.price = price;
}
@Override
public String toString() {
	return "Lap [bname=" + bname + ", ram=" + ram + ", price=" + price + "]";
}

@Override
public boolean equals(Object o) {
	Lap l=(Lap)o;
	return ((this.bname==l.bname)&&(this.ram==l.ram)&&(this.price==l.price));
}
}
