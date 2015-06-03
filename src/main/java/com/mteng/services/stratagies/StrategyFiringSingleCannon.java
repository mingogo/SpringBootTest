package com.mteng.services.stratagies;

import org.springframework.stereotype.Service;

@Service
public class StrategyFiringSingleCannon implements StrategyFiringMode {
    @Override
    public String fire() {
        return "Using single cannon.";
    }
}
