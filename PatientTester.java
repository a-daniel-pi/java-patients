public class PatientTester {
    public static void main(String[] args) {
        PatientManager manager = new PatientManager();
        System.out.println(manager);

        manager.addPatient(new Patient(1, 200));
        manager.addPatient(new Patient(2, 400));
        manager.addPatient(new Patient(3, 600));
        manager.addPatient(new Patient(4, 800));
        System.out.println(manager);

        manager.caffieneAbsorption();
        manager.caffieneAbsorption();
        System.out.println(manager);

        manager.removePatient(3);
        System.out.println(manager);
    }
}
