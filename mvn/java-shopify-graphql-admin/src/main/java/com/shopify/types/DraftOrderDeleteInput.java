package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to specify the draft order to delete by its ID.
 */
public class DraftOrderDeleteInput {
  /**
   * The ID of the draft order to delete.
   */
  private String id;

  public DraftOrderDeleteInput() {
  }

  /**
   * The ID of the draft order to delete.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "DraftOrderDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderDeleteInput that = (DraftOrderDeleteInput) o;
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
     * The ID of the draft order to delete.
     */
    private String id;

    public DraftOrderDeleteInput build() {
      DraftOrderDeleteInput result = new DraftOrderDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the draft order to delete.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
