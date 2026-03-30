package com.picasso.crm.api.erm.tour.participant.driver;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DriverEntityToDTOConvertor implements Converter<DriverEntity, Driver> {

    @Override
    public Driver convert(DriverEntity source) {
        Driver driver = new Driver();
        driver.setId(source.getId());
        driver.setPhone(source.getPhone());
        driver.setCarModel(source.getCarModel());

        return driver;
    }
}
