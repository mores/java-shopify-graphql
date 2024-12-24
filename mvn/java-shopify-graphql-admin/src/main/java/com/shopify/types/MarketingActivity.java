package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketingActivity implements com.shopify.types.Node {
  
  private String activityListUrl;

  
  private MoneyV2 adSpend;

  
  private App app;

  
  private MarketingActivityExtensionAppErrors appErrors;

  
  private MarketingBudget budget;

  
  private OffsetDateTime createdAt;

  
  private String formData;

  
  private MarketingActivityHierarchyLevel hierarchyLevel;

  
  private String id;

  
  private boolean inMainWorkflowVersion;

  
  private boolean isExternal;

  
  private MarketingChannel marketingChannel;

  
  private MarketingChannel marketingChannelType;

  
  private MarketingEvent marketingEvent;

  
  private String parentActivityId;

  
  private String parentRemoteId;

  
  private String sourceAndMedium;

  
  private MarketingActivityStatus status;

  
  private MarketingActivityStatusBadgeType statusBadgeType;

  
  private BadgeType statusBadgeTypeV2;

  
  private String statusLabel;

  
  private OffsetDateTime statusTransitionedAt;

  
  private MarketingTactic tactic;

  
  private MarketingActivityStatus targetStatus;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  
  private String urlParameterValue;

  
  private UTMParameters utmParameters;

  public MarketingActivity() {
  }

  
  public String getActivityListUrl() {
    return activityListUrl;
  }

  public void setActivityListUrl(String activityListUrl) {
    this.activityListUrl = activityListUrl;
  }

  
  public MoneyV2 getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyV2 adSpend) {
    this.adSpend = adSpend;
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public MarketingActivityExtensionAppErrors getAppErrors() {
    return appErrors;
  }

  public void setAppErrors(MarketingActivityExtensionAppErrors appErrors) {
    this.appErrors = appErrors;
  }

  
  public MarketingBudget getBudget() {
    return budget;
  }

  public void setBudget(MarketingBudget budget) {
    this.budget = budget;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
  }

  
  public MarketingActivityHierarchyLevel getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getInMainWorkflowVersion() {
    return inMainWorkflowVersion;
  }

  public void setInMainWorkflowVersion(boolean inMainWorkflowVersion) {
    this.inMainWorkflowVersion = inMainWorkflowVersion;
  }

  
  public boolean getIsExternal() {
    return isExternal;
  }

  public void setIsExternal(boolean isExternal) {
    this.isExternal = isExternal;
  }

  
  public MarketingChannel getMarketingChannel() {
    return marketingChannel;
  }

  public void setMarketingChannel(MarketingChannel marketingChannel) {
    this.marketingChannel = marketingChannel;
  }

  
  public MarketingChannel getMarketingChannelType() {
    return marketingChannelType;
  }

  public void setMarketingChannelType(MarketingChannel marketingChannelType) {
    this.marketingChannelType = marketingChannelType;
  }

  
  public MarketingEvent getMarketingEvent() {
    return marketingEvent;
  }

  public void setMarketingEvent(MarketingEvent marketingEvent) {
    this.marketingEvent = marketingEvent;
  }

  
  public String getParentActivityId() {
    return parentActivityId;
  }

  public void setParentActivityId(String parentActivityId) {
    this.parentActivityId = parentActivityId;
  }

  
  public String getParentRemoteId() {
    return parentRemoteId;
  }

  public void setParentRemoteId(String parentRemoteId) {
    this.parentRemoteId = parentRemoteId;
  }

  
  public String getSourceAndMedium() {
    return sourceAndMedium;
  }

  public void setSourceAndMedium(String sourceAndMedium) {
    this.sourceAndMedium = sourceAndMedium;
  }

  
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  
  public MarketingActivityStatusBadgeType getStatusBadgeType() {
    return statusBadgeType;
  }

  public void setStatusBadgeType(MarketingActivityStatusBadgeType statusBadgeType) {
    this.statusBadgeType = statusBadgeType;
  }

  
  public BadgeType getStatusBadgeTypeV2() {
    return statusBadgeTypeV2;
  }

  public void setStatusBadgeTypeV2(BadgeType statusBadgeTypeV2) {
    this.statusBadgeTypeV2 = statusBadgeTypeV2;
  }

  
  public String getStatusLabel() {
    return statusLabel;
  }

  public void setStatusLabel(String statusLabel) {
    this.statusLabel = statusLabel;
  }

  
  public OffsetDateTime getStatusTransitionedAt() {
    return statusTransitionedAt;
  }

  public void setStatusTransitionedAt(OffsetDateTime statusTransitionedAt) {
    this.statusTransitionedAt = statusTransitionedAt;
  }

  
  public MarketingTactic getTactic() {
    return tactic;
  }

  public void setTactic(MarketingTactic tactic) {
    this.tactic = tactic;
  }

  
  public MarketingActivityStatus getTargetStatus() {
    return targetStatus;
  }

  public void setTargetStatus(MarketingActivityStatus targetStatus) {
    this.targetStatus = targetStatus;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
  }

  
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
    
    private String activityListUrl;

    
    private MoneyV2 adSpend;

    
    private App app;

    
    private MarketingActivityExtensionAppErrors appErrors;

    
    private MarketingBudget budget;

    
    private OffsetDateTime createdAt;

    
    private String formData;

    
    private MarketingActivityHierarchyLevel hierarchyLevel;

    
    private String id;

    
    private boolean inMainWorkflowVersion;

    
    private boolean isExternal;

    
    private MarketingChannel marketingChannel;

    
    private MarketingChannel marketingChannelType;

    
    private MarketingEvent marketingEvent;

    
    private String parentActivityId;

    
    private String parentRemoteId;

    
    private String sourceAndMedium;

    
    private MarketingActivityStatus status;

    
    private MarketingActivityStatusBadgeType statusBadgeType;

    
    private BadgeType statusBadgeTypeV2;

    
    private String statusLabel;

    
    private OffsetDateTime statusTransitionedAt;

    
    private MarketingTactic tactic;

    
    private MarketingActivityStatus targetStatus;

    
    private String title;

    
    private OffsetDateTime updatedAt;

    
    private String urlParameterValue;

    
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

    
    public Builder activityListUrl(String activityListUrl) {
      this.activityListUrl = activityListUrl;
      return this;
    }

    
    public Builder adSpend(MoneyV2 adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder appErrors(MarketingActivityExtensionAppErrors appErrors) {
      this.appErrors = appErrors;
      return this;
    }

    
    public Builder budget(MarketingBudget budget) {
      this.budget = budget;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder formData(String formData) {
      this.formData = formData;
      return this;
    }

    
    public Builder hierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
      this.hierarchyLevel = hierarchyLevel;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inMainWorkflowVersion(boolean inMainWorkflowVersion) {
      this.inMainWorkflowVersion = inMainWorkflowVersion;
      return this;
    }

    
    public Builder isExternal(boolean isExternal) {
      this.isExternal = isExternal;
      return this;
    }

    
    public Builder marketingChannel(MarketingChannel marketingChannel) {
      this.marketingChannel = marketingChannel;
      return this;
    }

    
    public Builder marketingChannelType(MarketingChannel marketingChannelType) {
      this.marketingChannelType = marketingChannelType;
      return this;
    }

    
    public Builder marketingEvent(MarketingEvent marketingEvent) {
      this.marketingEvent = marketingEvent;
      return this;
    }

    
    public Builder parentActivityId(String parentActivityId) {
      this.parentActivityId = parentActivityId;
      return this;
    }

    
    public Builder parentRemoteId(String parentRemoteId) {
      this.parentRemoteId = parentRemoteId;
      return this;
    }

    
    public Builder sourceAndMedium(String sourceAndMedium) {
      this.sourceAndMedium = sourceAndMedium;
      return this;
    }

    
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder statusBadgeType(MarketingActivityStatusBadgeType statusBadgeType) {
      this.statusBadgeType = statusBadgeType;
      return this;
    }

    
    public Builder statusBadgeTypeV2(BadgeType statusBadgeTypeV2) {
      this.statusBadgeTypeV2 = statusBadgeTypeV2;
      return this;
    }

    
    public Builder statusLabel(String statusLabel) {
      this.statusLabel = statusLabel;
      return this;
    }

    
    public Builder statusTransitionedAt(OffsetDateTime statusTransitionedAt) {
      this.statusTransitionedAt = statusTransitionedAt;
      return this;
    }

    
    public Builder tactic(MarketingTactic tactic) {
      this.tactic = tactic;
      return this;
    }

    
    public Builder targetStatus(MarketingActivityStatus targetStatus) {
      this.targetStatus = targetStatus;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
      return this;
    }

    
    public Builder utmParameters(UTMParameters utmParameters) {
      this.utmParameters = utmParameters;
      return this;
    }
  }
}
