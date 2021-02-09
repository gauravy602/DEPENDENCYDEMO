package com.khushi.Springann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
	@Autowired
	@Qualifier("mediatek")
	Processor p;
	public Processor getP() {
		return p;
	}
	public void setP(Processor p) {
		this.p = p;
	}
	public void config() {
		System.out.println("Octa core, 4 gb Ram,12MP Camera");
		p.process();
	}

}
