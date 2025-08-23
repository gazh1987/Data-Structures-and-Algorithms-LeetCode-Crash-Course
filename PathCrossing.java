package Dsa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PathCrossing {
	public boolean isPathCrossing(String path) {
		
		Set<Coordinates> visited = new HashSet<>();
		Coordinates c = new Coordinates(0, 0);
		visited.add(c);
			
		for (char p : path.toCharArray()) {
			
			switch (p) {
				case 'N':
					c = new Coordinates(c.x, c.y + 1);
					break;
				case 'S': 
					c = new Coordinates(c.x, c.y - 1);
					break;
				case 'E':
					c = new Coordinates(c.x + 1, c.y);
					break;
				case 'W':
					c = new Coordinates(c.x - 1, c.y);
					break;
			}
			
			if (visited.contains(c)) {
				return true;
			}
			else {
				visited.add(c);
			}
		}
		
		return false;
    }
}

class Coordinates {
	public int x;
	public int y;
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object o) {
		Coordinates c = (Coordinates) o;
		return c.x == x && c.y == y;
	}
	
	@Override
	public int hashCode() {
        return Objects.hash(x, y);
    }
}
