package pojo;

/**
 * @author Ash
 * @date 2018/12/13 13:57
 */
public class Customer {
    private String studentNo;
    private String name;

    public Customer(String studentNo, String name) {
        this.studentNo = studentNo;
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

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
}
