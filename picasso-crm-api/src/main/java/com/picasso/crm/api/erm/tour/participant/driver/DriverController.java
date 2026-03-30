package com.picasso.crm.api.erm.tour.participant.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        driverService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public Driver update(@RequestBody Driver driver) {
        return driverService.save(driver);
    }
}
