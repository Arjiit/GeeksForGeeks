import java.util.*;
import java.io.*;
import java.lang.*;

public class LRUCache {
	LinkedHashMap<Integer, Integer> cache;
	int N;

	// initializing LRU cache with size N	
	public LRUCache(int N) {
		this.N = N;
		cache = new LinkedHashMap<Integer, Integer>(N, .75f, true) {
		protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
			return size() > N;
		}
	};
}

 // returns the value of key x if present else -1.
 
 public int get(int x) {
 	if (cache.containsKey(x)) {
 		return cache.get(x);
 		
 	} else {
 		return -1;
 	}
 }
 
 // setting the key x with value y it the LRU cache
 
 public void set(int x, int y) {
 	cache.put(x, y);
 }
 
}
