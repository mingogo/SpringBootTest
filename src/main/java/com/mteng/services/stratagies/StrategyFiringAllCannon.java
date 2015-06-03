package com.mteng.services.stratagies;

import org.springframework.stereotype.Service;

@Service
public class StrategyFiringAllCannon implements StrategyFiringMode {
    @Override
    public String fire() {
        return "Using all cannon.";
    }
}
