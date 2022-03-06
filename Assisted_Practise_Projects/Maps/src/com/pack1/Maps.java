package ComPackages;

import java.util.*;
import java.util.Map.Entry;
public class Maps {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(16,"Manoj");    
	      hm.put(17,"Rohith");    
	      hm.put(18,"Ravi");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(41,"Shravan");  
	      ht.put(42,"Naresh");  
	      ht.put(43,"Hamenth");  
	      ht.put(44,"Siva");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(88,"Pune");    
	      map.put(89,"Hyderabad");    
	      map.put(90,"Chennai");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
