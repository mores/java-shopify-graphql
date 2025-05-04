package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying a collection to publish and the sales channels to publish it to.
 */
public class CollectionPublishInput {
  /**
   * The collection to create or update publications for.
   */
  private String id;

  /**
   * The channels where the collection will be published.
   */
  private List<CollectionPublicationInput> collectionPublications;

  public CollectionPublishInput() {
  }

  /**
   * The collection to create or update publications for.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The channels where the collection will be published.
   */
  public List<CollectionPublicationInput> getCollectionPublications() {
    return collectionPublications;
  }

  public void setCollectionPublications(List<CollectionPublicationInput> collectionPublications) {
    this.collectionPublications = collectionPublications;
  }

  @Override
  public String toString() {
    return "CollectionPublishInput{id='" + id + "', collectionPublications='" + collectionPublications + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionPublishInput that = (CollectionPublishInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(collectionPublications, that.collectionPublications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, collectionPublications);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The collection to create or update publications for.
     */
    private String id;

    /**
     * The channels where the collection will be published.
     */
    private List<CollectionPublicationInput> collectionPublications;

    public CollectionPublishInput build() {
      CollectionPublishInput result = new CollectionPublishInput();
      result.id = this.id;
      result.collectionPublications = this.collectionPublications;
      return result;
    }

    /**
     * The collection to create or update publications for.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The channels where the collection will be published.
     */
    public Builder collectionPublications(List<CollectionPublicationInput> collectionPublications) {
      this.collectionPublications = collectionPublications;
      return this;
    }
  }
}
