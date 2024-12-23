package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Represents an object containing all information for channels available to a shop.
 */
public class AvailableChannelDefinitionsByChannel {
  /**
   * The channel definitions for channels installed on a shop.
   */
  private List<ChannelDefinition> channelDefinitions;

  /**
   * The name of the channel.
   */
  private String channelName;

  public AvailableChannelDefinitionsByChannel() {
  }

  /**
   * The channel definitions for channels installed on a shop.
   */
  public List<ChannelDefinition> getChannelDefinitions() {
    return channelDefinitions;
  }

  public void setChannelDefinitions(List<ChannelDefinition> channelDefinitions) {
    this.channelDefinitions = channelDefinitions;
  }

  /**
   * The name of the channel.
   */
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  @Override
  public String toString() {
    return "AvailableChannelDefinitionsByChannel{channelDefinitions='" + channelDefinitions + "', channelName='" + channelName + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AvailableChannelDefinitionsByChannel that = (AvailableChannelDefinitionsByChannel) o;
    return Objects.equals(channelDefinitions, that.channelDefinitions) &&
        Objects.equals(channelName, that.channelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelDefinitions, channelName);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The channel definitions for channels installed on a shop.
     */
    private List<ChannelDefinition> channelDefinitions;

    /**
     * The name of the channel.
     */
    private String channelName;

    public AvailableChannelDefinitionsByChannel build() {
      AvailableChannelDefinitionsByChannel result = new AvailableChannelDefinitionsByChannel();
      result.channelDefinitions = this.channelDefinitions;
      result.channelName = this.channelName;
      return result;
    }

    /**
     * The channel definitions for channels installed on a shop.
     */
    public Builder channelDefinitions(List<ChannelDefinition> channelDefinitions) {
      this.channelDefinitions = channelDefinitions;
      return this;
    }

    /**
     * The name of the channel.
     */
    public Builder channelName(String channelName) {
      this.channelName = channelName;
      return this;
    }
  }
}
