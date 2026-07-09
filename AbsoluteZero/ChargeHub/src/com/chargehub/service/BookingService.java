package com.chargehub.service;


import java.util.Scanner;

import com.chargehub.dao.BookingDAO;
import com.chargehub.entity.Booking;
import com.chargehub.entity.User;



public class BookingService {


Scanner sc = new Scanner(System.in);

BookingDAO dao = new BookingDAO();



public void bookSlot(User user)
{


System.out.println("\n===== BOOK CHARGING SLOT =====");


System.out.print("Enter Station ID : ");
int stationId = sc.nextInt();
sc.nextLine();


System.out.print("Enter Booking Date (YYYY-MM-DD) : ");
String date = sc.nextLine();


System.out.print("Enter Slot Time : ");
String time = sc.nextLine();



Booking booking = new Booking();


booking.setUserId(user.getUserId());

booking.setStationId(stationId);

booking.setBookingDate(date);

booking.setSlotTime(time);



boolean status = dao.createBooking(booking);



if(status)
{
    System.out.println("\nBooking Successful!");
}
else
{
    System.out.println("\nBooking Failed!");
}


}

}