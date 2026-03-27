package com.picasso.crm.api.guide;

import com.picasso.crm.api.tour.TourEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(
        name = "GUIDES",
        indexes = {
                @Index(columnList = "phone")
        }
)
public class GuideEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GUIDES_ID_GENERATOR")
    @SequenceGenerator(name = "GUIDES_ID_GENERATOR", sequenceName = "GUIDES_SEQ", allocationSize = 1)
    Long id;
    String name;
    String phone;
    String languages;
    @ManyToMany(mappedBy = "guides")
    List<TourEntity> tours;

    public GuideEntity add(TourEntity tourEntity) {
        if (tours == null) {
            tours = new ArrayList<>();
        }
        tours.add(tourEntity);
        return this;
    }
}
