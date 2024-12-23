package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to delete a metafield.
 */
public class MetafieldDeleteInput {
  /**
   * The ID of the metafield to delete.
   */
  private String id;

  public MetafieldDeleteInput() {
  }

  /**
   * The ID of the metafield to delete.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "MetafieldDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldDeleteInput that = (MetafieldDeleteInput) o;
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
     * The ID of the metafield to delete.
     */
    private String id;

    public MetafieldDeleteInput build() {
      MetafieldDeleteInput result = new MetafieldDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the metafield to delete.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
