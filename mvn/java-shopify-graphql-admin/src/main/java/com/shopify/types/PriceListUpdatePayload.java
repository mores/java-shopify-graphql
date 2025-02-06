package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceListUpdate` mutation.
 */
public class PriceListUpdatePayload {
  /**
   * The updated price list.
   */
  private PriceList priceList;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceListUserError> userErrors;

  public PriceListUpdatePayload() {
  }

  /**
   * The updated price list.
   */
  public PriceList getPriceList() {
    return priceList;
  }

  public void setPriceList(PriceList priceList) {
    this.priceList = priceList;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<PriceListUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<PriceListUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "PriceListUpdatePayload{priceList='" + priceList + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListUpdatePayload that = (PriceListUpdatePayload) o;
    return Objects.equals(priceList, that.priceList) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceList, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated price list.
     */
    private PriceList priceList;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceListUserError> userErrors;

    public PriceListUpdatePayload build() {
      PriceListUpdatePayload result = new PriceListUpdatePayload();
      result.priceList = this.priceList;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated price list.
     */
    public Builder priceList(PriceList priceList) {
      this.priceList = priceList;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<PriceListUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
