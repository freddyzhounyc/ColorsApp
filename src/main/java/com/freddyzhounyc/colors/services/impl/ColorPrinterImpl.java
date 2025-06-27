package com.freddyzhounyc.colors.services.impl;

import com.freddyzhounyc.colors.services.BluePrinter;
import com.freddyzhounyc.colors.services.ColorPrinter;
import com.freddyzhounyc.colors.services.GreenPrinter;
import com.freddyzhounyc.colors.services.RedPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.printRed(), bluePrinter.printBlue(), greenPrinter.printGreen());
    }
}
