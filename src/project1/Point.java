package project1;

import java.util.Objects;

public class Point {
	private int x;
	private int y;
	
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(!(obj instanceof Point))
			return false;
		var other = (Point)obj;
		return other.x == x && other.y == y;
		
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(x,y);
	}
	
	
	
	

}
