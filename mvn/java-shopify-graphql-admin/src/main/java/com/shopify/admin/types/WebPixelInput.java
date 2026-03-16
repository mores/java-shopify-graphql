package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for creating or updating a web pixel.
 */
public class WebPixelInput {
  /**
   * The
   * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
   * for the web pixel. This object specifies configuration options that control the web pixel's functionality and behavior.
   * You can find the settings for a web pixel in `extensions/&lt;your_extension_name>/shopify.extension.toml`.
   */
  private String settings;

  public WebPixelInput() {
  }

  /**
   * The
   * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
   * for the web pixel. This object specifies configuration options that control the web pixel's functionality and behavior.
   * You can find the settings for a web pixel in `extensions/&lt;your_extension_name>/shopify.extension.toml`.
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
     * The
     * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
     * for the web pixel. This object specifies configuration options that control the web pixel's functionality and behavior.
     * You can find the settings for a web pixel in `extensions/&lt;your_extension_name>/shopify.extension.toml`.
     */
    private String settings;

    public WebPixelInput build() {
      WebPixelInput result = new WebPixelInput();
      result.settings = this.settings;
      return result;
    }

    /**
     * The
     * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
     * for the web pixel. This object specifies configuration options that control the web pixel's functionality and behavior.
     * You can find the settings for a web pixel in `extensions/&lt;your_extension_name>/shopify.extension.toml`.
     */
    public Builder settings(String settings) {
      this.settings = settings;
      return this;
    }
  }
}
