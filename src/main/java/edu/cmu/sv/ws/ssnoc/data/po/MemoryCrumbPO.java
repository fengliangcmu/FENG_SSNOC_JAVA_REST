package edu.cmu.sv.ws.ssnoc.data.po;

import java.sql.Timestamp;

public class MemoryCrumbPO {

	private String crumbID;
	private String usedVolatile;
	private String remainingVolatile;
	private String usedPersistent;
	private String remainingPersistent;
	private Timestamp createAt;
	public String getCrumbID() {
		return crumbID;
	}
	public void setCrumbID(String crumbID) {
		this.crumbID = crumbID;
	}
	public String getUsedVolatile() {
		return usedVolatile;
	}
	public void setUsedVolatile(String usedVolatile) {
		this.usedVolatile = usedVolatile;
	}
	public String getRemainingVolatile() {
		return remainingVolatile;
	}
	public void setRemainingVolatile(String remainingVolatile) {
		this.remainingVolatile = remainingVolatile;
	}
	public String getUsedPersistent() {
		return usedPersistent;
	}
	public void setUsedPersistent(String usedPersistent) {
		this.usedPersistent = usedPersistent;
	}
	public String getRemainingPersistent() {
		return remainingPersistent;
	}
	public void setRemainingPersistent(String remainingPersistent) {
		this.remainingPersistent = remainingPersistent;
	}
	public Timestamp getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Timestamp createAt) {
		this.createAt = createAt;
	}
	
	
	
}
