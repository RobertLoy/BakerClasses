
public class Cake extends Dessert {

	@Override
	public String make(String flavor) {
		String msg;
		if (!this.isReady())
		{
			msg = "Added " + flavor + " to the mix. Bake for 30 min.";
			this.setName(flavor);			
			this.setReady(true);
			this.setRemaining(1.0);
		}
		else 
		{
			msg = "You already have a Cake.  Too much cake is bad!";			
		}
		return msg;		
	}

	@Override
	public boolean serve(double slice) {
		if (this.updateRemaining(slice)) {
			System.out.println("Served you " + slice + " % of the Cake.");
			return true;
		}
		else 
		{
			System.out.println("You cannot serve up " + slice + " % of the Cake.");	
			System.out.println("The Cake only has " + this.getRemaining() + " remaining.");				
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
	Cake (int time){
		this.setPrepTime(time);
	}
	
	

}
