package org.person.reference;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTest {
	
	static class AAA {
		int m;
		int n;
		
		public AAA(int m, int n) {
			super();
			this.m = m;
			this.n = n;
		}

		public int getM() {
			return m;
		}

		public int getN() {
			return n;
		}
		
		public void setM(int m) {
			this.m = m;
		}

		public void setN(int n) {
			this.n = n;
		}

		@Override
		public String toString() {
			return "AAA [m=" + m + ", n=" + n + "]";
		}
	}

	public static void main(String[] args) {
		new ReferenceTest().operate();
	}
	
	public void operate() {
		List<String> lists = new ArrayList<>();
		operate(lists);//by reference
		
		int num = 100;
		operate(num);//by value
		
		String str = "AAA";
		operate(str);//by value
		
		AAA cc = new AAA(1,2);
		operate(cc);//by reference
	}
	
	public void operate(List<String> lists) {
		lists.add("AAA");
	}
	
	public void operate(int num) {
		num = 200;
	}
	
	public void operate(String value) {
		value = "";
	}
	
	public void operate(AAA value) {
		value.setM(11);
		value.setN(11);
	}

}
