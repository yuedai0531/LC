import java.util.Scanner;

abstract class Distance {
    protected int feet;
    protected float inches;
    
	abstract public void setFeetAndInches(int feet, float inches);
	abstract public int getFeet();
	abstract public float getInches();
	abstract String getDistanceComparison(Distance dist2);
}

class Nakisa2 extends Distance{

	@Override
	public void setFeetAndInches(int feet, float inches) {
		if(feet >= 1 && feet <= 100)
			super.feet = feet;
		else
			System.out.println("feet error");
		
		if(inches >= 1 && inches <= 100)
			super.inches = inches;
		else
			System.out.println("inches error");
	}
	@Override
	public int getFeet() {
		return super.feet;
	}
	@Override
	public float getInches() {
		return super.inches;
	}
	@Override
	String getDistanceComparison(Distance dist2) {
		
		float length1 = this.feet*12 + this.inches;
		float length2 = dist2.feet*12 + dist2.inches;
		
		if(length1>length2)
			return "First distance is greater.";
		else if(length1 == length2)
			return "Both distances are equal.";
		else
			return "Second distance is greater.";
	}
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int dist1Feet = read.nextInt();
		float dist1Inches = read.nextFloat();
		int dist2Feet = read.nextInt();
		float dist2Inches = read.nextFloat();
		
		Nakisa2 dist1 = new Nakisa2();
		dist1.setFeetAndInches(dist1Feet, dist1Inches);
		Nakisa2 dist2 = new Nakisa2();
		dist2.setFeetAndInches(dist2Feet, dist2Inches);
		System.out.println(dist1.getDistanceComparison(dist2));
	}
}