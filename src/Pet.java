public interface Pet {
    public String name = null;
    public Integer age = 0;

    public final Integer PAWS = 4;
    public default Integer getAge() {
        return this.age;
    };

    public void setAge(Integer age);
    public String getName();

    public void setName(String name);
}
