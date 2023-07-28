public class Cat implements Pet {

    private final int PAWS=4;
    private String name;
    private Integer age;

    Cat(){
        this.name = "Рыжий";
        this.age = 15;
    }

    @Override
    public String toString() {
        String res = String.format("Мяу! Меня зовут %s. Мне %s года(лет), у меня %d лап.\n", this.getName(), this.getAge(), PAWS);
        return res;
    }

//    public Integer getAge() {
//        return age;
//    }
    public Integer getAge() {
        return this.age;
    };

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

    @Override
    public void play() {
        System.out.println("--Переопределение функции из функционального интерфейса--");
    }

    public static class CatComparatorByAge implements CatComparator {

        @Override
        public int compare(Cat cat1, Cat cat2) {
            return Integer.compare(cat1.getAge(), cat2.getAge());
        }
    }

    public static class CatComparatorByName implements CatComparator {
        @Override
        public int compare(Cat cat1, Cat cat2) {
            return Double.compare(cat1.getName().length(), cat2.getName().length());
        }
    }
}
