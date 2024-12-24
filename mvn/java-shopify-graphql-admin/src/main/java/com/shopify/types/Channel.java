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
public class Channel implements com.shopify.types.Node {
  
  private App app;

  
  private ResourcePublicationConnection collectionPublicationsV3;

  
  private CollectionConnection collections;

  
  private String handle;

  
  private boolean hasCollection;

  
  private String id;

  
  private String name;

  
  private List<NavigationItem> navigationItems;

  
  private String overviewPath;

  
  private ProductPublicationConnection productPublications;

  
  private ResourcePublicationConnection productPublicationsV3;

  
  private ProductConnection products;

  
  private Count productsCount;

  
  private boolean supportsFuturePublishing;

  public Channel() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
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

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
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

  
  public List<NavigationItem> getNavigationItems() {
    return navigationItems;
  }

  public void setNavigationItems(List<NavigationItem> navigationItems) {
    this.navigationItems = navigationItems;
  }

  
  public String getOverviewPath() {
    return overviewPath;
  }

  public void setOverviewPath(String overviewPath) {
    this.overviewPath = overviewPath;
  }

  
  public ProductPublicationConnection getProductPublications() {
    return productPublications;
  }

  public void setProductPublications(ProductPublicationConnection productPublications) {
    this.productPublications = productPublications;
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

  
  public Count getProductsCount() {
    return productsCount;
  }

  public void setProductsCount(Count productsCount) {
    this.productsCount = productsCount;
  }

  
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
    
    private App app;

    
    private ResourcePublicationConnection collectionPublicationsV3;

    
    private CollectionConnection collections;

    
    private String handle;

    
    private boolean hasCollection;

    
    private String id;

    
    private String name;

    
    private List<NavigationItem> navigationItems;

    
    private String overviewPath;

    
    private ProductPublicationConnection productPublications;

    
    private ResourcePublicationConnection productPublicationsV3;

    
    private ProductConnection products;

    
    private Count productsCount;

    
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

    
    public Builder app(App app) {
      this.app = app;
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

    
    public Builder handle(String handle) {
      this.handle = handle;
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

    
    public Builder navigationItems(List<NavigationItem> navigationItems) {
      this.navigationItems = navigationItems;
      return this;
    }

    
    public Builder overviewPath(String overviewPath) {
      this.overviewPath = overviewPath;
      return this;
    }

    
    public Builder productPublications(ProductPublicationConnection productPublications) {
      this.productPublications = productPublications;
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

    
    public Builder productsCount(Count productsCount) {
      this.productsCount = productsCount;
      return this;
    }

    
    public Builder supportsFuturePublishing(boolean supportsFuturePublishing) {
      this.supportsFuturePublishing = supportsFuturePublishing;
      return this;
    }
  }
}
