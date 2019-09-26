package packages.classes;
import java.util.ArrayList;

public class Menu {
	private ArrayList<String> meals = new ArrayList<String>();
	
	public void addMeal(String meal) {
		if (!this.meals.contains(meal)) {
			meals.add(meal);
		}
	}
	
	public void printMenu() {
		if (this.meals.isEmpty()) {
			System.out.println("Menu is empty");
		} else {
			for (String meal : meals) {
				System.out.println(meal);
			}
		}
		
	}
	
	public void clearMenu() {
		meals.clear();
	}
}
