package com.booking_management.Service;


import com.booking_management.DTO.respone.ApiRespone;
import com.booking_management.DTO.respone.TicketsDTO;
import com.booking_management.DTO.respone.TicketsReponseDTO;
import com.booking_management.Repository.BookingRespository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
@Slf4j
public class BookingManagementService {

    BookingRespository bookingRespository;

    public ApiRespone getTickets(LocalDate date){
        List<TicketsReponseDTO> tickets = bookingRespository.getTickets(date.getMonthValue(),date.getYear());
        return ApiRespone.builder()
                .code(2001)
                .message("OK")
                .result(tickets)
                .build();
    }


}
