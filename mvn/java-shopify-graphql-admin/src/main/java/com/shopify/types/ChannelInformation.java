package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ChannelInformation implements com.shopify.types.Node {
  
  private App app;

  
  private ChannelDefinition channelDefinition;

  
  private String channelId;

  
  private String id;

  public ChannelInformation() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
  public ChannelDefinition getChannelDefinition() {
    return channelDefinition;
  }

  public void setChannelDefinition(ChannelDefinition channelDefinition) {
    this.channelDefinition = channelDefinition;
  }

  
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "ChannelInformation{app='" + app + "', channelDefinition='" + channelDefinition + "', channelId='" + channelId + "', id='" + id + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChannelInformation that = (ChannelInformation) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(channelDefinition, that.channelDefinition) &&
        Objects.equals(channelId, that.channelId) &&
        Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, channelDefinition, channelId, id);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private App app;

    
    private ChannelDefinition channelDefinition;

    
    private String channelId;

    
    private String id;

    public ChannelInformation build() {
      ChannelInformation result = new ChannelInformation();
      result.app = this.app;
      result.channelDefinition = this.channelDefinition;
      result.channelId = this.channelId;
      result.id = this.id;
      return result;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder channelDefinition(ChannelDefinition channelDefinition) {
      this.channelDefinition = channelDefinition;
      return this;
    }

    
    public Builder channelId(String channelId) {
      this.channelId = channelId;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }
}
