package com.booking_management.Repository;

import com.booking_management.DTO.respone.TicketsReponseDTO;
import com.booking_management.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookingRespository extends JpaRepository<Booking,Integer> {


    @Query("select new com.booking_management.DTO.respone.TicketsReponseDTO(b.bookingId, r.roomName, b.bookingStatusId, EXTRACT(DAY FROM b.checkinDate)) from Booking b\n" +
            "inner join ProductList p on p.bookingId = b.bookingId\n" +
            "inner join Rooms r on r.roomId = p.roomId\n" +
            "where EXTRACT(MONTH FROM b.checkinDate) = ?1 and EXTRACT(Year FROM b.checkinDate) = ?2\n")
    List<TicketsReponseDTO> getTickets(Integer date, Integer month);
}
