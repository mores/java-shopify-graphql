package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for the theme file body.
 */
public class OnlineStoreThemeFileBodyInput {
  /**
   * The input type of the theme file body.
   */
  private OnlineStoreThemeFileBodyInputType type;

  /**
   * The body of the theme file.
   */
  private String value;

  public OnlineStoreThemeFileBodyInput() {
  }

  /**
   * The input type of the theme file body.
   */
  public OnlineStoreThemeFileBodyInputType getType() {
    return type;
  }

  public void setType(OnlineStoreThemeFileBodyInputType type) {
    this.type = type;
  }

  /**
   * The body of the theme file.
   */
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
    /**
     * The input type of the theme file body.
     */
    private OnlineStoreThemeFileBodyInputType type;

    /**
     * The body of the theme file.
     */
    private String value;

    public OnlineStoreThemeFileBodyInput build() {
      OnlineStoreThemeFileBodyInput result = new OnlineStoreThemeFileBodyInput();
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * The input type of the theme file body.
     */
    public Builder type(OnlineStoreThemeFileBodyInputType type) {
      this.type = type;
      return this;
    }

    /**
     * The body of the theme file.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
