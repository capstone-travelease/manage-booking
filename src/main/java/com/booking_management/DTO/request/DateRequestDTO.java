package com.booking_management.DTO.request;

import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DateRequestDTO {


    @NotNull(message = "Date should not be emty")
    LocalDate date;
}
