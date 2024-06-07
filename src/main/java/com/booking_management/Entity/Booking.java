package com.booking_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Booking {

    @Id
    Integer bookingId;
    Integer userId;
    Integer hotelId;
    Integer bookingStatusId;
    LocalDate checkinDate;
    LocalDate checkoutDate;
    String taxes;
    String coupon;
    String note;
    Integer totalPrice;
    Integer idAccount;
    LocalDate bookingData;

}
