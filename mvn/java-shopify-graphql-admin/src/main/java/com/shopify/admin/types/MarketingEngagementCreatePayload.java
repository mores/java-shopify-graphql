package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `marketingEngagementCreate` mutation.
 */
public class MarketingEngagementCreatePayload {
  /**
   * The marketing engagement that was created. This represents customer activity
   * taken on a marketing activity or a marketing channel.
   */
  private MarketingEngagement marketingEngagement;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<MarketingActivityUserError> userErrors;

  public MarketingEngagementCreatePayload() {
  }

  /**
   * The marketing engagement that was created. This represents customer activity
   * taken on a marketing activity or a marketing channel.
   */
  public MarketingEngagement getMarketingEngagement() {
    return marketingEngagement;
  }

  public void setMarketingEngagement(MarketingEngagement marketingEngagement) {
    this.marketingEngagement = marketingEngagement;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<MarketingActivityUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<MarketingActivityUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "MarketingEngagementCreatePayload{marketingEngagement='" + marketingEngagement + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEngagementCreatePayload that = (MarketingEngagementCreatePayload) o;
    return Objects.equals(marketingEngagement, that.marketingEngagement) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingEngagement, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The marketing engagement that was created. This represents customer activity
     * taken on a marketing activity or a marketing channel.
     */
    private MarketingEngagement marketingEngagement;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<MarketingActivityUserError> userErrors;

    public MarketingEngagementCreatePayload build() {
      MarketingEngagementCreatePayload result = new MarketingEngagementCreatePayload();
      result.marketingEngagement = this.marketingEngagement;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The marketing engagement that was created. This represents customer activity
     * taken on a marketing activity or a marketing channel.
     */
    public Builder marketingEngagement(MarketingEngagement marketingEngagement) {
      this.marketingEngagement = marketingEngagement;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<MarketingActivityUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
