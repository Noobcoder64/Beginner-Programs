package packages.classes;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
	Map<String, Integer> prices;
	Map<String, Integer> stocks;
	
	public Storehouse() {
		prices = new HashMap<String, Integer>();
		stocks = new HashMap<String, Integer>();
	}
	
	public void addProduct(String product, int price, int stock) {
		this.prices.put(product, price);
		this.stocks.put(product, stock);
	}
	
	public int price(String product) {
		if (!(prices.containsKey(product))) return -99;
		return prices.get(product);
	}
	
	public int stock(String product) {
		if (!(prices.containsKey(product))) return 0;
		return stocks.get(product);
	}
	
	public boolean take(String product) {
		int stock = stock(product);
		if (stock <= 0) return false;
		stocks.replace(product, stock - 1);
		return true;
	}
	
	public Set<String> products() {
		return this.prices.keySet();
	}
	
}
