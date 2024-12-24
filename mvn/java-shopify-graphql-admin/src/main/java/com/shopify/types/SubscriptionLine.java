package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SubscriptionLine {
  
  private MoneyV2 currentPrice;

  
  private List<Attribute> customAttributes;

  
  private List<SubscriptionDiscountAllocation> discountAllocations;

  
  private String id;

  
  private MoneyV2 lineDiscountedPrice;

  
  private SubscriptionPricingPolicy pricingPolicy;

  
  private String productId;

  
  private int quantity;

  
  private boolean requiresShipping;

  
  private String sellingPlanId;

  
  private String sellingPlanName;

  
  private String sku;

  
  private boolean taxable;

  
  private String title;

  
  private String variantId;

  
  private Image variantImage;

  
  private String variantTitle;

  public SubscriptionLine() {
  }

  
  public MoneyV2 getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(MoneyV2 currentPrice) {
    this.currentPrice = currentPrice;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public List<SubscriptionDiscountAllocation> getDiscountAllocations() {
    return discountAllocations;
  }

  public void setDiscountAllocations(List<SubscriptionDiscountAllocation> discountAllocations) {
    this.discountAllocations = discountAllocations;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public MoneyV2 getLineDiscountedPrice() {
    return lineDiscountedPrice;
  }

  public void setLineDiscountedPrice(MoneyV2 lineDiscountedPrice) {
    this.lineDiscountedPrice = lineDiscountedPrice;
  }

  
  public SubscriptionPricingPolicy getPricingPolicy() {
    return pricingPolicy;
  }

  public void setPricingPolicy(SubscriptionPricingPolicy pricingPolicy) {
    this.pricingPolicy = pricingPolicy;
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSellingPlanId() {
    return sellingPlanId;
  }

  public void setSellingPlanId(String sellingPlanId) {
    this.sellingPlanId = sellingPlanId;
  }

  
  public String getSellingPlanName() {
    return sellingPlanName;
  }

  public void setSellingPlanName(String sellingPlanName) {
    this.sellingPlanName = sellingPlanName;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(boolean taxable) {
    this.taxable = taxable;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  
  public Image getVariantImage() {
    return variantImage;
  }

  public void setVariantImage(Image variantImage) {
    this.variantImage = variantImage;
  }

  
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  @Override
  public String toString() {
    return "SubscriptionLine{currentPrice='" + currentPrice + "', customAttributes='" + customAttributes + "', discountAllocations='" + discountAllocations + "', id='" + id + "', lineDiscountedPrice='" + lineDiscountedPrice + "', pricingPolicy='" + pricingPolicy + "', productId='" + productId + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sellingPlanId='" + sellingPlanId + "', sellingPlanName='" + sellingPlanName + "', sku='" + sku + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', variantImage='" + variantImage + "', variantTitle='" + variantTitle + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionLine that = (SubscriptionLine) o;
    return Objects.equals(currentPrice, that.currentPrice) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountAllocations, that.discountAllocations) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineDiscountedPrice, that.lineDiscountedPrice) &&
        Objects.equals(pricingPolicy, that.pricingPolicy) &&
        Objects.equals(productId, that.productId) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sellingPlanId, that.sellingPlanId) &&
        Objects.equals(sellingPlanName, that.sellingPlanName) &&
        Objects.equals(sku, that.sku) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantImage, that.variantImage) &&
        Objects.equals(variantTitle, that.variantTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPrice, customAttributes, discountAllocations, id, lineDiscountedPrice, pricingPolicy, productId, quantity, requiresShipping, sellingPlanId, sellingPlanName, sku, taxable, title, variantId, variantImage, variantTitle);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyV2 currentPrice;

    
    private List<Attribute> customAttributes;

    
    private List<SubscriptionDiscountAllocation> discountAllocations;

    
    private String id;

    
    private MoneyV2 lineDiscountedPrice;

    
    private SubscriptionPricingPolicy pricingPolicy;

    
    private String productId;

    
    private int quantity;

    
    private boolean requiresShipping;

    
    private String sellingPlanId;

    
    private String sellingPlanName;

    
    private String sku;

    
    private boolean taxable;

    
    private String title;

    
    private String variantId;

    
    private Image variantImage;

    
    private String variantTitle;

    public SubscriptionLine build() {
      SubscriptionLine result = new SubscriptionLine();
      result.currentPrice = this.currentPrice;
      result.customAttributes = this.customAttributes;
      result.discountAllocations = this.discountAllocations;
      result.id = this.id;
      result.lineDiscountedPrice = this.lineDiscountedPrice;
      result.pricingPolicy = this.pricingPolicy;
      result.productId = this.productId;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sellingPlanId = this.sellingPlanId;
      result.sellingPlanName = this.sellingPlanName;
      result.sku = this.sku;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantImage = this.variantImage;
      result.variantTitle = this.variantTitle;
      return result;
    }

    
    public Builder currentPrice(MoneyV2 currentPrice) {
      this.currentPrice = currentPrice;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountAllocations(List<SubscriptionDiscountAllocation> discountAllocations) {
      this.discountAllocations = discountAllocations;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineDiscountedPrice(MoneyV2 lineDiscountedPrice) {
      this.lineDiscountedPrice = lineDiscountedPrice;
      return this;
    }

    
    public Builder pricingPolicy(SubscriptionPricingPolicy pricingPolicy) {
      this.pricingPolicy = pricingPolicy;
      return this;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder requiresShipping(boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sellingPlanId(String sellingPlanId) {
      this.sellingPlanId = sellingPlanId;
      return this;
    }

    
    public Builder sellingPlanName(String sellingPlanName) {
      this.sellingPlanName = sellingPlanName;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder taxable(boolean taxable) {
      this.taxable = taxable;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    
    public Builder variantImage(Image variantImage) {
      this.variantImage = variantImage;
      return this;
    }

    
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }
  }
}
