package nit.GITProj01;

/**
 * Hello world!
 */
public class App {
	
	public int sum(int x, int y)
	{
		return x+y;
	}
    public static void main(String[] args) {
    	App app=new App();
    	
        System.out.println("Sum is:"+app.sum(4, 4));
    }
}
