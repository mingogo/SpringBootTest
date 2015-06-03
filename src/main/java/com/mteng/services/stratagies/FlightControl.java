package com.mteng.services.stratagies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightControl {

    @Autowired
    WeaponService weaponService;

    public void attack(StrategyFiringMode firingMode) {
        weaponService.fire(firingMode);
    }
}
