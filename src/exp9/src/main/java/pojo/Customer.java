package pojo;

/**
 * @author Ash
 * @date 2018/12/13 13:57
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
