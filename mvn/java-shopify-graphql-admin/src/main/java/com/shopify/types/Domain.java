package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Domain implements com.shopify.types.Node {
  
  private String host;

  
  private String id;

  
  private DomainLocalization localization;

  
  private MarketWebPresence marketWebPresence;

  
  private boolean sslEnabled;

  
  private String url;

  public Domain() {
  }

  
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public DomainLocalization getLocalization() {
    return localization;
  }

  public void setLocalization(DomainLocalization localization) {
    this.localization = localization;
  }

  
  public MarketWebPresence getMarketWebPresence() {
    return marketWebPresence;
  }

  public void setMarketWebPresence(MarketWebPresence marketWebPresence) {
    this.marketWebPresence = marketWebPresence;
  }

  
  public boolean getSslEnabled() {
    return sslEnabled;
  }

  public void setSslEnabled(boolean sslEnabled) {
    this.sslEnabled = sslEnabled;
  }

  
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString() {
    return "Domain{host='" + host + "', id='" + id + "', localization='" + localization + "', marketWebPresence='" + marketWebPresence + "', sslEnabled='" + sslEnabled + "', url='" + url + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Domain that = (Domain) o;
    return Objects.equals(host, that.host) &&
        Objects.equals(id, that.id) &&
        Objects.equals(localization, that.localization) &&
        Objects.equals(marketWebPresence, that.marketWebPresence) &&
        sslEnabled == that.sslEnabled &&
        Objects.equals(url, that.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, id, localization, marketWebPresence, sslEnabled, url);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String host;

    
    private String id;

    
    private DomainLocalization localization;

    
    private MarketWebPresence marketWebPresence;

    
    private boolean sslEnabled;

    
    private String url;

    public Domain build() {
      Domain result = new Domain();
      result.host = this.host;
      result.id = this.id;
      result.localization = this.localization;
      result.marketWebPresence = this.marketWebPresence;
      result.sslEnabled = this.sslEnabled;
      result.url = this.url;
      return result;
    }

    
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder localization(DomainLocalization localization) {
      this.localization = localization;
      return this;
    }

    
    public Builder marketWebPresence(MarketWebPresence marketWebPresence) {
      this.marketWebPresence = marketWebPresence;
      return this;
    }

    
    public Builder sslEnabled(boolean sslEnabled) {
      this.sslEnabled = sslEnabled;
      return this;
    }

    
    public Builder url(String url) {
      this.url = url;
      return this;
    }
  }
}
