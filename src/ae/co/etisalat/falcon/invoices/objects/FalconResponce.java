/*   
* @author  Ashan Malinda Perera
* @version 1.0 
* @class 	FalconResponce.java
*/ 

package ae.co.etisalat.falcon.invoices.objects;

public class FalconResponce {
	
	String invoiceNumber="0";
	String billingMonth;
	String filePath;
	String responce;
	String AccountId="0";
	String ToakenId="0";
	String SmstokenId="0";
	
	public String getSmstokenId() {
		return SmstokenId;
	}
	public void setSmstokenId(String smstokenId) {
		SmstokenId = smstokenId;
	}
	public String getToakenId() {
		return ToakenId;
	}
	public void setToakenId(String toakenId) {
		ToakenId = toakenId;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getBillingMonth() {
		return billingMonth;
	}
	public void setBillingMonth(String billingMonth) {
		this.billingMonth = billingMonth;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getResponce() {
		return responce;
	}
	public void setResponce(String responce) {
		this.responce = responce;
	}
}
