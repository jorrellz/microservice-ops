package com.yonyou.microservice.gate.admin.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author joy
 */
@Table(name = "gate_filter")
public class Filter {
    @Id
	private Integer id;          
	private String name;          
	private String type;          
	private String orders;          
	private String execSetting;          
	private String canarySetting;     
	private String version;     
	private String script;
	@Column(name="update_date")
	private Date updateDate;
	@Column(name="service_name")
	private String serviceName;

	private String createBy;
	private Date createDate;
	private String updateBy;
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOrders() {
		return orders;
	}

	public void setOrders(String orders) {
		this.orders = orders;
	}

	public String getExecSetting() {
		return execSetting;
	}

	public void setExecSetting(String execSetting) {
		this.execSetting = execSetting;
	}

	public String getCanarySetting() {
		return canarySetting;
	}

	public void setCanarySetting(String canarySetting) {
		this.canarySetting = canarySetting;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

}
