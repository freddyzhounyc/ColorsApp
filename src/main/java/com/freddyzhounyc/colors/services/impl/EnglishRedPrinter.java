package com.freddyzhounyc.colors.services.impl;

import com.freddyzhounyc.colors.services.RedPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String printRed() {
        return "Red";
    }
}
