package it.scai.camelcxfgirex.business.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CustomProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
        String cxfMessage = exchange.getIn().getBody(String.class);
		
        String saluto = "Good Morning "+ cxfMessage;
        
        exchange.getOut().setBody(saluto);
	}

}
