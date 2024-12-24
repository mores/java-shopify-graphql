package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppUsagePricing implements AppPricingDetails {
  
  private MoneyV2 balanceUsed;

  
  private MoneyV2 cappedAmount;

  
  private AppPricingInterval interval;

  
  private String terms;

  public AppUsagePricing() {
  }

  
  public MoneyV2 getBalanceUsed() {
    return balanceUsed;
  }

  public void setBalanceUsed(MoneyV2 balanceUsed) {
    this.balanceUsed = balanceUsed;
  }

  
  public MoneyV2 getCappedAmount() {
    return cappedAmount;
  }

  public void setCappedAmount(MoneyV2 cappedAmount) {
    this.cappedAmount = cappedAmount;
  }

  
  public AppPricingInterval getInterval() {
    return interval;
  }

  public void setInterval(AppPricingInterval interval) {
    this.interval = interval;
  }

  
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  @Override
  public String toString() {
    return "AppUsagePricing{balanceUsed='" + balanceUsed + "', cappedAmount='" + cappedAmount + "', interval='" + interval + "', terms='" + terms + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppUsagePricing that = (AppUsagePricing) o;
    return Objects.equals(balanceUsed, that.balanceUsed) &&
        Objects.equals(cappedAmount, that.cappedAmount) &&
        Objects.equals(interval, that.interval) &&
        Objects.equals(terms, that.terms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceUsed, cappedAmount, interval, terms);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 balanceUsed;

    
    private MoneyV2 cappedAmount;

    
    private AppPricingInterval interval;

    
    private String terms;

    public AppUsagePricing build() {
      AppUsagePricing result = new AppUsagePricing();
      result.balanceUsed = this.balanceUsed;
      result.cappedAmount = this.cappedAmount;
      result.interval = this.interval;
      result.terms = this.terms;
      return result;
    }

    
    public Builder balanceUsed(MoneyV2 balanceUsed) {
      this.balanceUsed = balanceUsed;
      return this;
    }

    
    public Builder cappedAmount(MoneyV2 cappedAmount) {
      this.cappedAmount = cappedAmount;
      return this;
    }

    
    public Builder interval(AppPricingInterval interval) {
      this.interval = interval;
      return this;
    }

    
    public Builder terms(String terms) {
      this.terms = terms;
      return this;
    }
  }
}
