package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for specifying the collection to delete.
 */
public class CollectionDeleteInput {
  /**
   * The ID of the collection to be deleted.
   */
  private String id;

  public CollectionDeleteInput() {
  }

  /**
   * The ID of the collection to be deleted.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "CollectionDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionDeleteInput that = (CollectionDeleteInput) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the collection to be deleted.
     */
    private String id;

    public CollectionDeleteInput build() {
      CollectionDeleteInput result = new CollectionDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the collection to be deleted.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
