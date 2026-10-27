package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for linking an existing shareable source to a collection.
 */
public class CollectionShareableSourceInput {
  /**
   * The ID of an existing shareable source to link to the collection.
   */
  private String sourceId;

  public CollectionShareableSourceInput() {
  }

  /**
   * The ID of an existing shareable source to link to the collection.
   */
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  @Override
  public String toString() {
    return "CollectionShareableSourceInput{sourceId='" + sourceId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionShareableSourceInput that = (CollectionShareableSourceInput) o;
    return Objects.equals(sourceId, that.sourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of an existing shareable source to link to the collection.
     */
    private String sourceId;

    public CollectionShareableSourceInput build() {
      CollectionShareableSourceInput result = new CollectionShareableSourceInput();
      result.sourceId = this.sourceId;
      return result;
    }

    /**
     * The ID of an existing shareable source to link to the collection.
     */
    public Builder sourceId(String sourceId) {
      this.sourceId = sourceId;
      return this;
    }
  }
}
