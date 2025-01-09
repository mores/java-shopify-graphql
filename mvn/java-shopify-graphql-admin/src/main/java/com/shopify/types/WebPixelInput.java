package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to use to update a web pixel.
 */
public class WebPixelInput {
  /**
   * The web pixel settings in JSON format.
   */
  private String settings;

  public WebPixelInput() {
  }

  /**
   * The web pixel settings in JSON format.
   */
  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }

  @Override
  public String toString() {
    return "WebPixelInput{settings='" + settings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPixelInput that = (WebPixelInput) o;
    return Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The web pixel settings in JSON format.
     */
    private String settings;

    public WebPixelInput build() {
      WebPixelInput result = new WebPixelInput();
      result.settings = this.settings;
      return result;
    }

    /**
     * The web pixel settings in JSON format.
     */
    public Builder settings(String settings) {
      this.settings = settings;
      return this;
    }
  }
}
