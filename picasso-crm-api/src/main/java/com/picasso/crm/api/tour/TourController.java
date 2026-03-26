package com.picasso.crm.api.tour;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tours")
@RequiredArgsConstructor
public class TourController {

    private final TourService tourService;

    @PostMapping
    public Tour save(@RequestBody Tour tour) {
        return tourService.save(tour);
    }

    @GetMapping("/{id}")
    public Tour findById(@PathVariable Long id) {
        return tourService.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        tourService.deleteById(id);
        return ResponseEntity.noContent().build(); //для себя помечаю что эта конструкция вернет 204
    }

    @PutMapping("/{id}")
    public Tour update(@RequestBody Tour tour) {
        return tourService.save(tour);
    }
}
