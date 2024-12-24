package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class MarketingActivityCreateInput {
  
  private String marketingActivityTitle;

  
  private String formData;

  
  private String marketingActivityExtensionId;

  
  private String context;

  
  private UTMInput utm;

  
  private String urlParameterValue;

  
  private MarketingActivityStatus status;

  
  private MarketingActivityBudgetInput budget;

  public MarketingActivityCreateInput() {
  }

  
  public String getMarketingActivityTitle() {
    return marketingActivityTitle;
  }

  public void setMarketingActivityTitle(String marketingActivityTitle) {
    this.marketingActivityTitle = marketingActivityTitle;
  }

  
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
  }

  
  public String getMarketingActivityExtensionId() {
    return marketingActivityExtensionId;
  }

  public void setMarketingActivityExtensionId(String marketingActivityExtensionId) {
    this.marketingActivityExtensionId = marketingActivityExtensionId;
  }

  
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  
  public UTMInput getUtm() {
    return utm;
  }

  public void setUtm(UTMInput utm) {
    this.utm = utm;
  }

  
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
  }

  
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  @Override
  public String toString() {
    return "MarketingActivityCreateInput{marketingActivityTitle='" + marketingActivityTitle + "', formData='" + formData + "', marketingActivityExtensionId='" + marketingActivityExtensionId + "', context='" + context + "', utm='" + utm + "', urlParameterValue='" + urlParameterValue + "', status='" + status + "', budget='" + budget + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityCreateInput that = (MarketingActivityCreateInput) o;
    return Objects.equals(marketingActivityTitle, that.marketingActivityTitle) &&
        Objects.equals(formData, that.formData) &&
        Objects.equals(marketingActivityExtensionId, that.marketingActivityExtensionId) &&
        Objects.equals(context, that.context) &&
        Objects.equals(utm, that.utm) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(status, that.status) &&
        Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivityTitle, formData, marketingActivityExtensionId, context, utm, urlParameterValue, status, budget);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String marketingActivityTitle;

    
    private String formData;

    
    private String marketingActivityExtensionId;

    
    private String context;

    
    private UTMInput utm;

    
    private String urlParameterValue;

    
    private MarketingActivityStatus status;

    
    private MarketingActivityBudgetInput budget;

    public MarketingActivityCreateInput build() {
      MarketingActivityCreateInput result = new MarketingActivityCreateInput();
      result.marketingActivityTitle = this.marketingActivityTitle;
      result.formData = this.formData;
      result.marketingActivityExtensionId = this.marketingActivityExtensionId;
      result.context = this.context;
      result.utm = this.utm;
      result.urlParameterValue = this.urlParameterValue;
      result.status = this.status;
      result.budget = this.budget;
      return result;
    }

    
    public Builder marketingActivityTitle(String marketingActivityTitle) {
      this.marketingActivityTitle = marketingActivityTitle;
      return this;
    }

    
    public Builder formData(String formData) {
      this.formData = formData;
      return this;
    }

    
    public Builder marketingActivityExtensionId(String marketingActivityExtensionId) {
      this.marketingActivityExtensionId = marketingActivityExtensionId;
      return this;
    }

    
    public Builder context(String context) {
      this.context = context;
      return this;
    }

    
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      return this;
    }

    
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
      return this;
    }

    
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }
  }
}
