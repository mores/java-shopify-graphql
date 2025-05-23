package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The URL for the homepage of the online store in the context of the web presence and a
 * particular locale.
 */
public class WebPresenceRootUrl {
  /**
   * The locale that the storefront loads in.
   */
  private String locale;

  /**
   * The URL.
   */
  private String url;

  public WebPresenceRootUrl() {
  }

  /**
   * The locale that the storefront loads in.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The URL.
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "WebPresenceRootUrl{locale='" + locale + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebPresenceRootUrl that = (WebPresenceRootUrl) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The locale that the storefront loads in.
     */
    private String locale;

    /**
     * The URL.
     */
    private String url;

    public WebPresenceRootUrl build() {
      WebPresenceRootUrl result = new WebPresenceRootUrl();
      result.locale = this.locale;
      result.url = this.url;
      return result;
    }

    /**
     * The locale that the storefront loads in.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The URL.
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
