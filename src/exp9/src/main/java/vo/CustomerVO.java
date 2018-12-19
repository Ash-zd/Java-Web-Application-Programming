package vo;

import pojo.Customer;

/**
 * @author Ash
 * @date 2018/12/10 23:22
 */
public class CustomerVO extends Customer {
    private String phone;
    private String idNo;

    public CustomerVO(String name, String phone, String idNo) {
        super(name);
        this.phone = phone;
        this.idNo = idNo;
    }

    public CustomerVO(String phone, String idNo) {
        this.phone = phone;
        this.idNo = idNo;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
