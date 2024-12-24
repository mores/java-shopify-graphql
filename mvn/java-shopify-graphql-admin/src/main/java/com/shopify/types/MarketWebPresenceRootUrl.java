package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketWebPresenceRootUrl {
  
  private String locale;

  
  private String url;

  public MarketWebPresenceRootUrl() {
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "MarketWebPresenceRootUrl{locale='" + locale + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketWebPresenceRootUrl that = (MarketWebPresenceRootUrl) o;
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
    
    private String locale;

    
    private String url;

    public MarketWebPresenceRootUrl build() {
      MarketWebPresenceRootUrl result = new MarketWebPresenceRootUrl();
      result.locale = this.locale;
      result.url = this.url;
      return result;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
