package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceListFixedPricesDelete` mutation.
 */
public class PriceListFixedPricesDeletePayload {
  /**
   * A list of product variant IDs whose fixed prices were removed from the price list.
   */
  private List<String> deletedFixedPriceVariantIds;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceListPriceUserError> userErrors;

  public PriceListFixedPricesDeletePayload() {
  }

  /**
   * A list of product variant IDs whose fixed prices were removed from the price list.
   */
  public List<String> getDeletedFixedPriceVariantIds() {
    return deletedFixedPriceVariantIds;
  }

  public void setDeletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
    this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PriceListPriceUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListPriceUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesDeletePayload{deletedFixedPriceVariantIds='" + deletedFixedPriceVariantIds + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesDeletePayload that = (PriceListFixedPricesDeletePayload) o;
    return Objects.equals(deletedFixedPriceVariantIds, that.deletedFixedPriceVariantIds) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFixedPriceVariantIds, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of product variant IDs whose fixed prices were removed from the price list.
     */
    private List<String> deletedFixedPriceVariantIds;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceListPriceUserError> userErrors;

    public PriceListFixedPricesDeletePayload build() {
      PriceListFixedPricesDeletePayload result = new PriceListFixedPricesDeletePayload();
      result.deletedFixedPriceVariantIds = this.deletedFixedPriceVariantIds;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of product variant IDs whose fixed prices were removed from the price list.
     */
    public Builder deletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
      this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PriceListPriceUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
