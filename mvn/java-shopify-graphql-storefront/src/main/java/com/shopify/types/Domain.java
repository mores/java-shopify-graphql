package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Represents a web address.
 */
public class Domain {
  /**
   * The host name of the domain (eg: `example.com`).
   */
  private String host;

  /**
   * Whether SSL is enabled or not.
   */
  private boolean sslEnabled;

  /**
   * The URL of the domain (eg: `https://example.com`).
   */
  private String url;

  public Domain() {
  }

  /**
   * The host name of the domain (eg: `example.com`).
   */
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  /**
   * Whether SSL is enabled or not.
   */
  public boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  /**
   * The URL of the domain (eg: `https://example.com`).
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Domain{host='" + host + "', sslEnabled='" + sslEnabled + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Domain that = (Domain) o;
    return Objects.equals(host, that.host) &&
        sslEnabled == that.sslEnabled &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, sslEnabled, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The host name of the domain (eg: `example.com`).
     */
    private String host;

    /**
     * Whether SSL is enabled or not.
     */
    private boolean sslEnabled;

    /**
     * The URL of the domain (eg: `https://example.com`).
     */
    private String url;

    public Domain build() {
      Domain result = new Domain();
      result.host = this.host;
      result.sslEnabled = this.sslEnabled;
      result.url = this.url;
      return result;
    }

    /**
     * The host name of the domain (eg: `example.com`).
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Whether SSL is enabled or not.
     */
    public Builder sslEnabled(boolean sslEnabled) {
      this.sslEnabled = sslEnabled;
      return this;
    }

    /**
     * The URL of the domain (eg: `https://example.com`).
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
