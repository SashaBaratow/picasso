package com.picasso.crm.api.erm.tour.participant.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/drivers")
@RequiredArgsConstructor
public class DriverController {

    private final DriverService driverService;

    @PostMapping
    public Driver save(@RequestBody Driver driver) {
        return driverService.save(driver);
    }

    @PostMapping("/{id}")
    public Driver findById(@PathVariable Long id) {
        return driverService.findById(id).orElse(null);
    }
}
