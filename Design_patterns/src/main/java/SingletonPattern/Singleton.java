package SingletonPattern;

public class Singleton {
	private static Singleton instanc=null;
	public String s;
	private Singleton(){
		s="Constructor of singleton class";
	}
	public static Singleton Singleton() {
		if(instanc==null)
			instanc=new Singleton();
		return instanc;
	}
}