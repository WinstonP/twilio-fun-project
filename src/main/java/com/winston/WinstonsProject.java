package com.winston;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URISyntaxException;

/**
 * Created by winstonparris on 10/18/16.
 */
//i got the code for this from https://www.twilio.com/docs/quickstart/java/sms/sending-via-rest
public class WinstonsProject {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID = "ACc0f8d4a3747cac8df1b073e69561fa33";
    //heres my authentication token dont share it with anyone!
    public static final String AUTH_TOKEN = "PUt your auth token here!!!!!!!";

    public static void main(String[] args) throws URISyntaxException {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                //put your number in here!
                .creator(new PhoneNumber("+16784293807"),  // to
                        new PhoneNumber("+14704227361"),  // from
                        "you got it to work!")
                .create();


    }
}
