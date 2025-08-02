package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The `WebPixel` object enables you to manage JavaScript code snippets
 * that run on an online store and collect
 * [behavioral data](https://shopify.dev/docs/api/web-pixels-api/standard-events)
 * for marketing campaign optimization and analytics.
 *
 * Learn how to create a
 * [web pixel extension](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels)
 * to subscribe your app to events that are emitted by Shopify.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebPixel implements com.shopify.admin.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The
   * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
   * for the web pixel. This object specifies configuration options that control
   * the web pixel's functionality and behavior. You can find the settings for a web pixel in
   * `extensions/&lt;your_extension_name&gt;/shopify.extension.toml`.
   */
  private String settings;

  public WebPixel() {
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

  /**
   * The
   * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
   * for the web pixel. This object specifies configuration options that control
   * the web pixel's functionality and behavior. You can find the settings for a web pixel in
   * `extensions/&lt;your_extension_name&gt;/shopify.extension.toml`.
   */
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
    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The
     * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
     * for the web pixel. This object specifies configuration options that control
     * the web pixel's functionality and behavior. You can find the settings for a web pixel in
     * `extensions/&lt;your_extension_name&gt;/shopify.extension.toml`.
     */
    private String settings;

    public WebPixel build() {
      WebPixel result = new WebPixel();
      result.id = this.id;
      result.settings = this.settings;
      return result;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The
     * [settings object](https://shopify.dev/docs/apps/build/marketing-analytics/build-web-pixels#step-2-define-your-web-pixel-settings)
     * for the web pixel. This object specifies configuration options that control
     * the web pixel's functionality and behavior. You can find the settings for a web pixel in
     * `extensions/&lt;your_extension_name&gt;/shopify.extension.toml`.
     */
    public Builder settings(String settings) {
      this.settings = settings;
      return this;
    }
  }
}
