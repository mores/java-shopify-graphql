package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for Theme attributes to update.
 */
public class OnlineStoreThemeInput {
  /**
   * The new name of the theme.
   */
  private String name;

  public OnlineStoreThemeInput() {
  }

  /**
   * The new name of the theme.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "OnlineStoreThemeInput{name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OnlineStoreThemeInput that = (OnlineStoreThemeInput) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The new name of the theme.
     */
    private String name;

    public OnlineStoreThemeInput build() {
      OnlineStoreThemeInput result = new OnlineStoreThemeInput();
      result.name = this.name;
      return result;
    }

    /**
     * The new name of the theme.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
