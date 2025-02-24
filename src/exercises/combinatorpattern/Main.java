package exercises.combinatorpattern;

import java.time.LocalDate;

import static exercises.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2000,1,1)
        );

      //  System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store customer in db

        //Using combinator pattern
       ValidationResult result = isEmailValidator()
                .and(isPhoneNumberValidator())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
