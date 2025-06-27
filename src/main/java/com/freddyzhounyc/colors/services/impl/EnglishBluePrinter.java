package com.freddyzhounyc.colors.services.impl;

import com.freddyzhounyc.colors.services.BluePrinter;
import org.springframework.stereotype.Service;

public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String printBlue() {
        return "Blue";
    }
}
