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
public class AbandonedCheckout implements com.shopify.types.Navigable, com.shopify.types.Node {
  
  private String abandonedCheckoutUrl;

  
  private MailingAddress billingAddress;

  
  private OffsetDateTime completedAt;

  
  private OffsetDateTime createdAt;

  
  private List<Attribute> customAttributes;

  
  private Customer customer;

  
  private String defaultCursor;

  
  private List<String> discountCodes;

  
  private String id;

  
  private AbandonedCheckoutLineItemConnection lineItems;

  
  private int lineItemsQuantity;

  
  private String name;

  
  private String note;

  
  private MailingAddress shippingAddress;

  
  private MoneyBag subtotalPriceSet;

  
  private List<TaxLine> taxLines;

  
  private boolean taxesIncluded;

  
  private MoneyBag totalDiscountSet;

  
  private MoneyBag totalDutiesSet;

  
  private MoneyBag totalLineItemsPriceSet;

  
  private MoneyBag totalPriceSet;

  
  private MoneyBag totalTaxSet;

  
  private OffsetDateTime updatedAt;

  public AbandonedCheckout() {
  }

  
  public String getAbandonedCheckoutUrl() {
    return abandonedCheckoutUrl;
  }

  public void setAbandonedCheckoutUrl(String abandonedCheckoutUrl) {
    this.abandonedCheckoutUrl = abandonedCheckoutUrl;
  }

  
  public MailingAddress getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddress billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public List<Attribute> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<Attribute> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public String getDefaultCursor() {
    return defaultCursor;
  }

  public void setDefaultCursor(String defaultCursor) {
    this.defaultCursor = defaultCursor;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public AbandonedCheckoutLineItemConnection getLineItems() {
    return lineItems;
  }

  public void setLineItems(AbandonedCheckoutLineItemConnection lineItems) {
    this.lineItems = lineItems;
  }

  
  public int getLineItemsQuantity() {
    return lineItemsQuantity;
  }

  public void setLineItemsQuantity(int lineItemsQuantity) {
    this.lineItemsQuantity = lineItemsQuantity;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public MailingAddress getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddress shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  
  public MoneyBag getTotalDiscountSet() {
    return totalDiscountSet;
  }

  public void setTotalDiscountSet(MoneyBag totalDiscountSet) {
    this.totalDiscountSet = totalDiscountSet;
  }

  
  public MoneyBag getTotalDutiesSet() {
    return totalDutiesSet;
  }

  public void setTotalDutiesSet(MoneyBag totalDutiesSet) {
    this.totalDutiesSet = totalDutiesSet;
  }

  
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "AbandonedCheckout{abandonedCheckoutUrl='" + abandonedCheckoutUrl + "', billingAddress='" + billingAddress + "', completedAt='" + completedAt + "', createdAt='" + createdAt + "', customAttributes='" + customAttributes + "', customer='" + customer + "', defaultCursor='" + defaultCursor + "', discountCodes='" + discountCodes + "', id='" + id + "', lineItems='" + lineItems + "', lineItemsQuantity='" + lineItemsQuantity + "', name='" + name + "', note='" + note + "', shippingAddress='" + shippingAddress + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountSet='" + totalDiscountSet + "', totalDutiesSet='" + totalDutiesSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPriceSet='" + totalPriceSet + "', totalTaxSet='" + totalTaxSet + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonedCheckout that = (AbandonedCheckout) o;
    return Objects.equals(abandonedCheckoutUrl, that.abandonedCheckoutUrl) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(completedAt, that.completedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(defaultCursor, that.defaultCursor) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        lineItemsQuantity == that.lineItemsQuantity &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxesIncluded == that.taxesIncluded &&
        Objects.equals(totalDiscountSet, that.totalDiscountSet) &&
        Objects.equals(totalDutiesSet, that.totalDutiesSet) &&
        Objects.equals(totalLineItemsPriceSet, that.totalLineItemsPriceSet) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonedCheckoutUrl, billingAddress, completedAt, createdAt, customAttributes, customer, defaultCursor, discountCodes, id, lineItems, lineItemsQuantity, name, note, shippingAddress, subtotalPriceSet, taxLines, taxesIncluded, totalDiscountSet, totalDutiesSet, totalLineItemsPriceSet, totalPriceSet, totalTaxSet, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String abandonedCheckoutUrl;

    
    private MailingAddress billingAddress;

    
    private OffsetDateTime completedAt;

    
    private OffsetDateTime createdAt;

    
    private List<Attribute> customAttributes;

    
    private Customer customer;

    
    private String defaultCursor;

    
    private List<String> discountCodes;

    
    private String id;

    
    private AbandonedCheckoutLineItemConnection lineItems;

    
    private int lineItemsQuantity;

    
    private String name;

    
    private String note;

    
    private MailingAddress shippingAddress;

    
    private MoneyBag subtotalPriceSet;

    
    private List<TaxLine> taxLines;

    
    private boolean taxesIncluded;

    
    private MoneyBag totalDiscountSet;

    
    private MoneyBag totalDutiesSet;

    
    private MoneyBag totalLineItemsPriceSet;

    
    private MoneyBag totalPriceSet;

    
    private MoneyBag totalTaxSet;

    
    private OffsetDateTime updatedAt;

    public AbandonedCheckout build() {
      AbandonedCheckout result = new AbandonedCheckout();
      result.abandonedCheckoutUrl = this.abandonedCheckoutUrl;
      result.billingAddress = this.billingAddress;
      result.completedAt = this.completedAt;
      result.createdAt = this.createdAt;
      result.customAttributes = this.customAttributes;
      result.customer = this.customer;
      result.defaultCursor = this.defaultCursor;
      result.discountCodes = this.discountCodes;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.lineItemsQuantity = this.lineItemsQuantity;
      result.name = this.name;
      result.note = this.note;
      result.shippingAddress = this.shippingAddress;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.taxesIncluded = this.taxesIncluded;
      result.totalDiscountSet = this.totalDiscountSet;
      result.totalDutiesSet = this.totalDutiesSet;
      result.totalLineItemsPriceSet = this.totalLineItemsPriceSet;
      result.totalPriceSet = this.totalPriceSet;
      result.totalTaxSet = this.totalTaxSet;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder abandonedCheckoutUrl(String abandonedCheckoutUrl) {
      this.abandonedCheckoutUrl = abandonedCheckoutUrl;
      return this;
    }

    
    public Builder billingAddress(MailingAddress billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder completedAt(OffsetDateTime completedAt) {
      this.completedAt = completedAt;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder customAttributes(List<Attribute> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder defaultCursor(String defaultCursor) {
      this.defaultCursor = defaultCursor;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder lineItems(AbandonedCheckoutLineItemConnection lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder lineItemsQuantity(int lineItemsQuantity) {
      this.lineItemsQuantity = lineItemsQuantity;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder shippingAddress(MailingAddress shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    
    public Builder totalDiscountSet(MoneyBag totalDiscountSet) {
      this.totalDiscountSet = totalDiscountSet;
      return this;
    }

    
    public Builder totalDutiesSet(MoneyBag totalDutiesSet) {
      this.totalDutiesSet = totalDutiesSet;
      return this;
    }

    
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
