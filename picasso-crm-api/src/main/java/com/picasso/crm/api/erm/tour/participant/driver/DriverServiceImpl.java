package com.picasso.crm.api.erm.tour.participant.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService{
    private final DriverRepository driverRepository;
    private final DriverDTOToEntityConvertor toEntityConvertor;
    private final DriverEntityToDTOConvertor toDTOConvertor;

    @Override
    public Driver save(Driver driver) {
        DriverEntity driverEntity = toEntityConvertor.convert(driver);
        DriverEntity savedDriver = driverRepository.save(driverEntity);
        return toDTOConvertor.convert(savedDriver);
    }

    @Override
    public Optional<Driver> findById(Long id) {
        Optional<DriverEntity> driver = driverRepository.findById(id);
        return driver.map(toDTOConvertor :: convert);
    }
}
