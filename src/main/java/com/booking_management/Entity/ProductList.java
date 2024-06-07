package com.booking_management.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_list")
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductList {

    @Id
    Integer roomId;
    Integer bookingId;
    Integer roomQuantity;
    Integer price;
}
