package com.khushi.Springann;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class Mediatek implements Processor {
	public void process() {
		System.out.println("Worlds 2nd best Processor");
	}
	
}
