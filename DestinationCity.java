package Dsa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
	public String destCity(List<List<String>> paths) {
		Set<String> outgoing = new HashSet<>();
		
		for (List<String> p : paths) {
			outgoing.add(p.get(0));
		}
		
		for (List<String> p : paths) {
			String dest = p.get(1);
			if (!outgoing.contains(dest)) {
				return dest;
			}
		}
		
		return null;
    }
}
