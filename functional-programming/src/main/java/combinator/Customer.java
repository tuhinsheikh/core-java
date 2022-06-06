package combinator;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record Customer(String name, String email, String phoneNumber, LocalDate dob) {
}

