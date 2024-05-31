public class Appointment {
        private String appointmentId;
        private String patientId;
        private String doctorId;
        private String date;

        public Appointment(String appointmentId, String patientId, String doctorId, String date) {
            this.appointmentId = appointmentId;
            this.patientId = patientId;
            this.doctorId = doctorId;
            this.date = date;
        }

        public String getAppointmentId() {
            return appointmentId;
        }

        public String getPatientId() {
            return patientId;
        }

        public String getDoctorId() {
            return doctorId;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "appointmentId='" + appointmentId + '\'' +
                    ", patientId='" + patientId + '\'' +
                    ", doctorId='" + doctorId + '\'' +
                    ", date='" + date + '\'' +
                    '}';
        }
    }


