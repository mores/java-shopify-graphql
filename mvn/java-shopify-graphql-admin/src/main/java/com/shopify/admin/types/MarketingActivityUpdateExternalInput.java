package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields required to update an externally managed marketing activity.
 */
public class MarketingActivityUpdateExternalInput {
  /**
   * The title of the marketing activity.
   */
  private String title;

  /**
   * The budget for this marketing activity.
   */
  private MarketingActivityBudgetInput budget;

  /**
   * The amount spent on the marketing activity.
   */
  private MoneyInput adSpend;

  /**
   * The URL for viewing and/or managing the activity outside of Shopify.
   */
  private String remoteUrl;

  /**
   * The URL for a preview image that's used for the marketing activity.
   */
  private String remotePreviewImageUrl;

  /**
   * The method of marketing used for this marketing activity. The marketing tactic
   * determines which default fields are included in the marketing activity.
   */
  private MarketingTactic tactic;

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  private MarketingChannel marketingChannelType;

  /**
   * The domain from which ad clicks are forwarded to the shop.
   */
  private String referringDomain;

  /**
   * The date and time at which the activity is scheduled to start.
   */
  private OffsetDateTime scheduledStart;

  /**
   * The date and time at which the activity is scheduled to end.
   */
  private OffsetDateTime scheduledEnd;

  /**
   * The date and time at which the activity started.
   */
  private OffsetDateTime start;

  /**
   * The date and time at which the activity ended.
   */
  private OffsetDateTime end;

  /**
   * The status of the marketing activity.
   */
  private MarketingActivityExternalStatus status;

  public MarketingActivityUpdateExternalInput() {
  }

