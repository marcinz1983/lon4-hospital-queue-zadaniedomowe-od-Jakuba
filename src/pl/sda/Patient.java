package pl.sda;

public class Patient {
//             1. Utwórz klasę Patient mającą pola:
//                 * imie (String)
//                * nazwisko (String)
//                * jakBardzoZly (int) - opisuje poziom zlosci
//                * rozpoznanaChoroba (String)
//                * pamietaj o angielskich nazwach, konstruktorze, getterach i setterach jesli potrzebujesz
//
    private  String name;
    private  String Surname;
    private  int hawAngry;
    private  Disease disease;


    public Patient(String name, String surname, int hawAngry, Disease disease) {
        this.name = name;
        Surname = surname;
        this.hawAngry = hawAngry;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getHawAngry() {
        return hawAngry;
    }

    public Disease getIllness() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", hawAngry=" + hawAngry +
                ", illness='" + disease + '\'' +
                '}'+"\n" ;
    }
}
