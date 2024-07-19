class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public void printPersonDetails(Person person) {
        person.displayDetails();
    }

    public static void main(String[] args) {
        Person brian = new Person("Brian", 20, "Nairobi");

        brian.printPersonDetails(brian);
    }
}
