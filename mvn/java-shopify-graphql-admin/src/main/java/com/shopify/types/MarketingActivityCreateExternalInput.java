package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The input fields for creating an externally-managed marketing activity.
 */
public class MarketingActivityCreateExternalInput {
  /**
   * The title of the marketing activity.
   */
  private String title;

  /**
   * Specifies the [Urchin Traffic Module (UTM)
   * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are associated
   * with a related marketing campaign. Either the URL parameter value or UTM can
   * be set, but not both.
   */
  private UTMInput utm;

  /**
   * Value for a query parameter that gets inserted into storefront URLs for
   * matching storefront traffic to this activity. This feature is currently
   * available on a limited basis to some partners only. UTMs should continue to be
   * used for most partners. Both the URL parameter value and UTM parameters can be set.
   */
  private String urlParameterValue;

  /**
   * The budget for this marketing activity.
   */
  private MarketingActivityBudgetInput budget;

  /**
   * The amount spent on the marketing activity.
   */
  private MoneyInput adSpend;

  /**
   * The ID of an activity that's hosted outside of Shopify.
   */
  private String remoteId;

  /**
   * The status of the marketing activity. If status isn't set it will default to UNDEFINED.
   */
  private MarketingActivityExternalStatus status;

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
   * The unique string identifier of the channel to which this activity belongs.
   * For the correct handle for your channel, contact your partner manager.
   */
  private String channelHandle;

  /**
   * The date and time at which the activity is scheduled to start.
   */
  private OffsetDateTime scheduledStart;

  /**
   * The date and time at which the activity is scheduled to end.
   */
  private OffsetDateTime scheduledEnd;

  /**
   * The date and time at which the activity started. If omitted or set to `null`, the current time will be used.
   */
  private OffsetDateTime start;

  /**
   * The date and time at which the activity ended. If omitted or set to `null`,
   * the current time will be used if the status is set to `INACTIVE` or
   * `DELETED_EXTERNALLY`.
   */
  private OffsetDateTime end;

  /**
   * The ID for the parent marketing activity, if creating hierarchical activities.
   */
  private String parentActivityId;

  /**
   * The remote ID for the parent marketing activity, if creating hierarchical activities.
   */
  private String parentRemoteId;

  /**
   * The hierarchy level of the activity within a campaign. The hierarchy level can't be updated.
   */
  private MarketingActivityHierarchyLevel hierarchyLevel;

