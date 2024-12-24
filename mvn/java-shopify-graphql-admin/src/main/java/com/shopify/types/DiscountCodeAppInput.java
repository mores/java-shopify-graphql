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


public class DiscountCodeAppInput {
  
  private DiscountCombinesWithInput combinesWith;

  
  private String functionId;

  
  private String title;

  
  private OffsetDateTime startsAt;

  
  private OffsetDateTime endsAt;

  
  private Integer usageLimit;

  
  private Boolean appliesOncePerCustomer;

  
  private DiscountCustomerSelectionInput customerSelection;

  
  private String code;

  
  private List<MetafieldInput> metafields = Collections.emptyList();

  public DiscountCodeAppInput() {
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

  
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  
  public Boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(Boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  
  public DiscountCustomerSelectionInput getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelectionInput customerSelection) {
    this.customerSelection = customerSelection;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  @Override
  public String toString() {
    return "DiscountCodeAppInput{combinesWith='" + combinesWith + "', functionId='" + functionId + "', title='" + title + "', startsAt='" + startsAt + "', endsAt='" + endsAt + "', usageLimit='" + usageLimit + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', customerSelection='" + customerSelection + "', code='" + code + "', metafields='" + metafields + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeAppInput that = (DiscountCodeAppInput) o;
    return Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(usageLimit, that.usageLimit) &&
        Objects.equals(appliesOncePerCustomer, that.appliesOncePerCustomer) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(code, that.code) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combinesWith, functionId, title, startsAt, endsAt, usageLimit, appliesOncePerCustomer, customerSelection, code, metafields);
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

    
    private Integer usageLimit;

    
    private Boolean appliesOncePerCustomer;

    
    private DiscountCustomerSelectionInput customerSelection;

    
    private String code;

    
    private List<MetafieldInput> metafields = Collections.emptyList();

    public DiscountCodeAppInput build() {
      DiscountCodeAppInput result = new DiscountCodeAppInput();
      result.combinesWith = this.combinesWith;
      result.functionId = this.functionId;
      result.title = this.title;
      result.startsAt = this.startsAt;
      result.endsAt = this.endsAt;
      result.usageLimit = this.usageLimit;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.customerSelection = this.customerSelection;
      result.code = this.code;
      result.metafields = this.metafields;
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

    
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }

    
    public Builder appliesOncePerCustomer(Boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    
    public Builder customerSelection(DiscountCustomerSelectionInput customerSelection) {
      this.customerSelection = customerSelection;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }
  }
}
