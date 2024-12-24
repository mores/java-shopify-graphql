package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Publication implements com.shopify.types.Node {
  
  private App app;

  
  private boolean autoPublish;

  
  private Catalog catalog;

  
  private ResourcePublicationConnection collectionPublicationsV3;

  
  private CollectionConnection collections;

  
  private boolean hasCollection;

  
  private String id;

  
  private String name;

  
  private PublicationOperation operation;

  
  private ResourcePublicationConnection productPublicationsV3;

  
  private ProductConnection products;

  
  private boolean supportsFuturePublishing;

  public Publication() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public boolean getAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(boolean autoPublish) {
    this.autoPublish = autoPublish;
  }

  
  public Catalog getCatalog() {
    return catalog;
  }

  public void setCatalog(Catalog catalog) {
    this.catalog = catalog;
  }

  
  public ResourcePublicationConnection getCollectionPublicationsV3() {
    return collectionPublicationsV3;
  }

  public void setCollectionPublicationsV3(ResourcePublicationConnection collectionPublicationsV3) {
    this.collectionPublicationsV3 = collectionPublicationsV3;
  }

  
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  
  public boolean getHasCollection() {
    return hasCollection;
  }

  public void setHasCollection(boolean hasCollection) {
    this.hasCollection = hasCollection;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public PublicationOperation getOperation() {
    return operation;
  }

  public void setOperation(PublicationOperation operation) {
    this.operation = operation;
  }

  
  public ResourcePublicationConnection getProductPublicationsV3() {
    return productPublicationsV3;
  }

  public void setProductPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
    this.productPublicationsV3 = productPublicationsV3;
  }

  
  public ProductConnection getProducts() {
    return products;
  }

  public void setProducts(ProductConnection products) {
    this.products = products;
  }

  
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
    
    private App app;

    
    private boolean autoPublish;

    
    private Catalog catalog;

    
    private ResourcePublicationConnection collectionPublicationsV3;

    
    private CollectionConnection collections;

    
    private boolean hasCollection;

    
    private String id;

    
    private String name;

    
    private PublicationOperation operation;

    
    private ResourcePublicationConnection productPublicationsV3;

    
    private ProductConnection products;

    
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

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder autoPublish(boolean autoPublish) {
      this.autoPublish = autoPublish;
      return this;
    }

    
    public Builder catalog(Catalog catalog) {
      this.catalog = catalog;
      return this;
    }

    
    public Builder collectionPublicationsV3(
        ResourcePublicationConnection collectionPublicationsV3) {
      this.collectionPublicationsV3 = collectionPublicationsV3;
      return this;
    }

    
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }

    
    public Builder hasCollection(boolean hasCollection) {
      this.hasCollection = hasCollection;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder operation(PublicationOperation operation) {
      this.operation = operation;
      return this;
    }

    
    public Builder productPublicationsV3(ResourcePublicationConnection productPublicationsV3) {
      this.productPublicationsV3 = productPublicationsV3;
      return this;
    }

    
    public Builder products(ProductConnection products) {
      this.products = products;
      return this;
    }

    
    public Builder supportsFuturePublishing(boolean supportsFuturePublishing) {
      this.supportsFuturePublishing = supportsFuturePublishing;
      return this;
    }
  }
}
