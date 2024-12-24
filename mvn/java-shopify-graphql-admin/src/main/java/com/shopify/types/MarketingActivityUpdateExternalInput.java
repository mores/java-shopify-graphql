package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


public class MarketingActivityUpdateExternalInput {
  
  private String title;

  
  private MarketingActivityBudgetInput budget;

  
  private MoneyInput adSpend;

  
  private String remoteUrl;

  
  private String remotePreviewImageUrl;

  
  private MarketingTactic tactic;

  
  private MarketingChannel marketingChannelType;

  
  private String referringDomain;

  
  private OffsetDateTime scheduledStart;

  
  private OffsetDateTime scheduledEnd;

  
  private OffsetDateTime start;

  
  private OffsetDateTime end;

  
  private MarketingActivityExternalStatus status;

  public MarketingActivityUpdateExternalInput() {
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
    
    private String title;

    
    private MarketingActivityBudgetInput budget;

    
    private MoneyInput adSpend;

    
    private String remoteUrl;

    
    private String remotePreviewImageUrl;

    
    private MarketingTactic tactic;

    
    private MarketingChannel marketingChannelType;

    
    private String referringDomain;

    
    private OffsetDateTime scheduledStart;

    
    private OffsetDateTime scheduledEnd;

    
    private OffsetDateTime start;

    
    private OffsetDateTime end;

    
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

    
    public Builder title(String title) {
      this.title = title;
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

    
    public Builder status(MarketingActivityExternalStatus status) {
      this.status = status;
      return this;
    }
  }
}
