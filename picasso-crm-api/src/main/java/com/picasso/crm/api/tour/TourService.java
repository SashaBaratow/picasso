package com.picasso.crm.api.tour;

import java.util.Optional;

public interface TourService {

    Tour save(Tour tour);

    Optional<Tour> findById(Long id);

    void deleteById(Long id);

    Tour update(Tour tour);
}
