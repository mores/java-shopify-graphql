package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppSubscription implements com.shopify.types.Node {
  
  private OffsetDateTime createdAt;

  
  private OffsetDateTime currentPeriodEnd;

  
  private String id;

  
  private List<AppSubscriptionLineItem> lineItems;

  
  private String name;

  
  private String returnUrl;

  
  private AppSubscriptionStatus status;

  
  private boolean test;

  
  private int trialDays;

  public AppSubscription() {
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public OffsetDateTime getCurrentPeriodEnd() {
    return currentPeriodEnd;
  }

  public void setCurrentPeriodEnd(OffsetDateTime currentPeriodEnd) {
    this.currentPeriodEnd = currentPeriodEnd;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<AppSubscriptionLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<AppSubscriptionLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  
  public AppSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(AppSubscriptionStatus status) {
    this.status = status;
  }

  
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  
  public int getTrialDays() {
    return trialDays;
  }

  public void setTrialDays(int trialDays) {
    this.trialDays = trialDays;
  }

  @Override
  public String toString() {
    return "AppSubscription{createdAt='" + createdAt + "', currentPeriodEnd='" + currentPeriodEnd + "', id='" + id + "', lineItems='" + lineItems + "', name='" + name + "', returnUrl='" + returnUrl + "', status='" + status + "', test='" + test + "', trialDays='" + trialDays + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscription that = (AppSubscription) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currentPeriodEnd, that.currentPeriodEnd) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(name, that.name) &&
        Objects.equals(returnUrl, that.returnUrl) &&
        Objects.equals(status, that.status) &&
        test == that.test &&
        trialDays == that.trialDays;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentPeriodEnd, id, lineItems, name, returnUrl, status, test, trialDays);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private OffsetDateTime createdAt;

    
    private OffsetDateTime currentPeriodEnd;

    
    private String id;

    
    private List<AppSubscriptionLineItem> lineItems;

    
    private String name;

    
    private String returnUrl;

    
    private AppSubscriptionStatus status;

    
    private boolean test;

    
    private int trialDays;

    public AppSubscription build() {
      AppSubscription result = new AppSubscription();
      result.createdAt = this.createdAt;
      result.currentPeriodEnd = this.currentPeriodEnd;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.name = this.name;
      result.returnUrl = this.returnUrl;
      result.status = this.status;
      result.test = this.test;
      result.trialDays = this.trialDays;
      return result;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder currentPeriodEnd(OffsetDateTime currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItems(List<AppSubscriptionLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder returnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    
    public Builder status(AppSubscriptionStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder trialDays(int trialDays) {
      this.trialDays = trialDays;
      return this;
    }
  }
}
