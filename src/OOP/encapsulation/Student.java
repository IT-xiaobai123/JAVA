package encapsulation;

public class Student {
    //属性私有
    private String name;
    private int id;
    private char sex;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
