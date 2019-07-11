package practice08;

public class Klass {
    private int number;
    private Student leader;

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

    public Student getLeader() {
        return leader;
    }
    public void assignLeader(Student student){
        leader=student;
    }

    public boolean equals(Klass klass){
        if(this.number == klass.getNumber()){
            return true;
        }else {
            return false;
        }
    }
}
