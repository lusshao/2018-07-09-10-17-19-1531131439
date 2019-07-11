package practice07;

public class Klass {
    private int number;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+number;
    }

    public boolean equals(Klass klass){
        if(this.number == klass.getNumber()){
            return true;
        }else {
            return false;
        }
    }
}
