package NMR;
import java.util.*;


public class test {
	
	public static void main(String[] args){
		Boolean t = new Boolean(false);
		Hashtable electronEnvironment = new Hashtable();
		electronEnvironment.put("alkyl", t);
		if(((Boolean)(electronEnvironment.get("alkyl"))).booleanValue()){
				System.out.println("test");
			}
	
	}

}
