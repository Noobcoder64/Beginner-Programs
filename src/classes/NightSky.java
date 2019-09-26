package classes;
import java.util.Random;

public class NightSky {
	private double density;
	private int width;
	private int height;
	private int starsInLastPrint;
	
	public NightSky(double density) {
		this(density, 20 , 10);
	}
	
	public NightSky(int width, int height) {
		this(0.1, width, height);
	}
	
	public NightSky(double density, int width, int height) {
		this.density = density;
		this.width = width;
		this.height = height;
	}
	
	public void printLine() {
		Random random = new Random();
		double probability;
		
		for (int i = 0; i < this.width; i++) {
			probability = random.nextDouble();
			
			if (probability <= this.density) {
				System.out.print("*");
				this.starsInLastPrint++;
			} else {
				System.out.print(" ");
			}
		}
		
	}
	
	public void print() {
		for (int i = 0; i < this.height; i++) {
			printLine();
			System.out.println();
		}
	}
	
	public int starsInLastPrint() {
		return this.starsInLastPrint;
	}
}
