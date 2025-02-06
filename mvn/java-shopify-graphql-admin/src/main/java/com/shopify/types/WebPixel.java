package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A web pixel settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebPixel implements com.shopify.types.Node {
  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The settings JSON object for the web pixel.
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
   * The settings JSON object for the web pixel.
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
     * The settings JSON object for the web pixel.
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
     * The settings JSON object for the web pixel.
     */
    public Builder settings(String settings) {
      this.settings = settings;
      return this;
    }
  }
}
