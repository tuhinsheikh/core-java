package combinator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        var Tuhin = Customer.builder()
                .name("Tuhin")
                .email("tuhinsheikh@gmail.com")
                .phoneNumber("+19999999999")
                .dob(LocalDate.of(1989, 05, 15))
                .build();

        ValidatorService validatorService = new ValidatorService();

        var emailValid = validatorService.isEmailValid(Tuhin.email());
        System.out.println(emailValid);
    }





}
