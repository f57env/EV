package com.chargehub.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.chargehub.config.DBConnection;
import com.chargehub.entity.Booking;


public class BookingDAO {


    public boolean createBooking(Booking booking) {

        boolean result = false;


        try {

            Connection con = DBConnection.getConnection();


            String sql =
            "INSERT INTO bookings(user_id,station_id,booking_date,slot_time,status) VALUES(?,?,?,?,?)";


            PreparedStatement ps = con.prepareStatement(sql);


            ps.setInt(1, booking.getUserId());

            ps.setInt(2, booking.getStationId());

            ps.setString(3, booking.getBookingDate());

            ps.setString(4, booking.getSlotTime());

            ps.setString(5, "BOOKED");


            int rows = ps.executeUpdate();


            if(rows > 0)
            {
                result = true;
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


        return result;
    }

}