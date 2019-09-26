package boxes;

public class Thing {
	private String name;
	private int weight;
	
	public Thing(String name, int weight) {
		if (weight < 0) throw new IllegalArgumentException("Weight cannot be negative");
		this.name = name;
		this.weight = weight;
	}
	
	public Thing(String name) {
		this(name, 0);
	}
	
	public int weight() {
		return this.weight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Thing other = (Thing) obj;
		if (name != other.name)
			return false;
		return true;
	}
}
