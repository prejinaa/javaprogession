
import java.util.ArrayList;
import java.util.List;

    public class Hospital {
        private final List<Patient> patients;
        private final List<Doctor> doctors;
        private final List<Appointment> appointments;

        public Hospital() {
            patients = new ArrayList<>();
            doctors = new ArrayList<>();
            appointments = new ArrayList<>();
        }

        public void addPatient(Patient patient) {
            patients.add(patient);
            System.out.println("Patient added successfully.");
        }

        public void viewPatients() {
            if (patients.isEmpty()) {
                System.out.println("No patients in the hospital.");
            } else {
                for (Patient patient : patients) {
                    System.out.println(patient);
                }
            }
        }

        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
            System.out.println("Doctor added successfully.");
        }

        public void viewDoctors() {
            if (doctors.isEmpty()) {
                System.out.println("No doctors in the hospital.");
            } else {
                for (Doctor doctor : doctors) {
                    System.out.println(doctor);
                }
            }
        }

        public void addAppointment(Appointment appointment) {
            appointments.add(appointment);
            System.out.println("Appointment added successfully.");
        }

        public void viewAppointments() {
            if (appointments.isEmpty()) {
                System.out.println("No appointments in the hospital.");
            } else {
                for (Appointment appointment : appointments) {
                    System.out.println(appointment);
                }
            }
        }
    }


