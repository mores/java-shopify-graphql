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
public class MarketingEvent implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private App app;

  
  private MarketingChannel channel;

  
  private String channelHandle;

  
  private String description;

  
  private OffsetDateTime endedAt;

  
  private String id;

  
  private String legacyResourceId;

  
  private String manageUrl;

  
  private MarketingChannel marketingChannelType;

  
  private String previewUrl;

  
  private String remoteId;

  
  private OffsetDateTime scheduledToEndAt;

  
  private String sourceAndMedium;

  
  private OffsetDateTime startedAt;

  
  private String targetTypeDisplayText;

  
  private MarketingTactic type;

  
  private String utmCampaign;

  
  private String utmMedium;

  
  private String utmSource;

  public MarketingEvent() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public MarketingChannel getChannel() {
    return channel;
  }

  public void setChannel(MarketingChannel channel) {
    this.channel = channel;
  }

  
  public String getChannelHandle() {
    return channelHandle;
  }

  public void setChannelHandle(String channelHandle) {
    this.channelHandle = channelHandle;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public String getManageUrl() {
    return manageUrl;
  }

  public void setManageUrl(String manageUrl) {
    this.manageUrl = manageUrl;
  }

  
  public MarketingChannel getMarketingChannelType() {
    return marketingChannelType;
  }

  public void setMarketingChannelType(MarketingChannel marketingChannelType) {
    this.marketingChannelType = marketingChannelType;
  }

  
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  
  public OffsetDateTime getScheduledToEndAt() {
    return scheduledToEndAt;
  }

  public void setScheduledToEndAt(OffsetDateTime scheduledToEndAt) {
    this.scheduledToEndAt = scheduledToEndAt;
  }

  
  public String getSourceAndMedium() {
    return sourceAndMedium;
  }

  public void setSourceAndMedium(String sourceAndMedium) {
    this.sourceAndMedium = sourceAndMedium;
  }

  
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  
  public String getTargetTypeDisplayText() {
    return targetTypeDisplayText;
  }

  public void setTargetTypeDisplayText(String targetTypeDisplayText) {
    this.targetTypeDisplayText = targetTypeDisplayText;
  }

  
  public MarketingTactic getType() {
    return type;
  }

  public void setType(MarketingTactic type) {
    this.type = type;
  }

  
  public String getUtmCampaign() {
    return utmCampaign;
  }

  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }

  
  public String getUtmMedium() {
    return utmMedium;
  }

  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }

  
  public String getUtmSource() {
    return utmSource;
  }

  public void setUtmSource(String utmSource) {
    this.utmSource = utmSource;
  }

  @Override
  public String toString() {
    return "MarketingEvent{app='" + app + "', channel='" + channel + "', channelHandle='" + channelHandle + "', description='" + description + "', endedAt='" + endedAt + "', id='" + id + "', legacyResourceId='" + legacyResourceId + "', manageUrl='" + manageUrl + "', marketingChannelType='" + marketingChannelType + "', previewUrl='" + previewUrl + "', remoteId='" + remoteId + "', scheduledToEndAt='" + scheduledToEndAt + "', sourceAndMedium='" + sourceAndMedium + "', startedAt='" + startedAt + "', targetTypeDisplayText='" + targetTypeDisplayText + "', type='" + type + "', utmCampaign='" + utmCampaign + "', utmMedium='" + utmMedium + "', utmSource='" + utmSource + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingEvent that = (MarketingEvent) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(channel, that.channel) &&
        Objects.equals(channelHandle, that.channelHandle) &&
        Objects.equals(description, that.description) &&
        Objects.equals(endedAt, that.endedAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(manageUrl, that.manageUrl) &&
        Objects.equals(marketingChannelType, that.marketingChannelType) &&
        Objects.equals(previewUrl, that.previewUrl) &&
        Objects.equals(remoteId, that.remoteId) &&
        Objects.equals(scheduledToEndAt, that.scheduledToEndAt) &&
        Objects.equals(sourceAndMedium, that.sourceAndMedium) &&
        Objects.equals(startedAt, that.startedAt) &&
        Objects.equals(targetTypeDisplayText, that.targetTypeDisplayText) &&
        Objects.equals(type, that.type) &&
        Objects.equals(utmCampaign, that.utmCampaign) &&
        Objects.equals(utmMedium, that.utmMedium) &&
        Objects.equals(utmSource, that.utmSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, channel, channelHandle, description, endedAt, id, legacyResourceId, manageUrl, marketingChannelType, previewUrl, remoteId, scheduledToEndAt, sourceAndMedium, startedAt, targetTypeDisplayText, type, utmCampaign, utmMedium, utmSource);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private MarketingChannel channel;

    
    private String channelHandle;

    
    private String description;

    
    private OffsetDateTime endedAt;

    
    private String id;

    
    private String legacyResourceId;

    
    private String manageUrl;

    
    private MarketingChannel marketingChannelType;

    
    private String previewUrl;

    
    private String remoteId;

    
    private OffsetDateTime scheduledToEndAt;

    
    private String sourceAndMedium;

    
    private OffsetDateTime startedAt;

    
    private String targetTypeDisplayText;

    
    private MarketingTactic type;

    
    private String utmCampaign;

    
    private String utmMedium;

    
    private String utmSource;

    public MarketingEvent build() {
      MarketingEvent result = new MarketingEvent();
      result.app = this.app;
      result.channel = this.channel;
      result.channelHandle = this.channelHandle;
      result.description = this.description;
      result.endedAt = this.endedAt;
      result.id = this.id;
      result.legacyResourceId = this.legacyResourceId;
      result.manageUrl = this.manageUrl;
      result.marketingChannelType = this.marketingChannelType;
      result.previewUrl = this.previewUrl;
      result.remoteId = this.remoteId;
      result.scheduledToEndAt = this.scheduledToEndAt;
      result.sourceAndMedium = this.sourceAndMedium;
      result.startedAt = this.startedAt;
      result.targetTypeDisplayText = this.targetTypeDisplayText;
      result.type = this.type;
      result.utmCampaign = this.utmCampaign;
      result.utmMedium = this.utmMedium;
      result.utmSource = this.utmSource;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder channel(MarketingChannel channel) {
      this.channel = channel;
      return this;
    }

    
    public Builder channelHandle(String channelHandle) {
      this.channelHandle = channelHandle;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder endedAt(OffsetDateTime endedAt) {
      this.endedAt = endedAt;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder manageUrl(String manageUrl) {
      this.manageUrl = manageUrl;
      return this;
    }

    
    public Builder marketingChannelType(MarketingChannel marketingChannelType) {
      this.marketingChannelType = marketingChannelType;
      return this;
    }

    
    public Builder previewUrl(String previewUrl) {
      this.previewUrl = previewUrl;
      return this;
    }

    
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      return this;
    }

    
    public Builder scheduledToEndAt(OffsetDateTime scheduledToEndAt) {
      this.scheduledToEndAt = scheduledToEndAt;
      return this;
    }

    
    public Builder sourceAndMedium(String sourceAndMedium) {
      this.sourceAndMedium = sourceAndMedium;
      return this;
    }

    
    public Builder startedAt(OffsetDateTime startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    
    public Builder targetTypeDisplayText(String targetTypeDisplayText) {
      this.targetTypeDisplayText = targetTypeDisplayText;
      return this;
    }

    
    public Builder type(MarketingTactic type) {
      this.type = type;
      return this;
    }

    
    public Builder utmCampaign(String utmCampaign) {
      this.utmCampaign = utmCampaign;
      return this;
    }

    
    public Builder utmMedium(String utmMedium) {
      this.utmMedium = utmMedium;
      return this;
    }

    
    public Builder utmSource(String utmSource) {
      this.utmSource = utmSource;
      return this;
    }
  }
}
