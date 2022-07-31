package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // AshokLeyland truck = new AshokLeyland();
		Truck truck = new Truck();
       truck.soundHorn();
       truck.applyBrake("tesxt");
       truck.applyBrake(null, null);
       Suzuki bike = new Suzuki();
       bike.suzuki();
	}

}
