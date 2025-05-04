package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A channel definition represents channels surfaces on the platform.
 * A channel definition can be a platform or a subsegment of it such as Facebook
 * Home, Instagram Live, Instagram Shops, or WhatsApp chat.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ChannelDefinition implements com.shopify.admin.types.Node {
  /**
   * Name of the channel that this sub channel belongs to.
   */
  private String channelName;

  /**
   * Unique string used as a public identifier for the channel definition.
   */
  private String handle;

  /**
   * The unique ID for the channel definition.
   */
  private String id;

  /**
   * Whether this channel definition represents a marketplace.
   */
  private boolean isMarketplace;

  /**
   * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
   */
  private String subChannelName;

  /**
   * Icon displayed when showing the channel in admin.
   */
  private String svgIcon;

  public ChannelDefinition() {
  }

  /**
   * Name of the channel that this sub channel belongs to.
   */
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  /**
   * Unique string used as a public identifier for the channel definition.
   */
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  /**
   * The unique ID for the channel definition.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether this channel definition represents a marketplace.
   */
  public boolean getIsMarketplace() {
    return isMarketplace;
  }

  public void setIsMarketplace(boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
  }

  /**
   * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
   */
  public String getSubChannelName() {
    return subChannelName;
  }

  public void setSubChannelName(String subChannelName) {
    this.subChannelName = subChannelName;
  }

  /**
   * Icon displayed when showing the channel in admin.
   */
  public String getSvgIcon() {
    return svgIcon;
  }

  public void setSvgIcon(String svgIcon) {
    this.svgIcon = svgIcon;
  }

  @Override
  public String toString() {
    return "ChannelDefinition{channelName='" + channelName + "', handle='" + handle + "', id='" + id + "', isMarketplace='" + isMarketplace + "', subChannelName='" + subChannelName + "', svgIcon='" + svgIcon + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelDefinition that = (ChannelDefinition) o;
    return Objects.equals(channelName, that.channelName) &&
        Objects.equals(handle, that.handle) &&
        Objects.equals(id, that.id) &&
        isMarketplace == that.isMarketplace &&
        Objects.equals(subChannelName, that.subChannelName) &&
        Objects.equals(svgIcon, that.svgIcon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelName, handle, id, isMarketplace, subChannelName, svgIcon);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Name of the channel that this sub channel belongs to.
     */
    private String channelName;

    /**
     * Unique string used as a public identifier for the channel definition.
     */
    private String handle;

    /**
     * The unique ID for the channel definition.
     */
    private String id;

    /**
     * Whether this channel definition represents a marketplace.
     */
    private boolean isMarketplace;

    /**
     * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
     */
    private String subChannelName;

    /**
     * Icon displayed when showing the channel in admin.
     */
    private String svgIcon;

    public ChannelDefinition build() {
      ChannelDefinition result = new ChannelDefinition();
      result.channelName = this.channelName;
      result.handle = this.handle;
      result.id = this.id;
      result.isMarketplace = this.isMarketplace;
      result.subChannelName = this.subChannelName;
      result.svgIcon = this.svgIcon;
      return result;
    }

    /**
     * Name of the channel that this sub channel belongs to.
     */
    public Builder channelName(String channelName) {
      this.channelName = channelName;
      return this;
    }

    /**
     * Unique string used as a public identifier for the channel definition.
     */
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    /**
     * The unique ID for the channel definition.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether this channel definition represents a marketplace.
     */
    public Builder isMarketplace(boolean isMarketplace) {
      this.isMarketplace = isMarketplace;
      return this;
    }

    /**
     * Name of the sub channel (e.g. Online Store, Instagram Shopping, TikTok Live).
     */
    public Builder subChannelName(String subChannelName) {
      this.subChannelName = subChannelName;
      return this;
    }

    /**
     * Icon displayed when showing the channel in admin.
     */
    public Builder svgIcon(String svgIcon) {
      this.svgIcon = svgIcon;
      return this;
    }
  }
}
