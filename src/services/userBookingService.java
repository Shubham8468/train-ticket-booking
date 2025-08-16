package services;
import Ticket_booking.Entities.user;

import java.io.File;
import java.util.*;
public class userBookingService {
private user user;
private  List<User> userList;
private  final Object =new ObjectMapper();

private static final String USER_PATH="../localDb/user.json";//connact the file to the user path
public userBookingService(user user1){
//    its user for the no need to mainstion many time when the user book any serveces and maintion again
//    again its user name etc;
    this.user=user1;
    File user=new File(USER_PATH);

    }
}
