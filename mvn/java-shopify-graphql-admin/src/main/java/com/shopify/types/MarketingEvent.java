package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents actions that market a merchant's store or products.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class MarketingEvent implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  /**
   * The app that the marketing event is attributed to.
   */
  private App app;

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  private MarketingChannel channel;

  /**
   * The unique string identifier of the channel to which this activity belongs.
   * For the correct handle for your channel, contact your partner manager.
   */
  private String channelHandle;

  /**
   * A human-readable description of the marketing event.
   */
  private String description;

  /**
   * The date and time when the marketing event ended.
   */
  private OffsetDateTime endedAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The URL where the marketing event can be managed.
   */
  private String manageUrl;

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  private MarketingChannel marketingChannelType;

  /**
   * The URL where the marketing event can be previewed.
   */
  private String previewUrl;

  /**
   * An optional ID that helps Shopify validate engagement data.
   */
  private String remoteId;

  /**
   * The date and time when the marketing event is scheduled to end.
   */
  private OffsetDateTime scheduledToEndAt;

  /**
   * Where the `MarketingEvent` occurred and what kind of content was used.
   * Because `utmSource` and `utmMedium` are often used interchangeably, this is
   * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
   * provide a consistent representation for any given piece of marketing
   * regardless of the app that created it.
   */
  private String sourceAndMedium;

  /**
   * The date and time when the marketing event started.
   */
  private OffsetDateTime startedAt;

  /**
   * The display text for the marketing event type.
   */
  private String targetTypeDisplayText;

  /**
   * The marketing event type.
   */
  private MarketingTactic type;

  /**
   * The name of the marketing campaign.
   */
  private String utmCampaign;

  /**
   * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
   */
  private String utmMedium;

  /**
   * The referrer of the marketing event. Example values: `google`, `newsletter`.
   */
  private String utmSource;

  public MarketingEvent() {
  }

  /**
   * The app that the marketing event is attributed to.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
   */
  public MarketingChannel getChannel() {
    return channel;
  }

  public void setChannel(MarketingChannel channel) {
    this.channel = channel;
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
   * A human-readable description of the marketing event.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The date and time when the marketing event ended.
   */
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
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
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The URL where the marketing event can be managed.
   */
  public String getManageUrl() {
    return manageUrl;
  }

  public void setManageUrl(String manageUrl) {
    this.manageUrl = manageUrl;
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
   * The URL where the marketing event can be previewed.
   */
  public String getPreviewUrl() {
    return previewUrl;
  }

  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }

  /**
   * An optional ID that helps Shopify validate engagement data.
   */
  public String getRemoteId() {
    return remoteId;
  }

  public void setRemoteId(String remoteId) {
    this.remoteId = remoteId;
  }

  /**
   * The date and time when the marketing event is scheduled to end.
   */
  public OffsetDateTime getScheduledToEndAt() {
    return scheduledToEndAt;
  }

  public void setScheduledToEndAt(OffsetDateTime scheduledToEndAt) {
    this.scheduledToEndAt = scheduledToEndAt;
  }

  /**
   * Where the `MarketingEvent` occurred and what kind of content was used.
   * Because `utmSource` and `utmMedium` are often used interchangeably, this is
   * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
   * provide a consistent representation for any given piece of marketing
   * regardless of the app that created it.
   */
  public String getSourceAndMedium() {
    return sourceAndMedium;
  }

  public void setSourceAndMedium(String sourceAndMedium) {
    this.sourceAndMedium = sourceAndMedium;
  }

  /**
   * The date and time when the marketing event started.
   */
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * The display text for the marketing event type.
   */
  public String getTargetTypeDisplayText() {
    return targetTypeDisplayText;
  }

  public void setTargetTypeDisplayText(String targetTypeDisplayText) {
    this.targetTypeDisplayText = targetTypeDisplayText;
  }

  /**
   * The marketing event type.
   */
  public MarketingTactic getType() {
    return type;
  }

  public void setType(MarketingTactic type) {
    this.type = type;
  }

  /**
   * The name of the marketing campaign.
   */
  public String getUtmCampaign() {
    return utmCampaign;
  }

  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }

  /**
   * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
   */
  public String getUtmMedium() {
    return utmMedium;
  }

  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }

  /**
   * The referrer of the marketing event. Example values: `google`, `newsletter`.
   */
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
    /**
     * The app that the marketing event is attributed to.
     */
    private App app;

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    private MarketingChannel channel;

    /**
     * The unique string identifier of the channel to which this activity belongs.
     * For the correct handle for your channel, contact your partner manager.
     */
    private String channelHandle;

    /**
     * A human-readable description of the marketing event.
     */
    private String description;

    /**
     * The date and time when the marketing event ended.
     */
    private OffsetDateTime endedAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The URL where the marketing event can be managed.
     */
    private String manageUrl;

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    private MarketingChannel marketingChannelType;

    /**
     * The URL where the marketing event can be previewed.
     */
    private String previewUrl;

    /**
     * An optional ID that helps Shopify validate engagement data.
     */
    private String remoteId;

    /**
     * The date and time when the marketing event is scheduled to end.
     */
    private OffsetDateTime scheduledToEndAt;

    /**
     * Where the `MarketingEvent` occurred and what kind of content was used.
     * Because `utmSource` and `utmMedium` are often used interchangeably, this is
     * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
     * provide a consistent representation for any given piece of marketing
     * regardless of the app that created it.
     */
    private String sourceAndMedium;

    /**
     * The date and time when the marketing event started.
     */
    private OffsetDateTime startedAt;

    /**
     * The display text for the marketing event type.
     */
    private String targetTypeDisplayText;

    /**
     * The marketing event type.
     */
    private MarketingTactic type;

    /**
     * The name of the marketing campaign.
     */
    private String utmCampaign;

    /**
     * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
     */
    private String utmMedium;

    /**
     * The referrer of the marketing event. Example values: `google`, `newsletter`.
     */
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

    /**
     * The app that the marketing event is attributed to.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The medium through which the marketing activity and event reached consumers. This is used for reporting aggregation.
     */
    public Builder channel(MarketingChannel channel) {
      this.channel = channel;
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
     * A human-readable description of the marketing event.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The date and time when the marketing event ended.
     */
    public Builder endedAt(OffsetDateTime endedAt) {
      this.endedAt = endedAt;
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
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The URL where the marketing event can be managed.
     */
    public Builder manageUrl(String manageUrl) {
      this.manageUrl = manageUrl;
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
     * The URL where the marketing event can be previewed.
     */
    public Builder previewUrl(String previewUrl) {
      this.previewUrl = previewUrl;
      return this;
    }

    /**
     * An optional ID that helps Shopify validate engagement data.
     */
    public Builder remoteId(String remoteId) {
      this.remoteId = remoteId;
      return this;
    }

    /**
     * The date and time when the marketing event is scheduled to end.
     */
    public Builder scheduledToEndAt(OffsetDateTime scheduledToEndAt) {
      this.scheduledToEndAt = scheduledToEndAt;
      return this;
    }

    /**
     * Where the `MarketingEvent` occurred and what kind of content was used.
     * Because `utmSource` and `utmMedium` are often used interchangeably, this is
     * based on a combination of `marketingChannel`, `referringDomain`, and `type` to
     * provide a consistent representation for any given piece of marketing
     * regardless of the app that created it.
     */
    public Builder sourceAndMedium(String sourceAndMedium) {
      this.sourceAndMedium = sourceAndMedium;
      return this;
    }

    /**
     * The date and time when the marketing event started.
     */
    public Builder startedAt(OffsetDateTime startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     * The display text for the marketing event type.
     */
    public Builder targetTypeDisplayText(String targetTypeDisplayText) {
      this.targetTypeDisplayText = targetTypeDisplayText;
      return this;
    }

    /**
     * The marketing event type.
     */
    public Builder type(MarketingTactic type) {
      this.type = type;
      return this;
    }

    /**
     * The name of the marketing campaign.
     */
    public Builder utmCampaign(String utmCampaign) {
      this.utmCampaign = utmCampaign;
      return this;
    }

    /**
     * The medium that the marketing campaign is using. Example values: `cpc`, `banner`.
     */
    public Builder utmMedium(String utmMedium) {
      this.utmMedium = utmMedium;
      return this;
    }

    /**
     * The referrer of the marketing event. Example values: `google`, `newsletter`.
     */
    public Builder utmSource(String utmSource) {
      this.utmSource = utmSource;
      return this;
    }
  }
}
