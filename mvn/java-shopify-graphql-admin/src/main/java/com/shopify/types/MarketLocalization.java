package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The market localization of a field within a resource, which is determined by the market ID.
 */
public class MarketLocalization {
  /**
   * A reference to the value being localized on the resource that this market localization belongs to.
   */
  private String key;

  /**
   * The market that the localization is specific to.
   */
  private Market market;

  /**
   * Whether the original content has changed since this market localization was updated.
   */
  private boolean outdated;

  /**
   * The date and time when the market localization was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * The value of the market localization.
   */
  private String value;

  public MarketLocalization() {
  }

  /**
   * A reference to the value being localized on the resource that this market localization belongs to.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The market that the localization is specific to.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * Whether the original content has changed since this market localization was updated.
   */
  public boolean getOutdated() {
    return outdated;
  }

  public void setOutdated(boolean outdated) {
    this.outdated = outdated;
  }

  /**
   * The date and time when the market localization was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * The value of the market localization.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MarketLocalization{key='" + key + "', market='" + market + "', outdated='" + outdated + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalization that = (MarketLocalization) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(market, that.market) &&
        outdated == that.outdated &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, market, outdated, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A reference to the value being localized on the resource that this market localization belongs to.
     */
    private String key;

    /**
     * The market that the localization is specific to.
     */
    private Market market;

    /**
     * Whether the original content has changed since this market localization was updated.
     */
    private boolean outdated;

    /**
     * The date and time when the market localization was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * The value of the market localization.
     */
    private String value;

    public MarketLocalization build() {
      MarketLocalization result = new MarketLocalization();
      result.key = this.key;
      result.market = this.market;
      result.outdated = this.outdated;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    /**
     * A reference to the value being localized on the resource that this market localization belongs to.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The market that the localization is specific to.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * Whether the original content has changed since this market localization was updated.
     */
    public Builder outdated(boolean outdated) {
      this.outdated = outdated;
      return this;
    }

    /**
     * The date and time when the market localization was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * The value of the market localization.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
