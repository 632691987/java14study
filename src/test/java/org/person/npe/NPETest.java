package org.person.npe;

public class NPETest {
	public BClass bclass = new BClass();
	
	static class BClass {
		public CClass cClass = null;
		
		static class CClass {
			public int m = 10;
		}
	}
	
	public static void main(String[] args) {
		NPETest mm = new NPETest();
		System.out.println(mm.bclass.cClass.m);
	}
	
	
}
