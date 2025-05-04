package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields and values for creating or updating a translation.
 */
public class TranslationInput {
  /**
   * ISO code of the locale being translated into. Only locales returned in `shopLocales` are valid.
   */
  private String locale;

  /**
   * On the resource that this translation belongs to, the reference to the value being translated.
   */
  private String key;

  /**
   * The value of the translation.
   */
  private String value;

  /**
   * Hash digest representation of the content being translated.
   */
  private String translatableContentDigest;

  /**
   * The ID of the market that the translation is specific to. Not specifying this
   * field means that the translation will be available in all markets.
   */
  private String marketId;

  public TranslationInput() {
  }

  /**
   * ISO code of the locale being translated into. Only locales returned in `shopLocales` are valid.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
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
   * The value of the translation.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Hash digest representation of the content being translated.
   */
  public String getTranslatableContentDigest() {
    return translatableContentDigest;
  }

  public void setTranslatableContentDigest(String translatableContentDigest) {
    this.translatableContentDigest = translatableContentDigest;
  }

  /**
   * The ID of the market that the translation is specific to. Not specifying this
   * field means that the translation will be available in all markets.
   */
  public String getMarketId() {
    return marketId;
  }

  public void setMarketId(String marketId) {
    this.marketId = marketId;
  }

  @Override
  public String toString() {
    return "TranslationInput{locale='" + locale + "', key='" + key + "', value='" + value + "', translatableContentDigest='" + translatableContentDigest + "', marketId='" + marketId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslationInput that = (TranslationInput) o;
    return Objects.equals(locale, that.locale) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value) &&
        Objects.equals(translatableContentDigest, that.translatableContentDigest) &&
        Objects.equals(marketId, that.marketId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locale, key, value, translatableContentDigest, marketId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ISO code of the locale being translated into. Only locales returned in `shopLocales` are valid.
     */
    private String locale;

    /**
     * On the resource that this translation belongs to, the reference to the value being translated.
     */
    private String key;

    /**
     * The value of the translation.
     */
    private String value;

    /**
     * Hash digest representation of the content being translated.
     */
    private String translatableContentDigest;

    /**
     * The ID of the market that the translation is specific to. Not specifying this
     * field means that the translation will be available in all markets.
     */
    private String marketId;

    public TranslationInput build() {
      TranslationInput result = new TranslationInput();
      result.locale = this.locale;
      result.key = this.key;
      result.value = this.value;
      result.translatableContentDigest = this.translatableContentDigest;
      result.marketId = this.marketId;
      return result;
    }

    /**
     * ISO code of the locale being translated into. Only locales returned in `shopLocales` are valid.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * On the resource that this translation belongs to, the reference to the value being translated.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The value of the translation.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Hash digest representation of the content being translated.
     */
    public Builder translatableContentDigest(String translatableContentDigest) {
      this.translatableContentDigest = translatableContentDigest;
      return this;
    }

    /**
     * The ID of the market that the translation is specific to. Not specifying this
     * field means that the translation will be available in all markets.
     */
    public Builder marketId(String marketId) {
      this.marketId = marketId;
      return this;
    }
  }
}
