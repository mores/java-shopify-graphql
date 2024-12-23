package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceListFixedPricesUpdate` mutation.
 */
public class PriceListFixedPricesUpdatePayload {
  /**
   * A list of deleted variant IDs for prices.
   */
  private List<String> deletedFixedPriceVariantIds;

  /**
   * The price list for which the fixed prices were modified.
   */
  private PriceList priceList;

  /**
   * The prices that were added to the price list.
   */
  private List<PriceListPrice> pricesAdded;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceListPriceUserError> userErrors;

  public PriceListFixedPricesUpdatePayload() {
  }

  /**
   * A list of deleted variant IDs for prices.
   */
  public List<String> getDeletedFixedPriceVariantIds() {
    return deletedFixedPriceVariantIds;
  }

  public void setDeletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
    this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
  }

  /**
   * The price list for which the fixed prices were modified.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * The prices that were added to the price list.
   */
  public List<PriceListPrice> getPricesAdded() {
    return pricesAdded;
  }

  public void setPricesAdded(List<PriceListPrice> pricesAdded) {
    this.pricesAdded = pricesAdded;
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
    return "PriceListFixedPricesUpdatePayload{deletedFixedPriceVariantIds='" + deletedFixedPriceVariantIds + "', priceList='" + priceList + "', pricesAdded='" + pricesAdded + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesUpdatePayload that = (PriceListFixedPricesUpdatePayload) o;
    return Objects.equals(deletedFixedPriceVariantIds, that.deletedFixedPriceVariantIds) &&
        Objects.equals(priceList, that.priceList) &&
        Objects.equals(pricesAdded, that.pricesAdded) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedFixedPriceVariantIds, priceList, pricesAdded, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of deleted variant IDs for prices.
     */
    private List<String> deletedFixedPriceVariantIds;

    /**
     * The price list for which the fixed prices were modified.
     */
    private PriceList priceList;

    /**
     * The prices that were added to the price list.
     */
    private List<PriceListPrice> pricesAdded;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceListPriceUserError> userErrors;

    public PriceListFixedPricesUpdatePayload build() {
      PriceListFixedPricesUpdatePayload result = new PriceListFixedPricesUpdatePayload();
      result.deletedFixedPriceVariantIds = this.deletedFixedPriceVariantIds;
      result.priceList = this.priceList;
      result.pricesAdded = this.pricesAdded;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * A list of deleted variant IDs for prices.
     */
    public Builder deletedFixedPriceVariantIds(List<String> deletedFixedPriceVariantIds) {
      this.deletedFixedPriceVariantIds = deletedFixedPriceVariantIds;
      return this;
    }

    /**
     * The price list for which the fixed prices were modified.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * The prices that were added to the price list.
     */
    public Builder pricesAdded(List<PriceListPrice> pricesAdded) {
      this.pricesAdded = pricesAdded;
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
