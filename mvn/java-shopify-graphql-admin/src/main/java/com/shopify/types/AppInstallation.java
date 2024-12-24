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
public class AppInstallation implements MetafieldReferencer, com.shopify.types.HasMetafields, com.shopify.types.Node {
  
  private List<AccessScope> accessScopes;

  
  private List<AppSubscription> activeSubscriptions;

  
  private AppSubscriptionConnection allSubscriptions;

  
  private App app;

  
  private Channel channel;

  
  private AppCreditConnection credits;

  
  private String id;

  
  private String launchUrl;

  
  private Metafield metafield;

  
  private MetafieldConnection metafields;

  
  private AppPurchaseOneTimeConnection oneTimePurchases;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private Publication publication;

  
  private AppRevenueAttributionRecordConnection revenueAttributionRecords;

  
  private List<AppSubscription> subscriptions;

  
  private String uninstallUrl;

  public AppInstallation() {
  }

  
  public List<AccessScope> getAccessScopes() {
    return accessScopes;
  }

  public void setAccessScopes(List<AccessScope> accessScopes) {
    this.accessScopes = accessScopes;
  }

  
  public List<AppSubscription> getActiveSubscriptions() {
    return activeSubscriptions;
  }

  public void setActiveSubscriptions(List<AppSubscription> activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
  }

  
  public AppSubscriptionConnection getAllSubscriptions() {
    return allSubscriptions;
  }

  public void setAllSubscriptions(AppSubscriptionConnection allSubscriptions) {
    this.allSubscriptions = allSubscriptions;
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  
  public AppCreditConnection getCredits() {
    return credits;
  }

  public void setCredits(AppCreditConnection credits) {
    this.credits = credits;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLaunchUrl() {
    return launchUrl;
  }

  public void setLaunchUrl(String launchUrl) {
    this.launchUrl = launchUrl;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public AppPurchaseOneTimeConnection getOneTimePurchases() {
    return oneTimePurchases;
  }

  public void setOneTimePurchases(AppPurchaseOneTimeConnection oneTimePurchases) {
    this.oneTimePurchases = oneTimePurchases;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  
  public AppRevenueAttributionRecordConnection getRevenueAttributionRecords() {
    return revenueAttributionRecords;
  }

  public void setRevenueAttributionRecords(
      AppRevenueAttributionRecordConnection revenueAttributionRecords) {
    this.revenueAttributionRecords = revenueAttributionRecords;
  }

  
  public List<AppSubscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<AppSubscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  
  public String getUninstallUrl() {
    return uninstallUrl;
  }

  public void setUninstallUrl(String uninstallUrl) {
    this.uninstallUrl = uninstallUrl;
  }

  @Override
  public String toString() {
    return "AppInstallation{accessScopes='" + accessScopes + "', activeSubscriptions='" + activeSubscriptions + "', allSubscriptions='" + allSubscriptions + "', app='" + app + "', channel='" + channel + "', credits='" + credits + "', id='" + id + "', launchUrl='" + launchUrl + "', metafield='" + metafield + "', metafields='" + metafields + "', oneTimePurchases='" + oneTimePurchases + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', publication='" + publication + "', revenueAttributionRecords='" + revenueAttributionRecords + "', subscriptions='" + subscriptions + "', uninstallUrl='" + uninstallUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppInstallation that = (AppInstallation) o;
    return Objects.equals(accessScopes, that.accessScopes) &&
        Objects.equals(activeSubscriptions, that.activeSubscriptions) &&
        Objects.equals(allSubscriptions, that.allSubscriptions) &&
        Objects.equals(app, that.app) &&
        Objects.equals(channel, that.channel) &&
        Objects.equals(credits, that.credits) &&
        Objects.equals(id, that.id) &&
        Objects.equals(launchUrl, that.launchUrl) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(oneTimePurchases, that.oneTimePurchases) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(publication, that.publication) &&
        Objects.equals(revenueAttributionRecords, that.revenueAttributionRecords) &&
        Objects.equals(subscriptions, that.subscriptions) &&
        Objects.equals(uninstallUrl, that.uninstallUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessScopes, activeSubscriptions, allSubscriptions, app, channel, credits, id, launchUrl, metafield, metafields, oneTimePurchases, privateMetafield, privateMetafields, publication, revenueAttributionRecords, subscriptions, uninstallUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<AccessScope> accessScopes;

    
    private List<AppSubscription> activeSubscriptions;

    
    private AppSubscriptionConnection allSubscriptions;

    
    private App app;

    
    private Channel channel;

    
    private AppCreditConnection credits;

    
    private String id;

    
    private String launchUrl;

    
    private Metafield metafield;

    
    private MetafieldConnection metafields;

    
    private AppPurchaseOneTimeConnection oneTimePurchases;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private Publication publication;

    
    private AppRevenueAttributionRecordConnection revenueAttributionRecords;

    
    private List<AppSubscription> subscriptions;

    
    private String uninstallUrl;

    public AppInstallation build() {
      AppInstallation result = new AppInstallation();
      result.accessScopes = this.accessScopes;
      result.activeSubscriptions = this.activeSubscriptions;
      result.allSubscriptions = this.allSubscriptions;
      result.app = this.app;
      result.channel = this.channel;
      result.credits = this.credits;
      result.id = this.id;
      result.launchUrl = this.launchUrl;
      result.metafield = this.metafield;
      result.metafields = this.metafields;
      result.oneTimePurchases = this.oneTimePurchases;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.publication = this.publication;
      result.revenueAttributionRecords = this.revenueAttributionRecords;
      result.subscriptions = this.subscriptions;
      result.uninstallUrl = this.uninstallUrl;
      return result;
    }

    
    public Builder accessScopes(List<AccessScope> accessScopes) {
      this.accessScopes = accessScopes;
      return this;
    }

    
    public Builder activeSubscriptions(List<AppSubscription> activeSubscriptions) {
      this.activeSubscriptions = activeSubscriptions;
      return this;
    }

    
    public Builder allSubscriptions(AppSubscriptionConnection allSubscriptions) {
      this.allSubscriptions = allSubscriptions;
      return this;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    
    public Builder credits(AppCreditConnection credits) {
      this.credits = credits;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder oneTimePurchases(AppPurchaseOneTimeConnection oneTimePurchases) {
      this.oneTimePurchases = oneTimePurchases;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    
    public Builder revenueAttributionRecords(
        AppRevenueAttributionRecordConnection revenueAttributionRecords) {
      this.revenueAttributionRecords = revenueAttributionRecords;
      return this;
    }

    
    public Builder subscriptions(List<AppSubscription> subscriptions) {
      this.subscriptions = subscriptions;
      return this;
    }

    
    public Builder uninstallUrl(String uninstallUrl) {
      this.uninstallUrl = uninstallUrl;
      return this;
    }
  }
}
