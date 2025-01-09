package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The market localizable content of a resource's field.
 */
public class MarketLocalizableContent {
  /**
   * The hash digest representation of the content value.
   */
  private String digest;

  /**
   * The resource field that's being localized.
   */
  private String key;

  /**
   * The content value.
   */
  private String value;

  public MarketLocalizableContent() {
  }

  /**
   * The hash digest representation of the content value.
   */
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  /**
   * The resource field that's being localized.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The content value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MarketLocalizableContent{digest='" + digest + "', key='" + key + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketLocalizableContent that = (MarketLocalizableContent) o;
    return Objects.equals(digest, that.digest) &&
        Objects.equals(key, that.key) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, key, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The hash digest representation of the content value.
     */
    private String digest;

    /**
     * The resource field that's being localized.
     */
    private String key;

    /**
     * The content value.
     */
    private String value;

    public MarketLocalizableContent build() {
      MarketLocalizableContent result = new MarketLocalizableContent();
      result.digest = this.digest;
      result.key = this.key;
      result.value = this.value;
      return result;
    }

    /**
     * The hash digest representation of the content value.
     */
    public Builder digest(String digest) {
      this.digest = digest;
      return this;
    }

    /**
     * The resource field that's being localized.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The content value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
