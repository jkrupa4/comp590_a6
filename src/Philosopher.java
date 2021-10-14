public class Philosopher implements Runnable {
	private Object left;
    private Object right;
    private int index;

    public Philosopher(Object left, Object right, int index) {
        this.left = left;
        this.right = right;
        this.index = index;
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
            	
            	// pick_up_left_fork();
            	if (this.index != 0) {
            		synchronized(this.left) {
                		act("picked up left fork.");
                		
                		// pick_up_right_fork();
                		synchronized(this.right) {
                			
                			// eat();
                			act("picked up right fork. Is eating.");
                			
                			// put_down_right_fork();
                			act("put down right fork.");
                		}
                		
                		// put_down_left_fork();
                		act("put down left fork.");
                	}
            	} else {
            		synchronized(this.left) {
                		act("picked up right fork.");
                		
                		// pick_up_right_fork();
                		synchronized(this.right) {
                			
                			// eat();
                			act("picked up left fork. Is eating.");
                			
                			// put_down_right_fork();
                			act("put down left fork.");
                		}
                		
                		// put_down_left_fork();
                		act("put down right fork.");
                	}
            	}
            	
            }
        } catch (InterruptedException e) {
        	Thread.currentThread().interrupt();
        	return;
        }
    	
    }
}
