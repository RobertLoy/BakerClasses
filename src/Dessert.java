
public abstract class Dessert {
	
	// Class attributes
	private double calories;
	private String name;
	private boolean isReady = false;
	private double remaining = 0.00;
	protected int prepTime;

	
	// Class Getter/Setter Methods
	public void setCalories(double cal) {
		this.calories = cal;
	}
	
	public double getCalories() {
		return this.calories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isReady() {
		return isReady;
	}

	public void setReady(boolean ready) {
		this.isReady = ready;
	}
	
	public double getRemaining() {
		return remaining;
	}

	public void setRemaining(double remaining) {
		this.remaining = remaining;
	}	
	
	// Abstract Methods
	public abstract String make(String filling);	
	public abstract boolean serve(double size);
	public abstract int getPrepTime(); 
	protected abstract void setPrepTime(int prepTime);
	
	// Object methods
	protected void throwAway() {
		this.setReady(false);
		this.setRemaining(0.00);
	}
	
	protected boolean updateRemaining(double serving) {
		double remaining = this.getRemaining() - serving;
		if (remaining > 0.00)
		{
			this.setRemaining(this.getRemaining() - serving);
			return true;
		}
		else if (remaining == 0.0) {
			this.setReady(false);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void compareDesserts(Pie a, Cake b) {
		
		if (a.getRemaining() > b.getRemaining()) {
			System.out.println("You have more " + a.getName() + " Pie than " + b.getName() + " Cake.");
		}
		else 
		{
			System.out.println("You have more " + b.getName() + " Cake than " + a.getName() + " Pie.");			
		}
		
	}







}
