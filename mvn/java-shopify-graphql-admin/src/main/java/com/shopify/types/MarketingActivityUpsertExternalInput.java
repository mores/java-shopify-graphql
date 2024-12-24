package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class MarketingActivityUpsertExternalInput {
  
  private String title;

  
  private UTMInput utm;

  
  private MarketingActivityBudgetInput budget;

  
  private MoneyInput adSpend;

  
  private String remoteId;

  
  private MarketingActivityExternalStatus status;

  
  private String remoteUrl;

  
  private String remotePreviewImageUrl;

  
  private MarketingTactic tactic;

  
  private MarketingChannel marketingChannelType;

  
  private String referringDomain;

  
  private String channelHandle;

  
  private OffsetDateTime scheduledStart;

  
  private OffsetDateTime scheduledEnd;

  
  private OffsetDateTime start;

  
  private OffsetDateTime end;

  
  private String urlParameterValue;

  
  private String parentRemoteId;

  
  private MarketingActivityHierarchyLevel hierarchyLevel;

  public MarketingActivityUpsertExternalInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public UTMInput getUtm() {
    return utm;
  }

  public void setUtm(UTMInput utm) {
    this.utm = utm;
  }

  
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  
  public MoneyInput getAdSpend() {
    return adSpend;
  }

  public void setAdSpend(MoneyInput adSpend) {
    this.adSpend = adSpend;
  }

  
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  
  public MarketingActivityExternalStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityExternalStatus status) {
    this.status = status;
  }

  
  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  
  public String getRemotePreviewImageUrl() {
    return remotePreviewImageUrl;
  }

  public void setRemotePreviewImageUrl(String remotePreviewImageUrl) {
    this.remotePreviewImageUrl = remotePreviewImageUrl;
  }

  
  public MarketingTactic getTactic() {
    return tactic;
  }

  public void setTactic(MarketingTactic tactic) {
    this.tactic = tactic;
  }

  
  public MarketingChannel getMarketingChannelType() {
    return marketingChannelType;
  }

  public void setMarketingChannelType(MarketingChannel marketingChannelType) {
    this.marketingChannelType = marketingChannelType;
  }

  
  public String getReferringDomain() {
    return referringDomain;
  }

  public void setReferringDomain(String referringDomain) {
    this.referringDomain = referringDomain;
  }

  
  public String getChannelHandle() {
    return channelHandle;
  }

  public void setChannelHandle(String channelHandle) {
    this.channelHandle = channelHandle;
  }

  
  public OffsetDateTime getScheduledStart() {
    return scheduledStart;
  }

  public void setScheduledStart(OffsetDateTime scheduledStart) {
    this.scheduledStart = scheduledStart;
  }

  
  public OffsetDateTime getScheduledEnd() {
    return scheduledEnd;
  }

  public void setScheduledEnd(OffsetDateTime scheduledEnd) {
    this.scheduledEnd = scheduledEnd;
  }

  
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
  }

  
  public String getParentRemoteId() {
    return parentRemoteId;
  }

  public void setParentRemoteId(String parentRemoteId) {
    this.parentRemoteId = parentRemoteId;
  }

  
  public MarketingActivityHierarchyLevel getHierarchyLevel() {
    return hierarchyLevel;
  }

  public void setHierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
    this.hierarchyLevel = hierarchyLevel;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpsertExternalInput{title='" + title + "', utm='" + utm + "', budget='" + budget + "', adSpend='" + adSpend + "', remoteId='" + remoteId + "', status='" + status + "', remoteUrl='" + remoteUrl + "', remotePreviewImageUrl='" + remotePreviewImageUrl + "', tactic='" + tactic + "', marketingChannelType='" + marketingChannelType + "', referringDomain='" + referringDomain + "', channelHandle='" + channelHandle + "', scheduledStart='" + scheduledStart + "', scheduledEnd='" + scheduledEnd + "', start='" + start + "', end='" + end + "', urlParameterValue='" + urlParameterValue + "', parentRemoteId='" + parentRemoteId + "', hierarchyLevel='" + hierarchyLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpsertExternalInput that = (MarketingActivityUpsertExternalInput) o;
    return Objects.equals(title, that.title) &&
        Objects.equals(utm, that.utm) &&
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
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(parentRemoteId, that.parentRemoteId) &&
        Objects.equals(hierarchyLevel, that.hierarchyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, utm, budget, adSpend, remoteId, status, remoteUrl, remotePreviewImageUrl, tactic, marketingChannelType, referringDomain, channelHandle, scheduledStart, scheduledEnd, start, end, urlParameterValue, parentRemoteId, hierarchyLevel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String title;

    
    private UTMInput utm;

    
    private MarketingActivityBudgetInput budget;

    
    private MoneyInput adSpend;

    
    private String remoteId;

    
    private MarketingActivityExternalStatus status;

    
    private String remoteUrl;

    
    private String remotePreviewImageUrl;

    
    private MarketingTactic tactic;

    
    private MarketingChannel marketingChannelType;

    
    private String referringDomain;

    
    private String channelHandle;

    
    private OffsetDateTime scheduledStart;

    
    private OffsetDateTime scheduledEnd;

    
    private OffsetDateTime start;

    
    private OffsetDateTime end;

    
    private String urlParameterValue;

    
    private String parentRemoteId;

    
    private MarketingActivityHierarchyLevel hierarchyLevel;

    public MarketingActivityUpsertExternalInput build() {
      MarketingActivityUpsertExternalInput result = new MarketingActivityUpsertExternalInput();
      result.title = this.title;
      result.utm = this.utm;
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
      result.urlParameterValue = this.urlParameterValue;
      result.parentRemoteId = this.parentRemoteId;
      result.hierarchyLevel = this.hierarchyLevel;
      return result;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      return this;
    }

    
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }

    
    public Builder adSpend(MoneyInput adSpend) {
      this.adSpend = adSpend;
      return this;
    }

    
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      return this;
    }

    
    public Builder status(MarketingActivityExternalStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder remoteUrl(String remoteUrl) {
      this.remoteUrl = remoteUrl;
      return this;
    }

    
    public Builder remotePreviewImageUrl(String remotePreviewImageUrl) {
      this.remotePreviewImageUrl = remotePreviewImageUrl;
      return this;
    }

    
    public Builder tactic(MarketingTactic tactic) {
      this.tactic = tactic;
      return this;
    }

    
    public Builder marketingChannelType(MarketingChannel marketingChannelType) {
      this.marketingChannelType = marketingChannelType;
      return this;
    }

    
    public Builder referringDomain(String referringDomain) {
      this.referringDomain = referringDomain;
      return this;
    }

    
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      return this;
    }

    
    public Builder scheduledStart(OffsetDateTime scheduledStart) {
      this.scheduledStart = scheduledStart;
      return this;
    }

    
    public Builder scheduledEnd(OffsetDateTime scheduledEnd) {
      this.scheduledEnd = scheduledEnd;
      return this;
    }

    
    public Builder start(OffsetDateTime start) {
      this.start = start;
      return this;
    }

    
    public Builder end(OffsetDateTime end) {
      this.end = end;
      return this;
    }

    
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
      return this;
    }

    
    public Builder parentRemoteId(String parentRemoteId) {
      this.parentRemoteId = parentRemoteId;
      return this;
    }

    
    public Builder hierarchyLevel(MarketingActivityHierarchyLevel hierarchyLevel) {
      this.hierarchyLevel = hierarchyLevel;
      return this;
    }
  }
}
