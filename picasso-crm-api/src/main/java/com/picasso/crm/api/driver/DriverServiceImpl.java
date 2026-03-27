package com.picasso.crm.api.driver;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
