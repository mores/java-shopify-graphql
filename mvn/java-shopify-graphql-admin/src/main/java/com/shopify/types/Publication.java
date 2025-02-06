package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A publication is a group of products and collections that is published to an app.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Publication implements com.shopify.types.Node {
  /**
   * The app associated with the publication.
   */
  private App app;

  /**
   * Whether new products are automatically published to this publication.
   */
  private boolean autoPublish;

  /**
   * The catalog associated with the publication.
   */
  private Catalog catalog;

  /**
   * The collection publications for the list of collections published to the publication.
   */
  private ResourcePublicationConnection collectionPublicationsV3;

  /**
   * The list of collections published to the publication.
   */
  private CollectionConnection collections;

  /**
   * Whether the collection is available to the publication.
   */
  private boolean hasCollection;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Name of the publication.
   */
  private String name;

  /**
   * A background operation associated with this publication.
   */
  private PublicationOperation operation;

  /**
   * The product publications for the list of products published to the publication.
   */
  private ResourcePublicationConnection productPublicationsV3;

  /**
   * The list of products published to the publication.
   */
  private ProductConnection products;

  /**
   * Whether the publication supports future publishing.
   */
  private boolean supportsFuturePublishing;

  public Publication() {
  }

  /**
   * The app associated with the publication.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * Whether new products are automatically published to this publication.
   */
  public boolean getAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(boolean autoPublish) {
    this.autoPublish = autoPublish;
  }

  /**
   * The catalog associated with the publication.
   */
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  /**
   * The collection publications for the list of collections published to the publication.
   */
  public ResourcePublicationConnection getCollectionPublicationsV3() {
    return collectionPublicationsV3;
  }

  public void setCollectionPublicationsV3(ResourcePublicationConnection collectionPublicationsV3) {
    this.collectionPublicationsV3 = collectionPublicationsV3;
  }

  /**
   * The list of collections published to the publication.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  /**
   * Whether the collection is available to the publication.
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
   * Name of the publication.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A background operation associated with this publication.
   */
  public PublicationOperation getOperation() {
    return operation;
  }

  public void setOperation(PublicationOperation operation) {
    this.operation = operation;
  }

  /**
   * The product publications for the list of products published to the publication.
   */
  public ResourcePublicationConnection getProductPublicationsV3() {
    return productPublicationsV3;
  }

  public void setProductPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
    this.productPublicationsV3 = productPublicationsV3;
  }

  /**
   * The list of products published to the publication.
   */
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  /**
   * Whether the publication supports future publishing.
   */
  public boolean getSupportsFuturePublishing() {
    return supportsFuturePublishing;
  }

  public void setSupportsFuturePublishing(boolean supportsFuturePublishing) {
    this.supportsFuturePublishing = supportsFuturePublishing;
  }

  @Override
  public String toString() {
    return "Publication{app='" + app + "', autoPublish='" + autoPublish + "', catalog='" + catalog + "', collectionPublicationsV3='" + collectionPublicationsV3 + "', collections='" + collections + "', hasCollection='" + hasCollection + "', id='" + id + "', name='" + name + "', operation='" + operation + "', productPublicationsV3='" + productPublicationsV3 + "', products='" + products + "', supportsFuturePublishing='" + supportsFuturePublishing + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Publication that = (Publication) o;
    return Objects.equals(app, that.app) &&
        autoPublish == that.autoPublish &&
        Objects.equals(catalog, that.catalog) &&
        Objects.equals(collectionPublicationsV3, that.collectionPublicationsV3) &&
        Objects.equals(collections, that.collections) &&
        hasCollection == that.hasCollection &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(operation, that.operation) &&
        Objects.equals(productPublicationsV3, that.productPublicationsV3) &&
        Objects.equals(products, that.products) &&
        supportsFuturePublishing == that.supportsFuturePublishing;
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, autoPublish, catalog, collectionPublicationsV3, collections, hasCollection, id, name, operation, productPublicationsV3, products, supportsFuturePublishing);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app associated with the publication.
     */
    private App app;

    /**
     * Whether new products are automatically published to this publication.
     */
    private boolean autoPublish;

    /**
     * The catalog associated with the publication.
     */
    private Catalog catalog;

    /**
     * The collection publications for the list of collections published to the publication.
     */
    private ResourcePublicationConnection collectionPublicationsV3;

    /**
     * The list of collections published to the publication.
     */
    private CollectionConnection collections;

    /**
     * Whether the collection is available to the publication.
     */
    private boolean hasCollection;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Name of the publication.
     */
    private String name;

    /**
     * A background operation associated with this publication.
     */
    private PublicationOperation operation;

    /**
     * The product publications for the list of products published to the publication.
     */
    private ResourcePublicationConnection productPublicationsV3;

    /**
     * The list of products published to the publication.
     */
    private ProductConnection products;

    /**
     * Whether the publication supports future publishing.
     */
    private boolean supportsFuturePublishing;

    public Publication build() {
      Publication result = new Publication();
      result.app = this.app;
      result.autoPublish = this.autoPublish;
      result.catalog = this.catalog;
      result.collectionPublicationsV3 = this.collectionPublicationsV3;
      result.collections = this.collections;
      result.hasCollection = this.hasCollection;
      result.id = this.id;
      result.name = this.name;
      result.operation = this.operation;
      result.productPublicationsV3 = this.productPublicationsV3;
      result.products = this.products;
      result.supportsFuturePublishing = this.supportsFuturePublishing;
      return result;
    }

    /**
     * The app associated with the publication.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * Whether new products are automatically published to this publication.
     */
    public Builder autoPublish(boolean autoPublish) {
      this.autoPublish = autoPublish;
      return this;
    }

    /**
     * The catalog associated with the publication.
     */
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * The collection publications for the list of collections published to the publication.
     */
    public Builder collectionPublicationsV3(
        ResourcePublicationConnection collectionPublicationsV3) {
      this.collectionPublicationsV3 = collectionPublicationsV3;
      return this;
    }

    /**
     * The list of collections published to the publication.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    /**
     * Whether the collection is available to the publication.
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
     * Name of the publication.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A background operation associated with this publication.
     */
    public Builder operation(PublicationOperation operation) {
      this.operation = operation;
      return this;
    }

    /**
     * The product publications for the list of products published to the publication.
     */
    public Builder productPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
      this.productPublicationsV3 = productPublicationsV3;
      return this;
    }

    /**
     * The list of products published to the publication.
     */
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    /**
     * Whether the publication supports future publishing.
     */
    public Builder supportsFuturePublishing(boolean supportsFuturePublishing) {
      this.supportsFuturePublishing = supportsFuturePublishing;
      return this;
    }
  }
}
