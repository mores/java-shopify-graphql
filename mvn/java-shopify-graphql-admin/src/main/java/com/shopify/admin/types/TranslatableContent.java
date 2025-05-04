package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Translatable content of a resource's field.
 */
public class TranslatableContent {
  /**
   * Hash digest representation of the content value.
   */
  private String digest;

  /**
   * The resource field that's being translated.
   */
  private String key;

  /**
   * Locale of the content.
   */
  private String locale;

  /**
   * Type of the translatable content.
   */
  private LocalizableContentType type;

  /**
   * Content value.
   */
  private String value;

  public TranslatableContent() {
  }

  /**
   * Hash digest representation of the content value.
   */
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  /**
   * The resource field that's being translated.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * Locale of the content.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Type of the translatable content.
   */
  public LocalizableContentType getType() {
    return type;
  }

  public void setType(LocalizableContentType type) {
    this.type = type;
  }

  /**
   * Content value.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "TranslatableContent{digest='" + digest + "', key='" + key + "', locale='" + locale + "', type='" + type + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TranslatableContent that = (TranslatableContent) o;
    return Objects.equals(digest, that.digest) &&
        Objects.equals(key, that.key) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(type, that.type) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digest, key, locale, type, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Hash digest representation of the content value.
     */
    private String digest;

    /**
     * The resource field that's being translated.
     */
    private String key;

    /**
     * Locale of the content.
     */
    private String locale;

    /**
     * Type of the translatable content.
     */
    private LocalizableContentType type;

    /**
     * Content value.
     */
    private String value;

    public TranslatableContent build() {
      TranslatableContent result = new TranslatableContent();
      result.digest = this.digest;
      result.key = this.key;
      result.locale = this.locale;
      result.type = this.type;
      result.value = this.value;
      return result;
    }

    /**
     * Hash digest representation of the content value.
     */
    public Builder digest(String digest) {
      this.digest = digest;
      return this;
    }

    /**
     * The resource field that's being translated.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Locale of the content.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Type of the translatable content.
     */
    public Builder type(LocalizableContentType type) {
      this.type = type;
      return this;
    }

    /**
     * Content value.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
