package com.freddyzhounyc.colors;

import com.freddyzhounyc.colors.services.BluePrinter;
import com.freddyzhounyc.colors.services.ColorPrinter;
import com.freddyzhounyc.colors.services.GreenPrinter;
import com.freddyzhounyc.colors.services.RedPrinter;
import com.freddyzhounyc.colors.services.impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColorsApplication implements CommandLineRunner {
	private final ColorPrinter colorPrinter;

	public ColorsApplication(ColorPrinter colorPrinter) {
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColorsApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		System.out.println(colorPrinter.print());
	}
}
