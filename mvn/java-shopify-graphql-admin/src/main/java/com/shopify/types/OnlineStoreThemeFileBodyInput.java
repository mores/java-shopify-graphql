package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OnlineStoreThemeFileBodyInput {
  
  private OnlineStoreThemeFileBodyInputType type;

  
  private String value;

  public OnlineStoreThemeFileBodyInput() {
  }

  
  public OnlineStoreThemeFileBodyInputType getType() {
    return type;
  }

  public void setType(OnlineStoreThemeFileBodyInputType type) {
    this.type = type;
  }

  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeFileBodyInput{type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeFileBodyInput that = (OnlineStoreThemeFileBodyInput) o;
    return Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OnlineStoreThemeFileBodyInputType type;

    
    private String value;

    public OnlineStoreThemeFileBodyInput build() {
      OnlineStoreThemeFileBodyInput result = new OnlineStoreThemeFileBodyInput();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    
    public Builder type(OnlineStoreThemeFileBodyInputType type) {
      this.type = type;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
