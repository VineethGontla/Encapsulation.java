
class Person {
   
    private int age;    // Private field for age

    
    public Person(int age) {  // Constructor to initialize the age
        this.age = age;
    }

    // Public method to check voting eligibility
    public boolean isEligibleToVote() {
        return age > 18;
    }

    
    public void setAge(int age) {
        this.age = age;
    }

    // Public method to get the age (if needed)
    public int getAge() {
        return age;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person(20);

        
        if(person.isEligibleToVote()) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}

