package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CustomerVisit implements com.shopify.types.CustomerMoment, com.shopify.types.Node {
  
  private String id;

  
  private String landingPage;

  
  private String landingPageHtml;

  
  private MarketingEvent marketingEvent;

  
  private OffsetDateTime occurredAt;

  
  private String referralCode;

  
  private String referralInfoHtml;

  
  private String referrerUrl;

  
  private String source;

  
  private String sourceDescription;

  
  private MarketingTactic sourceType;

  
  private UTMParameters utmParameters;

  public CustomerVisit() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(String landingPage) {
    this.landingPage = landingPage;
  }

  
  public String getLandingPageHtml() {
    return landingPageHtml;
  }

  public void setLandingPageHtml(String landingPageHtml) {
    this.landingPageHtml = landingPageHtml;
  }

  
  public MarketingEvent getMarketingEvent() {
    return marketingEvent;
  }

  public void setMarketingEvent(MarketingEvent marketingEvent) {
    this.marketingEvent = marketingEvent;
  }

  
  public OffsetDateTime getOccurredAt() {
    return occurredAt;
  }

  public void setOccurredAt(OffsetDateTime occurredAt) {
    this.occurredAt = occurredAt;
  }

  
  public String getReferralCode() {
    return referralCode;
  }

  public void setReferralCode(String referralCode) {
    this.referralCode = referralCode;
  }

  
  public String getReferralInfoHtml() {
    return referralInfoHtml;
  }

  public void setReferralInfoHtml(String referralInfoHtml) {
    this.referralInfoHtml = referralInfoHtml;
  }

  
  public String getReferrerUrl() {
    return referrerUrl;
  }

  public void setReferrerUrl(String referrerUrl) {
    this.referrerUrl = referrerUrl;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
  public String getSourceDescription() {
    return sourceDescription;
  }

  public void setSourceDescription(String sourceDescription) {
    this.sourceDescription = sourceDescription;
  }

  
  public MarketingTactic getSourceType() {
    return sourceType;
  }

  public void setSourceType(MarketingTactic sourceType) {
    this.sourceType = sourceType;
  }

  
  public UTMParameters getUtmParameters() {
    return utmParameters;
  }

  public void setUtmParameters(UTMParameters utmParameters) {
    this.utmParameters = utmParameters;
  }

  @Override
  public String toString() {
    return "CustomerVisit{id='" + id + "', landingPage='" + landingPage + "', landingPageHtml='" + landingPageHtml + "', marketingEvent='" + marketingEvent + "', occurredAt='" + occurredAt + "', referralCode='" + referralCode + "', referralInfoHtml='" + referralInfoHtml + "', referrerUrl='" + referrerUrl + "', source='" + source + "', sourceDescription='" + sourceDescription + "', sourceType='" + sourceType + "', utmParameters='" + utmParameters + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerVisit that = (CustomerVisit) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(landingPage, that.landingPage) &&
        Objects.equals(landingPageHtml, that.landingPageHtml) &&
        Objects.equals(marketingEvent, that.marketingEvent) &&
        Objects.equals(occurredAt, that.occurredAt) &&
        Objects.equals(referralCode, that.referralCode) &&
        Objects.equals(referralInfoHtml, that.referralInfoHtml) &&
        Objects.equals(referrerUrl, that.referrerUrl) &&
        Objects.equals(source, that.source) &&
        Objects.equals(sourceDescription, that.sourceDescription) &&
        Objects.equals(sourceType, that.sourceType) &&
        Objects.equals(utmParameters, that.utmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, landingPage, landingPageHtml, marketingEvent, occurredAt, referralCode, referralInfoHtml, referrerUrl, source, sourceDescription, sourceType, utmParameters);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String landingPage;

    
    private String landingPageHtml;

    
    private MarketingEvent marketingEvent;

    
    private OffsetDateTime occurredAt;

    
    private String referralCode;

    
    private String referralInfoHtml;

    
    private String referrerUrl;

    
    private String source;

    
    private String sourceDescription;

    
    private MarketingTactic sourceType;

    
    private UTMParameters utmParameters;

    public CustomerVisit build() {
      CustomerVisit result = new CustomerVisit();
      result.id = this.id;
      result.landingPage = this.landingPage;
      result.landingPageHtml = this.landingPageHtml;
      result.marketingEvent = this.marketingEvent;
      result.occurredAt = this.occurredAt;
      result.referralCode = this.referralCode;
      result.referralInfoHtml = this.referralInfoHtml;
      result.referrerUrl = this.referrerUrl;
      result.source = this.source;
      result.sourceDescription = this.sourceDescription;
      result.sourceType = this.sourceType;
      result.utmParameters = this.utmParameters;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder landingPage(String landingPage) {
      this.landingPage = landingPage;
      return this;
    }

    
    public Builder landingPageHtml(String landingPageHtml) {
      this.landingPageHtml = landingPageHtml;
      return this;
    }

    
    public Builder marketingEvent(MarketingEvent marketingEvent) {
      this.marketingEvent = marketingEvent;
      return this;
    }

    
    public Builder occurredAt(OffsetDateTime occurredAt) {
      this.occurredAt = occurredAt;
      return this;
    }

    
    public Builder referralCode(String referralCode) {
      this.referralCode = referralCode;
      return this;
    }

    
    public Builder referralInfoHtml(String referralInfoHtml) {
      this.referralInfoHtml = referralInfoHtml;
      return this;
    }

    
    public Builder referrerUrl(String referrerUrl) {
      this.referrerUrl = referrerUrl;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder sourceDescription(String sourceDescription) {
      this.sourceDescription = sourceDescription;
      return this;
    }

    
    public Builder sourceType(MarketingTactic sourceType) {
      this.sourceType = sourceType;
      return this;
    }

    
    public Builder utmParameters(UTMParameters utmParameters) {
      this.utmParameters = utmParameters;
      return this;
    }
  }
}
