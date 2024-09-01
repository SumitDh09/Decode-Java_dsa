package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HospitalManagement {
    private static final ArrayList<Patient> patients = new ArrayList<>();
    private static final ArrayList<Doctor> doctors = new ArrayList<>();
    private static final ArrayList<Appointment> appointments = new ArrayList<>();



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Hospital Management System");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    break;
                case 1:
                    addPatient(scanner);
                    break;
                case 2:
                    addDoctor(scanner);
                    break;
                case 3:
                    scheduleAppointment(scanner);
                    break;
                case 4:
                    viewPatients();
                    break;
                case 5:
                    viewDoctors();
                    break;
                case 6:
                    viewAppointments();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 0);

        scanner.close();
    }

    private static void addPatient(Scanner scanner) {
        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Patient Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Patient Gender: ");
        String gender = scanner.nextLine();
        Patient patient = new Patient(name, age, gender);
        patients.add(patient);
        System.out.println("Patient added successfully!");
    }

    private static void addDoctor(Scanner scanner) {
        System.out.print("Enter Doctor Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Doctor Speciality: ");
        String specialty = scanner.nextLine();
        Doctor doctor = new Doctor(name, specialty);
        doctors.add(doctor);
        System.out.println("Doctor added successfully!");
    }

    private static void scheduleAppointment(Scanner scanner) {
        System.out.print("Enter Patient ID: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter Doctor ID: ");
        int doctorId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        Patient patient = findPatientById(patientId);
        Doctor doctor = findDoctorById(doctorId);
        if (patient != null && doctor != null) {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
            System.out.println("Appointment scheduled successfully!");
        } else {
            System.out.println("Invalid Patient ID or Doctor ID.");
        }

    }

    private static void viewPatients() {
        System.out.println("List of Patients:");
        Iterator var0 = patients.iterator();

        while(var0.hasNext()) {
            Patient patient = (Patient)var0.next();
            System.out.println(patient);
        }

    }

    private static void viewDoctors() {
        System.out.println("List of Doctors:");
        Iterator var0 = doctors.iterator();

        while(var0.hasNext()) {
            Doctor doctor = (Doctor)var0.next();
            System.out.println(doctor);
        }

    }

    private static void viewAppointments() {
        System.out.println("List of Appointments:");
        Iterator var0 = appointments.iterator();

        while(var0.hasNext()) {
            Appointment appointment = (Appointment)var0.next();
            System.out.println(appointment);
        }

    }

    private static Patient findPatientById(int id) {
        Iterator var1 = patients.iterator();

        Patient patient;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            patient = (Patient)var1.next();
        } while(patient.getId() != id);

        return patient;
    }

    private static Doctor findDoctorById(int id) {
        Iterator var1 = doctors.iterator();

        Doctor doctor;
        do {
            if (!var1.hasNext()) {
                return null;
            }

            doctor = (Doctor)var1.next();
        } while(doctor.getId() != id);

        return doctor;
    }
}
