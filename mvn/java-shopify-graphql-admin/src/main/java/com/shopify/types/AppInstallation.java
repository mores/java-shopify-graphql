package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents an installed application on a shop.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppInstallation implements MetafieldReferencer, com.shopify.types.HasMetafields, com.shopify.types.Node {
  /**
   * The access scopes granted to the application by a merchant during installation.
   */
  private List<AccessScope> accessScopes;

  /**
   * The active application subscriptions billed to the shop on a recurring basis.
   */
  private List<AppSubscription> activeSubscriptions;

  /**
   * All subscriptions created for a shop.
   */
  private AppSubscriptionConnection allSubscriptions;

  /**
   * Application which is installed.
   */
  private App app;

  /**
   * Channel associated with the installed application.
   */
  private Channel channel;

  /**
   * Credits that can be used towards future app purchases.
   */
  private AppCreditConnection credits;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The URL to launch the application.
   */
  private String launchUrl;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * One-time purchases to a shop.
   */
  private AppPurchaseOneTimeConnection oneTimePurchases;

  /**
   * The publication associated with the installed application.
   */
  private Publication publication;

  /**
   * The records that track the externally-captured revenue for the app. The records are used for revenue attribution purposes.
   */
  private AppRevenueAttributionRecordConnection revenueAttributionRecords;

  /**
   * Subscriptions charge to a shop on a recurring basis.
   */
  private List<AppSubscription> subscriptions;

  /**
   * The URL to uninstall the application.
   */
  private String uninstallUrl;

  public AppInstallation() {
  }

  /**
   * The access scopes granted to the application by a merchant during installation.
   */
  public List<AccessScope> getAccessScopes() {
    return accessScopes;
  }

  public void setAccessScopes(List<AccessScope> accessScopes) {
    this.accessScopes = accessScopes;
  }

  /**
   * The active application subscriptions billed to the shop on a recurring basis.
   */
  public List<AppSubscription> getActiveSubscriptions() {
    return activeSubscriptions;
  }

  public void setActiveSubscriptions(List<AppSubscription> activeSubscriptions) {
    this.activeSubscriptions = activeSubscriptions;
  }

  /**
   * All subscriptions created for a shop.
   */
  public AppSubscriptionConnection getAllSubscriptions() {
    return allSubscriptions;
  }

  public void setAllSubscriptions(AppSubscriptionConnection allSubscriptions) {
    this.allSubscriptions = allSubscriptions;
  }

  /**
   * Application which is installed.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * Channel associated with the installed application.
   */
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  /**
   * Credits that can be used towards future app purchases.
   */
  public AppCreditConnection getCredits() {
    return credits;
  }

  public void setCredits(AppCreditConnection credits) {
    this.credits = credits;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The URL to launch the application.
   */
  public String getLaunchUrl() {
    return launchUrl;
  }

  public void setLaunchUrl(String launchUrl) {
    this.launchUrl = launchUrl;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * One-time purchases to a shop.
   */
  public AppPurchaseOneTimeConnection getOneTimePurchases() {
    return oneTimePurchases;
  }

  public void setOneTimePurchases(AppPurchaseOneTimeConnection oneTimePurchases) {
    this.oneTimePurchases = oneTimePurchases;
  }

  /**
   * The publication associated with the installed application.
   */
  public Publication getPublication() {
    return publication;
  }

  public void setPublication(Publication publication) {
    this.publication = publication;
  }

  /**
   * The records that track the externally-captured revenue for the app. The records are used for revenue attribution purposes.
   */
  public AppRevenueAttributionRecordConnection getRevenueAttributionRecords() {
    return revenueAttributionRecords;
  }

  public void setRevenueAttributionRecords(
      AppRevenueAttributionRecordConnection revenueAttributionRecords) {
    this.revenueAttributionRecords = revenueAttributionRecords;
  }

  /**
   * Subscriptions charge to a shop on a recurring basis.
   */
  public List<AppSubscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<AppSubscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  /**
   * The URL to uninstall the application.
   */
  public String getUninstallUrl() {
    return uninstallUrl;
  }

  public void setUninstallUrl(String uninstallUrl) {
    this.uninstallUrl = uninstallUrl;
  }

  @Override
  public String toString() {
    return "AppInstallation{accessScopes='" + accessScopes + "', activeSubscriptions='" + activeSubscriptions + "', allSubscriptions='" + allSubscriptions + "', app='" + app + "', channel='" + channel + "', credits='" + credits + "', id='" + id + "', launchUrl='" + launchUrl + "', metafield='" + metafield + "', metafields='" + metafields + "', oneTimePurchases='" + oneTimePurchases + "', publication='" + publication + "', revenueAttributionRecords='" + revenueAttributionRecords + "', subscriptions='" + subscriptions + "', uninstallUrl='" + uninstallUrl + "'}";
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
        Objects.equals(publication, that.publication) &&
        Objects.equals(revenueAttributionRecords, that.revenueAttributionRecords) &&
        Objects.equals(subscriptions, that.subscriptions) &&
        Objects.equals(uninstallUrl, that.uninstallUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessScopes, activeSubscriptions, allSubscriptions, app, channel, credits, id, launchUrl, metafield, metafields, oneTimePurchases, publication, revenueAttributionRecords, subscriptions, uninstallUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The access scopes granted to the application by a merchant during installation.
     */
    private List<AccessScope> accessScopes;

    /**
     * The active application subscriptions billed to the shop on a recurring basis.
     */
    private List<AppSubscription> activeSubscriptions;

    /**
     * All subscriptions created for a shop.
     */
    private AppSubscriptionConnection allSubscriptions;

    /**
     * Application which is installed.
     */
    private App app;

    /**
     * Channel associated with the installed application.
     */
    private Channel channel;

    /**
     * Credits that can be used towards future app purchases.
     */
    private AppCreditConnection credits;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The URL to launch the application.
     */
    private String launchUrl;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * One-time purchases to a shop.
     */
    private AppPurchaseOneTimeConnection oneTimePurchases;

    /**
     * The publication associated with the installed application.
     */
    private Publication publication;

    /**
     * The records that track the externally-captured revenue for the app. The records are used for revenue attribution purposes.
     */
    private AppRevenueAttributionRecordConnection revenueAttributionRecords;

    /**
     * Subscriptions charge to a shop on a recurring basis.
     */
    private List<AppSubscription> subscriptions;

    /**
     * The URL to uninstall the application.
     */
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
      result.publication = this.publication;
      result.revenueAttributionRecords = this.revenueAttributionRecords;
      result.subscriptions = this.subscriptions;
      result.uninstallUrl = this.uninstallUrl;
      return result;
    }

    /**
     * The access scopes granted to the application by a merchant during installation.
     */
    public Builder accessScopes(List<AccessScope> accessScopes) {
      this.accessScopes = accessScopes;
      return this;
    }

    /**
     * The active application subscriptions billed to the shop on a recurring basis.
     */
    public Builder activeSubscriptions(List<AppSubscription> activeSubscriptions) {
      this.activeSubscriptions = activeSubscriptions;
      return this;
    }

    /**
     * All subscriptions created for a shop.
     */
    public Builder allSubscriptions(AppSubscriptionConnection allSubscriptions) {
      this.allSubscriptions = allSubscriptions;
      return this;
    }

    /**
     * Application which is installed.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * Channel associated with the installed application.
     */
    public Builder channel(Channel channel) {
      this.channel = channel;
      return this;
    }

    /**
     * Credits that can be used towards future app purchases.
     */
    public Builder credits(AppCreditConnection credits) {
      this.credits = credits;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The URL to launch the application.
     */
    public Builder launchUrl(String launchUrl) {
      this.launchUrl = launchUrl;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * One-time purchases to a shop.
     */
    public Builder oneTimePurchases(AppPurchaseOneTimeConnection oneTimePurchases) {
      this.oneTimePurchases = oneTimePurchases;
      return this;
    }

    /**
     * The publication associated with the installed application.
     */
    public Builder publication(Publication publication) {
      this.publication = publication;
      return this;
    }

    /**
     * The records that track the externally-captured revenue for the app. The records are used for revenue attribution purposes.
     */
    public Builder revenueAttributionRecords(
        AppRevenueAttributionRecordConnection revenueAttributionRecords) {
      this.revenueAttributionRecords = revenueAttributionRecords;
      return this;
    }

    /**
     * Subscriptions charge to a shop on a recurring basis.
     */
    public Builder subscriptions(List<AppSubscription> subscriptions) {
      this.subscriptions = subscriptions;
      return this;
    }

    /**
     * The URL to uninstall the application.
     */
    public Builder uninstallUrl(String uninstallUrl) {
      this.uninstallUrl = uninstallUrl;
      return this;
    }
  }
}
