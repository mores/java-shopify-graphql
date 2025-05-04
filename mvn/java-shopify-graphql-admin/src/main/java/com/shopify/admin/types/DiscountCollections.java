package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A list of collections that the discount can have as a prerequisite or a list of
 * collections to which the discount can be applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCollections implements DiscountItems {
  /**
   * The list of collections that the discount can have as a prerequisite or the
   * list of collections to which the discount can be applied.
   */
  private CollectionConnection collections;

  public DiscountCollections() {
  }

  /**
   * The list of collections that the discount can have as a prerequisite or the
   * list of collections to which the discount can be applied.
   */
  public CollectionConnection getCollections() {
    return collections;
  }

  public void setCollections(CollectionConnection collections) {
    this.collections = collections;
  }

  @Override
  public String toString() {
    return "DiscountCollections{collections='" + collections + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCollections that = (DiscountCollections) o;
    return Objects.equals(collections, that.collections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collections);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of collections that the discount can have as a prerequisite or the
     * list of collections to which the discount can be applied.
     */
    private CollectionConnection collections;

    public DiscountCollections build() {
      DiscountCollections result = new DiscountCollections();
      result.collections = this.collections;
      return result;
    }

    /**
     * The list of collections that the discount can have as a prerequisite or the
     * list of collections to which the discount can be applied.
     */
    public Builder collections(CollectionConnection collections) {
      this.collections = collections;
      return this;
    }
  }
}
