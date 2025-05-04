package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for publications to which a collection will be published.
 */
public class CollectionPublicationInput {
  /**
   * The ID of the publication.
   */
  private String publicationId;

  public CollectionPublicationInput() {
  }

  /**
   * The ID of the publication.
   */
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  @Override
  public String toString() {
    return "CollectionPublicationInput{publicationId='" + publicationId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionPublicationInput that = (CollectionPublicationInput) o;
    return Objects.equals(publicationId, that.publicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publicationId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the publication.
     */
    private String publicationId;

    public CollectionPublicationInput build() {
      CollectionPublicationInput result = new CollectionPublicationInput();
      result.publicationId = this.publicationId;
      return result;
    }

    /**
     * The ID of the publication.
     */
    public Builder publicationId(String publicationId) {
      this.publicationId = publicationId;
      return this;
    }
  }
}
