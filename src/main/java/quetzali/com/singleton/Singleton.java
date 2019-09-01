package quetzali.com.singleton;
//class singleton 
public class Singleton {
	//variable private of  singleton
	private static Singleton instance;
	//constructor private
	private Singleton() {}
	//method get for get instance Singleton
	public static synchronized Singleton getInstance() {
		if(instance!=null) {
			instance = new Singleton();
		}
		return instance;
	}
}
