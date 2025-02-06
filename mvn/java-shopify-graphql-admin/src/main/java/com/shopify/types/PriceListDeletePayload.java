package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `priceListDelete` mutation.
 */
public class PriceListDeletePayload {
  /**
   * The ID of the deleted price list.
   */
  private String deletedId;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<PriceListUserError> userErrors;

  public PriceListDeletePayload() {
  }

  /**
   * The ID of the deleted price list.
   */
  public String getDeletedId() {
    return deletedId;
  }

  public void setDeletedId(String deletedId) {
    this.deletedId = deletedId;
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
    return "PriceListDeletePayload{deletedId='" + deletedId + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PriceListDeletePayload that = (PriceListDeletePayload) o;
    return Objects.equals(deletedId, that.deletedId) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedId, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the deleted price list.
     */
    private String deletedId;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<PriceListUserError> userErrors;

    public PriceListDeletePayload build() {
      PriceListDeletePayload result = new PriceListDeletePayload();
      result.deletedId = this.deletedId;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the deleted price list.
     */
    public Builder deletedId(String deletedId) {
      this.deletedId = deletedId;
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
