package com.booking_management.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
public class Rooms {

    @Id
    Integer roomId;
    String roomName;
    Long roomPrice;
    Integer roomTypeId;
    Integer hotelId;
    Integer roomQuantity;
    boolean roomStatus;
}