  public MarketingActivityCreateExternalInput() {
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
   * Specifies the [Urchin Traffic Module (UTM)
   * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are associated
   * with a related marketing campaign. Either the URL parameter value or UTM can
   * be set, but not both.
   */
  public UTMInput getUtm() {
    return utm;
  }

  public void setUtm(UTMInput utm) {
    this.utm = utm;
  }

  /**
   * Value for a query parameter that gets inserted into storefront URLs for
   * matching storefront traffic to this activity. This feature is currently
   * available on a limited basis to some partners only. UTMs should continue to be
   * used for most partners. Both the URL parameter value and UTM parameters can be set.
   */
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
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
   * The ID of an activity that's hosted outside of Shopify.
   */
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  /**
   * The status of the marketing activity. If status isn't set it will default to UNDEFINED.
   */
  public MarketingActivityExternalStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityExternalStatus status) {
    this.status = status;
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
   * The unique string identifier of the channel to which this activity belongs.
   * For the correct handle for your channel, contact your partner manager.
   */
  public String getChannelHandle() {
    return channelHandle;
  }

  public void setChannelHandle(String channelHandle) {
    this.channelHandle = channelHandle;
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
   * The date and time at which the activity started. If omitted or set to `null`, the current time will be used.
   */
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  /**
   * The date and time at which the activity ended. If omitted or set to `null`,
   * the current time will be used if the status is set to `INACTIVE` or
   * `DELETED_EXTERNALLY`.
   */
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  /**
   * The ID for the parent marketing activity, if creating hierarchical activities.
   */
  public String getParentActivityId() {
    return parentActivityId;
  }

  public void setParentActivityId(String parentActivityId) {
    this.parentActivityId = parentActivityId;
  }

  /**
   * The remote ID for the parent marketing activity, if creating hierarchical activities.
   */
  public String getParentRemoteId() {
    return parentRemoteId;
  }

  public void setParentRemoteId(String parentRemoteId) {
    this.parentRemoteId = parentRemoteId;
  }

  /**
   * The hierarchy level of the activity within a campaign. The hierarchy level can't be updated.
   */
  public MarketingActivityHierarchyLevel getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  @Override
  public String toString() {
    return "MarketingActivityCreateExternalInput{title='" + title + "', utm='" + utm + "', urlParameterValue='" + urlParameterValue + "', budget='" + budget + "', adSpend='" + adSpend + "', remoteId='" + remoteId + "', status='" + status + "', remoteUrl='" + remoteUrl + "', remotePreviewImageUrl='" + remotePreviewImageUrl + "', tactic='" + tactic + "', marketingChannelType='" + marketingChannelType + "', referringDomain='" + referringDomain + "', channelHandle='" + channelHandle + "', scheduledStart='" + scheduledStart + "', scheduledEnd='" + scheduledEnd + "', start='" + start + "', end='" + end + "', parentActivityId='" + parentActivityId + "', parentRemoteId='" + parentRemoteId + "', hierarchyLevel='" + hierarchyLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityCreateExternalInput that = (MarketingActivityCreateExternalInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(utm, that.utm) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(budget, that.budget) &&
        Objects.equals(adSpend, that.adSpend) &&
        Objects.equals(remoteId, that.remoteId) &&
        Objects.equals(status, that.status) &&
        Objects.equals(remoteUrl, that.remoteUrl) &&
        Objects.equals(remotePreviewImageUrl, that.remotePreviewImageUrl) &&
        Objects.equals(tactic, that.tactic) &&
        Objects.equals(marketingChannelType, that.marketingChannelType) &&
        Objects.equals(referringDomain, that.referringDomain) &&
        Objects.equals(channelHandle, that.channelHandle) &&
        Objects.equals(scheduledStart, that.scheduledStart) &&
        Objects.equals(scheduledEnd, that.scheduledEnd) &&
        Objects.equals(start, that.start) &&
        Objects.equals(end, that.end) &&
        Objects.equals(parentActivityId, that.parentActivityId) &&
        Objects.equals(parentRemoteId, that.parentRemoteId) &&
        Objects.equals(hierarchyLevel, that.hierarchyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, utm, urlParameterValue, budget, adSpend, remoteId, status, remoteUrl, remotePreviewImageUrl, tactic, marketingChannelType, referringDomain, channelHandle, scheduledStart, scheduledEnd, start, end, parentActivityId, parentRemoteId, hierarchyLevel);
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
     * Specifies the [Urchin Traffic Module (UTM)
     * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are associated
     * with a related marketing campaign. Either the URL parameter value or UTM can
     * be set, but not both.
     */
    private UTMInput utm;

    /**
     * Value for a query parameter that gets inserted into storefront URLs for
     * matching storefront traffic to this activity. This feature is currently
     * available on a limited basis to some partners only. UTMs should continue to be
     * used for most partners. Both the URL parameter value and UTM parameters can be set.
     */
    private String urlParameterValue;

    /**
     * The budget for this marketing activity.
     */
    private MarketingActivityBudgetInput budget;

    /**
     * The amount spent on the marketing activity.
     */
    private MoneyInput adSpend;

    /**
     * The ID of an activity that's hosted outside of Shopify.
     */
    private String remoteId;

    /**
     * The status of the marketing activity. If status isn't set it will default to UNDEFINED.
     */
    private MarketingActivityExternalStatus status;

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
     * The unique string identifier of the channel to which this activity belongs.
     * For the correct handle for your channel, contact your partner manager.
     */
    private String channelHandle;

    /**
     * The date and time at which the activity is scheduled to start.
     */
    private OffsetDateTime scheduledStart;

    /**
     * The date and time at which the activity is scheduled to end.
     */
    private OffsetDateTime scheduledEnd;

    /**
     * The date and time at which the activity started. If omitted or set to `null`, the current time will be used.
     */
    private OffsetDateTime start;

    /**
     * The date and time at which the activity ended. If omitted or set to `null`,
     * the current time will be used if the status is set to `INACTIVE` or
     * `DELETED_EXTERNALLY`.
     */
    private OffsetDateTime end;

    /**
     * The ID for the parent marketing activity, if creating hierarchical activities.
     */
    private String parentActivityId;

    /**
     * The remote ID for the parent marketing activity, if creating hierarchical activities.
     */
    private String parentRemoteId;

    /**
     * The hierarchy level of the activity within a campaign. The hierarchy level can't be updated.
     */
    private MarketingActivityHierarchyLevel hierarchyLevel;

    public MarketingActivityCreateExternalInput build() {
      MarketingActivityCreateExternalInput result = new MarketingActivityCreateExternalInput();
      result.title = this.title;
      result.utm = this.utm;
      result.urlParameterValue = this.urlParameterValue;
      result.budget = this.budget;
      result.adSpend = this.adSpend;
      result.remoteId = this.remoteId;
      result.status = this.status;
      result.remoteUrl = this.remoteUrl;
      result.remotePreviewImageUrl = this.remotePreviewImageUrl;
      result.tactic = this.tactic;
      result.marketingChannelType = this.marketingChannelType;
      result.referringDomain = this.referringDomain;
      result.channelHandle = this.channelHandle;
      result.scheduledStart = this.scheduledStart;
      result.scheduledEnd = this.scheduledEnd;
      result.start = this.start;
      result.end = this.end;
      result.parentActivityId = this.parentActivityId;
      result.parentRemoteId = this.parentRemoteId;
      result.hierarchyLevel = this.hierarchyLevel;
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
     * Specifies the [Urchin Traffic Module (UTM)
     * parameters](https://en.wikipedia.org/wiki/UTM_parameters) that are associated
     * with a related marketing campaign. Either the URL parameter value or UTM can
     * be set, but not both.
     */
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      return this;
    }

    /**
     * Value for a query parameter that gets inserted into storefront URLs for
     * matching storefront traffic to this activity. This feature is currently
     * available on a limited basis to some partners only. UTMs should continue to be
     * used for most partners. Both the URL parameter value and UTM parameters can be set.
     */
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
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
     * The ID of an activity that's hosted outside of Shopify.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      return this;
    }

    /**
     * The status of the marketing activity. If status isn't set it will default to UNDEFINED.
     */
    public Builder status(MarketingActivityExternalStatus status) {
      this.status = status;
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
     * The unique string identifier of the channel to which this activity belongs.
     * For the correct handle for your channel, contact your partner manager.
     */
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
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
     * The date and time at which the activity started. If omitted or set to `null`, the current time will be used.
     */
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }

    /**
     * The date and time at which the activity ended. If omitted or set to `null`,
     * the current time will be used if the status is set to `INACTIVE` or
     * `DELETED_EXTERNALLY`.
     */
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }

    /**
     * The ID for the parent marketing activity, if creating hierarchical activities.
     */
    public Builder parentActivityId(String parentActivityId) {
      this.parentActivityId = parentActivityId;
      return this;
    }

    /**
     * The remote ID for the parent marketing activity, if creating hierarchical activities.
     */
    public Builder parentRemoteId(String parentRemoteId) {
      this.parentRemoteId = parentRemoteId;
      return this;
    }

    /**
     * The hierarchy level of the activity within a campaign. The hierarchy level can't be updated.
     */
    public Builder hierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
      this.hierarchyLevel = hierarchyLevel;
      return this;
    }
  }
}
