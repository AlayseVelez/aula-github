import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) throws IOException {
    	
    	List<String> list = new ArrayList<>();
    	
    	list.add("adones");
    	list.add("alice");
    	list.add("helena");
    	list.add("alayse");
    	
    	System.out.println(list.size());
    	
    	for(String x:list) {
    		System.out.println(x);
    	}
        
        
    }
}