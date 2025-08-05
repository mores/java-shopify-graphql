package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Contains the information for a given sales channel.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ChannelInformation implements com.shopify.admin.types.Node {
  /**
   * The app associated with the channel.
   */
  private App app;

  /**
   * The channel definition associated with the channel.
   */
  private ChannelDefinition channelDefinition;

  /**
   * The unique ID for the channel.
   */
  private String channelId;

  /**
   * The publishing destination display name or channel name.
   */
  private String displayName;

  /**
   * A globally-unique ID.
   */
  private String id;

  public ChannelInformation() {
  }

  /**
   * The app associated with the channel.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The channel definition associated with the channel.
   */
  public ChannelDefinition getChannelDefinition() {
    return channelDefinition;
  }

  public void setChannelDefinition(ChannelDefinition channelDefinition) {
    this.channelDefinition = channelDefinition;
  }

  /**
   * The unique ID for the channel.
   */
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  /**
   * The publishing destination display name or channel name.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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

  @Override
  public String toString() {
    return "ChannelInformation{app='" + app + "', channelDefinition='" + channelDefinition + "', channelId='" + channelId + "', displayName='" + displayName + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelInformation that = (ChannelInformation) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(channelDefinition, that.channelDefinition) &&
        Objects.equals(channelId, that.channelId) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, channelDefinition, channelId, displayName, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The app associated with the channel.
     */
    private App app;

    /**
     * The channel definition associated with the channel.
     */
    private ChannelDefinition channelDefinition;

    /**
     * The unique ID for the channel.
     */
    private String channelId;

    /**
     * The publishing destination display name or channel name.
     */
    private String displayName;

    /**
     * A globally-unique ID.
     */
    private String id;

    public ChannelInformation build() {
      ChannelInformation result = new ChannelInformation();
      result.app = this.app;
      result.channelDefinition = this.channelDefinition;
      result.channelId = this.channelId;
      result.displayName = this.displayName;
      result.id = this.id;
      return result;
    }

    /**
     * The app associated with the channel.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The channel definition associated with the channel.
     */
    public Builder channelDefinition(ChannelDefinition channelDefinition) {
      this.channelDefinition = channelDefinition;
      return this;
    }

    /**
     * The unique ID for the channel.
     */
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    /**
     * The publishing destination display name or channel name.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
