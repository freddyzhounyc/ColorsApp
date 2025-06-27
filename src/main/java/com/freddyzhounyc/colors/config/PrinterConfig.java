package com.freddyzhounyc.colors.config;

import com.freddyzhounyc.colors.services.BluePrinter;
import com.freddyzhounyc.colors.services.ColorPrinter;
import com.freddyzhounyc.colors.services.GreenPrinter;
import com.freddyzhounyc.colors.services.RedPrinter;
import com.freddyzhounyc.colors.services.impl.ColorPrinterImpl;
import com.freddyzhounyc.colors.services.impl.EnglishBluePrinter;
import com.freddyzhounyc.colors.services.impl.EnglishGreenPrinter;
import com.freddyzhounyc.colors.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public ColorPrinter colorPrinter(RedPrinter redprinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redprinter, greenPrinter, bluePrinter);
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }
}
