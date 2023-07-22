public class Cat implements Pet{
    private String name;
    private Integer age;

    Cat(){
        this.name = "Рыжий";
        this.age = 15;
    }

    @Override
    public String toString() {
        String res = String.format("Мяу! Меня зовут %s. Мне %s года(лет), у меня %d лап.\n", this.name, this.age, PAWS);
        return res;
    }

//    public Integer getAge() {
//        return age;
//    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println(this);
    }

}
