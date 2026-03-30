package com.picasso.crm.api.erm.tour.participant.driver;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DriverDTOToEntityConvertor implements Converter<Driver, DriverEntity> {

    @Override
    public DriverEntity convert(Driver source) {
        DriverEntity driverEntity = new DriverEntity();
        driverEntity.setId(source.getId());
        driverEntity.setPhone(source.getPhone());
        driverEntity.setCarModel(source.getCarModel());
        return driverEntity;
    }
}
