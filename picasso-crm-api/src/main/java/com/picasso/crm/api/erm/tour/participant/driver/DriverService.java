package com.picasso.crm.api.erm.tour.participant.driver;

import java.util.Optional;

public interface DriverService {
    Driver save(Driver driver);

    Optional<Driver> findById(Long id);
}
