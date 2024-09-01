package Project;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public String toString() {
        String var10000 = String.valueOf(this.patient);
        return "Appointment :[ Patient:" + var10000 + ", Doctor :" + String.valueOf(this.doctor) + ",Date :" + this.date + "]";
    }
}
