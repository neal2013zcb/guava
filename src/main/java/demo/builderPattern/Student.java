package demo.builderPattern;

public class Student {
    public int id;
    public String name;
    public String passwd;
    public String sex;
    public String address;

    //私有化
    private Student(){}

    //私有化
    private Student(Student targer) {
        this.id = targer.id;
        this.name = targer.name;
        this.passwd = targer.passwd;
        this.sex = targer.sex;
        this.address = targer.address;
    }



    public static class Builder{

        private Student targer;

        public Builder() {
            targer = new Student();
        }

        public Builder setId(int id){
            targer.id = id;
            return this;
        }

        public Builder setName(String name){
            targer.name = name;
            return this;
        }

        public Builder setPasswd(String passwd){
            targer.passwd = passwd;
            return this;
        }

        public Builder setSex(String sex){
            targer.sex = sex;
            return this;
        }

        public Builder setAddress(String address){
            targer.address = address;
            return this;
        }

        public Student build(){
            return new Student(targer);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }



}