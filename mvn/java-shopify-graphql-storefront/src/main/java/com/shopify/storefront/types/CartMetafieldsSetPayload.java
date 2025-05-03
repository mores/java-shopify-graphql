package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `cartMetafieldsSet` mutation.
 */
public class CartMetafieldsSetPayload {
  /**
   * The list of cart metafields that were set.
   */
  private List<Metafield> metafields;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MetafieldsSetUserError> userErrors;

  public CartMetafieldsSetPayload() {
  }

  /**
   * The list of cart metafields that were set.
   */
  public List<Metafield> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<Metafield> metafields) {
    this.metafields = metafields;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MetafieldsSetUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MetafieldsSetUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CartMetafieldsSetPayload{metafields='" + metafields + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartMetafieldsSetPayload that = (CartMetafieldsSetPayload) o;
    return Objects.equals(metafields, that.metafields) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metafields, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The list of cart metafields that were set.
     */
    private List<Metafield> metafields;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MetafieldsSetUserError> userErrors;

    public CartMetafieldsSetPayload build() {
      CartMetafieldsSetPayload result = new CartMetafieldsSetPayload();
      result.metafields = this.metafields;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The list of cart metafields that were set.
     */
    public Builder metafields(List<Metafield> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MetafieldsSetUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
