package com.picasso.crm.api;

import com.picasso.crm.api.tour.TourEntity;
import com.picasso.crm.api.tour.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication()
public class PicassoCrmApiApplication {
    @Autowired
    private TourRepository tourRepository;
    public static void main(String[] args) {
        SpringApplication.run(PicassoCrmApiApplication.class, args);
    }
}
