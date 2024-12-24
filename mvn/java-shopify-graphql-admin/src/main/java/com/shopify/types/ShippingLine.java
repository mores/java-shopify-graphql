package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShippingLine implements DraftOrderPlatformDiscountAllocationTarget {
  
  private String carrierIdentifier;

  
  private String code;

  
  private MoneyBag currentDiscountedPriceSet;

  
  private boolean custom;

  
  private String deliveryCategory;

  
  private List<DiscountAllocation> discountAllocations;

  
  private MoneyV2 discountedPrice;

  
  private MoneyBag discountedPriceSet;

  
  private String id;

  
  private boolean isRemoved;

  
  private MoneyV2 originalPrice;

  
  private MoneyBag originalPriceSet;

  
  private String phone;

  
  private String price;

  
  private FulfillmentService requestedFulfillmentService;

  
  private String shippingRateHandle;

  
  private String source;

  
  private List<TaxLine> taxLines;

  
  private String title;

  public ShippingLine() {
  }

  
  public String getCarrierIdentifier() {
    return carrierIdentifier;
  }

  public void setCarrierIdentifier(String carrierIdentifier) {
    this.carrierIdentifier = carrierIdentifier;
  }

  
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  
  public MoneyBag getCurrentDiscountedPriceSet() {
    return currentDiscountedPriceSet;
  }

  public void setCurrentDiscountedPriceSet(MoneyBag currentDiscountedPriceSet) {
    this.currentDiscountedPriceSet = currentDiscountedPriceSet;
  }

  
  public boolean getCustom() {
    return custom;
  }

  public void setCustom(boolean custom) {
    this.custom = custom;
  }

  
  public String getDeliveryCategory() {
    return deliveryCategory;
  }

  public void setDeliveryCategory(String deliveryCategory) {
    this.deliveryCategory = deliveryCategory;
  }

  
  public List<DiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<DiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  
  public MoneyV2 getDiscountedPrice() {
    return discountedPrice;
  }

  public void setDiscountedPrice(MoneyV2 discountedPrice) {
    this.discountedPrice = discountedPrice;
  }

  
  public MoneyBag getDiscountedPriceSet() {
    return discountedPriceSet;
  }

  public void setDiscountedPriceSet(MoneyBag discountedPriceSet) {
    this.discountedPriceSet = discountedPriceSet;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public boolean getIsRemoved() {
    return isRemoved;
  }

  public void setIsRemoved(boolean isRemoved) {
    this.isRemoved = isRemoved;
  }

  
  public MoneyV2 getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(MoneyV2 originalPrice) {
    this.originalPrice = originalPrice;
  }

  
  public MoneyBag getOriginalPriceSet() {
    return originalPriceSet;
  }

  public void setOriginalPriceSet(MoneyBag originalPriceSet) {
    this.originalPriceSet = originalPriceSet;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  
  public FulfillmentService getRequestedFulfillmentService() {
    return requestedFulfillmentService;
  }

  public void setRequestedFulfillmentService(FulfillmentService requestedFulfillmentService) {
    this.requestedFulfillmentService = requestedFulfillmentService;
  }

  
  public String getShippingRateHandle() {
    return shippingRateHandle;
  }

  public void setShippingRateHandle(String shippingRateHandle) {
    this.shippingRateHandle = shippingRateHandle;
  }

  
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "ShippingLine{carrierIdentifier='" + carrierIdentifier + "', code='" + code + "', currentDiscountedPriceSet='" + currentDiscountedPriceSet + "', custom='" + custom + "', deliveryCategory='" + deliveryCategory + "', discountAllocations='" + discountAllocations + "', discountedPrice='" + discountedPrice + "', discountedPriceSet='" + discountedPriceSet + "', id='" + id + "', isRemoved='" + isRemoved + "', originalPrice='" + originalPrice + "', originalPriceSet='" + originalPriceSet + "', phone='" + phone + "', price='" + price + "', requestedFulfillmentService='" + requestedFulfillmentService + "', shippingRateHandle='" + shippingRateHandle + "', source='" + source + "', taxLines='" + taxLines + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingLine that = (ShippingLine) o;
    return Objects.equals(carrierIdentifier, that.carrierIdentifier) &&
        Objects.equals(code, that.code) &&
        Objects.equals(currentDiscountedPriceSet, that.currentDiscountedPriceSet) &&
        custom == that.custom &&
        Objects.equals(deliveryCategory, that.deliveryCategory) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(discountedPrice, that.discountedPrice) &&
        Objects.equals(discountedPriceSet, that.discountedPriceSet) &&
        Objects.equals(id, that.id) &&
        isRemoved == that.isRemoved &&
        Objects.equals(originalPrice, that.originalPrice) &&
        Objects.equals(originalPriceSet, that.originalPriceSet) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(price, that.price) &&
        Objects.equals(requestedFulfillmentService, that.requestedFulfillmentService) &&
        Objects.equals(shippingRateHandle, that.shippingRateHandle) &&
        Objects.equals(source, that.source) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierIdentifier, code, currentDiscountedPriceSet, custom, deliveryCategory, discountAllocations, discountedPrice, discountedPriceSet, id, isRemoved, originalPrice, originalPriceSet, phone, price, requestedFulfillmentService, shippingRateHandle, source, taxLines, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String carrierIdentifier;

    
    private String code;

    
    private MoneyBag currentDiscountedPriceSet;

    
    private boolean custom;

    
    private String deliveryCategory;

    
    private List<DiscountAllocation> discountAllocations;

    
    private MoneyV2 discountedPrice;

    
    private MoneyBag discountedPriceSet;

    
    private String id;

    
    private boolean isRemoved;

    
    private MoneyV2 originalPrice;

    
    private MoneyBag originalPriceSet;

    
    private String phone;

    
    private String price;

    
    private FulfillmentService requestedFulfillmentService;

    
    private String shippingRateHandle;

    
    private String source;

    
    private List<TaxLine> taxLines;

    
    private String title;

    public ShippingLine build() {
      ShippingLine result = new ShippingLine();
      result.carrierIdentifier = this.carrierIdentifier;
      result.code = this.code;
      result.currentDiscountedPriceSet = this.currentDiscountedPriceSet;
      result.custom = this.custom;
      result.deliveryCategory = this.deliveryCategory;
      result.discountAllocations = this.discountAllocations;
      result.discountedPrice = this.discountedPrice;
      result.discountedPriceSet = this.discountedPriceSet;
      result.id = this.id;
      result.isRemoved = this.isRemoved;
      result.originalPrice = this.originalPrice;
      result.originalPriceSet = this.originalPriceSet;
      result.phone = this.phone;
      result.price = this.price;
      result.requestedFulfillmentService = this.requestedFulfillmentService;
      result.shippingRateHandle = this.shippingRateHandle;
      result.source = this.source;
      result.taxLines = this.taxLines;
      result.title = this.title;
      return result;
    }

    
    public Builder carrierIdentifier(String carrierIdentifier) {
      this.carrierIdentifier = carrierIdentifier;
      return this;
    }

    
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    
    public Builder currentDiscountedPriceSet(MoneyBag currentDiscountedPriceSet) {
      this.currentDiscountedPriceSet = currentDiscountedPriceSet;
      return this;
    }

    
    public Builder custom(boolean custom) {
      this.custom = custom;
      return this;
    }

    
    public Builder deliveryCategory(String deliveryCategory) {
      this.deliveryCategory = deliveryCategory;
      return this;
    }

    
    public Builder discountAllocations(List<DiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    
    public Builder discountedPrice(MoneyV2 discountedPrice) {
      this.discountedPrice = discountedPrice;
      return this;
    }

    
    public Builder discountedPriceSet(MoneyBag discountedPriceSet) {
      this.discountedPriceSet = discountedPriceSet;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder isRemoved(boolean isRemoved) {
      this.isRemoved = isRemoved;
      return this;
    }

    
    public Builder originalPrice(MoneyV2 originalPrice) {
      this.originalPrice = originalPrice;
      return this;
    }

    
    public Builder originalPriceSet(MoneyBag originalPriceSet) {
      this.originalPriceSet = originalPriceSet;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder price(String price) {
      this.price = price;
      return this;
    }

    
    public Builder requestedFulfillmentService(FulfillmentService requestedFulfillmentService) {
      this.requestedFulfillmentService = requestedFulfillmentService;
      return this;
    }

    
    public Builder shippingRateHandle(String shippingRateHandle) {
      this.shippingRateHandle = shippingRateHandle;
      return this;
    }

    
    public Builder source(String source) {
      this.source = source;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
