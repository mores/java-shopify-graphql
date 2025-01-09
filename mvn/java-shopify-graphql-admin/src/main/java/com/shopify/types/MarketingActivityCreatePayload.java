package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingActivityCreate` mutation.
 */
public class MarketingActivityCreatePayload {
  /**
   * The created marketing activity.
   */
  private MarketingActivity marketingActivity;

  /**
   * The path to return back to shopify admin from embedded editor.
   */
  private String redirectPath;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<UserError> userErrors;

  public MarketingActivityCreatePayload() {
  }

  /**
   * The created marketing activity.
   */
  public MarketingActivity getMarketingActivity() {
    return marketingActivity;
  }

  public void setMarketingActivity(MarketingActivity marketingActivity) {
    this.marketingActivity = marketingActivity;
  }

  /**
   * The path to return back to shopify admin from embedded editor.
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
    return "MarketingActivityCreatePayload{marketingActivity='" + marketingActivity + "', redirectPath='" + redirectPath + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityCreatePayload that = (MarketingActivityCreatePayload) o;
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
     * The created marketing activity.
     */
    private MarketingActivity marketingActivity;

    /**
     * The path to return back to shopify admin from embedded editor.
     */
    private String redirectPath;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<UserError> userErrors;

    public MarketingActivityCreatePayload build() {
      MarketingActivityCreatePayload result = new MarketingActivityCreatePayload();
      result.marketingActivity = this.marketingActivity;
      result.redirectPath = this.redirectPath;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The created marketing activity.
     */
    public Builder marketingActivity(MarketingActivity marketingActivity) {
      this.marketingActivity = marketingActivity;
      return this;
    }

    /**
     * The path to return back to shopify admin from embedded editor.
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
