package day52.Lesson.src;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();

        customer.setName("Dale");
        customer.setAge(21);

        System.out.println("The customer's name is " + customer.name + " and their age is " + customer.age);
        
        
        
        // Customer customer1 = new Customer("Dale");
        
        // String typeOfCustomer = customer1.frequentCustomer();

        // System.out.println(customer1.getName() + " is a " + typeOfCustomer + " customer.");
        // customer1.howOld(22);
        // customer1.printCustomer();
    }
}
