package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class ExchangeV2LineItem {
  
  private List<Attribute> customAttributes;

  
  private MoneyBag discountedTotalSet;

  
  private MoneyBag discountedUnitPriceSet;

  
  private FulfillmentService fulfillmentService;

  
  private boolean giftCard;

  
  private List<GiftCard> giftCards;

  
  private boolean isGiftCard;

  
  private LineItem lineItem;

  
  private String name;

  
  private MoneyBag originalTotalSet;

  
  private MoneyBag originalUnitPriceSet;

  
  private int quantity;

  
  private boolean requiresShipping;

  
  private String sku;

  
  private List<TaxLine> taxLines;

  
  private boolean taxable;

  
  private String title;

  
  private ProductVariant variant;

  
  private String variantTitle;

  
  private String vendor;

  public ExchangeV2LineItem() {
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public MoneyBag getDiscountedTotalSet() {
    return discountedTotalSet;
  }

  public void setDiscountedTotalSet(MoneyBag discountedTotalSet) {
    this.discountedTotalSet = discountedTotalSet;
  }

  
  public MoneyBag getDiscountedUnitPriceSet() {
    return discountedUnitPriceSet;
  }

  public void setDiscountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
    this.discountedUnitPriceSet = discountedUnitPriceSet;
  }

  
  public FulfillmentService getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(FulfillmentService fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  
  public boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(boolean giftCard) {
    this.giftCard = giftCard;
  }

  
  public List<GiftCard> getGiftCards() {
    return giftCards;
  }

  public void setGiftCards(List<GiftCard> giftCards) {
    this.giftCards = giftCards;
  }

  
  public boolean getIsGiftCard() {
    return isGiftCard;
  }

  public void setIsGiftCard(boolean isGiftCard) {
    this.isGiftCard = isGiftCard;
  }

  
  public LineItem getLineItem() {
    return lineItem;
  }

  public void setLineItem(LineItem lineItem) {
    this.lineItem = lineItem;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public MoneyBag getOriginalTotalSet() {
    return originalTotalSet;
  }

  public void setOriginalTotalSet(MoneyBag originalTotalSet) {
    this.originalTotalSet = originalTotalSet;
  }

  
  public MoneyBag getOriginalUnitPriceSet() {
    return originalUnitPriceSet;
  }

  public void setOriginalUnitPriceSet(MoneyBag originalUnitPriceSet) {
    this.originalUnitPriceSet = originalUnitPriceSet;
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

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
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

  
  public ProductVariant getVariant() {
    return variant;
  }

  public void setVariant(ProductVariant variant) {
    this.variant = variant;
  }

  
  public String getVariantTitle() {
    return variantTitle;
  }

  public void setVariantTitle(String variantTitle) {
    this.variantTitle = variantTitle;
  }

  
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  @Override
  public String toString() {
    return "ExchangeV2LineItem{customAttributes='" + customAttributes + "', discountedTotalSet='" + discountedTotalSet + "', discountedUnitPriceSet='" + discountedUnitPriceSet + "', fulfillmentService='" + fulfillmentService + "', giftCard='" + giftCard + "', giftCards='" + giftCards + "', isGiftCard='" + isGiftCard + "', lineItem='" + lineItem + "', name='" + name + "', originalTotalSet='" + originalTotalSet + "', originalUnitPriceSet='" + originalUnitPriceSet + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', variant='" + variant + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeV2LineItem that = (ExchangeV2LineItem) o;
    return Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountedTotalSet, that.discountedTotalSet) &&
        Objects.equals(discountedUnitPriceSet, that.discountedUnitPriceSet) &&
        Objects.equals(fulfillmentService, that.fulfillmentService) &&
        giftCard == that.giftCard &&
        Objects.equals(giftCards, that.giftCards) &&
        isGiftCard == that.isGiftCard &&
        Objects.equals(lineItem, that.lineItem) &&
        Objects.equals(name, that.name) &&
        Objects.equals(originalTotalSet, that.originalTotalSet) &&
        Objects.equals(originalUnitPriceSet, that.originalUnitPriceSet) &&
        quantity == that.quantity &&
        requiresShipping == that.requiresShipping &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxable == that.taxable &&
        Objects.equals(title, that.title) &&
        Objects.equals(variant, that.variant) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customAttributes, discountedTotalSet, discountedUnitPriceSet, fulfillmentService, giftCard, giftCards, isGiftCard, lineItem, name, originalTotalSet, originalUnitPriceSet, quantity, requiresShipping, sku, taxLines, taxable, title, variant, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<Attribute> customAttributes;

    
    private MoneyBag discountedTotalSet;

    
    private MoneyBag discountedUnitPriceSet;

    
    private FulfillmentService fulfillmentService;

    
    private boolean giftCard;

    
    private List<GiftCard> giftCards;

    
    private boolean isGiftCard;

    
    private LineItem lineItem;

    
    private String name;

    
    private MoneyBag originalTotalSet;

    
    private MoneyBag originalUnitPriceSet;

    
    private int quantity;

    
    private boolean requiresShipping;

    
    private String sku;

    
    private List<TaxLine> taxLines;

    
    private boolean taxable;

    
    private String title;

    
    private ProductVariant variant;

    
    private String variantTitle;

    
    private String vendor;

    public ExchangeV2LineItem build() {
      ExchangeV2LineItem result = new ExchangeV2LineItem();
      result.customAttributes = this.customAttributes;
      result.discountedTotalSet = this.discountedTotalSet;
      result.discountedUnitPriceSet = this.discountedUnitPriceSet;
      result.fulfillmentService = this.fulfillmentService;
      result.giftCard = this.giftCard;
      result.giftCards = this.giftCards;
      result.isGiftCard = this.isGiftCard;
      result.lineItem = this.lineItem;
      result.name = this.name;
      result.originalTotalSet = this.originalTotalSet;
      result.originalUnitPriceSet = this.originalUnitPriceSet;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variant = this.variant;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountedTotalSet(MoneyBag discountedTotalSet) {
      this.discountedTotalSet = discountedTotalSet;
      return this;
    }

    
    public Builder discountedUnitPriceSet(MoneyBag discountedUnitPriceSet) {
      this.discountedUnitPriceSet = discountedUnitPriceSet;
      return this;
    }

    
    public Builder fulfillmentService(FulfillmentService fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    
    public Builder giftCard(boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    
    public Builder giftCards(List<GiftCard> giftCards) {
      this.giftCards = giftCards;
      return this;
    }

    
    public Builder isGiftCard(boolean isGiftCard) {
      this.isGiftCard = isGiftCard;
      return this;
    }

    
    public Builder lineItem(LineItem lineItem) {
      this.lineItem = lineItem;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder originalTotalSet(MoneyBag originalTotalSet) {
      this.originalTotalSet = originalTotalSet;
      return this;
    }

    
    public Builder originalUnitPriceSet(MoneyBag originalUnitPriceSet) {
      this.originalUnitPriceSet = originalUnitPriceSet;
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

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
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

    
    public Builder variant(ProductVariant variant) {
      this.variant = variant;
      return this;
    }

    
    public Builder variantTitle(String variantTitle) {
      this.variantTitle = variantTitle;
      return this;
    }

    
    public Builder vendor(String vendor) {
      this.vendor = vendor;
      return this;
    }
  }
}
