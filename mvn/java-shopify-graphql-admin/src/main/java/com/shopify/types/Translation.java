package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Translation of a field of a resource.
 */
public class Translation {
  /**
   * On the resource that this translation belongs to, the reference to the value being translated.
   */
  private String key;

  /**
   * ISO code of the translation locale.
   */
  private String locale;

  /**
   * The market that the translation is specific to. Null value means the translation is available in all markets.
   */
  private Market market;

  /**
   * Whether the original content has changed since this translation was updated.
   */
  private boolean outdated;

  /**
   * The date and time when the translation was updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * Translation value.
   */
  private String value;

  public Translation() {
  }

  /**
   * On the resource that this translation belongs to, the reference to the value being translated.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * ISO code of the translation locale.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The market that the translation is specific to. Null value means the translation is available in all markets.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * Whether the original content has changed since this translation was updated.
   */
  public boolean getOutdated() {
    return outdated;
  }

  public void setOutdated(boolean outdated) {
    this.outdated = outdated;
  }

  /**
   * The date and time when the translation was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Translation value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Translation{key='" + key + "', locale='" + locale + "', market='" + market + "', outdated='" + outdated + "', updatedAt='" + updatedAt + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Translation that = (Translation) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(market, that.market) &&
        outdated == that.outdated &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, locale, market, outdated, updatedAt, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * On the resource that this translation belongs to, the reference to the value being translated.
     */
    private String key;

    /**
     * ISO code of the translation locale.
     */
    private String locale;

    /**
     * The market that the translation is specific to. Null value means the translation is available in all markets.
     */
    private Market market;

    /**
     * Whether the original content has changed since this translation was updated.
     */
    private boolean outdated;

    /**
     * The date and time when the translation was updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * Translation value.
     */
    private String value;

    public Translation build() {
      Translation result = new Translation();
      result.key = this.key;
      result.locale = this.locale;
      result.market = this.market;
      result.outdated = this.outdated;
      result.updatedAt = this.updatedAt;
      result.value = this.value;
      return result;
    }

    /**
     * On the resource that this translation belongs to, the reference to the value being translated.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * ISO code of the translation locale.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The market that the translation is specific to. Null value means the translation is available in all markets.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * Whether the original content has changed since this translation was updated.
     */
    public Builder outdated(boolean outdated) {
      this.outdated = outdated;
      return this;
    }

    /**
     * The date and time when the translation was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Translation value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
