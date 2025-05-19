package GetterSetter;

public class MainGetterSetterPrint {

	public static void main(String[] args) {
		gttereSetterClass obj = new gttereSetterClass();
		obj.setCarmodel("KIA");
		System.out.println("A car model is :" +obj.getCarmodel());
		
		obj.setCarColor("Balck");
        System.out.println("Color of car is :"+ obj.getCarColor());	
        
        obj.setCarTire("MRF");
        System.out.println("Tires of car is of :"+ obj.getCarTire());
        
        obj.setDoor(2);
        System.out.println("Car has doors :"+obj.getDoor());
        
        obj.setIsconvertible(true);
        System.out.println("car is setIsconvertible:" + obj.getIsConvertible());
        
	}

}
