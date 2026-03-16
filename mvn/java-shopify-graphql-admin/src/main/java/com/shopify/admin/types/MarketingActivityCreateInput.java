package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a marketing activity. Marketing activity app
 * extensions are deprecated and will be removed in the near future.
 */
public class MarketingActivityCreateInput {
  /**
   * The ID of the marketing activity extension.
   */
  private String marketingActivityExtensionId;

  /**
   * The current state of the marketing activity.
   */
  private MarketingActivityStatus status;

  public MarketingActivityCreateInput() {
  }

  /**
   * The ID of the marketing activity extension.
   */
  public String getMarketingActivityExtensionId() {
    return marketingActivityExtensionId;
  }

  public void setMarketingActivityExtensionId(String marketingActivityExtensionId) {
    this.marketingActivityExtensionId = marketingActivityExtensionId;
  }

  /**
   * The current state of the marketing activity.
   */
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MarketingActivityCreateInput{marketingActivityExtensionId='" + marketingActivityExtensionId + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityCreateInput that = (MarketingActivityCreateInput) o;
    return Objects.equals(marketingActivityExtensionId, that.marketingActivityExtensionId) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivityExtensionId, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the marketing activity extension.
     */
    private String marketingActivityExtensionId;

    /**
     * The current state of the marketing activity.
     */
    private MarketingActivityStatus status;

    public MarketingActivityCreateInput build() {
      MarketingActivityCreateInput result = new MarketingActivityCreateInput();
      result.marketingActivityExtensionId = this.marketingActivityExtensionId;
      result.status = this.status;
      return result;
    }

    /**
     * The ID of the marketing activity extension.
     */
    public Builder marketingActivityExtensionId(String marketingActivityExtensionId) {
      this.marketingActivityExtensionId = marketingActivityExtensionId;
      return this;
    }

    /**
     * The current state of the marketing activity.
     */
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }
  }
}
