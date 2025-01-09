package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The marketing activity resource represents marketing that a
 *         merchant created through an app.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketingActivity implements com.shopify.types.Node {
  /**
   * The URL of the marketing activity listing page in the marketing section.
   */
  private String activityListUrl;

  /**
   * The amount spent on the marketing activity.
   */
  private MoneyV2 adSpend;

  /**
   * The app which created this marketing activity.
   */
  private App app;

  /**
   * The errors generated when an app publishes the marketing activity.
   */
  private MarketingActivityExtensionAppErrors appErrors;

  /**
   * The allocated budget for the marketing activity.
   */
  private MarketingBudget budget;

  /**
   * The date and time when the marketing activity was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The completed content in the marketing activity creation form.
   */
  private String formData;

  /**
   * The hierarchy level of the marketing activity.
   */
  private MarketingActivityHierarchyLevel hierarchyLevel;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the marketing activity is in the main workflow version of the marketing automation.
   */
  private boolean inMainWorkflowVersion;

  /**
   * The marketing activity represents an external marketing activity.
   */
  private boolean isExternal;

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  private MarketingChannel marketingChannel;

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  private MarketingChannel marketingChannelType;

  /**
   * Associated marketing event of this marketing activity.
   */
  private MarketingEvent marketingEvent;

  /**
   * ID of the parent activity of this marketing activity.
   */
  private String parentActivityId;

  /**
   * ID of the parent activity of this marketing activity.
   */
  private String parentRemoteId;

  /**
   * A contextual description of the marketing activity based on the platform and tactic used.
   */
  private String sourceAndMedium;

  /**
   * The current state of the marketing activity.
   */
  private MarketingActivityStatus status;

  /**
   * The severity of the marketing activity's status.
   */
  private MarketingActivityStatusBadgeType statusBadgeType;

  /**
   * The severity of the marketing activity's status.
   */
  private BadgeType statusBadgeTypeV2;

  /**
   * The rendered status of the marketing activity.
   */
  private String statusLabel;

  /**
   * The [date and time](
   *           https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
   *           ) when the activity's status last changed.
   */
  private OffsetDateTime statusTransitionedAt;

  /**
   * The method of marketing used for this marketing activity.
   */
  private MarketingTactic tactic;

  /**
   * The status to which the marketing activity is currently transitioning.
   */
  private MarketingActivityStatus targetStatus;

  /**
   * The marketing activity's title, which is rendered on the marketing listing page.
   */
  private String title;

  /**
   * The date and time when the marketing activity was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The value portion of the URL query parameter used in attributing sessions to this activity.
   */
  private String urlParameterValue;

  /**
   * The set of [Urchin Tracking Module](
   *           https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
   *           ) used in the URL for tracking this marketing activity.
   */
  private UTMParameters utmParameters;

  public MarketingActivity() {
  }

  /**
   * The URL of the marketing activity listing page in the marketing section.
   */
  public String getActivityListUrl() {
    return activityListUrl;
  }

  public void setActivityListUrl(String activityListUrl) {
    this.activityListUrl = activityListUrl;
  }

  /**
   * The amount spent on the marketing activity.
   */
  public MoneyV2 getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyV2 adSpend) {
    this.adSpend = adSpend;
  }

  /**
   * The app which created this marketing activity.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The errors generated when an app publishes the marketing activity.
   */
  public MarketingActivityExtensionAppErrors getAppErrors() {
    return appErrors;
  }

  public void setAppErrors(MarketingActivityExtensionAppErrors appErrors) {
    this.appErrors = appErrors;
  }

  /**
   * The allocated budget for the marketing activity.
   */
  public MarketingBudget getBudget() {
    return budget;
  }

  public void setBudget(MarketingBudget budget) {
    this.budget = budget;
  }

  /**
   * The date and time when the marketing activity was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The completed content in the marketing activity creation form.
   */
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
  }

  /**
   * The hierarchy level of the marketing activity.
   */
  public MarketingActivityHierarchyLevel getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the marketing activity is in the main workflow version of the marketing automation.
   */
  public boolean getInMainWorkflowVersion() {
    return inMainWorkflowVersion;
  }

  public void setInMainWorkflowVersion(boolean inMainWorkflowVersion) {
    this.inMainWorkflowVersion = inMainWorkflowVersion;
  }

  /**
   * The marketing activity represents an external marketing activity.
   */
  public boolean getIsExternal() {
    return isExternal;
  }

  public void setIsExternal(boolean isExternal) {
    this.isExternal = isExternal;
  }

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  public MarketingChannel getMarketingChannel() {
    return marketingChannel;
  }

  public void setMarketingChannel(MarketingChannel marketingChannel) {
    this.marketingChannel = marketingChannel;
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
   * Associated marketing event of this marketing activity.
   */
  public MarketingEvent getMarketingEvent() {
    return marketingEvent;
  }

  public void setMarketingEvent(MarketingEvent marketingEvent) {
    this.marketingEvent = marketingEvent;
  }

  /**
   * ID of the parent activity of this marketing activity.
   */
  public String getParentActivityId() {
    return parentActivityId;
  }

  public void setParentActivityId(String parentActivityId) {
    this.parentActivityId = parentActivityId;
  }

  /**
   * ID of the parent activity of this marketing activity.
   */
  public String getParentRemoteId() {
    return parentRemoteId;
  }

  public void setParentRemoteId(String parentRemoteId) {
    this.parentRemoteId = parentRemoteId;
  }

  /**
   * A contextual description of the marketing activity based on the platform and tactic used.
   */
  public String getSourceAndMedium() {
    return sourceAndMedium;
  }

  public void setSourceAndMedium(String sourceAndMedium) {
    this.sourceAndMedium = sourceAndMedium;
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

  /**
   * The severity of the marketing activity's status.
   */
  public MarketingActivityStatusBadgeType getStatusBadgeType() {
    return statusBadgeType;
  }

  public void setStatusBadgeType(MarketingActivityStatusBadgeType statusBadgeType) {
    this.statusBadgeType = statusBadgeType;
  }

  /**
   * The severity of the marketing activity's status.
   */
  public BadgeType getStatusBadgeTypeV2() {
    return statusBadgeTypeV2;
  }

  public void setStatusBadgeTypeV2(BadgeType statusBadgeTypeV2) {
    this.statusBadgeTypeV2 = statusBadgeTypeV2;
  }

  /**
   * The rendered status of the marketing activity.
   */
  public String getStatusLabel() {
    return statusLabel;
  }

  public void setStatusLabel(String statusLabel) {
    this.statusLabel = statusLabel;
  }

  /**
   * The [date and time](
   *           https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
   *           ) when the activity's status last changed.
   */
  public OffsetDateTime getStatusTransitionedAt() {
    return statusTransitionedAt;
  }

  public void setStatusTransitionedAt(OffsetDateTime statusTransitionedAt) {
    this.statusTransitionedAt = statusTransitionedAt;
  }

  /**
   * The method of marketing used for this marketing activity.
   */
  public MarketingTactic getTactic() {
    return tactic;
  }

  public void setTactic(MarketingTactic tactic) {
    this.tactic = tactic;
  }

  /**
   * The status to which the marketing activity is currently transitioning.
   */
  public MarketingActivityStatus getTargetStatus() {
    return targetStatus;
  }

  public void setTargetStatus(MarketingActivityStatus targetStatus) {
    this.targetStatus = targetStatus;
  }

  /**
   * The marketing activity's title, which is rendered on the marketing listing page.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The date and time when the marketing activity was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The value portion of the URL query parameter used in attributing sessions to this activity.
   */
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
  }

  /**
   * The set of [Urchin Tracking Module](
   *           https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
   *           ) used in the URL for tracking this marketing activity.
   */
  public UTMParameters getUtmParameters() {
    return utmParameters;
  }

  public void setUtmParameters(UTMParameters utmParameters) {
    this.utmParameters = utmParameters;
  }

  @Override
  public String toString() {
    return "MarketingActivity{activityListUrl='" + activityListUrl + "', adSpend='" + adSpend + "', app='" + app + "', appErrors='" + appErrors + "', budget='" + budget + "', createdAt='" + createdAt + "', formData='" + formData + "', hierarchyLevel='" + hierarchyLevel + "', id='" + id + "', inMainWorkflowVersion='" + inMainWorkflowVersion + "', isExternal='" + isExternal + "', marketingChannel='" + marketingChannel + "', marketingChannelType='" + marketingChannelType + "', marketingEvent='" + marketingEvent + "', parentActivityId='" + parentActivityId + "', parentRemoteId='" + parentRemoteId + "', sourceAndMedium='" + sourceAndMedium + "', status='" + status + "', statusBadgeType='" + statusBadgeType + "', statusBadgeTypeV2='" + statusBadgeTypeV2 + "', statusLabel='" + statusLabel + "', statusTransitionedAt='" + statusTransitionedAt + "', tactic='" + tactic + "', targetStatus='" + targetStatus + "', title='" + title + "', updatedAt='" + updatedAt + "', urlParameterValue='" + urlParameterValue + "', utmParameters='" + utmParameters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivity that = (MarketingActivity) o;
    return Objects.equals(activityListUrl, that.activityListUrl) &&
        Objects.equals(adSpend, that.adSpend) &&
        Objects.equals(app, that.app) &&
        Objects.equals(appErrors, that.appErrors) &&
        Objects.equals(budget, that.budget) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(formData, that.formData) &&
        Objects.equals(hierarchyLevel, that.hierarchyLevel) &&
        Objects.equals(id, that.id) &&
        inMainWorkflowVersion == that.inMainWorkflowVersion &&
        isExternal == that.isExternal &&
        Objects.equals(marketingChannel, that.marketingChannel) &&
        Objects.equals(marketingChannelType, that.marketingChannelType) &&
        Objects.equals(marketingEvent, that.marketingEvent) &&
        Objects.equals(parentActivityId, that.parentActivityId) &&
        Objects.equals(parentRemoteId, that.parentRemoteId) &&
        Objects.equals(sourceAndMedium, that.sourceAndMedium) &&
        Objects.equals(status, that.status) &&
        Objects.equals(statusBadgeType, that.statusBadgeType) &&
        Objects.equals(statusBadgeTypeV2, that.statusBadgeTypeV2) &&
        Objects.equals(statusLabel, that.statusLabel) &&
        Objects.equals(statusTransitionedAt, that.statusTransitionedAt) &&
        Objects.equals(tactic, that.tactic) &&
        Objects.equals(targetStatus, that.targetStatus) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(utmParameters, that.utmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityListUrl, adSpend, app, appErrors, budget, createdAt, formData, hierarchyLevel, id, inMainWorkflowVersion, isExternal, marketingChannel, marketingChannelType, marketingEvent, parentActivityId, parentRemoteId, sourceAndMedium, status, statusBadgeType, statusBadgeTypeV2, statusLabel, statusTransitionedAt, tactic, targetStatus, title, updatedAt, urlParameterValue, utmParameters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL of the marketing activity listing page in the marketing section.
     */
    private String activityListUrl;

    /**
     * The amount spent on the marketing activity.
     */
    private MoneyV2 adSpend;

    /**
     * The app which created this marketing activity.
     */
    private App app;

    /**
     * The errors generated when an app publishes the marketing activity.
     */
    private MarketingActivityExtensionAppErrors appErrors;

    /**
     * The allocated budget for the marketing activity.
     */
    private MarketingBudget budget;

    /**
     * The date and time when the marketing activity was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The completed content in the marketing activity creation form.
     */
    private String formData;

    /**
     * The hierarchy level of the marketing activity.
     */
    private MarketingActivityHierarchyLevel hierarchyLevel;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the marketing activity is in the main workflow version of the marketing automation.
     */
    private boolean inMainWorkflowVersion;

    /**
     * The marketing activity represents an external marketing activity.
     */
    private boolean isExternal;

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    private MarketingChannel marketingChannel;

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    private MarketingChannel marketingChannelType;

    /**
     * Associated marketing event of this marketing activity.
     */
    private MarketingEvent marketingEvent;

    /**
     * ID of the parent activity of this marketing activity.
     */
    private String parentActivityId;

    /**
     * ID of the parent activity of this marketing activity.
     */
    private String parentRemoteId;

    /**
     * A contextual description of the marketing activity based on the platform and tactic used.
     */
    private String sourceAndMedium;

    /**
     * The current state of the marketing activity.
     */
    private MarketingActivityStatus status;

    /**
     * The severity of the marketing activity's status.
     */
    private MarketingActivityStatusBadgeType statusBadgeType;

    /**
     * The severity of the marketing activity's status.
     */
    private BadgeType statusBadgeTypeV2;

    /**
     * The rendered status of the marketing activity.
     */
    private String statusLabel;

    /**
     * The [date and time](
     *           https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
     *           ) when the activity's status last changed.
     */
    private OffsetDateTime statusTransitionedAt;

    /**
     * The method of marketing used for this marketing activity.
     */
    private MarketingTactic tactic;

    /**
     * The status to which the marketing activity is currently transitioning.
     */
    private MarketingActivityStatus targetStatus;

    /**
     * The marketing activity's title, which is rendered on the marketing listing page.
     */
    private String title;

    /**
     * The date and time when the marketing activity was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The value portion of the URL query parameter used in attributing sessions to this activity.
     */
    private String urlParameterValue;

    /**
     * The set of [Urchin Tracking Module](
     *           https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
     *           ) used in the URL for tracking this marketing activity.
     */
    private UTMParameters utmParameters;

    public MarketingActivity build() {
      MarketingActivity result = new MarketingActivity();
      result.activityListUrl = this.activityListUrl;
      result.adSpend = this.adSpend;
      result.app = this.app;
      result.appErrors = this.appErrors;
      result.budget = this.budget;
      result.createdAt = this.createdAt;
      result.formData = this.formData;
      result.hierarchyLevel = this.hierarchyLevel;
      result.id = this.id;
      result.inMainWorkflowVersion = this.inMainWorkflowVersion;
      result.isExternal = this.isExternal;
      result.marketingChannel = this.marketingChannel;
      result.marketingChannelType = this.marketingChannelType;
      result.marketingEvent = this.marketingEvent;
      result.parentActivityId = this.parentActivityId;
      result.parentRemoteId = this.parentRemoteId;
      result.sourceAndMedium = this.sourceAndMedium;
      result.status = this.status;
      result.statusBadgeType = this.statusBadgeType;
      result.statusBadgeTypeV2 = this.statusBadgeTypeV2;
      result.statusLabel = this.statusLabel;
      result.statusTransitionedAt = this.statusTransitionedAt;
      result.tactic = this.tactic;
      result.targetStatus = this.targetStatus;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      result.urlParameterValue = this.urlParameterValue;
      result.utmParameters = this.utmParameters;
      return result;
    }

    /**
     * The URL of the marketing activity listing page in the marketing section.
     */
    public Builder activityListUrl(String activityListUrl) {
      this.activityListUrl = activityListUrl;
      return this;
    }

    /**
     * The amount spent on the marketing activity.
     */
    public Builder adSpend(MoneyV2 adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    /**
     * The app which created this marketing activity.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The errors generated when an app publishes the marketing activity.
     */
    public Builder appErrors(MarketingActivityExtensionAppErrors appErrors) {
      this.appErrors = appErrors;
      return this;
    }

    /**
     * The allocated budget for the marketing activity.
     */
    public Builder budget(MarketingBudget budget) {
      this.budget = budget;
      return this;
    }

    /**
     * The date and time when the marketing activity was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The completed content in the marketing activity creation form.
     */
    public Builder formData(String formData) {
      this.formData = formData;
      return this;
    }

    /**
     * The hierarchy level of the marketing activity.
     */
    public Builder hierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
      this.hierarchyLevel = hierarchyLevel;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the marketing activity is in the main workflow version of the marketing automation.
     */
    public Builder inMainWorkflowVersion(boolean inMainWorkflowVersion) {
      this.inMainWorkflowVersion = inMainWorkflowVersion;
      return this;
    }

    /**
     * The marketing activity represents an external marketing activity.
     */
    public Builder isExternal(boolean isExternal) {
      this.isExternal = isExternal;
      return this;
    }

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    public Builder marketingChannel(MarketingChannel marketingChannel) {
      this.marketingChannel = marketingChannel;
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
     * Associated marketing event of this marketing activity.
     */
    public Builder marketingEvent(MarketingEvent marketingEvent) {
      this.marketingEvent = marketingEvent;
      return this;
    }

    /**
     * ID of the parent activity of this marketing activity.
     */
    public Builder parentActivityId(String parentActivityId) {
      this.parentActivityId = parentActivityId;
      return this;
    }

    /**
     * ID of the parent activity of this marketing activity.
     */
    public Builder parentRemoteId(String parentRemoteId) {
      this.parentRemoteId = parentRemoteId;
      return this;
    }

    /**
     * A contextual description of the marketing activity based on the platform and tactic used.
     */
    public Builder sourceAndMedium(String sourceAndMedium) {
      this.sourceAndMedium = sourceAndMedium;
      return this;
    }

    /**
     * The current state of the marketing activity.
     */
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The severity of the marketing activity's status.
     */
    public Builder statusBadgeType(MarketingActivityStatusBadgeType statusBadgeType) {
      this.statusBadgeType = statusBadgeType;
      return this;
    }

    /**
     * The severity of the marketing activity's status.
     */
    public Builder statusBadgeTypeV2(BadgeType statusBadgeTypeV2) {
      this.statusBadgeTypeV2 = statusBadgeTypeV2;
      return this;
    }

    /**
     * The rendered status of the marketing activity.
     */
    public Builder statusLabel(String statusLabel) {
      this.statusLabel = statusLabel;
      return this;
    }

    /**
     * The [date and time](
     *           https://help.shopify.com/https://en.wikipedia.org/wiki/ISO_8601
     *           ) when the activity's status last changed.
     */
    public Builder statusTransitionedAt(OffsetDateTime statusTransitionedAt) {
      this.statusTransitionedAt = statusTransitionedAt;
      return this;
    }

    /**
     * The method of marketing used for this marketing activity.
     */
    public Builder tactic(MarketingTactic tactic) {
      this.tactic = tactic;
      return this;
    }

    /**
     * The status to which the marketing activity is currently transitioning.
     */
    public Builder targetStatus(MarketingActivityStatus targetStatus) {
      this.targetStatus = targetStatus;
      return this;
    }

    /**
     * The marketing activity's title, which is rendered on the marketing listing page.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The date and time when the marketing activity was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The value portion of the URL query parameter used in attributing sessions to this activity.
     */
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
      return this;
    }

    /**
     * The set of [Urchin Tracking Module](
     *           https://help.shopify.com/https://en.wikipedia.org/wiki/UTM_parameters
     *           ) used in the URL for tracking this marketing activity.
     */
    public Builder utmParameters(UTMParameters utmParameters) {
      this.utmParameters = utmParameters;
      return this;
    }
  }
}
