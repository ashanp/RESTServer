/*   
* @author  Ashan Malinda Perera
* @version 1.0 
* @class 	EbillonlineViewServiceREST.java
*/  

package ae.co.etisalat.falcon.invoices;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONObject;
import ae.co.etisalat.falcon.invoices.objects.FalconResponce;


@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EbillonlineViewServiceREST {
	/**
     * Default constructor. 
     */
    public EbillonlineViewServiceREST() {
        // TODO Auto-generated constructor stub
    }


    /**
     * Retrieves representation of an instance of FalconInvoices
     * @return an instance of String
     */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String resourceMethodGET() { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/**
     * PUT method for updating or creating an instance of FalconInvoices
     * @content content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	
	@POST
	@Path("/invoiceServicebyInvoiceNumberREST")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response invoiceServicebyInvoiceNumberREST(InputStream incomingData) throws org.json.JSONException {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - "+e);
		}
		
		JSONObject jsonObject = new JSONObject(crunchifyBuilder.toString());
		JSONObject invoiceData = new JSONObject(jsonObject.get("billInquiry").toString());
		String invoiceNumber = invoiceData.get("invoiceNumber").toString();
		String billingMonth = invoiceData.get("billingMonth").toString();
		System.out.println("invoiceNumber: "+invoiceNumber +" "+"billingMonth: "+billingMonth);
		FalconResponce resp = new FalconResponce();
		resp.setInvoiceNumber(invoiceNumber);
		resp.setAccountId("0");
		resp.setBillingMonth(billingMonth);
		resp.setFilePath("/nassout/out/Prod/CONSUMER/EN/SEQ1/"+invoiceNumber+".pdf");
		resp.setResponce("0");
		JSONObject jsonObject1 = new JSONObject(resp);
		return Response.status(200).entity(jsonObject1.toString()).build();
	}
	
	@POST
	@Path("/invoiceServicebyAccountIdREST")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response invoiceServicebyAccountIdREST(InputStream incomingData) throws org.json.JSONException {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - "+e);
		}
		
		JSONObject jsonObject = new JSONObject(crunchifyBuilder.toString());
		JSONObject invoiceData = new JSONObject(jsonObject.get("billInquiry").toString());
		String AccountId = invoiceData.get("accountId").toString();
		String billingMonth = invoiceData.get("billingMonth").toString();
		System.out.println("accountId: "+AccountId +" "+"billingMonth: "+billingMonth);
		FalconResponce resp = new FalconResponce();
		resp.setAccountId(AccountId);
		resp.setInvoiceNumber("0");
		resp.setBillingMonth(billingMonth);
		resp.setFilePath("/nassout/out/Prod/CONSUMER/EN/SEQ1/INV4856372845.pdf");
		resp.setResponce("0");
		JSONObject jsonObject1 = new JSONObject(resp);
		return Response.status(200).entity(jsonObject1.toString()).build();
	}
	
	@POST
	@Path("/invoiceServicebyTokenIdREST")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response invoiceServicebyTokenIdREST(InputStream incomingData) throws org.json.JSONException {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - "+e);
		}
		
		JSONObject jsonObject = new JSONObject(crunchifyBuilder.toString());
		JSONObject invoiceData = new JSONObject(jsonObject.get("billInquiry").toString());
		String ToakenId = invoiceData.get("toakenId").toString();
		String billingMonth = invoiceData.get("billingMonth").toString();
		System.out.println("toakenId: "+ToakenId +" "+"billingMonth: "+billingMonth);
		FalconResponce resp = new FalconResponce();
		resp.setToakenId(ToakenId);
		resp.setBillingMonth(billingMonth);
		resp.setFilePath("/nassout/out/Prod/CONSUMER/EN/SEQ1/INV4856372845.pdf");
		JSONObject jsonResponse = new JSONObject(resp);
		return Response.status(200).entity(jsonResponse.toString()).build();
	}
	
	@POST
	@Path("/invoiceServicebySmstokenIdREST")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response invoiceServicebySmstokenIdREST(InputStream incomingData) throws org.json.JSONException {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - "+e);
		}
		
		JSONObject jsonObject = new JSONObject(crunchifyBuilder.toString());
		JSONObject invoiceData = new JSONObject(jsonObject.get("billInquiry").toString());
		String SmstokenId = invoiceData.get("smstokenId").toString();
		String billingMonth = invoiceData.get("billingMonth").toString();
		System.out.println("toakenId: "+SmstokenId +" "+"billingMonth: "+billingMonth);
		FalconResponce resp = new FalconResponce();
		resp.setSmstokenId(SmstokenId);
		resp.setBillingMonth(billingMonth);
		resp.setFilePath("/nassout/out/Prod/CONSUMER/EN/SEQ1/INV4856372845.pdf");
		JSONObject jsonResponse = new JSONObject(resp);
		return Response.status(200).entity(jsonResponse.toString()).build();
	}
	
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verifyRESTService(InputStream incomingData) {
		String result = "Service Successfully started..";
		return Response.status(200).entity(result).build();
	}	
}