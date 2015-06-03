package com.mteng.services.stratagies;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class WeaponService {

    public void fire(StrategyFiringMode inputFiringMode) {
        System.out.println(inputFiringMode.fire());
    }
}
