package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionUnpublishInput {
  
  private String id;

  
  private List<CollectionPublicationInput> collectionPublications;

  public CollectionUnpublishInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
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
    
    private String id;

    
    private List<CollectionPublicationInput> collectionPublications;

    public CollectionUnpublishInput build() {
      CollectionUnpublishInput result = new CollectionUnpublishInput();
      result.id = this.id;
      result.collectionPublications = this.collectionPublications;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder collectionPublications(List<CollectionPublicationInput> collectionPublications) {
      this.collectionPublications = collectionPublications;
      return this;
    }
  }
}
