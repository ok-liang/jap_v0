package cn.itcast.domain;

import javax.persistence.*;
import java.io.Serializable;

/***
 * 客户实体类
 *      配置映射关系：
 *          1、实体类 和 表的映射关系
 *              @Entry ：声明此类是一个实体类
 *              @Table ：配置 实体类 和 表的映射关系
 *                      name ：配置数据库表的名称
 *
 *          2、实体类中属性 和 表中字段的映射关系
 *              @Column ：配置实体类属性 和 字段的映射关系
 *                      name：数据库表中字段的名称
 */

@Entity //声明此类是 实体类
@Table(name = "cst_customer") //建立实体类和表的映射关系
public class Customer implements Serializable {

    /**
     * @Id 声明当前私有属性为数据库的主键
     * @GeneratedValue ：配置主键的生成策略
     *      GenerationType.IDENTITY ：主键自增长
     * @Column ：配置实体类属性 和 字段的映射关系
     *      name：数据库表中字段的名称
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long custId; //'客户编号(主键)',

    @Column(name = "cust_name")
    private String custName; //'客户名称(公司名称)',

    @Column(name = "cust_source")
    private String custSource; //客户信息来源

    @Column(name = "cust_industry")
    private String custIndustry; //客户所属行业

    @Column(name = "cust_level")
    private String custLevel; //客户级别

    @Column(name = "cust_address")
    private String custAddress; //客户联系地址

    @Column(name = "cust_phone")
    private String custPhone; //客户联系电话

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custPhone='" + custPhone + '\'' +
                '}';
    }
}
