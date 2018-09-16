
public class Pie extends Dessert {

	@Override	
	public String make(String filling) {
		String msg;
		if (!this.isReady())
		{
			msg = "Added " + filling + " to the crust. Bake for 20 min.";
			this.setName(filling);
			this.setReady(true);	
			this.setRemaining(1.0);		

		}
		else 
		{
			msg = "You already have a Pie.  Don't get greedy!";			
		}
		return msg;
	}

	@Override
	public boolean serve(double slice) {
		if (this.updateRemaining(slice)) {
			System.out.println("Served you " + slice + " % of the Pie.");
			return true;
		}
		else 
		{
			System.out.println("You cannot serve up " + slice + " % of the Pie.");	
			System.out.println("The Pie only has " + this.getRemaining() + " remaining.");				
			return false;
		}
	}

	@Override
	public int getPrepTime() {
		return this.prepTime;
	}

	@Override
	protected void setPrepTime(int prepTime) {
		this.prepTime = prepTime;
	}
	
	// Constructor
	Pie (int time){
		this.setPrepTime(time);
	}

}
