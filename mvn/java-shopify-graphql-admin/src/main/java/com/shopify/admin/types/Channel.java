package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A channel represents an app where you sell a group of products and collections.
 * A channel can be a platform or marketplace such as Facebook or Pinterest, an online store, or POS.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Channel implements com.shopify.admin.types.Node {
  /**
   * The underlying app used by the channel.
   */
  private App app;

  /**
   * The collection publications for the list of collections published to the channel.
   */
  private ResourcePublicationConnection collectionPublicationsV3;

  /**
   * The list of collections published to the channel.
   */
  private CollectionConnection collections;

  /**
   * The unique identifier for the channel.
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
   * The product publications for the list of products published to the channel.
   */
  private ResourcePublicationConnection productPublicationsV3;

  /**
   * The list of products published to the channel.
   */
  private ProductConnection products;

  /**
   * The count of products published to the channel. Limited to a maximum of 10000.
   */
  private Count productsCount;

  /**
   * Whether the channel supports future publishing.
   */
  private boolean supportsFuturePublishing;

  public Channel() {
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
   * The collection publications for the list of collections published to the channel.
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
   * The unique identifier for the channel.
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
   * The product publications for the list of products published to the channel.
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
   * The count of products published to the channel. Limited to a maximum of 10000.
   */
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
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
    return "Channel{app='" + app + "', collectionPublicationsV3='" + collectionPublicationsV3 + "', collections='" + collections + "', handle='" + handle + "', hasCollection='" + hasCollection + "', id='" + id + "', name='" + name + "', navigationItems='" + navigationItems + "', overviewPath='" + overviewPath + "', productPublications='" + productPublications + "', productPublicationsV3='" + productPublicationsV3 + "', products='" + products + "', productsCount='" + productsCount + "', supportsFuturePublishing='" + supportsFuturePublishing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Channel that = (Channel) o;
    return Objects.equals(app, that.app) &&
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
        supportsFuturePublishing == that.supportsFuturePublishing;
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, collectionPublicationsV3, collections, handle, hasCollection, id, name, navigationItems, overviewPath, productPublications, productPublicationsV3, products, productsCount, supportsFuturePublishing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The underlying app used by the channel.
     */
    private App app;

    /**
     * The collection publications for the list of collections published to the channel.
     */
    private ResourcePublicationConnection collectionPublicationsV3;

    /**
     * The list of collections published to the channel.
     */
    private CollectionConnection collections;

    /**
     * The unique identifier for the channel.
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
     * The product publications for the list of products published to the channel.
     */
    private ResourcePublicationConnection productPublicationsV3;

    /**
     * The list of products published to the channel.
     */
    private ProductConnection products;

    /**
     * The count of products published to the channel. Limited to a maximum of 10000.
     */
    private Count productsCount;

    /**
     * Whether the channel supports future publishing.
     */
    private boolean supportsFuturePublishing;

    public Channel build() {
      Channel result = new Channel();
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
      result.supportsFuturePublishing = this.supportsFuturePublishing;
      return result;
    }

    /**
     * The underlying app used by the channel.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The collection publications for the list of collections published to the channel.
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
     * The unique identifier for the channel.
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
     * The product publications for the list of products published to the channel.
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
     * The count of products published to the channel. Limited to a maximum of 10000.
     */
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
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
