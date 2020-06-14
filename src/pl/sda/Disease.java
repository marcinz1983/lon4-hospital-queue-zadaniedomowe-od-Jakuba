package pl.sda;

public class Disease {

    private String disease;

    public Disease() {

    }
    public Disease(String disease) {
        this.disease = disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public String toString() {
        return  disease ;
    }
}
