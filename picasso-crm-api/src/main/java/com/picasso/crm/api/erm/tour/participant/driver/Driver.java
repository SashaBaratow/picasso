package com.picasso.crm.api.erm.tour.participant.driver;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Driver {
    Long id;
    String name;
    String phone;
    String carModel;
}
