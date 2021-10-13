public class Philosopher implements Runnable {
	private Object left;
    private Object right;

    public Philosopher(Object left, Object right) {
        this.left = left;
        this.right = right;
    }

    public void act(String act) throws InterruptedException {
    	System.out.println(Thread.currentThread().getName() + " " + act);
    	Thread.sleep((int)(Math.random() * 100));
    }
    
    public void run() {
        try {
        	while (true) {
            	// think();
            	act("is thinking.");
            	
            	// pick_up_left_fork( );
            	
            	
            	
            	// pick_up_right_fork( );
            	
            	
            	
            	// eat( );
            	
            	
            	
            	// put_down_right_fork();
            	
            	
            	
            	// put_down_left_fork();
            	
            	
            	
            }
        } catch (InterruptedException e) {
        	Thread.currentThread().interrupt();
        	return;
        }
    	
    }
}
