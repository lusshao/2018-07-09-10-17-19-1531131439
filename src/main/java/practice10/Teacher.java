package practice10;

import java.util.List;

public class Teacher extends Person{

    private List<Klass> classes;
    public Teacher(int id,String name, int age){
        super(id,name,age);
    }
    public Teacher(int id,String name, int age,List classes){
        super(id,name,age);
        this.classes = classes;
    }
    public String introduce(){
        if(classes!=null){
            String classesString = "";
            for(int i = 0;i < classes.size() ;i++){
                if(i == 0){
                    classesString += classes.get(i).getNumber();
                }else{
                    classesString += ", "+classes.get(i).getNumber();
                }
            }
            return super.introduce()+" I am a Teacher. I teach Class "+classesString+".";
        }else {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
    }

    public String introduceWith(Student student ){
        if(classes.contains(student.getKlass())){
            return super.introduce()+" I am a Teacher. I teach "+student.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach "+student.getName()+".";
        }
    }

    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }

    public List getClasses() {
        return classes;
    }

    public void setClasses(List classes) {
        this.classes = classes;
    }
}
