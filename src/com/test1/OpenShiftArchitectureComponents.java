package com.test1;

public class OpenShiftArchitectureComponents {
	private String atomicService;
	private String dockerService;
	private String openVsWithservice;
	private String crioService;
	private boolean masterApi;
	private String masterApiService;
	private boolean masterController;
	private String masterControllerService;
	private String etcdService;
	private String systemdServices;
	private String componentsList;

	public OpenShiftArchitectureComponents() {

	}

	public OpenShiftArchitectureComponents(String atomicService, String dockerService, String openVsWithservice,
			String crioService, boolean masterApi, String masterApiService, boolean masterController,
			String masterControllerService, String etcdService, String systemdServices, String componentsList) {
		super();
		this.atomicService = atomicService;
		this.dockerService = dockerService;
		this.openVsWithservice = openVsWithservice;
		this.crioService = crioService;
		this.masterApi = masterApi;
		this.masterApiService = masterApiService;
		this.masterController = masterController;
		this.masterControllerService = masterControllerService;
		this.etcdService = etcdService;
		this.systemdServices = systemdServices;
		this.componentsList = componentsList;
	}

	public String getAtomicService() {
		return atomicService;
	}

	public void setAtomicService(String atomicService) {
		this.atomicService = atomicService;
	}

	public String getDockerService() {
		return dockerService;
	}

	public void setDockerService(String dockerService) {
		this.dockerService = dockerService;
	}

	public String getOpenVsWithservice() {
		return openVsWithservice;
	}

	public void setOpenVsWithservice(String openVsWithservice) {
		this.openVsWithservice = openVsWithservice;
	}

	public String getCrioService() {
		return crioService;
	}

	public void setCrioService(String crioService) {
		this.crioService = crioService;
	}

	public boolean isMasterApi() {
		return masterApi;
	}

	public void setMasterApi(boolean masterApi) {
		this.masterApi = masterApi;
	}

	public String getMasterApiService() {
		return masterApiService;
	}

	public void setMasterApiService(String masterApiService) {
		this.masterApiService = masterApiService;
	}

	public boolean isMasterController() {
		return masterController;
	}

	public void setMasterController(boolean masterController) {
		this.masterController = masterController;
	}

	public String getMasterControllerService() {
		return masterControllerService;
	}

	public void setMasterControllerService(String masterControllerService) {
		this.masterControllerService = masterControllerService;
	}

	public String getEtcdService() {
		return etcdService;
	}

	public void setEtcdService(String etcdService) {
		this.etcdService = etcdService;
	}

	public String getSystemdServices() {
		return systemdServices;
	}

	public void setSystemdServices(String systemdServices) {
		this.systemdServices = systemdServices;
	}

	public String getComponentsList() {
		return componentsList;
	}

	public void setComponentsList(String componentsList) {
		this.componentsList = componentsList;
	}

}
