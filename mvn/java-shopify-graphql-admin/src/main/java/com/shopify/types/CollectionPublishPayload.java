package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `collectionPublish` mutation.
 */
public class CollectionPublishPayload {
  /**
   * The published collection.
   */
  private Collection collection;

  /**
   * The channels where the collection has been published.
   */
  private List<CollectionPublication> collectionPublications;

  /**
   * The shop associated with the collection.
   */
  private Shop shop;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public CollectionPublishPayload() {
  }

  /**
   * The published collection.
   */
  public Collection getCollection() {
    return collection;
  }

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  /**
   * The channels where the collection has been published.
   */
  public List<CollectionPublication> getCollectionPublications() {
    return collectionPublications;
  }

  public void setCollectionPublications(List<CollectionPublication> collectionPublications) {
    this.collectionPublications = collectionPublications;
  }

  /**
   * The shop associated with the collection.
   */
  public Shop getShop() {
    return shop;
  }

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
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
    /**
     * The published collection.
     */
    private Collection collection;

    /**
     * The channels where the collection has been published.
     */
    private List<CollectionPublication> collectionPublications;

    /**
     * The shop associated with the collection.
     */
    private Shop shop;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public CollectionPublishPayload build() {
      CollectionPublishPayload result = new CollectionPublishPayload();
      result.collection = this.collection;
      result.collectionPublications = this.collectionPublications;
      result.shop = this.shop;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The published collection.
     */
    public Builder collection(Collection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * The channels where the collection has been published.
     */
    public Builder collectionPublications(List<CollectionPublication> collectionPublications) {
      this.collectionPublications = collectionPublications;
      return this;
    }

    /**
     * The shop associated with the collection.
     */
    public Builder shop(Shop shop) {
      this.shop = shop;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
