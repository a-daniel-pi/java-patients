import java.util.ArrayList;

public class PatientManager {
    public ArrayList<Patient> patients;

    public PatientManager() {
        patients = new ArrayList<Patient>();
    }

    public int addPatient(Patient patient) {
        for(int i = 0; i < patients.size(); i++) {
            if(patients.get(i)==null) {
                patients.set(i, patient);
                return i;
            }
        }
        patients.add(patient);
        return patients.size() - 1;
    }

    public Patient removePatient(int index) {
        Patient patient = patients.get(index);
        patients.set(index, null);
        return patient;
    }

    public void caffieneAbsorption() {
        for(int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            if(patient == null) {
                continue;
            }
            patient.caffieneLevel -= 160;
            if(patient.caffieneLevel<=0) {
                patient.caffieneLevel = 0;
                removePatient(i);
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        int patientCount = 0;
        for(int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            if(patient == null) {
                continue;
            }
            patientCount++;
            result += "" + patient.id + " " + patient.caffieneLevel;
            if(i != patients.size()-1) {
                result += "\n";
            }
        }
        if (patientCount == 0) {
            return "Empty";
        }
        return result;
    }
}
