package com.test1;

public class OpenShiftMirrorPodComponent {
	private String podsConfig;
	private String adminConsoleUrl;
	private String kubeConfigFile;
	private String origin;
	private String cloudProvider;
	private boolean originMaster;
	private String libraryOrigin;
	private String libExecutor;
	private String kubeletPlugin;
	private String containerRunbook;
	private String imageSource;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public OpenShiftMirrorPodComponent() {

	}

	public OpenShiftMirrorPodComponent(String podsConfig, String adminConsoleUrl, String kubeConfigFile, String origin,
			String cloudProvider, boolean originMaster, String libraryOrigin, String libExecutor, String kubeletPlugin,
			String containerRunbook, String imageSource, String creationDate, String modifiedDate, String entityState) {
		super();
		this.podsConfig = podsConfig;
		this.adminConsoleUrl = adminConsoleUrl;
		this.kubeConfigFile = kubeConfigFile;
		this.origin = origin;
		this.cloudProvider = cloudProvider;
		this.originMaster = originMaster;
		this.libraryOrigin = libraryOrigin;
		this.libExecutor = libExecutor;
		this.kubeletPlugin = kubeletPlugin;
		this.containerRunbook = containerRunbook;
		this.imageSource = imageSource;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getPodsConfig() {
		return podsConfig;
	}

	public void setPodsConfig(String podsConfig) {
		this.podsConfig = podsConfig;
	}

	public String getAdminConsoleUrl() {
		return adminConsoleUrl;
	}

	public void setAdminConsoleUrl(String adminConsoleUrl) {
		this.adminConsoleUrl = adminConsoleUrl;
	}

	public String getKubeConfigFile() {
		return kubeConfigFile;
	}

	public void setKubeConfigFile(String kubeConfigFile) {
		this.kubeConfigFile = kubeConfigFile;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getCloudProvider() {
		return cloudProvider;
	}

	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
	}

	public boolean isOriginMaster() {
		return originMaster;
	}

	public void setOriginMaster(boolean originMaster) {
		this.originMaster = originMaster;
	}

	public String getLibraryOrigin() {
		return libraryOrigin;
	}

	public void setLibraryOrigin(String libraryOrigin) {
		this.libraryOrigin = libraryOrigin;
	}

	public String getLibExecutor() {
		return libExecutor;
	}

	public void setLibExecutor(String libExecutor) {
		this.libExecutor = libExecutor;
	}

	public String getKubeletPlugin() {
		return kubeletPlugin;
	}

	public void setKubeletPlugin(String kubeletPlugin) {
		this.kubeletPlugin = kubeletPlugin;
	}

	public String getContainerRunbook() {
		return containerRunbook;
	}

	public void setContainerRunbook(String containerRunbook) {
		this.containerRunbook = containerRunbook;
	}

	public String getImageSource() {
		return imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
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
