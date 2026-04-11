package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents operations involving a collection.
 */
public class CollectionOperations {
  /**
   * Collection duplicate operations.
   */
  private List<CollectionDuplicateOperation> duplicate;

  public CollectionOperations() {
  }

  /**
   * Collection duplicate operations.
   */
  public List<CollectionDuplicateOperation> getDuplicate() {
    return duplicate;
  }

  public void setDuplicate(List<CollectionDuplicateOperation> duplicate) {
    this.duplicate = duplicate;
  }

  @Override
  public String toString() {
    return "CollectionOperations{duplicate='" + duplicate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionOperations that = (CollectionOperations) o;
    return Objects.equals(duplicate, that.duplicate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duplicate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Collection duplicate operations.
     */
    private List<CollectionDuplicateOperation> duplicate;

    public CollectionOperations build() {
      CollectionOperations result = new CollectionOperations();
      result.duplicate = this.duplicate;
      return result;
    }

    /**
     * Collection duplicate operations.
     */
    public Builder duplicate(List<CollectionDuplicateOperation> duplicate) {
      this.duplicate = duplicate;
      return this;
    }
  }
}
