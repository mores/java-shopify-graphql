package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionPublishPayload {
  
  private Collection collection;

  
  private List<CollectionPublication> collectionPublications;

  
  private Shop shop;

  
  private List<UserError> userErrors;

  public CollectionPublishPayload() {
  }

  
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  
  public List<CollectionPublication> getCollectionPublications() {
    return collectionPublications;
  }

  public void setCollectionPublications(List<CollectionPublication> collectionPublications) {
    this.collectionPublications = collectionPublications;
  }

  
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CollectionPublishPayload{collection='" + collection + "', collectionPublications='" + collectionPublications + "', shop='" + shop + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionPublishPayload that = (CollectionPublishPayload) o;
    return Objects.equals(collection, that.collection) &&
        Objects.equals(collectionPublications, that.collectionPublications) &&
        Objects.equals(shop, that.shop) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collection, collectionPublications, shop, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Collection collection;

    
    private List<CollectionPublication> collectionPublications;

    
    private Shop shop;

    
    private List<UserError> userErrors;

    public CollectionPublishPayload build() {
      CollectionPublishPayload result = new CollectionPublishPayload();
      result.collection = this.collection;
      result.collectionPublications = this.collectionPublications;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    
    public Builder collectionPublications(List<CollectionPublication> collectionPublications) {
      this.collectionPublications = collectionPublications;
      return this;
    }

    
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
