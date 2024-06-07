package com.booking_management.Controller;


import com.booking_management.DTO.request.DateRequestDTO;
import com.booking_management.DTO.respone.ApiRespone;
import com.booking_management.Service.BookingManagementService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/booking-management/")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC,makeFinal = true)
public class BookingManagementController {


    BookingManagementService bookingManagementService;
    @GetMapping("/ticket")
    ResponseEntity<ApiRespone> getTicketsFollowingMonth(@RequestBody @Valid DateRequestDTO date){
        System.out.println(date.getDate());
        return ResponseEntity.ok(bookingManagementService.getTickets(date.getDate()));
    }
}
