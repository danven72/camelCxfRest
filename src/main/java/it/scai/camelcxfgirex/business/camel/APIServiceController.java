package it.scai.camelcxfgirex.business.camel;

import org.apache.camel.Exchange;

import it.scai.camelcxfgirex.model.WorkElementResponse;

public class APIServiceController {
	
	public APIServiceController()
	{
	}
	
	public void doGetString(Exchange exchange)
	{
       String calledUri = getCallerUrl(exchange);
       String bodyTest = exchange.getIn().getBody(String.class);
       
       System.out.println("Body Test:  "+ bodyTest+ " - calledUri: "+ calledUri);
	}

	public void doGetWorkElement(Exchange exchange) throws Exception 
	{
		Integer id = exchange.getIn().getBody(Integer.class);
		//NB: Qui potrei usare il DAO opportuno per recuperare l'oggetto!
		WorkElementResponse wer = new WorkElementResponse();
		wer.setId(id);
		wer.setType("The Type");
		
		//System.out.println("Body Test:  "+ bodyTest+ " - calledUri: "+ calledUri);
		
		exchange.getIn().setBody(wer);
	}	
	
    private static String getCallerUrl(Exchange exchange) {
        String ret = "";
        if (exchange.getIn().getHeader("host") != null)
            ret += exchange.getIn().getHeader("host");
        if (exchange.getIn().getHeader(Exchange.HTTP_URI) != null)
            ret += exchange.getIn().getHeader(Exchange.HTTP_URI);
        if (exchange.getIn().getHeader(Exchange.HTTP_QUERY) != null)
            ret += "?" + (String) exchange.getIn().getHeader(Exchange.HTTP_QUERY);
        return ret;
    }

}
