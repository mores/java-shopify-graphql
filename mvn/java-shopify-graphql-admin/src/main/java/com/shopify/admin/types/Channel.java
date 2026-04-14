package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A connection between a Shopify shop and an external selling platform that
 * supports product syndication and optionally order ingestion. Each channel binds
 * a merchant's account on a specific platform — such as Amazon, eBay, Google, or a
 * point-of-sale system — to the shop, establishing the publishing destination for product feeds.
 *
 * Sales Channel applications use [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
 * to establish channels after merchant authentication, and can manage multiple
 * channel connections per app. Each channel is bound to a channel specification
 * that declares the platform's regional coverage, capabilities, and requirements.
 *
 * Use channels to manage where catalog items are syndicated, track publication
 * status across platforms, and control
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
 * visibility for different selling destinations.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Channel implements com.shopify.admin.types.Node {
  /**
   * The unique account ID for the merchant on the external platform. This value is
   * opaque to Shopify — its format is determined by the channel, such as an Amazon
   * Seller ID or Google Merchant Center ID.
   */
  private String accountId;

  /**
   * The merchant-facing name for the external account. Displayed in Shopify Admin
   * wherever the channel connection is referenced, such as in Markets and order attribution.
   */
  private String accountName;

  /**
   * The underlying app used by the channel.
   */
  private App app;

  /**
   * The list of collection publications. Each record represents information about the publication of a collection.
   */
  private ResourcePublicationConnection collectionPublicationsV3;

  /**
   * The list of collections published to the channel.
   */
  private CollectionConnection collections;

  /**
   * A unique, human-readable identifier for the channel within the shop. Set during [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
   * or auto-generated from the specification handle and account ID. Use with [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle) for lookups.
   */
  private String handle;

  /**
   * Whether the collection is available to the channel.
   */
  private boolean hasCollection;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the channel.
   */
  private String name;

  /**
   * The menu items for the channel, which also appear as submenu items in the left navigation sidebar in the Shopify admin.
   */
  private List<NavigationItem> navigationItems;

  /**
   * Home page for the channel.
   */
  private String overviewPath;

  /**
   * The product publications for the products published to the channel.
   */
  private ProductPublicationConnection productPublications;

  /**
   * The list of product publication records for products published to this channel.
   */
  private ResourcePublicationConnection productPublicationsV3;

  /**
   * The list of products published to the channel.
   */
  private ProductConnection products;

  /**
   * Retrieves the total count of [`products`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
   * published to a specific sales channel. Limited to a maximum of 10000 by default.
   */
  private Count productsCount;

  /**
   * The resource feedback for the channel. Returns `null` when no active feedback
   * exists—for example, after `shopResourceFeedbackCreate` is called with `state:
   * ACCEPTED`, which clears the feedback signal. A `null` result is expected and
   * means the channel has no outstanding feedback.
   */
  private AppFeedback resourceFeedback;

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * bound to this channel. The specification declares the channel's regional
   * coverage, capabilities, and requirements, and is deployed by the Sales Channel
   * application via `shopify app deploy`.
   */
  private String specificationHandle;

  /**
   * Whether the channel supports future publishing.
   */
  private boolean supportsFuturePublishing;

  public Channel() {
  }

  /**
   * The unique account ID for the merchant on the external platform. This value is
   * opaque to Shopify — its format is determined by the channel, such as an Amazon
   * Seller ID or Google Merchant Center ID.
   */
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * The merchant-facing name for the external account. Displayed in Shopify Admin
   * wherever the channel connection is referenced, such as in Markets and order attribution.
   */
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  /**
   * The underlying app used by the channel.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The list of collection publications. Each record represents information about the publication of a collection.
   */
  public ResourcePublicationConnection getCollectionPublicationsV3() {
    return collectionPublicationsV3;
  }

  public void setCollectionPublicationsV3(ResourcePublicationConnection collectionPublicationsV3) {
    this.collectionPublicationsV3 = collectionPublicationsV3;
  }

  /**
   * The list of collections published to the channel.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * A unique, human-readable identifier for the channel within the shop. Set during [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
   * or auto-generated from the specification handle and account ID. Use with [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle) for lookups.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * Whether the collection is available to the channel.
   */
  public boolean getHasCollection() {
    return hasCollection;
  }

  public void setHasCollection(boolean hasCollection) {
    this.hasCollection = hasCollection;
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
   * The name of the channel.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The menu items for the channel, which also appear as submenu items in the left navigation sidebar in the Shopify admin.
   */
  public List<NavigationItem> getNavigationItems() {
    return navigationItems;
  }

  public void setNavigationItems(List<NavigationItem> navigationItems) {
    this.navigationItems = navigationItems;
  }

  /**
   * Home page for the channel.
   */
  public String getOverviewPath() {
    return overviewPath;
  }

  public void setOverviewPath(String overviewPath) {
    this.overviewPath = overviewPath;
  }

  /**
   * The product publications for the products published to the channel.
   */
  public ProductPublicationConnection getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(ProductPublicationConnection productPublications) {
    this.productPublications = productPublications;
  }

  /**
   * The list of product publication records for products published to this channel.
   */
  public ResourcePublicationConnection getProductPublicationsV3() {
    return productPublicationsV3;
  }

  public void setProductPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
    this.productPublicationsV3 = productPublicationsV3;
  }

  /**
   * The list of products published to the channel.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * Retrieves the total count of [`products`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
   * published to a specific sales channel. Limited to a maximum of 10000 by default.
   */
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
  }

  /**
   * The resource feedback for the channel. Returns `null` when no active feedback
   * exists—for example, after `shopResourceFeedbackCreate` is called with `state:
   * ACCEPTED`, which clears the feedback signal. A `null` result is expected and
   * means the channel has no outstanding feedback.
   */
  public AppFeedback getResourceFeedback() {
    return resourceFeedback;
  }

  public void setResourceFeedback(AppFeedback resourceFeedback) {
    this.resourceFeedback = resourceFeedback;
  }

  /**
   * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
   * bound to this channel. The specification declares the channel's regional
   * coverage, capabilities, and requirements, and is deployed by the Sales Channel
   * application via `shopify app deploy`.
   */
  public String getSpecificationHandle() {
    return specificationHandle;
  }

  public void setSpecificationHandle(String specificationHandle) {
    this.specificationHandle = specificationHandle;
  }

  /**
   * Whether the channel supports future publishing.
   */
  public boolean getSupportsFuturePublishing() {
    return supportsFuturePublishing;
  }

  public void setSupportsFuturePublishing(boolean supportsFuturePublishing) {
    this.supportsFuturePublishing = supportsFuturePublishing;
  }

  @Override
  public String toString() {
    return "Channel{accountId='" + accountId + "', accountName='" + accountName + "', app='" + app + "', collectionPublicationsV3='" + collectionPublicationsV3 + "', collections='" + collections + "', handle='" + handle + "', hasCollection='" + hasCollection + "', id='" + id + "', name='" + name + "', navigationItems='" + navigationItems + "', overviewPath='" + overviewPath + "', productPublications='" + productPublications + "', productPublicationsV3='" + productPublicationsV3 + "', products='" + products + "', productsCount='" + productsCount + "', resourceFeedback='" + resourceFeedback + "', specificationHandle='" + specificationHandle + "', supportsFuturePublishing='" + supportsFuturePublishing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Channel that = (Channel) o;
    return Objects.equals(accountId, that.accountId) &&
        Objects.equals(accountName, that.accountName) &&
        Objects.equals(app, that.app) &&
        Objects.equals(collectionPublicationsV3, that.collectionPublicationsV3) &&
        Objects.equals(collections, that.collections) &&
        Objects.equals(handle, that.handle) &&
        hasCollection == that.hasCollection &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(navigationItems, that.navigationItems) &&
        Objects.equals(overviewPath, that.overviewPath) &&
        Objects.equals(productPublications, that.productPublications) &&
        Objects.equals(productPublicationsV3, that.productPublicationsV3) &&
        Objects.equals(products, that.products) &&
        Objects.equals(productsCount, that.productsCount) &&
        Objects.equals(resourceFeedback, that.resourceFeedback) &&
        Objects.equals(specificationHandle, that.specificationHandle) &&
        supportsFuturePublishing == that.supportsFuturePublishing;
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, app, collectionPublicationsV3, collections, handle, hasCollection, id, name, navigationItems, overviewPath, productPublications, productPublicationsV3, products, productsCount, resourceFeedback, specificationHandle, supportsFuturePublishing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique account ID for the merchant on the external platform. This value is
     * opaque to Shopify — its format is determined by the channel, such as an Amazon
     * Seller ID or Google Merchant Center ID.
     */
    private String accountId;

    /**
     * The merchant-facing name for the external account. Displayed in Shopify Admin
     * wherever the channel connection is referenced, such as in Markets and order attribution.
     */
    private String accountName;

    /**
     * The underlying app used by the channel.
     */
    private App app;

    /**
     * The list of collection publications. Each record represents information about the publication of a collection.
     */
    private ResourcePublicationConnection collectionPublicationsV3;

    /**
     * The list of collections published to the channel.
     */
    private CollectionConnection collections;

    /**
     * A unique, human-readable identifier for the channel within the shop. Set during [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
     * or auto-generated from the specification handle and account ID. Use with [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle) for lookups.
     */
    private String handle;

    /**
     * Whether the collection is available to the channel.
     */
    private boolean hasCollection;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the channel.
     */
    private String name;

    /**
     * The menu items for the channel, which also appear as submenu items in the left navigation sidebar in the Shopify admin.
     */
    private List<NavigationItem> navigationItems;

    /**
     * Home page for the channel.
     */
    private String overviewPath;

    /**
     * The product publications for the products published to the channel.
     */
    private ProductPublicationConnection productPublications;

    /**
     * The list of product publication records for products published to this channel.
     */
    private ResourcePublicationConnection productPublicationsV3;

    /**
     * The list of products published to the channel.
     */
    private ProductConnection products;

    /**
     * Retrieves the total count of [`products`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
     * published to a specific sales channel. Limited to a maximum of 10000 by default.
     */
    private Count productsCount;

    /**
     * The resource feedback for the channel. Returns `null` when no active feedback
     * exists—for example, after `shopResourceFeedbackCreate` is called with `state:
     * ACCEPTED`, which clears the feedback signal. A `null` result is expected and
     * means the channel has no outstanding feedback.
     */
    private AppFeedback resourceFeedback;

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * bound to this channel. The specification declares the channel's regional
     * coverage, capabilities, and requirements, and is deployed by the Sales Channel
     * application via `shopify app deploy`.
     */
    private String specificationHandle;

    /**
     * Whether the channel supports future publishing.
     */
    private boolean supportsFuturePublishing;

    public Channel build() {
      Channel result = new Channel();
      result.accountId = this.accountId;
      result.accountName = this.accountName;
      result.app = this.app;
      result.collectionPublicationsV3 = this.collectionPublicationsV3;
      result.collections = this.collections;
      result.handle = this.handle;
      result.hasCollection = this.hasCollection;
      result.id = this.id;
      result.name = this.name;
      result.navigationItems = this.navigationItems;
      result.overviewPath = this.overviewPath;
      result.productPublications = this.productPublications;
      result.productPublicationsV3 = this.productPublicationsV3;
      result.products = this.products;
      result.productsCount = this.productsCount;
      result.resourceFeedback = this.resourceFeedback;
      result.specificationHandle = this.specificationHandle;
      result.supportsFuturePublishing = this.supportsFuturePublishing;
      return result;
    }

    /**
     * The unique account ID for the merchant on the external platform. This value is
     * opaque to Shopify — its format is determined by the channel, such as an Amazon
     * Seller ID or Google Merchant Center ID.
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * The merchant-facing name for the external account. Displayed in Shopify Admin
     * wherever the channel connection is referenced, such as in Markets and order attribution.
     */
    public Builder accountName(String accountName) {
      this.accountName = accountName;
      return this;
    }

    /**
     * The underlying app used by the channel.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The list of collection publications. Each record represents information about the publication of a collection.
     */
    public Builder collectionPublicationsV3(
        ResourcePublicationConnection collectionPublicationsV3) {
      this.collectionPublicationsV3 = collectionPublicationsV3;
      return this;
    }

    /**
     * The list of collections published to the channel.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * A unique, human-readable identifier for the channel within the shop. Set during [`channelCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/channelCreate)
     * or auto-generated from the specification handle and account ID. Use with [`channelByHandle`](https://shopify.dev/docs/api/admin-graphql/latest/queries/channelByHandle) for lookups.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * Whether the collection is available to the channel.
     */
    public Builder hasCollection(boolean hasCollection) {
      this.hasCollection = hasCollection;
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
     * The name of the channel.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The menu items for the channel, which also appear as submenu items in the left navigation sidebar in the Shopify admin.
     */
    public Builder navigationItems(List<NavigationItem> navigationItems) {
      this.navigationItems = navigationItems;
      return this;
    }

    /**
     * Home page for the channel.
     */
    public Builder overviewPath(String overviewPath) {
      this.overviewPath = overviewPath;
      return this;
    }

    /**
     * The product publications for the products published to the channel.
     */
    public Builder productPublications(ProductPublicationConnection productPublications) {
      this.productPublications = productPublications;
      return this;
    }

    /**
     * The list of product publication records for products published to this channel.
     */
    public Builder productPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
      this.productPublicationsV3 = productPublicationsV3;
      return this;
    }

    /**
     * The list of products published to the channel.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * Retrieves the total count of [`products`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product)
     * published to a specific sales channel. Limited to a maximum of 10000 by default.
     */
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
      return this;
    }

    /**
     * The resource feedback for the channel. Returns `null` when no active feedback
     * exists—for example, after `shopResourceFeedbackCreate` is called with `state:
     * ACCEPTED`, which clears the feedback signal. A `null` result is expected and
     * means the channel has no outstanding feedback.
     */
    public Builder resourceFeedback(AppFeedback resourceFeedback) {
      this.resourceFeedback = resourceFeedback;
      return this;
    }

    /**
     * The handle of the [channel specification](https://shopify.dev/docs/apps/build/sales-channels/channel-config-extension)
     * bound to this channel. The specification declares the channel's regional
     * coverage, capabilities, and requirements, and is deployed by the Sales Channel
     * application via `shopify app deploy`.
     */
    public Builder specificationHandle(String specificationHandle) {
      this.specificationHandle = specificationHandle;
      return this;
    }

    /**
     * Whether the channel supports future publishing.
     */
    public Builder supportsFuturePublishing(boolean supportsFuturePublishing) {
      this.supportsFuturePublishing = supportsFuturePublishing;
      return this;
    }
  }
}
