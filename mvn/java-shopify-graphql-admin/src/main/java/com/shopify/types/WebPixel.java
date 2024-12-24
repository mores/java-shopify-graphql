package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebPixel implements com.shopify.types.Node {
  
  private String id;

  
  private String settings;

  public WebPixel() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }

  @Override
  public String toString() {
    return "WebPixel{id='" + id + "', settings='" + settings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPixel that = (WebPixel) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, settings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String settings;

    public WebPixel build() {
      WebPixel result = new WebPixel();
      result.id = this.id;
      result.settings = this.settings;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder settings(String settings) {
      this.settings = settings;
      return this;
    }
  }
}
