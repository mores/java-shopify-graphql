package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for specifying the collection to unpublish and the sales channels to remove it from.
 */
public class CollectionUnpublishInput {
  /**
   * The collection to create or update publications for.
   */
  private String id;

  /**
   * The channels where the collection is published.
   */
  private List<CollectionPublicationInput> collectionPublications;

  public CollectionUnpublishInput() {
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
   * The channels where the collection is published.
   */
  public List<CollectionPublicationInput> getCollectionPublications() {
    return collectionPublications;
  }

  public void setCollectionPublications(List<CollectionPublicationInput> collectionPublications) {
    this.collectionPublications = collectionPublications;
  }

  @Override
  public String toString() {
    return "CollectionUnpublishInput{id='" + id + "', collectionPublications='" + collectionPublications + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionUnpublishInput that = (CollectionUnpublishInput) o;
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
     * The channels where the collection is published.
     */
    private List<CollectionPublicationInput> collectionPublications;

    public CollectionUnpublishInput build() {
      CollectionUnpublishInput result = new CollectionUnpublishInput();
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
     * The channels where the collection is published.
     */
    public Builder collectionPublications(List<CollectionPublicationInput> collectionPublications) {
      this.collectionPublications = collectionPublications;
      return this;
    }
  }
}
