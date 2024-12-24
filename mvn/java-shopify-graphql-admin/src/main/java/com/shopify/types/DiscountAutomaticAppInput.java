package com.shopify.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class DiscountAutomaticAppInput {
  
  private DiscountCombinesWithInput combinesWith;

  
  private String functionId;

  
  private String title;

  
  private OffsetDateTime startsAt;

  
  private OffsetDateTime endsAt;

  
  private List<MetafieldInput> metafields = Collections.emptyList();

  
  private Boolean appliesOnSubscription = false;

  
  private Integer recurringCycleLimit = 1;

  public DiscountAutomaticAppInput() {
  }

  
  public DiscountCombinesWithInput getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWithInput combinesWith) {
    this.combinesWith = combinesWith;
  }

  
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public Boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(Boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticAppInput{combinesWith='" + combinesWith + "', functionId='" + functionId + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', metafields='" + metafields + "', appliesOnSubscription='" + appliesOnSubscription + "', recurringCycleLimit='" + recurringCycleLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticAppInput that = (DiscountAutomaticAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(appliesOnSubscription, that.appliesOnSubscription) &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, functionId, title, startsAt, endsAt, metafields, appliesOnSubscription, recurringCycleLimit);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DiscountCombinesWithInput combinesWith;

    
    private String functionId;

    
    private String title;

    
    private OffsetDateTime startsAt;

    
    private OffsetDateTime endsAt;

    
    private List<MetafieldInput> metafields = Collections.emptyList();

    
    private Boolean appliesOnSubscription = false;

    
    private Integer recurringCycleLimit = 1;

    public DiscountAutomaticAppInput build() {
      DiscountAutomaticAppInput result = new DiscountAutomaticAppInput();
      result.combinesWith = this.combinesWith;
      result.functionId = this.functionId;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.metafields = this.metafields;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.recurringCycleLimit = this.recurringCycleLimit;
      return result;
    }

    
    public Builder combinesWith(DiscountCombinesWithInput combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder appliesOnSubscription(Boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }
  }
}
