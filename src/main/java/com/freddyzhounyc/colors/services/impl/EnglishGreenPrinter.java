package com.freddyzhounyc.colors.services.impl;

import com.freddyzhounyc.colors.services.GreenPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EnglishGreenPrinter implements GreenPrinter {
    @Override
    public String printGreen() {
        return "Green";
    }
}
