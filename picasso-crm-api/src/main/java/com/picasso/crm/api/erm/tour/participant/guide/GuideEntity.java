package com.picasso.crm.api.erm.tour.participant.guide;

import com.picasso.crm.api.erm.tour.participant.TourParticipantEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

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
public class GuideEntity extends TourParticipantEntity {

    String name;
    String languages;
}
