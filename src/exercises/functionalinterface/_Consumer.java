package exercises.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        //Normal Java function
        Customer maria = new Customer("Maria", "0730578565");
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        //Consumer Functional interface
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumerV2.accept(maria, false);
    }

    // Consumer Way
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customeName +
                    ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "***************"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customeName +
                    ", thanks for registering phone number "
                    + customer.customerPhoneNumber);

    // Normal Way
    static void greetCustomer(Customer customer) {

        System.out.println("Hello " + customer.customeName +
                ", thanks for registering phone number "
                + customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {

        System.out.println("Hello " + customer.customeName +
                ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "***************"));
    }

    static class Customer {
        private final String customeName;
        private final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customeName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}