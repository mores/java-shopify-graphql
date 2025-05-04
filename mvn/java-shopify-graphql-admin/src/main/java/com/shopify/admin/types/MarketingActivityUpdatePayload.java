package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingActivityUpdate` mutation.
 */
public class MarketingActivityUpdatePayload {
  /**
   * The updated marketing activity.
   */
  private MarketingActivity marketingActivity;

  /**
   * The redirect path from the embedded editor to the Shopify admin.
   */
  private String redirectPath;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public MarketingActivityUpdatePayload() {
  }

  /**
   * The updated marketing activity.
   */
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  /**
   * The redirect path from the embedded editor to the Shopify admin.
   */
  public String getRedirectPath() {
    return redirectPath;
  }

  public void setRedirectPath(String redirectPath) {
    this.redirectPath = redirectPath;
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
    return "MarketingActivityUpdatePayload{marketingActivity='" + marketingActivity + "', redirectPath='" + redirectPath + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdatePayload that = (MarketingActivityUpdatePayload) o;
    return Objects.equals(marketingActivity, that.marketingActivity) &&
        Objects.equals(redirectPath, that.redirectPath) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivity, redirectPath, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The updated marketing activity.
     */
    private MarketingActivity marketingActivity;

    /**
     * The redirect path from the embedded editor to the Shopify admin.
     */
    private String redirectPath;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public MarketingActivityUpdatePayload build() {
      MarketingActivityUpdatePayload result = new MarketingActivityUpdatePayload();
      result.marketingActivity = this.marketingActivity;
      result.redirectPath = this.redirectPath;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The updated marketing activity.
     */
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    /**
     * The redirect path from the embedded editor to the Shopify admin.
     */
    public Builder redirectPath(String redirectPath) {
      this.redirectPath = redirectPath;
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
