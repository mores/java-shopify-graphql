package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a channel market condition.
 */
public class MarketConditionsChannelsInput {
  /**
   * A list of channel IDs to include in the market condition.
   */
  private List<String> channelIds;

  public MarketConditionsChannelsInput() {
  }

  /**
   * A list of channel IDs to include in the market condition.
   */
  public List<String> getChannelIds() {
    return channelIds;
  }

  public void setChannelIds(List<String> channelIds) {
    this.channelIds = channelIds;
  }

  @Override
  public String toString() {
    return "MarketConditionsChannelsInput{channelIds='" + channelIds + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketConditionsChannelsInput that = (MarketConditionsChannelsInput) o;
    return Objects.equals(channelIds, that.channelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelIds);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of channel IDs to include in the market condition.
     */
    private List<String> channelIds;

    public MarketConditionsChannelsInput build() {
      MarketConditionsChannelsInput result = new MarketConditionsChannelsInput();
      result.channelIds = this.channelIds;
      return result;
    }

    /**
     * A list of channel IDs to include in the market condition.
     */
    public Builder channelIds(List<String> channelIds) {
      this.channelIds = channelIds;
      return this;
    }
  }
}
