package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `shopifyPaymentsPayoutAlternateCurrencyCreate` mutation.
 */
public class ShopifyPaymentsPayoutAlternateCurrencyCreatePayload {
  /**
   * The resulting alternate currency payout created.
   */
  private ShopifyPaymentsToolingProviderPayout payout;

  /**
   * Whether the alternate currency payout was created successfully.
   */
  private Boolean success;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> userErrors;

  public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload() {
  }

  /**
   * The resulting alternate currency payout created.
   */
  public ShopifyPaymentsToolingProviderPayout getPayout() {
    return payout;
  }

  public void setPayout(ShopifyPaymentsToolingProviderPayout payout) {
    this.payout = payout;
  }

  /**
   * Whether the alternate currency payout was created successfully.
   */
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(
      List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsPayoutAlternateCurrencyCreatePayload{payout='" + payout + "', success='" + success + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsPayoutAlternateCurrencyCreatePayload that = (ShopifyPaymentsPayoutAlternateCurrencyCreatePayload) o;
    return Objects.equals(payout, that.payout) &&
        Objects.equals(success, that.success) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payout, success, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The resulting alternate currency payout created.
     */
    private ShopifyPaymentsToolingProviderPayout payout;

    /**
     * Whether the alternate currency payout was created successfully.
     */
    private Boolean success;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> userErrors;

    public ShopifyPaymentsPayoutAlternateCurrencyCreatePayload build() {
      ShopifyPaymentsPayoutAlternateCurrencyCreatePayload result = new ShopifyPaymentsPayoutAlternateCurrencyCreatePayload();
      result.payout = this.payout;
      result.success = this.success;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The resulting alternate currency payout created.
     */
    public Builder payout(ShopifyPaymentsToolingProviderPayout payout) {
      this.payout = payout;
      return this;
    }

    /**
     * Whether the alternate currency payout was created successfully.
     */
    public Builder success(Boolean success) {
      this.success = success;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(
        List<ShopifyPaymentsPayoutAlternateCurrencyCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
