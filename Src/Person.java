public class Person {
    private String name;

    private int age;

    public Person(String name, int age)
    {
        setName(name);
        this.age = age;
    }

    public String getname()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if(name.contains("1") || name.contains("2"))
        {
            return;
        }
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge()
    {
        this.age = age;
    }

}
