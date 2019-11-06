package ddd;

public class User1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String to1() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
