public class Patient {
    private final String id;
    private final String name;
    private final int age;
    private final String ailment;

    public Patient(String id, String name, int age, String ailment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ailment='" + ailment + '\'' +
                '}';
    }
}


