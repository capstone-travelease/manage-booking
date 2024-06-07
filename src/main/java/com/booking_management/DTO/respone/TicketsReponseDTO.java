package com.booking_management.DTO.respone;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicketsReponseDTO {
    Integer bookngId;
    String roomName;
    Integer bookingStatus;
    Integer date;
}
