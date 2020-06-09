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
    //Patient pacjent = new Patient();

    public HospitalQueue(Patient[] patientQueue) {
        this.patientQueue = patientQueue;
    }

    public HospitalQueue(){

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

    public void add(Patient pacjent) {
        this.patientQueue[counter] = pacjent;
        counter++;
    }
}
