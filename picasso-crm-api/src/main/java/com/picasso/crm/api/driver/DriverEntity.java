package com.picasso.crm.api.driver;

import com.picasso.crm.api.tour.TourEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "DRIVERS",
        indexes = {
                @Index(columnList = "phone")
        }
)
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DRIVER_ID_GENERATOR")
    @SequenceGenerator(name = "DRIVER_ID_GENERATOR", sequenceName = "DRIVER_SEQ", allocationSize = 1)
    Long id;
    String name;
    String phone;
    String carModel;
    @ManyToMany(mappedBy = "drivers")
    List<TourEntity> tours;

}
