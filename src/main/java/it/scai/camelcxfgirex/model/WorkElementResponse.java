package it.scai.camelcxfgirex.model;

public class WorkElementResponse implements ResponseBean {

	private static final long serialVersionUID = 1L;

	private long id;
	
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
