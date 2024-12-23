package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a storefront access token.
 */
public class StorefrontAccessTokenInput {
  /**
   * A title for the storefront access token.
   */
  private String title;

  public StorefrontAccessTokenInput() {
  }

  /**
   * A title for the storefront access token.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "StorefrontAccessTokenInput{title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorefrontAccessTokenInput that = (StorefrontAccessTokenInput) o;
    return Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A title for the storefront access token.
     */
    private String title;

    public StorefrontAccessTokenInput build() {
      StorefrontAccessTokenInput result = new StorefrontAccessTokenInput();
      result.title = this.title;
      return result;
    }

    /**
     * A title for the storefront access token.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
