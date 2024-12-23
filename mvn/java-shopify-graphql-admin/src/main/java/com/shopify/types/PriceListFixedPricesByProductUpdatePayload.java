package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceListFixedPricesByProductUpdate` mutation.
 */
public class PriceListFixedPricesByProductUpdatePayload {
  /**
   * The price list for which the fixed prices were modified.
   */
  private PriceList priceList;

  /**
   * The product for which the fixed prices were added.
   */
  private List<Product> pricesToAddProducts;

  /**
   * The product for which the fixed prices were deleted.
   */
  private List<Product> pricesToDeleteProducts;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors;

  public PriceListFixedPricesByProductUpdatePayload() {
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
   * The product for which the fixed prices were added.
   */
  public List<Product> getPricesToAddProducts() {
    return pricesToAddProducts;
  }

  public void setPricesToAddProducts(List<Product> pricesToAddProducts) {
    this.pricesToAddProducts = pricesToAddProducts;
  }

  /**
   * The product for which the fixed prices were deleted.
   */
  public List<Product> getPricesToDeleteProducts() {
    return pricesToDeleteProducts;
  }

  public void setPricesToDeleteProducts(List<Product> pricesToDeleteProducts) {
    this.pricesToDeleteProducts = pricesToDeleteProducts;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PriceListFixedPricesByProductBulkUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListFixedPricesByProductUpdatePayload{priceList='" + priceList + "', pricesToAddProducts='" + pricesToAddProducts + "', pricesToDeleteProducts='" + pricesToDeleteProducts + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListFixedPricesByProductUpdatePayload that = (PriceListFixedPricesByProductUpdatePayload) o;
    return Objects.equals(priceList, that.priceList) &&
        Objects.equals(pricesToAddProducts, that.pricesToAddProducts) &&
        Objects.equals(pricesToDeleteProducts, that.pricesToDeleteProducts) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceList, pricesToAddProducts, pricesToDeleteProducts, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The price list for which the fixed prices were modified.
     */
    private PriceList priceList;

    /**
     * The product for which the fixed prices were added.
     */
    private List<Product> pricesToAddProducts;

    /**
     * The product for which the fixed prices were deleted.
     */
    private List<Product> pricesToDeleteProducts;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors;

    public PriceListFixedPricesByProductUpdatePayload build() {
      PriceListFixedPricesByProductUpdatePayload result = new PriceListFixedPricesByProductUpdatePayload();
      result.priceList = this.priceList;
      result.pricesToAddProducts = this.pricesToAddProducts;
      result.pricesToDeleteProducts = this.pricesToDeleteProducts;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The price list for which the fixed prices were modified.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * The product for which the fixed prices were added.
     */
    public Builder pricesToAddProducts(List<Product> pricesToAddProducts) {
      this.pricesToAddProducts = pricesToAddProducts;
      return this;
    }

    /**
     * The product for which the fixed prices were deleted.
     */
    public Builder pricesToDeleteProducts(List<Product> pricesToDeleteProducts) {
      this.pricesToDeleteProducts = pricesToDeleteProducts;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PriceListFixedPricesByProductBulkUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