  /**
   * The title of the marketing activity.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The budget for this marketing activity.
   */
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  /**
   * The amount spent on the marketing activity.
   */
  public MoneyInput getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyInput adSpend) {
    this.adSpend = adSpend;
  }

  /**
   * The URL for viewing and/or managing the activity outside of Shopify.
   */
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  /**
   * The URL for a preview image that's used for the marketing activity.
   */
  public String getRemotePreviewImageUrl() {
    return remotePreviewImageUrl;
  }

  public void setRemotePreviewImageUrl(String remotePreviewImageUrl) {
    this.remotePreviewImageUrl = remotePreviewImageUrl;
  }

  /**
   * The method of marketing used for this marketing activity. The marketing tactic
   * determines which default fields are included in the marketing activity.
   */
  public MarketingTactic getTactic() {
    return tactic;
  }

  public void setTactic(MarketingTactic tactic) {
    this.tactic = tactic;
  }

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  public MarketingChannel getMarketingChannelType() {
    return marketingChannelType;
  }

  public void setMarketingChannelType(MarketingChannel marketingChannelType) {
    this.marketingChannelType = marketingChannelType;
  }

  /**
   * The domain from which ad clicks are forwarded to the shop.
   */
  public String getReferringDomain() {
    return referringDomain;
  }

  public void setReferringDomain(String referringDomain) {
    this.referringDomain = referringDomain;
  }

  /**
   * The date and time at which the activity is scheduled to start.
   */
  public OffsetDateTime getScheduledStart() {
    return scheduledStart;
  }

  public void setScheduledStart(OffsetDateTime scheduledStart) {
    this.scheduledStart = scheduledStart;
  }

  /**
   * The date and time at which the activity is scheduled to end.
   */
  public OffsetDateTime getScheduledEnd() {
    return scheduledEnd;
  }

  public void setScheduledEnd(OffsetDateTime scheduledEnd) {
    this.scheduledEnd = scheduledEnd;
  }

  /**
   * The date and time at which the activity started.
   */
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /**
   * The date and time at which the activity ended.
   */
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  /**
   * The status of the marketing activity.
   */
  public MarketingActivityExternalStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityExternalStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateExternalInput{title='" + title + "', budget='" + budget + "', adSpend='" + adSpend + "', remoteUrl='" + remoteUrl + "', remotePreviewImageUrl='" + remotePreviewImageUrl + "', tactic='" + tactic + "', marketingChannelType='" + marketingChannelType + "', referringDomain='" + referringDomain + "', scheduledStart='" + scheduledStart + "', scheduledEnd='" + scheduledEnd + "', start='" + start + "', end='" + end + "', status='" + status + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateExternalInput that = (MarketingActivityUpdateExternalInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(budget, that.budget) &&
        Objects.equals(adSpend, that.adSpend) &&
        Objects.equals(remoteUrl, that.remoteUrl) &&
        Objects.equals(remotePreviewImageUrl, that.remotePreviewImageUrl) &&
        Objects.equals(tactic, that.tactic) &&
        Objects.equals(marketingChannelType, that.marketingChannelType) &&
        Objects.equals(referringDomain, that.referringDomain) &&
        Objects.equals(scheduledStart, that.scheduledStart) &&
        Objects.equals(scheduledEnd, that.scheduledEnd) &&
        Objects.equals(start, that.start) &&
        Objects.equals(end, that.end) &&
        Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, budget, adSpend, remoteUrl, remotePreviewImageUrl, tactic, marketingChannelType, referringDomain, scheduledStart, scheduledEnd, start, end, status);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the marketing activity.
     */
    private String title;

    /**
     * The budget for this marketing activity.
     */
    private MarketingActivityBudgetInput budget;

    /**
     * The amount spent on the marketing activity.
     */
    private MoneyInput adSpend;

    /**
     * The URL for viewing and/or managing the activity outside of Shopify.
     */
    private String remoteUrl;

    /**
     * The URL for a preview image that's used for the marketing activity.
     */
    private String remotePreviewImageUrl;

    /**
     * The method of marketing used for this marketing activity. The marketing tactic
     * determines which default fields are included in the marketing activity.
     */
    private MarketingTactic tactic;

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    private MarketingChannel marketingChannelType;

    /**
     * The domain from which ad clicks are forwarded to the shop.
     */
    private String referringDomain;

    /**
     * The date and time at which the activity is scheduled to start.
     */
    private OffsetDateTime scheduledStart;

    /**
     * The date and time at which the activity is scheduled to end.
     */
    private OffsetDateTime scheduledEnd;

    /**
     * The date and time at which the activity started.
     */
    private OffsetDateTime start;

    /**
     * The date and time at which the activity ended.
     */
    private OffsetDateTime end;

    /**
     * The status of the marketing activity.
     */
    private MarketingActivityExternalStatus status;

    public MarketingActivityUpdateExternalInput build() {
      MarketingActivityUpdateExternalInput result = new MarketingActivityUpdateExternalInput();
      result.title = this.title;
      result.budget = this.budget;
      result.adSpend = this.adSpend;
      result.remoteUrl = this.remoteUrl;
      result.remotePreviewImageUrl = this.remotePreviewImageUrl;
      result.tactic = this.tactic;
      result.marketingChannelType = this.marketingChannelType;
      result.referringDomain = this.referringDomain;
      result.scheduledStart = this.scheduledStart;
      result.scheduledEnd = this.scheduledEnd;
      result.start = this.start;
      result.end = this.end;
      result.status = this.status;
      return result;
    }

    /**
     * The title of the marketing activity.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The budget for this marketing activity.
     */
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }

    /**
     * The amount spent on the marketing activity.
     */
    public Builder adSpend(MoneyInput adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    /**
     * The URL for viewing and/or managing the activity outside of Shopify.
     */
    public Builder remoteUrl(String remoteUrl) {
      this.remoteUrl = remoteUrl;
      return this;
    }

    /**
     * The URL for a preview image that's used for the marketing activity.
     */
    public Builder remotePreviewImageUrl(String remotePreviewImageUrl) {
      this.remotePreviewImageUrl = remotePreviewImageUrl;
      return this;
    }

    /**
     * The method of marketing used for this marketing activity. The marketing tactic
     * determines which default fields are included in the marketing activity.
     */
    public Builder tactic(MarketingTactic tactic) {
      this.tactic = tactic;
      return this;
    }

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    public Builder marketingChannelType(MarketingChannel marketingChannelType) {
      this.marketingChannelType = marketingChannelType;
      return this;
    }

    /**
     * The domain from which ad clicks are forwarded to the shop.
     */
    public Builder referringDomain(String referringDomain) {
      this.referringDomain = referringDomain;
      return this;
    }

    /**
     * The date and time at which the activity is scheduled to start.
     */
    public Builder scheduledStart(OffsetDateTime scheduledStart) {
      this.scheduledStart = scheduledStart;
      return this;
    }

    /**
     * The date and time at which the activity is scheduled to end.
     */
    public Builder scheduledEnd(OffsetDateTime scheduledEnd) {
      this.scheduledEnd = scheduledEnd;
      return this;
    }

    /**
     * The date and time at which the activity started.
     */
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }

    /**
     * The date and time at which the activity ended.
     */
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }

    /**
     * The status of the marketing activity.
     */
    public Builder status(MarketingActivityExternalStatus status) {
      this.status = status;
      return this;
    }
  }
}
