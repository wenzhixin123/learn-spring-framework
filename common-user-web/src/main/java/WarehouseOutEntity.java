
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WarehouseOutEntity {
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

	public static class Bulider{

		private String companyId;
		private String orderNo;
		private String submitOrderNo = "";
		private Double receivablesAmount = 0.00;
		private String expressCompany = "";
		private String expressListNo = "";
		private String extExpressCompany = "";
		private String extExpressListNo = "";
		private Double weight = 0.00;
		private String companyCode = "";//结算代码


		public Bulider(String companyId, String orderNo) {
			this.companyId = companyId;
			this.orderNo = orderNo;
		}

		public Bulider submitOrderNo(String submitOrderNo){
			this.submitOrderNo = submitOrderNo;
			return this;
		}
		public Bulider weight(Double weight){
			this.weight = weight;
			return this;
		}
		public Bulider receivablesAmount(Double receivablesAmount){
			this.receivablesAmount = receivablesAmount;
			return this;
		}
		public Bulider expressCompany(String expressCompany){
			this.expressCompany = expressCompany;
			return this;
		}
		public Bulider expressListNo(String expressListNo){
			this.expressListNo = expressListNo;
			return this;
		}
		public Bulider extExpressCompany(String extExpressCompany){
			this.extExpressCompany = extExpressCompany;
			return this;
		}
		public Bulider extExpressListNo(String extExpressListNo){
			this.extExpressListNo = extExpressListNo;
			return this;
		}
		public Bulider companyCode(String companyCode){
			this.companyCode = companyCode;
			return this;
		}
		public WarehouseOutEntity bulid(){
			return new WarehouseOutEntity().getInstance(this);
		}
	}
	public WarehouseOutEntity getInstance(Bulider bulider){
		companyId = bulider.companyId;
		orderNo = bulider.orderNo;
		submitOrderNo = bulider.submitOrderNo;
		receivablesAmount = bulider.receivablesAmount;
		expressCompany = bulider.expressCompany;
		expressListNo = bulider.expressListNo;
		extExpressCompany = bulider.extExpressCompany;
		extExpressListNo = bulider.extExpressListNo;
		companyCode = bulider.companyCode;
		weight = bulider.weight;
		return this;
	}
	public String getCompanyId() {
		return companyId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public String getSubmitOrderNo() {
		return submitOrderNo;
	}
	public Double getReceivablesAmount() {
		return receivablesAmount;
	}
	public String getExpressCompany() {
		return expressCompany;
	}
	public String getExpressListNo() {
		return expressListNo;
	}
	public String getExtExpressCompany() {
		return extExpressCompany;
	}
	public String getExtExpressListNo() {
		return extExpressListNo;
	}
	public String getActualDate() {
		return actualDate;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public Double getWeight() {
		return weight;
	}
}
