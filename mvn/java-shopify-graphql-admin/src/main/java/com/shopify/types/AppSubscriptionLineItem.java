package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class AppSubscriptionLineItem {
  
  private String id;

  
  private AppPlanV2 plan;

  
  private AppUsageRecordConnection usageRecords;

  public AppSubscriptionLineItem() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public AppPlanV2 getPlan() {
    return plan;
  }

  public void setPlan(AppPlanV2 plan) {
    this.plan = plan;
  }

  
  public AppUsageRecordConnection getUsageRecords() {
    return usageRecords;
  }

  public void setUsageRecords(AppUsageRecordConnection usageRecords) {
    this.usageRecords = usageRecords;
  }

  @Override
  public String toString() {
    return "AppSubscriptionLineItem{id='" + id + "', plan='" + plan + "', usageRecords='" + usageRecords + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscriptionLineItem that = (AppSubscriptionLineItem) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(plan, that.plan) &&
        Objects.equals(usageRecords, that.usageRecords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, plan, usageRecords);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private AppPlanV2 plan;

    
    private AppUsageRecordConnection usageRecords;

    public AppSubscriptionLineItem build() {
      AppSubscriptionLineItem result = new AppSubscriptionLineItem();
      result.id = this.id;
      result.plan = this.plan;
      result.usageRecords = this.usageRecords;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder plan(AppPlanV2 plan) {
      this.plan = plan;
      return this;
    }

    
    public Builder usageRecords(AppUsageRecordConnection usageRecords) {
      this.usageRecords = usageRecords;
      return this;
    }
  }
}
