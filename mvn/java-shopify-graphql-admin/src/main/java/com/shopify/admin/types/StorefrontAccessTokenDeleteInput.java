package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to delete a storefront access token.
 */
public class StorefrontAccessTokenDeleteInput {
  /**
   * The ID of the storefront access token to delete.
   */
  private String id;

  public StorefrontAccessTokenDeleteInput() {
  }

  /**
   * The ID of the storefront access token to delete.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "StorefrontAccessTokenDeleteInput{id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorefrontAccessTokenDeleteInput that = (StorefrontAccessTokenDeleteInput) o;
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
     * The ID of the storefront access token to delete.
     */
    private String id;

    public StorefrontAccessTokenDeleteInput build() {
      StorefrontAccessTokenDeleteInput result = new StorefrontAccessTokenDeleteInput();
      result.id = this.id;
      return result;
    }

    /**
     * The ID of the storefront access token to delete.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
