package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ChannelDefinition implements com.shopify.types.Node {
  
  private String channelName;

  
  private String handle;

  
  private String id;

  
  private boolean isMarketplace;

  
  private String subChannelName;

  
  private String svgIcon;

  public ChannelDefinition() {
  }

  
  public String getChannelName() {
    return channelName;
  }

  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }

  
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsMarketplace() {
    return isMarketplace;
  }

  public void setIsMarketplace(boolean isMarketplace) {
    this.isMarketplace = isMarketplace;
  }

  
  public String getSubChannelName() {
    return subChannelName;
  }

  public void setSubChannelName(String subChannelName) {
    this.subChannelName = subChannelName;
  }

  
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
    
    private String channelName;

    
    private String handle;

    
    private String id;

    
    private boolean isMarketplace;

    
    private String subChannelName;

    
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

    
    public Builder channelName(String channelName) {
      this.channelName = channelName;
      return this;
    }

    
    public Builder handle(String handle) {
      this.handle = handle;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isMarketplace(boolean isMarketplace) {
      this.isMarketplace = isMarketplace;
      return this;
    }

    
    public Builder subChannelName(String subChannelName) {
      this.subChannelName = subChannelName;
      return this;
    }

    
    public Builder svgIcon(String svgIcon) {
      this.svgIcon = svgIcon;
      return this;
    }
  }
}
