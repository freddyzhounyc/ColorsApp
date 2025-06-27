package com.freddyzhounyc.colors.services.impl;

import com.freddyzhounyc.colors.services.BluePrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String printBlue() {
        return "Blue";
    }
}
