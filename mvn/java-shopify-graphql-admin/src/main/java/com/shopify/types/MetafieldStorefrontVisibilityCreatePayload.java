package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `metafieldStorefrontVisibilityCreate` mutation.
 */
public class MetafieldStorefrontVisibilityCreatePayload {
  /**
   * The `MetafieldStorefrontVisibility` that was created.
   */
  private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public MetafieldStorefrontVisibilityCreatePayload() {
  }

  /**
   * The `MetafieldStorefrontVisibility` that was created.
   */
  public MetafieldStorefrontVisibility getMetafieldStorefrontVisibility() {
    return metafieldStorefrontVisibility;
  }

  public void setMetafieldStorefrontVisibility(
      MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
    this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MetafieldStorefrontVisibilityCreatePayload{metafieldStorefrontVisibility='" + metafieldStorefrontVisibility + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MetafieldStorefrontVisibilityCreatePayload that = (MetafieldStorefrontVisibilityCreatePayload) o;
    return Objects.equals(metafieldStorefrontVisibility, that.metafieldStorefrontVisibility) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metafieldStorefrontVisibility, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The `MetafieldStorefrontVisibility` that was created.
     */
    private MetafieldStorefrontVisibility metafieldStorefrontVisibility;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public MetafieldStorefrontVisibilityCreatePayload build() {
      MetafieldStorefrontVisibilityCreatePayload result = new MetafieldStorefrontVisibilityCreatePayload();
      result.metafieldStorefrontVisibility = this.metafieldStorefrontVisibility;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The `MetafieldStorefrontVisibility` that was created.
     */
    public Builder metafieldStorefrontVisibility(
        MetafieldStorefrontVisibility metafieldStorefrontVisibility) {
      this.metafieldStorefrontVisibility = metafieldStorefrontVisibility;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
