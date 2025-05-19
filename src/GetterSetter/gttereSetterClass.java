package GetterSetter;

public class gttereSetterClass {
	
	private String carModel = "Suzuki";
	private String carColor = "White";
	private String carTire = "Bridgestone";
	private int door = 4;
	private boolean isConvertible = true;
	
	public String getCarmodel() {
		return carModel;
	}
	public String getCarColor() {
		return carColor;
	}
	public String getCarTire() {
		return  carTire;
	}
	public int getDoor() {
		return door;
	}
	public boolean getIsConvertible() {
		return  isConvertible;
	}
	public void setCarmodel(String carModel) {
		this.carModel = carModel;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setCarTire(String carTire) {
		this.carTire = carTire;
	}
	public void setDoor(int door) {
		this.door=door;
	}
	public void setIsconvertible(boolean isConvertible) {
		this.isConvertible = isConvertible;
	}

	public static void main(String[] args) {
		
	}

}
