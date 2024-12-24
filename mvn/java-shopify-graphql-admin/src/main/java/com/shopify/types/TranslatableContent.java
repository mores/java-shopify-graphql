package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class TranslatableContent {
  
  private String digest;

  
  private String key;

  
  private String locale;

  
  private LocalizableContentType type;

  
  private String value;

  public TranslatableContent() {
  }

  
  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public LocalizableContentType getType() {
    return type;
  }

  public void setType(LocalizableContentType type) {
    this.type = type;
  }

  
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
    
    private String digest;

    
    private String key;

    
    private String locale;

    
    private LocalizableContentType type;

    
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

    
    public Builder digest(String digest) {
      this.digest = digest;
      return this;
    }

    
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder type(LocalizableContentType type) {
      this.type = type;
      return this;
    }

    
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
