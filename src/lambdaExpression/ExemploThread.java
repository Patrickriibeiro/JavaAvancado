package lambdaExpression;

public class ExemploThread {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {			
		         @Override
		        public void run() {
		        	System.out.println("Thread 1 em execu��o");
		        }  		 
		
		   });
		
		t1.start();
		
		Thread t2 = new Thread( () -> System.out.println("Thread 2 em execu��o"));	
		t2.start();
		
		}	
}
