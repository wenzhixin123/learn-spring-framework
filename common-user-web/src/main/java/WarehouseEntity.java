/**
 * Created by Administrator on 2017/11/6.
 */
public class WarehouseEntity {
    private String companyId;
    private String orderNo;
    private String submitOrderNo;
    private Double receivablesAmount;
    private String expressCompany;
    private String expressListNo;
    private String extExpressCompany;
    private String extExpressListNo;
    private String actualDate;
    private Double weight;
    private String companyCode;//结算代码

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getSubmitOrderNo() {
        return submitOrderNo;
    }

    public void setSubmitOrderNo(String submitOrderNo) {
        this.submitOrderNo = submitOrderNo;
    }

    public Double getReceivablesAmount() {
        return receivablesAmount;
    }

    public void setReceivablesAmount(Double receivablesAmount) {
        this.receivablesAmount = receivablesAmount;
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public String getExpressListNo() {
        return expressListNo;
    }

    public void setExpressListNo(String expressListNo) {
        this.expressListNo = expressListNo;
    }

    public String getExtExpressCompany() {
        return extExpressCompany;
    }

    public void setExtExpressCompany(String extExpressCompany) {
        this.extExpressCompany = extExpressCompany;
    }

    public String getExtExpressListNo() {
        return extExpressListNo;
    }

    public void setExtExpressListNo(String extExpressListNo) {
        this.extExpressListNo = extExpressListNo;
    }

    public String getActualDate() {
        return actualDate;
    }

    public void setActualDate(String actualDate) {
        this.actualDate = actualDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Override
    public String toString() {
        return "WarehouseEntity{" +
                "companyId='" + companyId + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", submitOrderNo='" + submitOrderNo + '\'' +
                ", receivablesAmount=" + receivablesAmount +
                ", expressCompany='" + expressCompany + '\'' +
                ", expressListNo='" + expressListNo + '\'' +
                ", extExpressCompany='" + extExpressCompany + '\'' +
                ", extExpressListNo='" + extExpressListNo + '\'' +
                ", actualDate='" + actualDate + '\'' +
                ", weight=" + weight +
                ", companyCode='" + companyCode + '\'' +
                '}';
    }
}
