package com.khushi.Springann;

import org.springframework.stereotype.Component;

@Component
public class snapdragon implements Processor{
	public void process() {
		System.out.println("Worlds best Processor");
	}

}
