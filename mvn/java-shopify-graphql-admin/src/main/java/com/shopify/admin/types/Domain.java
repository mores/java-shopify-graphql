package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * A unique string that represents the address of a Shopify store on the Internet.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Domain implements com.shopify.admin.types.Node {
  /**
   * The date and time when the domain was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The host name of the domain. For example, `example.com`.
   */
  private String host;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The localization of the domain, if the domain doesn't redirect.
   */
  private DomainLocalization localization;

  /**
   * The web presence of the domain.
   */
  private MarketWebPresence marketWebPresence;

  /**
   * Whether SSL is enabled.
   */
  private boolean sslEnabled;

  /**
   * The URL of the domain (for example, `https://example.com`).
   */
  private String url;

  public Domain() {
  }

  /**
   * The date and time when the domain was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The host name of the domain. For example, `example.com`.
   */
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
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
   * The localization of the domain, if the domain doesn't redirect.
   */
  public DomainLocalization getLocalization() {
    return localization;
  }

  public void setLocalization(DomainLocalization localization) {
    this.localization = localization;
  }

  /**
   * The web presence of the domain.
   */
  public MarketWebPresence getMarketWebPresence() {
    return marketWebPresence;
  }

  public void setMarketWebPresence(MarketWebPresence marketWebPresence) {
    this.marketWebPresence = marketWebPresence;
  }

  /**
   * Whether SSL is enabled.
   */
  public boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  /**
   * The URL of the domain (for example, `https://example.com`).
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Domain{createdAt='" + createdAt + "', host='" + host + "', id='" + id + "', localization='" + localization + "', marketWebPresence='" + marketWebPresence + "', sslEnabled='" + sslEnabled + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Domain that = (Domain) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(host, that.host) &&
        Objects.equals(id, that.id) &&
        Objects.equals(localization, that.localization) &&
        Objects.equals(marketWebPresence, that.marketWebPresence) &&
        sslEnabled == that.sslEnabled &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, host, id, localization, marketWebPresence, sslEnabled, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the domain was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The host name of the domain. For example, `example.com`.
     */
    private String host;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The localization of the domain, if the domain doesn't redirect.
     */
    private DomainLocalization localization;

    /**
     * The web presence of the domain.
     */
    private MarketWebPresence marketWebPresence;

    /**
     * Whether SSL is enabled.
     */
    private boolean sslEnabled;

    /**
     * The URL of the domain (for example, `https://example.com`).
     */
    private String url;

    public Domain build() {
      Domain result = new Domain();
      result.createdAt = this.createdAt;
      result.host = this.host;
      result.id = this.id;
      result.localization = this.localization;
      result.marketWebPresence = this.marketWebPresence;
      result.sslEnabled = this.sslEnabled;
      result.url = this.url;
      return result;
    }

    /**
     * The date and time when the domain was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The host name of the domain. For example, `example.com`.
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The localization of the domain, if the domain doesn't redirect.
     */
    public Builder localization(DomainLocalization localization) {
      this.localization = localization;
      return this;
    }

    /**
     * The web presence of the domain.
     */
    public Builder marketWebPresence(MarketWebPresence marketWebPresence) {
      this.marketWebPresence = marketWebPresence;
      return this;
    }

    /**
     * Whether SSL is enabled.
     */
    public Builder sslEnabled(boolean sslEnabled) {
      this.sslEnabled = sslEnabled;
      return this;
    }

    /**
     * The URL of the domain (for example, `https://example.com`).
     */
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
