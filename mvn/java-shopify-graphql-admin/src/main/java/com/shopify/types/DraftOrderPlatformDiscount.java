package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DraftOrderPlatformDiscount {
  
  private List<DraftOrderPlatformDiscountAllocation> allocations;

  
  private boolean automaticDiscount;

  
  private boolean bxgyDiscount;

  
  private String code;

  
  private DiscountClass discountClass;

  
  private DiscountNode discountNode;

  
  private String id;

  
  private String presentationLevel;

  
  private String shortSummary;

  
  private String summary;

  
  private String title;

  
  private MoneyV2 totalAmount;

  
  private MoneyBag totalAmountPriceSet;

  public DraftOrderPlatformDiscount() {
  }

  
  public List<DraftOrderPlatformDiscountAllocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<DraftOrderPlatformDiscountAllocation> allocations) {
    this.allocations = allocations;
  }

  
  public boolean getAutomaticDiscount() {
    return automaticDiscount;
  }

  public void setAutomaticDiscount(boolean automaticDiscount) {
    this.automaticDiscount = automaticDiscount;
  }

  
  public boolean getBxgyDiscount() {
    return bxgyDiscount;
  }

  public void setBxgyDiscount(boolean bxgyDiscount) {
    this.bxgyDiscount = bxgyDiscount;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  
  public DiscountNode getDiscountNode() {
    return discountNode;
  }

  public void setDiscountNode(DiscountNode discountNode) {
    this.discountNode = discountNode;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getPresentationLevel() {
    return presentationLevel;
  }

  public void setPresentationLevel(String presentationLevel) {
    this.presentationLevel = presentationLevel;
  }

  
  public String getShortSummary() {
    return shortSummary;
  }

  public void setShortSummary(String shortSummary) {
    this.shortSummary = shortSummary;
  }

  
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  
  public MoneyBag getTotalAmountPriceSet() {
    return totalAmountPriceSet;
  }

  public void setTotalAmountPriceSet(MoneyBag totalAmountPriceSet) {
    this.totalAmountPriceSet = totalAmountPriceSet;
  }

  @Override
  public String toString() {
    return "DraftOrderPlatformDiscount{allocations='" + allocations + "', automaticDiscount='" + automaticDiscount + "', bxgyDiscount='" + bxgyDiscount + "', code='" + code + "', discountClass='" + discountClass + "', discountNode='" + discountNode + "', id='" + id + "', presentationLevel='" + presentationLevel + "', shortSummary='" + shortSummary + "', summary='" + summary + "', title='" + title + "', totalAmount='" + totalAmount + "', totalAmountPriceSet='" + totalAmountPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderPlatformDiscount that = (DraftOrderPlatformDiscount) o;
    return Objects.equals(allocations, that.allocations) &&
        automaticDiscount == that.automaticDiscount &&
        bxgyDiscount == that.bxgyDiscount &&
        Objects.equals(code, that.code) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountNode, that.discountNode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(presentationLevel, that.presentationLevel) &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalAmount, that.totalAmount) &&
        Objects.equals(totalAmountPriceSet, that.totalAmountPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations, automaticDiscount, bxgyDiscount, code, discountClass, discountNode, id, presentationLevel, shortSummary, summary, title, totalAmount, totalAmountPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<DraftOrderPlatformDiscountAllocation> allocations;

    
    private boolean automaticDiscount;

    
    private boolean bxgyDiscount;

    
    private String code;

    
    private DiscountClass discountClass;

    
    private DiscountNode discountNode;

    
    private String id;

    
    private String presentationLevel;

    
    private String shortSummary;

    
    private String summary;

    
    private String title;

    
    private MoneyV2 totalAmount;

    
    private MoneyBag totalAmountPriceSet;

    public DraftOrderPlatformDiscount build() {
      DraftOrderPlatformDiscount result = new DraftOrderPlatformDiscount();
      result.allocations = this.allocations;
      result.automaticDiscount = this.automaticDiscount;
      result.bxgyDiscount = this.bxgyDiscount;
      result.code = this.code;
      result.discountClass = this.discountClass;
      result.discountNode = this.discountNode;
      result.id = this.id;
      result.presentationLevel = this.presentationLevel;
      result.shortSummary = this.shortSummary;
      result.summary = this.summary;
      result.title = this.title;
      result.totalAmount = this.totalAmount;
      result.totalAmountPriceSet = this.totalAmountPriceSet;
      return result;
    }

    
    public Builder allocations(List<DraftOrderPlatformDiscountAllocation> allocations) {
      this.allocations = allocations;
      return this;
    }

    
    public Builder automaticDiscount(boolean automaticDiscount) {
      this.automaticDiscount = automaticDiscount;
      return this;
    }

    
    public Builder bxgyDiscount(boolean bxgyDiscount) {
      this.bxgyDiscount = bxgyDiscount;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    
    public Builder discountNode(DiscountNode discountNode) {
      this.discountNode = discountNode;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder presentationLevel(String presentationLevel) {
      this.presentationLevel = presentationLevel;
      return this;
    }

    
    public Builder shortSummary(String shortSummary) {
      this.shortSummary = shortSummary;
      return this;
    }

    
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    
    public Builder totalAmountPriceSet(MoneyBag totalAmountPriceSet) {
      this.totalAmountPriceSet = totalAmountPriceSet;
      return this;
    }
  }
}
