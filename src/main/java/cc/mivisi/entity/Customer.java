package cc.mivisi.entity;

import java.util.Date;

public class Customer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_id
     *
     * @mbg.generated
     */
    private Long custId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_name
     *
     * @mbg.generated
     */
    private String custName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_user_id
     *
     * @mbg.generated
     */
    private Long custUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_create_id
     *
     * @mbg.generated
     */
    private Long custCreateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_source
     *
     * @mbg.generated
     */
    private String custSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_industry
     *
     * @mbg.generated
     */
    private String custIndustry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_level
     *
     * @mbg.generated
     */
    private String custLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_linkman
     *
     * @mbg.generated
     */
    private String custLinkman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_phone
     *
     * @mbg.generated
     */
    private String custPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_mobile
     *
     * @mbg.generated
     */
    private String custMobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_zipcode
     *
     * @mbg.generated
     */
    private String custZipcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_address
     *
     * @mbg.generated
     */
    private String custAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.cust_createtime
     *
     * @mbg.generated
     */
    private Date custCreatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_id
     *
     * @return the value of customer.cust_id
     *
     * @mbg.generated
     */
    public Long getCustId() {
        return custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_id
     *
     * @param custId the value for customer.cust_id
     *
     * @mbg.generated
     */
    public void setCustId(Long custId) {
        this.custId = custId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_name
     *
     * @return the value of customer.cust_name
     *
     * @mbg.generated
     */
    public String getCustName() {
        return custName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_name
     *
     * @param custName the value for customer.cust_name
     *
     * @mbg.generated
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_user_id
     *
     * @return the value of customer.cust_user_id
     *
     * @mbg.generated
     */
    public Long getCustUserId() {
        return custUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_user_id
     *
     * @param custUserId the value for customer.cust_user_id
     *
     * @mbg.generated
     */
    public void setCustUserId(Long custUserId) {
        this.custUserId = custUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_create_id
     *
     * @return the value of customer.cust_create_id
     *
     * @mbg.generated
     */
    public Long getCustCreateId() {
        return custCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_create_id
     *
     * @param custCreateId the value for customer.cust_create_id
     *
     * @mbg.generated
     */
    public void setCustCreateId(Long custCreateId) {
        this.custCreateId = custCreateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_source
     *
     * @return the value of customer.cust_source
     *
     * @mbg.generated
     */
    public String getCustSource() {
        return custSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_source
     *
     * @param custSource the value for customer.cust_source
     *
     * @mbg.generated
     */
    public void setCustSource(String custSource) {
        this.custSource = custSource == null ? null : custSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_industry
     *
     * @return the value of customer.cust_industry
     *
     * @mbg.generated
     */
    public String getCustIndustry() {
        return custIndustry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_industry
     *
     * @param custIndustry the value for customer.cust_industry
     *
     * @mbg.generated
     */
    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry == null ? null : custIndustry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_level
     *
     * @return the value of customer.cust_level
     *
     * @mbg.generated
     */
    public String getCustLevel() {
        return custLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_level
     *
     * @param custLevel the value for customer.cust_level
     *
     * @mbg.generated
     */
    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel == null ? null : custLevel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_linkman
     *
     * @return the value of customer.cust_linkman
     *
     * @mbg.generated
     */
    public String getCustLinkman() {
        return custLinkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_linkman
     *
     * @param custLinkman the value for customer.cust_linkman
     *
     * @mbg.generated
     */
    public void setCustLinkman(String custLinkman) {
        this.custLinkman = custLinkman == null ? null : custLinkman.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_phone
     *
     * @return the value of customer.cust_phone
     *
     * @mbg.generated
     */
    public String getCustPhone() {
        return custPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_phone
     *
     * @param custPhone the value for customer.cust_phone
     *
     * @mbg.generated
     */
    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_mobile
     *
     * @return the value of customer.cust_mobile
     *
     * @mbg.generated
     */
    public String getCustMobile() {
        return custMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_mobile
     *
     * @param custMobile the value for customer.cust_mobile
     *
     * @mbg.generated
     */
    public void setCustMobile(String custMobile) {
        this.custMobile = custMobile == null ? null : custMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_zipcode
     *
     * @return the value of customer.cust_zipcode
     *
     * @mbg.generated
     */
    public String getCustZipcode() {
        return custZipcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_zipcode
     *
     * @param custZipcode the value for customer.cust_zipcode
     *
     * @mbg.generated
     */
    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode == null ? null : custZipcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_address
     *
     * @return the value of customer.cust_address
     *
     * @mbg.generated
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_address
     *
     * @param custAddress the value for customer.cust_address
     *
     * @mbg.generated
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.cust_createtime
     *
     * @return the value of customer.cust_createtime
     *
     * @mbg.generated
     */
    public Date getCustCreatetime() {
        return custCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.cust_createtime
     *
     * @param custCreatetime the value for customer.cust_createtime
     *
     * @mbg.generated
     */
    public void setCustCreatetime(Date custCreatetime) {
        this.custCreatetime = custCreatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", custId=").append(custId);
        sb.append(", custName=").append(custName);
        sb.append(", custUserId=").append(custUserId);
        sb.append(", custCreateId=").append(custCreateId);
        sb.append(", custSource=").append(custSource);
        sb.append(", custIndustry=").append(custIndustry);
        sb.append(", custLevel=").append(custLevel);
        sb.append(", custLinkman=").append(custLinkman);
        sb.append(", custPhone=").append(custPhone);
        sb.append(", custMobile=").append(custMobile);
        sb.append(", custZipcode=").append(custZipcode);
        sb.append(", custAddress=").append(custAddress);
        sb.append(", custCreatetime=").append(custCreatetime);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Customer other = (Customer) that;
        return (this.getCustId() == null ? other.getCustId() == null : this.getCustId().equals(other.getCustId()))
            && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
            && (this.getCustUserId() == null ? other.getCustUserId() == null : this.getCustUserId().equals(other.getCustUserId()))
            && (this.getCustCreateId() == null ? other.getCustCreateId() == null : this.getCustCreateId().equals(other.getCustCreateId()))
            && (this.getCustSource() == null ? other.getCustSource() == null : this.getCustSource().equals(other.getCustSource()))
            && (this.getCustIndustry() == null ? other.getCustIndustry() == null : this.getCustIndustry().equals(other.getCustIndustry()))
            && (this.getCustLevel() == null ? other.getCustLevel() == null : this.getCustLevel().equals(other.getCustLevel()))
            && (this.getCustLinkman() == null ? other.getCustLinkman() == null : this.getCustLinkman().equals(other.getCustLinkman()))
            && (this.getCustPhone() == null ? other.getCustPhone() == null : this.getCustPhone().equals(other.getCustPhone()))
            && (this.getCustMobile() == null ? other.getCustMobile() == null : this.getCustMobile().equals(other.getCustMobile()))
            && (this.getCustZipcode() == null ? other.getCustZipcode() == null : this.getCustZipcode().equals(other.getCustZipcode()))
            && (this.getCustAddress() == null ? other.getCustAddress() == null : this.getCustAddress().equals(other.getCustAddress()))
            && (this.getCustCreatetime() == null ? other.getCustCreatetime() == null : this.getCustCreatetime().equals(other.getCustCreatetime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustId() == null) ? 0 : getCustId().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getCustUserId() == null) ? 0 : getCustUserId().hashCode());
        result = prime * result + ((getCustCreateId() == null) ? 0 : getCustCreateId().hashCode());
        result = prime * result + ((getCustSource() == null) ? 0 : getCustSource().hashCode());
        result = prime * result + ((getCustIndustry() == null) ? 0 : getCustIndustry().hashCode());
        result = prime * result + ((getCustLevel() == null) ? 0 : getCustLevel().hashCode());
        result = prime * result + ((getCustLinkman() == null) ? 0 : getCustLinkman().hashCode());
        result = prime * result + ((getCustPhone() == null) ? 0 : getCustPhone().hashCode());
        result = prime * result + ((getCustMobile() == null) ? 0 : getCustMobile().hashCode());
        result = prime * result + ((getCustZipcode() == null) ? 0 : getCustZipcode().hashCode());
        result = prime * result + ((getCustAddress() == null) ? 0 : getCustAddress().hashCode());
        result = prime * result + ((getCustCreatetime() == null) ? 0 : getCustCreatetime().hashCode());
        return result;
    }
}