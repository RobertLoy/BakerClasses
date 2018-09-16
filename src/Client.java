
public class Client {

	public static void main(String[] args) {
		Pie apple = new Pie(30);
		Cake vanilla = new Cake(45);
		

		System.out.println(apple.make("apple"));
		System.out.println(vanilla.make("vanilla"));		
		// Cannot make a second pie right now
		System.out.println(apple.make("apple"));
		apple.serve(.25);
		// Cannot make a second pie right now
		System.out.println(apple.make("apple"));
		apple.serve(.25);
		apple.serve(.25);
		apple.serve(.25);		
		System.out.println(apple.make("apple"));
		System.out.println(apple.make("apple"));		
		apple.throwAway();
		System.out.println(apple.make("apple"));
		apple.compareDesserts(apple, vanilla);
		
	}

}
