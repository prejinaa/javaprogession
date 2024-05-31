import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Add New Doctor");
            System.out.println("4. View All Doctors");
            System.out.println("5. Add New Appointment");
            System.out.println("6. View All Appointments");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient ID: ");
                    String patientId = scanner.nextLine();
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter patient ailment: ");
                    String patientAilment = scanner.nextLine();
                    hospital.addPatient(new Patient(patientId, patientName, patientAge, patientAilment));
                    break;
                case 2:
                    hospital.viewPatients();
                    break;
                case 3:
                    System.out.print("Enter doctor ID: ");
                    String doctorId = scanner.nextLine();
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String doctorSpecialization = scanner.nextLine();
                    hospital.addDoctor(new Doctor(doctorId, doctorName, doctorSpecialization));
                    break;
                case 4:
                    hospital.viewDoctors();
                    break;
                case 5:
                    System.out.print("Enter appointment ID: ");
                    String appointmentId = scanner.nextLine();
                    System.out.print("Enter patient ID: ");
                    patientId = scanner.nextLine();
                    System.out.print("Enter doctor ID: ");
                    doctorId = scanner.nextLine();
                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String appointmentDate = scanner.nextLine();
                    hospital.addAppointment(new Appointment(appointmentId, patientId, doctorId, appointmentDate));
                    break;
                case 6:
                    hospital.viewAppointments();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
