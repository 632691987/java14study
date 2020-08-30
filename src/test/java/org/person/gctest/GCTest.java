package org.person.gctest;

import java.util.concurrent.TimeUnit;


/**
 * -XX:+UseSerialGC
 * -XX:+UseParallelGC
 * -XX:+UnlockExperimentalVMOptions -XX:+UseZGC
 * -XX:+UseZGC
 * 
 * 1) If the application has a small data set (up to approximately 100 MB), then select the serial collector with the option -XX:+UseSerialGC.
 * 2) If the application will be run on a single processor and there are no pause-time requirements, then select the serial collector with the option -XX:+UseSerialGC
 * 
 * 
 * 
 * 3) If (a) peak application performance is the first priority and 
 *       (b) there are no pause-time requirements or pauses of one second or longer are acceptable, 
 *       then let the VM select the collector or select the parallel collector with -XX:+UseParallelGC
 * 
 * 
 * 4) If response time is more important than overall throughput and garbage collection pauses must be kept shorter, then select the mostly concurrent collector with -XX:+UseG1GC
 * 
 * 5) If response time is a high priority, and/or you are using a very large heap, then select a fully concurrent collector with -XX:UseZGC
 *
 */

public class GCTest {
	
	public static void main(String... args) throws InterruptedException {
		for(int i = 0; i < 100000; i++) {
			new Entity(6, 7);
			if (i % 100 == 0) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println("i=" + i);
			}
		}
	}
	
	static record Entity(int m, int n) {
		
	}
}
