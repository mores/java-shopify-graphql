package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderCreateLineItemInput {
  
  private String fulfillmentService;

  
  private Boolean giftCard = false;

  
  private MoneyBagInput priceSet;

  
  private String productId;

  
  private List<OrderCreateLineItemPropertyInput> properties;

  
  private int quantity;

  
  private Boolean requiresShipping = false;

  
  private String sku;

  
  private List<OrderCreateTaxLineInput> taxLines;

  
  private Boolean taxable = true;

  
  private String title;

  
  private String variantId;

  
  private String variantTitle;

  
  private String vendor;

  public OrderCreateLineItemInput() {
  }

  
  public String getFulfillmentService() {
    return fulfillmentService;
  }

  public void setFulfillmentService(String fulfillmentService) {
    this.fulfillmentService = fulfillmentService;
  }

  
  public Boolean getGiftCard() {
    return giftCard;
  }

  public void setGiftCard(Boolean giftCard) {
    this.giftCard = giftCard;
  }

  
  public MoneyBagInput getPriceSet() {
    return priceSet;
  }

  public void setPriceSet(MoneyBagInput priceSet) {
    this.priceSet = priceSet;
  }

  
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  
  public List<OrderCreateLineItemPropertyInput> getProperties() {
    return properties;
  }

  public void setProperties(List<OrderCreateLineItemPropertyInput> properties) {
    this.properties = properties;
  }

  
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  
  public Boolean getRequiresShipping() {
    return requiresShipping;
  }

  public void setRequiresShipping(Boolean requiresShipping) {
    this.requiresShipping = requiresShipping;
  }

  
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  
  public List<OrderCreateTaxLineInput> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
    this.taxLines = taxLines;
  }

  
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
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
    return "OrderCreateLineItemInput{fulfillmentService='" + fulfillmentService + "', giftCard='" + giftCard + "', priceSet='" + priceSet + "', productId='" + productId + "', properties='" + properties + "', quantity='" + quantity + "', requiresShipping='" + requiresShipping + "', sku='" + sku + "', taxLines='" + taxLines + "', taxable='" + taxable + "', title='" + title + "', variantId='" + variantId + "', variantTitle='" + variantTitle + "', vendor='" + vendor + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateLineItemInput that = (OrderCreateLineItemInput) o;
    return Objects.equals(fulfillmentService, that.fulfillmentService) &&
        Objects.equals(giftCard, that.giftCard) &&
        Objects.equals(priceSet, that.priceSet) &&
        Objects.equals(productId, that.productId) &&
        Objects.equals(properties, that.properties) &&
        quantity == that.quantity &&
        Objects.equals(requiresShipping, that.requiresShipping) &&
        Objects.equals(sku, that.sku) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(taxable, that.taxable) &&
        Objects.equals(title, that.title) &&
        Objects.equals(variantId, that.variantId) &&
        Objects.equals(variantTitle, that.variantTitle) &&
        Objects.equals(vendor, that.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fulfillmentService, giftCard, priceSet, productId, properties, quantity, requiresShipping, sku, taxLines, taxable, title, variantId, variantTitle, vendor);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String fulfillmentService;

    
    private Boolean giftCard = false;

    
    private MoneyBagInput priceSet;

    
    private String productId;

    
    private List<OrderCreateLineItemPropertyInput> properties;

    
    private int quantity;

    
    private Boolean requiresShipping = false;

    
    private String sku;

    
    private List<OrderCreateTaxLineInput> taxLines;

    
    private Boolean taxable = true;

    
    private String title;

    
    private String variantId;

    
    private String variantTitle;

    
    private String vendor;

    public OrderCreateLineItemInput build() {
      OrderCreateLineItemInput result = new OrderCreateLineItemInput();
      result.fulfillmentService = this.fulfillmentService;
      result.giftCard = this.giftCard;
      result.priceSet = this.priceSet;
      result.productId = this.productId;
      result.properties = this.properties;
      result.quantity = this.quantity;
      result.requiresShipping = this.requiresShipping;
      result.sku = this.sku;
      result.taxLines = this.taxLines;
      result.taxable = this.taxable;
      result.title = this.title;
      result.variantId = this.variantId;
      result.variantTitle = this.variantTitle;
      result.vendor = this.vendor;
      return result;
    }

    
    public Builder fulfillmentService(String fulfillmentService) {
      this.fulfillmentService = fulfillmentService;
      return this;
    }

    
    public Builder giftCard(Boolean giftCard) {
      this.giftCard = giftCard;
      return this;
    }

    
    public Builder priceSet(MoneyBagInput priceSet) {
      this.priceSet = priceSet;
      return this;
    }

    
    public Builder productId(String productId) {
      this.productId = productId;
      return this;
    }

    
    public Builder properties(List<OrderCreateLineItemPropertyInput> properties) {
      this.properties = properties;
      return this;
    }

    
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    
    public Builder requiresShipping(Boolean requiresShipping) {
      this.requiresShipping = requiresShipping;
      return this;
    }

    
    public Builder sku(String sku) {
      this.sku = sku;
      return this;
    }

    
    public Builder taxLines(List<OrderCreateTaxLineInput> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder taxable(Boolean taxable) {
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
