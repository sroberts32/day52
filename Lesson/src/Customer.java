package day52.Lesson.src;

public class Customer {
    public String name;
    public int age;

    // no-args constructor
    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


// public class Customer {
//     private String name;
//     private int age;

//     public Customer(String customerName) {
//         this.age = 0;
//         this.name = customerName;
//     }

//     public void printCustomer() {
//         if (customerIsOver21()) {
//         System.out.println("The customer's name is " + this.name + " and their age is: " + this.age);
//     }
// }

//     //setter
//     public void howOld(int customerAge) {
//         this.age = customerAge;
//     }

//     public String frequentCustomer() {
//         return "frequent";
//     }

//     public String nonFrequentCustomer() {
//         return "non-frequent";
//     }

//     //getter
//     public String getName() {
//         return name;
//     }

//     public boolean customerIsOver21() {
//         if (this.age < 21) {
//             return false;
//         }
//         return true;
//     }
// }
