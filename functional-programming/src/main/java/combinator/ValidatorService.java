package combinator;

import java.util.regex.Pattern;

public class ValidatorService {

    public boolean isEmailValid(String email){
       var     regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
               + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
       return Pattern.compile(regexPattern).matcher(email).matches();
    }
}
