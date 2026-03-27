package com.picasso.crm.api.tour;

import com.picasso.crm.api.driver.DriverEntity;
import com.picasso.crm.api.guide.GuideEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "TOURS",
        indexes = {
                @Index(columnList = "startDate, endDate"),
                @Index(columnList = "name")
        }
)
public class TourEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TOURS_ID_GENERATOR")
    @SequenceGenerator(name = "TOURS_ID_GENERATOR", sequenceName = "TOURS_SEQ", allocationSize = 1)
    Long id;
    LocalDateTime startDate;
    LocalDateTime endDate;
    Duration duration;
    String name;
    String description;
    @ManyToMany
    List<GuideEntity> guides;
    @ManyToMany
    List<DriverEntity> drivers;
}
