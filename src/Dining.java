public class Dining {
	public static void main(String[] args) {
		Philosopher[] philosophers = new Philosopher[5];
		Object[] forks = new Object[5];
		
		for (int x = 0; x < 5; x++) {
			forks[x] = new Object();
		}
		
		for (int x = 0; x < 5; x++) {
			Object left = forks[x];
			Object right = forks[(x + 1) % 5];
			
			philosophers[x] = new Philosopher(left, right);
			Thread newPhil = new Thread(philosophers[x], "Philosopher " + (x + 1));
			newPhil.start();
		}
	}
}