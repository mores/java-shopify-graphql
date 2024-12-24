package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class App implements com.shopify.types.Node {
  
  private String apiKey;

  
  private String appStoreAppUrl;

  
  private String appStoreDeveloperUrl;

  
  private List<AccessScope> availableAccessScopes;

  
  private Image banner;

  
  private String description;

  
  private String developerName;

  
  private AppDeveloperType developerType;

  
  private String developerUrl;

  
  private boolean embedded;

  
  private List<FailedRequirement> failedRequirements;

  
  private List<String> features;

  
  private AppFeedback feedback;

  
  private String handle;

  
  private Image icon;

  
  private String id;

  
  private String installUrl;

  
  private AppInstallation installation;

  
  private boolean isPostPurchaseAppInUse;

  
  private String launchUrl;

  
  private List<NavigationItem> navigationItems;

  
  private List<AccessScope> optionalAccessScopes;

  
  private boolean previouslyInstalled;

  
  private String pricingDetails;

  
  private String pricingDetailsSummary;

  
  private String privacyPolicyUrl;

  
  private AppPublicCategory publicCategory;

  
  private boolean published;

  
  private List<AccessScope> requestedAccessScopes;

  
  private List<Image> screenshots;

  
  private boolean shopifyDeveloped;

  
  private String title;

  
  private String uninstallMessage;

  
  private String uninstallUrl;

  
  private String webhookApiVersion;

  public App() {
  }

  
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  
  public String getAppStoreAppUrl() {
    return appStoreAppUrl;
  }

  public void setAppStoreAppUrl(String appStoreAppUrl) {
    this.appStoreAppUrl = appStoreAppUrl;
  }

  
  public String getAppStoreDeveloperUrl() {
    return appStoreDeveloperUrl;
  }

  public void setAppStoreDeveloperUrl(String appStoreDeveloperUrl) {
    this.appStoreDeveloperUrl = appStoreDeveloperUrl;
  }

  
  public List<AccessScope> getAvailableAccessScopes() {
    return availableAccessScopes;
  }

  public void setAvailableAccessScopes(List<AccessScope> availableAccessScopes) {
    this.availableAccessScopes = availableAccessScopes;
  }

  
  public Image getBanner() {
    return banner;
  }

  public void setBanner(Image banner) {
    this.banner = banner;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getDeveloperName() {
    return developerName;
  }

  public void setDeveloperName(String developerName) {
    this.developerName = developerName;
  }

  
  public AppDeveloperType getDeveloperType() {
    return developerType;
  }

  public void setDeveloperType(AppDeveloperType developerType) {
    this.developerType = developerType;
  }

  
  public String getDeveloperUrl() {
    return developerUrl;
  }

  public void setDeveloperUrl(String developerUrl) {
    this.developerUrl = developerUrl;
  }

  
  public boolean getEmbedded() {
    return embedded;
  }

  public void setEmbedded(boolean embedded) {
    this.embedded = embedded;
  }

  
  public List<FailedRequirement> getFailedRequirements() {
    return failedRequirements;
  }

  public void setFailedRequirements(List<FailedRequirement> failedRequirements) {
    this.failedRequirements = failedRequirements;
  }

  
  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }

  
  public AppFeedback getFeedback() {
    return feedback;
  }

  public void setFeedback(AppFeedback feedback) {
    this.feedback = feedback;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public Image getIcon() {
    return icon;
  }

  public void setIcon(Image icon) {
    this.icon = icon;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getInstallUrl() {
    return installUrl;
  }

  public void setInstallUrl(String installUrl) {
    this.installUrl = installUrl;
  }

  
  public AppInstallation getInstallation() {
    return installation;
  }

  public void setInstallation(AppInstallation installation) {
    this.installation = installation;
  }

  
  public boolean getIsPostPurchaseAppInUse() {
    return isPostPurchaseAppInUse;
  }

  public void setIsPostPurchaseAppInUse(boolean isPostPurchaseAppInUse) {
    this.isPostPurchaseAppInUse = isPostPurchaseAppInUse;
  }

  
  public String getLaunchUrl() {
    return launchUrl;
  }

  public void setLaunchUrl(String launchUrl) {
    this.launchUrl = launchUrl;
  }

  
  public List<NavigationItem> getNavigationItems() {
    return navigationItems;
  }

  public void setNavigationItems(List<NavigationItem> navigationItems) {
    this.navigationItems = navigationItems;
  }

  
  public List<AccessScope> getOptionalAccessScopes() {
    return optionalAccessScopes;
  }

  public void setOptionalAccessScopes(List<AccessScope> optionalAccessScopes) {
    this.optionalAccessScopes = optionalAccessScopes;
  }

  
  public boolean getPreviouslyInstalled() {
    return previouslyInstalled;
  }

  public void setPreviouslyInstalled(boolean previouslyInstalled) {
    this.previouslyInstalled = previouslyInstalled;
  }

  
  public String getPricingDetails() {
    return pricingDetails;
  }

  public void setPricingDetails(String pricingDetails) {
    this.pricingDetails = pricingDetails;
  }

  
  public String getPricingDetailsSummary() {
    return pricingDetailsSummary;
  }

  public void setPricingDetailsSummary(String pricingDetailsSummary) {
    this.pricingDetailsSummary = pricingDetailsSummary;
  }

  
  public String getPrivacyPolicyUrl() {
    return privacyPolicyUrl;
  }

  public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
    this.privacyPolicyUrl = privacyPolicyUrl;
  }

  
  public AppPublicCategory getPublicCategory() {
    return publicCategory;
  }

  public void setPublicCategory(AppPublicCategory publicCategory) {
    this.publicCategory = publicCategory;
  }

  
  public boolean getPublished() {
    return published;
  }

  public void setPublished(boolean published) {
    this.published = published;
  }

  
  public List<AccessScope> getRequestedAccessScopes() {
    return requestedAccessScopes;
  }

  public void setRequestedAccessScopes(List<AccessScope> requestedAccessScopes) {
    this.requestedAccessScopes = requestedAccessScopes;
  }

  
  public List<Image> getScreenshots() {
    return screenshots;
  }

  public void setScreenshots(List<Image> screenshots) {
    this.screenshots = screenshots;
  }

  
  public boolean getShopifyDeveloped() {
    return shopifyDeveloped;
  }

  public void setShopifyDeveloped(boolean shopifyDeveloped) {
    this.shopifyDeveloped = shopifyDeveloped;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getUninstallMessage() {
    return uninstallMessage;
  }

  public void setUninstallMessage(String uninstallMessage) {
    this.uninstallMessage = uninstallMessage;
  }

  
  public String getUninstallUrl() {
    return uninstallUrl;
  }

  public void setUninstallUrl(String uninstallUrl) {
    this.uninstallUrl = uninstallUrl;
  }

  
  public String getWebhookApiVersion() {
    return webhookApiVersion;
  }

  public void setWebhookApiVersion(String webhookApiVersion) {
    this.webhookApiVersion = webhookApiVersion;
  }

  @Override
  public String toString() {
    return "App{apiKey='" + apiKey + "', appStoreAppUrl='" + appStoreAppUrl + "', appStoreDeveloperUrl='" + appStoreDeveloperUrl + "', availableAccessScopes='" + availableAccessScopes + "', banner='" + banner + "', description='" + description + "', developerName='" + developerName + "', developerType='" + developerType + "', developerUrl='" + developerUrl + "', embedded='" + embedded + "', failedRequirements='" + failedRequirements + "', features='" + features + "', feedback='" + feedback + "', handle='" + handle + "', icon='" + icon + "', id='" + id + "', installUrl='" + installUrl + "', installation='" + installation + "', isPostPurchaseAppInUse='" + isPostPurchaseAppInUse + "', launchUrl='" + launchUrl + "', navigationItems='" + navigationItems + "', optionalAccessScopes='" + optionalAccessScopes + "', previouslyInstalled='" + previouslyInstalled + "', pricingDetails='" + pricingDetails + "', pricingDetailsSummary='" + pricingDetailsSummary + "', privacyPolicyUrl='" + privacyPolicyUrl + "', publicCategory='" + publicCategory + "', published='" + published + "', requestedAccessScopes='" + requestedAccessScopes + "', screenshots='" + screenshots + "', shopifyDeveloped='" + shopifyDeveloped + "', title='" + title + "', uninstallMessage='" + uninstallMessage + "', uninstallUrl='" + uninstallUrl + "', webhookApiVersion='" + webhookApiVersion + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App that = (App) o;
    return Objects.equals(apiKey, that.apiKey) &&
        Objects.equals(appStoreAppUrl, that.appStoreAppUrl) &&
        Objects.equals(appStoreDeveloperUrl, that.appStoreDeveloperUrl) &&
        Objects.equals(availableAccessScopes, that.availableAccessScopes) &&
        Objects.equals(banner, that.banner) &&
        Objects.equals(description, that.description) &&
        Objects.equals(developerName, that.developerName) &&
        Objects.equals(developerType, that.developerType) &&
        Objects.equals(developerUrl, that.developerUrl) &&
        embedded == that.embedded &&
        Objects.equals(failedRequirements, that.failedRequirements) &&
        Objects.equals(features, that.features) &&
        Objects.equals(feedback, that.feedback) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(id, that.id) &&
        Objects.equals(installUrl, that.installUrl) &&
        Objects.equals(installation, that.installation) &&
        isPostPurchaseAppInUse == that.isPostPurchaseAppInUse &&
        Objects.equals(launchUrl, that.launchUrl) &&
        Objects.equals(navigationItems, that.navigationItems) &&
        Objects.equals(optionalAccessScopes, that.optionalAccessScopes) &&
        previouslyInstalled == that.previouslyInstalled &&
        Objects.equals(pricingDetails, that.pricingDetails) &&
        Objects.equals(pricingDetailsSummary, that.pricingDetailsSummary) &&
        Objects.equals(privacyPolicyUrl, that.privacyPolicyUrl) &&
        Objects.equals(publicCategory, that.publicCategory) &&
        published == that.published &&
        Objects.equals(requestedAccessScopes, that.requestedAccessScopes) &&
        Objects.equals(screenshots, that.screenshots) &&
        shopifyDeveloped == that.shopifyDeveloped &&
        Objects.equals(title, that.title) &&
        Objects.equals(uninstallMessage, that.uninstallMessage) &&
        Objects.equals(uninstallUrl, that.uninstallUrl) &&
        Objects.equals(webhookApiVersion, that.webhookApiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKey, appStoreAppUrl, appStoreDeveloperUrl, availableAccessScopes, banner, description, developerName, developerType, developerUrl, embedded, failedRequirements, features, feedback, handle, icon, id, installUrl, installation, isPostPurchaseAppInUse, launchUrl, navigationItems, optionalAccessScopes, previouslyInstalled, pricingDetails, pricingDetailsSummary, privacyPolicyUrl, publicCategory, published, requestedAccessScopes, screenshots, shopifyDeveloped, title, uninstallMessage, uninstallUrl, webhookApiVersion);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String apiKey;

    
    private String appStoreAppUrl;

    
    private String appStoreDeveloperUrl;

    
    private List<AccessScope> availableAccessScopes;

    
    private Image banner;

    
    private String description;

    
    private String developerName;

    
    private AppDeveloperType developerType;

    
    private String developerUrl;

    
    private boolean embedded;

    
    private List<FailedRequirement> failedRequirements;

    
    private List<String> features;

    
    private AppFeedback feedback;

    
    private String handle;

    
    private Image icon;

    
    private String id;

    
    private String installUrl;

    
    private AppInstallation installation;

    
    private boolean isPostPurchaseAppInUse;

    
    private String launchUrl;

    
    private List<NavigationItem> navigationItems;

    
    private List<AccessScope> optionalAccessScopes;

    
    private boolean previouslyInstalled;

    
    private String pricingDetails;

    
    private String pricingDetailsSummary;

    
    private String privacyPolicyUrl;

    
    private AppPublicCategory publicCategory;

    
    private boolean published;

    
    private List<AccessScope> requestedAccessScopes;

    
    private List<Image> screenshots;

    
    private boolean shopifyDeveloped;

    
    private String title;

    
    private String uninstallMessage;

    
    private String uninstallUrl;

    
    private String webhookApiVersion;

    public App build() {
      App result = new App();
      result.apiKey = this.apiKey;
      result.appStoreAppUrl = this.appStoreAppUrl;
      result.appStoreDeveloperUrl = this.appStoreDeveloperUrl;
      result.availableAccessScopes = this.availableAccessScopes;
      result.banner = this.banner;
      result.description = this.description;
      result.developerName = this.developerName;
      result.developerType = this.developerType;
      result.developerUrl = this.developerUrl;
      result.embedded = this.embedded;
      result.failedRequirements = this.failedRequirements;
      result.features = this.features;
      result.feedback = this.feedback;
      result.handle = this.handle;
      result.icon = this.icon;
      result.id = this.id;
      result.installUrl = this.installUrl;
      result.installation = this.installation;
      result.isPostPurchaseAppInUse = this.isPostPurchaseAppInUse;
      result.launchUrl = this.launchUrl;
      result.navigationItems = this.navigationItems;
      result.optionalAccessScopes = this.optionalAccessScopes;
      result.previouslyInstalled = this.previouslyInstalled;
      result.pricingDetails = this.pricingDetails;
      result.pricingDetailsSummary = this.pricingDetailsSummary;
      result.privacyPolicyUrl = this.privacyPolicyUrl;
      result.publicCategory = this.publicCategory;
      result.published = this.published;
      result.requestedAccessScopes = this.requestedAccessScopes;
      result.screenshots = this.screenshots;
      result.shopifyDeveloped = this.shopifyDeveloped;
      result.title = this.title;
      result.uninstallMessage = this.uninstallMessage;
      result.uninstallUrl = this.uninstallUrl;
      result.webhookApiVersion = this.webhookApiVersion;
      return result;
    }

    
    public Builder apiKey(String apiKey) {
      this.apiKey = apiKey;
      return this;
    }

    
    public Builder appStoreAppUrl(String appStoreAppUrl) {
      this.appStoreAppUrl = appStoreAppUrl;
      return this;
    }

    
    public Builder appStoreDeveloperUrl(String appStoreDeveloperUrl) {
      this.appStoreDeveloperUrl = appStoreDeveloperUrl;
      return this;
    }

    
    public Builder availableAccessScopes(List<AccessScope> availableAccessScopes) {
      this.availableAccessScopes = availableAccessScopes;
      return this;
    }

    
    public Builder banner(Image banner) {
      this.banner = banner;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder developerName(String developerName) {
      this.developerName = developerName;
      return this;
    }

    
    public Builder developerType(AppDeveloperType developerType) {
      this.developerType = developerType;
      return this;
    }

    
    public Builder developerUrl(String developerUrl) {
      this.developerUrl = developerUrl;
      return this;
    }

    
    public Builder embedded(boolean embedded) {
      this.embedded = embedded;
      return this;
    }

    
    public Builder failedRequirements(List<FailedRequirement> failedRequirements) {
      this.failedRequirements = failedRequirements;
      return this;
    }

    
    public Builder features(List<String> features) {
      this.features = features;
      return this;
    }

    
    public Builder feedback(AppFeedback feedback) {
      this.feedback = feedback;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder icon(Image icon) {
      this.icon = icon;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder installUrl(String installUrl) {
      this.installUrl = installUrl;
      return this;
    }

    
    public Builder installation(AppInstallation installation) {
      this.installation = installation;
      return this;
    }

    
    public Builder isPostPurchaseAppInUse(boolean isPostPurchaseAppInUse) {
      this.isPostPurchaseAppInUse = isPostPurchaseAppInUse;
      return this;
    }

    
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }

    
    public Builder navigationItems(List<NavigationItem> navigationItems) {
      this.navigationItems = navigationItems;
      return this;
    }

    
    public Builder optionalAccessScopes(List<AccessScope> optionalAccessScopes) {
      this.optionalAccessScopes = optionalAccessScopes;
      return this;
    }

    
    public Builder previouslyInstalled(boolean previouslyInstalled) {
      this.previouslyInstalled = previouslyInstalled;
      return this;
    }

    
    public Builder pricingDetails(String pricingDetails) {
      this.pricingDetails = pricingDetails;
      return this;
    }

    
    public Builder pricingDetailsSummary(String pricingDetailsSummary) {
      this.pricingDetailsSummary = pricingDetailsSummary;
      return this;
    }

    
    public Builder privacyPolicyUrl(String privacyPolicyUrl) {
      this.privacyPolicyUrl = privacyPolicyUrl;
      return this;
    }

    
    public Builder publicCategory(AppPublicCategory publicCategory) {
      this.publicCategory = publicCategory;
      return this;
    }

    
    public Builder published(boolean published) {
      this.published = published;
      return this;
    }

    
    public Builder requestedAccessScopes(List<AccessScope> requestedAccessScopes) {
      this.requestedAccessScopes = requestedAccessScopes;
      return this;
    }

    
    public Builder screenshots(List<Image> screenshots) {
      this.screenshots = screenshots;
      return this;
    }

    
    public Builder shopifyDeveloped(boolean shopifyDeveloped) {
      this.shopifyDeveloped = shopifyDeveloped;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder uninstallMessage(String uninstallMessage) {
      this.uninstallMessage = uninstallMessage;
      return this;
    }

    
    public Builder uninstallUrl(String uninstallUrl) {
      this.uninstallUrl = uninstallUrl;
      return this;
    }

    
    public Builder webhookApiVersion(String webhookApiVersion) {
      this.webhookApiVersion = webhookApiVersion;
      return this;
    }
  }
}
