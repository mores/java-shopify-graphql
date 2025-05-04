package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `checkoutBrandingUpsert` mutation.
 */
public class CheckoutBrandingUpsertPayload {
  /**
   * Returns the new checkout branding settings.
   */
  private CheckoutBranding checkoutBranding;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<CheckoutBrandingUpsertUserError> userErrors;

  public CheckoutBrandingUpsertPayload() {
  }

  /**
   * Returns the new checkout branding settings.
   */
  public CheckoutBranding getCheckoutBranding() {
    return checkoutBranding;
  }

  public void setCheckoutBranding(CheckoutBranding checkoutBranding) {
    this.checkoutBranding = checkoutBranding;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<CheckoutBrandingUpsertUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<CheckoutBrandingUpsertUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingUpsertPayload{checkoutBranding='" + checkoutBranding + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingUpsertPayload that = (CheckoutBrandingUpsertPayload) o;
    return Objects.equals(checkoutBranding, that.checkoutBranding) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutBranding, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Returns the new checkout branding settings.
     */
    private CheckoutBranding checkoutBranding;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<CheckoutBrandingUpsertUserError> userErrors;

    public CheckoutBrandingUpsertPayload build() {
      CheckoutBrandingUpsertPayload result = new CheckoutBrandingUpsertPayload();
      result.checkoutBranding = this.checkoutBranding;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * Returns the new checkout branding settings.
     */
    public Builder checkoutBranding(CheckoutBranding checkoutBranding) {
      this.checkoutBranding = checkoutBranding;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<CheckoutBrandingUpsertUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
