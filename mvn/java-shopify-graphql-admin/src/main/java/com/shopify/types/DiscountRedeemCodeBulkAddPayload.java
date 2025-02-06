package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `discountRedeemCodeBulkAdd` mutation.
 */
public class DiscountRedeemCodeBulkAddPayload {
  /**
   * The ID of the discount redeem code bulk creation operation. The properties and
   * status of the operation can be tracked using the
   * [`DiscountRedeemCodeBulkCreation` query](https://shopify.dev/api/admin-graphql/2022-04/queries/discountRedeemCodeBulkCreation).
   */
  private DiscountRedeemCodeBulkCreation bulkCreation;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<DiscountUserError> userErrors;

  public DiscountRedeemCodeBulkAddPayload() {
  }

  /**
   * The ID of the discount redeem code bulk creation operation. The properties and
   * status of the operation can be tracked using the
   * [`DiscountRedeemCodeBulkCreation` query](https://shopify.dev/api/admin-graphql/2022-04/queries/discountRedeemCodeBulkCreation).
   */
  public DiscountRedeemCodeBulkCreation getBulkCreation() {
    return bulkCreation;
  }

  public void setBulkCreation(DiscountRedeemCodeBulkCreation bulkCreation) {
    this.bulkCreation = bulkCreation;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<DiscountUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<DiscountUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DiscountRedeemCodeBulkAddPayload{bulkCreation='" + bulkCreation + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountRedeemCodeBulkAddPayload that = (DiscountRedeemCodeBulkAddPayload) o;
    return Objects.equals(bulkCreation, that.bulkCreation) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkCreation, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the discount redeem code bulk creation operation. The properties and
     * status of the operation can be tracked using the
     * [`DiscountRedeemCodeBulkCreation` query](https://shopify.dev/api/admin-graphql/2022-04/queries/discountRedeemCodeBulkCreation).
     */
    private DiscountRedeemCodeBulkCreation bulkCreation;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<DiscountUserError> userErrors;

    public DiscountRedeemCodeBulkAddPayload build() {
      DiscountRedeemCodeBulkAddPayload result = new DiscountRedeemCodeBulkAddPayload();
      result.bulkCreation = this.bulkCreation;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The ID of the discount redeem code bulk creation operation. The properties and
     * status of the operation can be tracked using the
     * [`DiscountRedeemCodeBulkCreation` query](https://shopify.dev/api/admin-graphql/2022-04/queries/discountRedeemCodeBulkCreation).
     */
    public Builder bulkCreation(DiscountRedeemCodeBulkCreation bulkCreation) {
      this.bulkCreation = bulkCreation;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<DiscountUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
