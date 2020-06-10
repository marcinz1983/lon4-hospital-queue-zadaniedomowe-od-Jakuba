package pl.sda;

import java.util.Arrays;

public class HospitalQueue {
//     2. Utwórz klasę HospitalQueue, która
//    a ma pole tablicę o wielkości 20 (maksymalna długość kolejki) (patientQueue)
//    b utwórz metodę add(Patient) -> dodaje pacjenta
//    c utwórz metodę Patient next() -> zwracającą kolejną osobę z kolejki i usuwającą ją z niej
//    d Patient peek() -> podglądającą kto jest (zwraca kolejną osobę bez usuwania jej z kolejki)

    private Patient[] patientQueue = new Patient[20];
    private int counter;


    public HospitalQueue(Patient[] patientQueue) {
        this.patientQueue = patientQueue;
    }

    public HospitalQueue() {

    }

    public int getCounter() {
        return counter;
    }

    public Patient getLastPatientQueue(){
        return patientQueue[counter-1];
    }


    public Patient[] getPatientQueue() {
        return patientQueue;
    }

    public void setPatientQueue(Patient[] patientQueue) {
        this.patientQueue = patientQueue;
    }

    @Override
    public String toString() {
        return "HospitalQueue{" +
                "patientQueue=" + Arrays.toString(patientQueue) +
                '}';
    }

    public void addPatient(Patient pacjent) {
        for (int i = (patientQueue.length - 2); i >= 0; i--) {
            patientQueue[i + 1] = patientQueue[i];
        }
        this.patientQueue[0] = pacjent;
        counter++;
    }

    public Patient patientNext(){
        Patient nextPatient = patientQueue[counter-1];
        //System.arraycopy(patientQueue,0,patientQueue,0,counter-1);
        patientQueue = Arrays.copyOf(patientQueue,counter-1);
        patientQueue = Arrays.copyOf(patientQueue,20);
        counter--;
        return nextPatient;

    }

    public Patient patientPeek(){
        return patientQueue[counter-1];
    }
}
