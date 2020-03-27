package org.person.recordtest;

record Point(int x, int y) {
	
	static int z = 0;
	
	public static void main(String[] args) {
		Point point = new Point(5, 6);
		System.out.println(point.x);
	}
	
}
