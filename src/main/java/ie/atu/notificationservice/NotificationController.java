package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @PostMapping("/notification")
    public String notification(@RequestBody UserDetails userDetails){
        return(String.format("User " + userDetails.getName() + "(" + userDetails.getEmail() + ") has been successfully registered" ));
    }
}
