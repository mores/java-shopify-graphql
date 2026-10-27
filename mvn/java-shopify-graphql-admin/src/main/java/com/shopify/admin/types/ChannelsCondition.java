package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A condition checking the channel that the visitor is shopping from.
 */
public class ChannelsCondition {
  /**
   * The application level for the condition.
   */
  private MarketConditionApplicationType applicationLevel;

  /**
   * The channels that comprise the market.
   */
  private ChannelConnection channels;

  /**
   * The total number of channels condition.
   */
  private Count channelsCount;

  public ChannelsCondition() {
  }

  /**
   * The application level for the condition.
   */
  public MarketConditionApplicationType getApplicationLevel() {
    return applicationLevel;
  }

  public void setApplicationLevel(MarketConditionApplicationType applicationLevel) {
    this.applicationLevel = applicationLevel;
  }

  /**
   * The channels that comprise the market.
   */
  public ChannelConnection getChannels() {
    return channels;
  }

  public void setChannels(ChannelConnection channels) {
    this.channels = channels;
  }

  /**
   * The total number of channels condition.
   */
  public Count getChannelsCount() {
    return channelsCount;
  }

  public void setChannelsCount(Count channelsCount) {
    this.channelsCount = channelsCount;
  }

  @Override
  public String toString() {
    return "ChannelsCondition{applicationLevel='" + applicationLevel + "', channels='" + channels + "', channelsCount='" + channelsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelsCondition that = (ChannelsCondition) o;
    return Objects.equals(applicationLevel, that.applicationLevel) &&
        Objects.equals(channels, that.channels) &&
        Objects.equals(channelsCount, that.channelsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationLevel, channels, channelsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The application level for the condition.
     */
    private MarketConditionApplicationType applicationLevel;

    /**
     * The channels that comprise the market.
     */
    private ChannelConnection channels;

    /**
     * The total number of channels condition.
     */
    private Count channelsCount;

    public ChannelsCondition build() {
      ChannelsCondition result = new ChannelsCondition();
      result.applicationLevel = this.applicationLevel;
      result.channels = this.channels;
      result.channelsCount = this.channelsCount;
      return result;
    }

    /**
     * The application level for the condition.
     */
    public Builder applicationLevel(MarketConditionApplicationType applicationLevel) {
      this.applicationLevel = applicationLevel;
      return this;
    }

    /**
     * The channels that comprise the market.
     */
    public Builder channels(ChannelConnection channels) {
      this.channels = channels;
      return this;
    }

    /**
     * The total number of channels condition.
     */
    public Builder channelsCount(Count channelsCount) {
      this.channelsCount = channelsCount;
      return this;
    }
  }
}
