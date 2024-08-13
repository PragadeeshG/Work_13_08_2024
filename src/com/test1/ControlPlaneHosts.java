package com.test1;

public class ControlPlaneHosts {
	private String serviceCode;
	private String hyperKube;
	private String nodeSync;
	private String masterNodeArchitecture;
	private String sdnToSdn;
	private boolean sdnToOvs;
	private String apiServerYaml;
	private String controllersYaml;
	private String etcdYaml;
	private String yamlToPropsConverter;
	private String YamlToZmlConverter;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public ControlPlaneHosts() {

	}

	public ControlPlaneHosts(String serviceCode, String hyperKube, String nodeSync, String masterNodeArchitecture,
			String sdnToSdn, boolean sdnToOvs, String apiServerYaml, String controllersYaml, String etcdYaml,
			String yamlToPropsConverter, String yamlToZmlConverter, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.serviceCode = serviceCode;
		this.hyperKube = hyperKube;
		this.nodeSync = nodeSync;
		this.masterNodeArchitecture = masterNodeArchitecture;
		this.sdnToSdn = sdnToSdn;
		this.sdnToOvs = sdnToOvs;
		this.apiServerYaml = apiServerYaml;
		this.controllersYaml = controllersYaml;
		this.etcdYaml = etcdYaml;
		this.yamlToPropsConverter = yamlToPropsConverter;
		YamlToZmlConverter = yamlToZmlConverter;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getHyperKube() {
		return hyperKube;
	}

	public void setHyperKube(String hyperKube) {
		this.hyperKube = hyperKube;
	}

	public String getNodeSync() {
		return nodeSync;
	}

	public void setNodeSync(String nodeSync) {
		this.nodeSync = nodeSync;
	}

	public String getMasterNodeArchitecture() {
		return masterNodeArchitecture;
	}

	public void setMasterNodeArchitecture(String masterNodeArchitecture) {
		this.masterNodeArchitecture = masterNodeArchitecture;
	}

	public String getSdnToSdn() {
		return sdnToSdn;
	}

	public void setSdnToSdn(String sdnToSdn) {
		this.sdnToSdn = sdnToSdn;
	}

	public boolean isSdnToOvs() {
		return sdnToOvs;
	}

	public void setSdnToOvs(boolean sdnToOvs) {
		this.sdnToOvs = sdnToOvs;
	}

	public String getApiServerYaml() {
		return apiServerYaml;
	}

	public void setApiServerYaml(String apiServerYaml) {
		this.apiServerYaml = apiServerYaml;
	}

	public String getControllersYaml() {
		return controllersYaml;
	}

	public void setControllersYaml(String controllersYaml) {
		this.controllersYaml = controllersYaml;
	}

	public String getEtcdYaml() {
		return etcdYaml;
	}

	public void setEtcdYaml(String etcdYaml) {
		this.etcdYaml = etcdYaml;
	}

	public String getYamlToPropsConverter() {
		return yamlToPropsConverter;
	}

	public void setYamlToPropsConverter(String yamlToPropsConverter) {
		this.yamlToPropsConverter = yamlToPropsConverter;
	}

	public String getYamlToZmlConverter() {
		return YamlToZmlConverter;
	}

	public void setYamlToZmlConverter(String yamlToZmlConverter) {
		YamlToZmlConverter = yamlToZmlConverter;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}