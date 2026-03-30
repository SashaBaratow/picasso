package com.picasso.crm.api.erm.tour.participant.driver;

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
        name = "DRIVERS",
        indexes = {
                @Index(columnList = "phone")
        }
)
public class DriverEntity extends TourParticipantEntity {

    String phone;
    String carModel;
}
