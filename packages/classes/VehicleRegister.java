package packages.classes;
import java.util.HashMap;

public class VehicleRegister {
	HashMap<RegistrationPlate, String> owners;
	
	public VehicleRegister() {
		this.owners = new HashMap<RegistrationPlate, String>();
	}
	
	public boolean add(RegistrationPlate plate, String owner) {
		if (this.owners.containsKey(plate)) return false;
		this.owners.put(plate, owner);
		return true;
	}
	
	public String get(RegistrationPlate plate) {
		return this.owners.get(plate);
	}
	
	public boolean delete(RegistrationPlate plate) {
		if (!this.owners.containsKey(plate)) return false;
		this.owners.remove(plate);
		return true;
	}
}