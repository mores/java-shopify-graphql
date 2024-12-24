package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class MarketingActivityUpdateInput {
  
  private String id;

  
  private String marketingRecommendationId;

  
  private String title;

  
  private MarketingActivityBudgetInput budget;

  
  private MarketingActivityStatus status;

  
  private MarketingActivityStatus targetStatus;

  
  private String formData;

  
  private UTMInput utm;

  
  private String urlParameterValue;

  
  private List<String> marketedResources;

  
  private String errors;

  public MarketingActivityUpdateInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getMarketingRecommendationId() {
    return marketingRecommendationId;
  }

  public void setMarketingRecommendationId(String marketingRecommendationId) {
    this.marketingRecommendationId = marketingRecommendationId;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  
  public MarketingActivityStatus getTargetStatus() {
    return targetStatus;
  }

  public void setTargetStatus(MarketingActivityStatus targetStatus) {
    this.targetStatus = targetStatus;
  }

  
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
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

  
  public List<String> getMarketedResources() {
    return marketedResources;
  }

  public void setMarketedResources(List<String> marketedResources) {
    this.marketedResources = marketedResources;
  }

  
  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateInput{id='" + id + "', marketingRecommendationId='" + marketingRecommendationId + "', title='" + title + "', budget='" + budget + "', status='" + status + "', targetStatus='" + targetStatus + "', formData='" + formData + "', utm='" + utm + "', urlParameterValue='" + urlParameterValue + "', marketedResources='" + marketedResources + "', errors='" + errors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateInput that = (MarketingActivityUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(marketingRecommendationId, that.marketingRecommendationId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(budget, that.budget) &&
        Objects.equals(status, that.status) &&
        Objects.equals(targetStatus, that.targetStatus) &&
        Objects.equals(formData, that.formData) &&
        Objects.equals(utm, that.utm) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(marketedResources, that.marketedResources) &&
        Objects.equals(errors, that.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, marketingRecommendationId, title, budget, status, targetStatus, formData, utm, urlParameterValue, marketedResources, errors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String marketingRecommendationId;

    
    private String title;

    
    private MarketingActivityBudgetInput budget;

    
    private MarketingActivityStatus status;

    
    private MarketingActivityStatus targetStatus;

    
    private String formData;

    
    private UTMInput utm;

    
    private String urlParameterValue;

    
    private List<String> marketedResources;

    
    private String errors;

    public MarketingActivityUpdateInput build() {
      MarketingActivityUpdateInput result = new MarketingActivityUpdateInput();
      result.id = this.id;
      result.marketingRecommendationId = this.marketingRecommendationId;
      result.title = this.title;
      result.budget = this.budget;
      result.status = this.status;
      result.targetStatus = this.targetStatus;
      result.formData = this.formData;
      result.utm = this.utm;
      result.urlParameterValue = this.urlParameterValue;
      result.marketedResources = this.marketedResources;
      result.errors = this.errors;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder marketingRecommendationId(String marketingRecommendationId) {
      this.marketingRecommendationId = marketingRecommendationId;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }

    
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder targetStatus(MarketingActivityStatus targetStatus) {
      this.targetStatus = targetStatus;
      return this;
    }

    
    public Builder formData(String formData) {
      this.formData = formData;
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

    
    public Builder marketedResources(List<String> marketedResources) {
      this.marketedResources = marketedResources;
      return this;
    }

    
    public Builder errors(String errors) {
      this.errors = errors;
      return this;
    }
  }
}
