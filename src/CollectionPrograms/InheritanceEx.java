package CollectionPrograms;
class Bike
{
	int speed;
	int gear;
	public Bike(int speed, int gear)
	{
		this.speed=speed;
		this.gear=gear;
	}
	public void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	public void speedUp(int increment)
	{
		speed +=increment;
	}
	public String toString()
	{
		return ("no of gear:"+gear+" speed:"+speed);
		
	}
}
class MotorBike extends Bike
{
	int seatHeight;
	public MotorBike(int speed,int gear,int seatHeight)
	{
		super(speed,gear);
		this.seatHeight=seatHeight;
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	public String toString()
	{
		return (super.toString()+" seatHeight:"+seatHeight);
		
	}
	
}
public class InheritanceEx {

	public static void main(String[] args) {
		MotorBike mb=new MotorBike(2,100,20);
		System.out.println(mb.toString());

	}

}
