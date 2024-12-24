package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CalculatedDraftOrder {
  
  private Boolean acceptAutomaticDiscounts;

  
  private List<ResourceAlert> alerts;

  
  private DraftOrderAppliedDiscount appliedDiscount;

  
  private List<ShippingRate> availableShippingRates;

  
  private boolean billingAddressMatchesShippingAddress;

  
  private CurrencyCode currencyCode;

  
  private Customer customer;

  
  private List<String> discountCodes;

  
  private List<CalculatedDraftOrderLineItem> lineItems;

  
  private MoneyBag lineItemsSubtotalPrice;

  
  private String marketName;

  
  private CountryCode marketRegionCountryCode;

  
  private String phone;

  
  private List<DraftOrderPlatformDiscount> platformDiscounts;

  
  private CurrencyCode presentmentCurrencyCode;

  
  private PurchasingEntity purchasingEntity;

  
  private ShippingLine shippingLine;

  
  private String subtotalPrice;

  
  private MoneyBag subtotalPriceSet;

  
  private List<TaxLine> taxLines;

  
  private boolean taxesIncluded;

  
  private MoneyBag totalDiscountsSet;

  
  private MoneyBag totalLineItemsPriceSet;

  
  private String totalPrice;

  
  private MoneyBag totalPriceSet;

  
  private int totalQuantityOfLineItems;

  
  private String totalShippingPrice;

  
  private MoneyBag totalShippingPriceSet;

  
  private String totalTax;

  
  private MoneyBag totalTaxSet;

  
  private String transformerFingerprint;

  
  private List<DraftOrderWarning> warnings;

  public CalculatedDraftOrder() {
  }

  
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  
  public List<ResourceAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ResourceAlert> alerts) {
    this.alerts = alerts;
  }

  
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  
  public List<ShippingRate> getAvailableShippingRates() {
    return availableShippingRates;
  }

  public void setAvailableShippingRates(List<ShippingRate> availableShippingRates) {
    this.availableShippingRates = availableShippingRates;
  }

  
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public List<CalculatedDraftOrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CalculatedDraftOrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  public MoneyBag getLineItemsSubtotalPrice() {
    return lineItemsSubtotalPrice;
  }

  public void setLineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
    this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
  }

  
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
    return platformDiscounts;
  }

  public void setPlatformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
    this.platformDiscounts = platformDiscounts;
  }

  
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
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

  
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  
  public int getTotalQuantityOfLineItems() {
    return totalQuantityOfLineItems;
  }

  public void setTotalQuantityOfLineItems(int totalQuantityOfLineItems) {
    this.totalQuantityOfLineItems = totalQuantityOfLineItems;
  }

  
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  
  public List<DraftOrderWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<DraftOrderWarning> warnings) {
    this.warnings = warnings;
  }

  @Override
  public String toString() {
    return "CalculatedDraftOrder{acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', alerts='" + alerts + "', appliedDiscount='" + appliedDiscount + "', availableShippingRates='" + availableShippingRates + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', currencyCode='" + currencyCode + "', customer='" + customer + "', discountCodes='" + discountCodes + "', lineItems='" + lineItems + "', lineItemsSubtotalPrice='" + lineItemsSubtotalPrice + "', marketName='" + marketName + "', marketRegionCountryCode='" + marketRegionCountryCode + "', phone='" + phone + "', platformDiscounts='" + platformDiscounts + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', purchasingEntity='" + purchasingEntity + "', shippingLine='" + shippingLine + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountsSet='" + totalDiscountsSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalQuantityOfLineItems='" + totalQuantityOfLineItems + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', transformerFingerprint='" + transformerFingerprint + "', warnings='" + warnings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDraftOrder that = (CalculatedDraftOrder) o;
    return Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        Objects.equals(alerts, that.alerts) &&
        Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(availableShippingRates, that.availableShippingRates) &&
        billingAddressMatchesShippingAddress == that.billingAddressMatchesShippingAddress &&
        Objects.equals(currencyCode, that.currencyCode) &&
        Objects.equals(customer, that.customer) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(lineItemsSubtotalPrice, that.lineItemsSubtotalPrice) &&
        Objects.equals(marketName, that.marketName) &&
        Objects.equals(marketRegionCountryCode, that.marketRegionCountryCode) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(platformDiscounts, that.platformDiscounts) &&
        Objects.equals(presentmentCurrencyCode, that.presentmentCurrencyCode) &&
        Objects.equals(purchasingEntity, that.purchasingEntity) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(subtotalPrice, that.subtotalPrice) &&
        Objects.equals(subtotalPriceSet, that.subtotalPriceSet) &&
        Objects.equals(taxLines, that.taxLines) &&
        taxesIncluded == that.taxesIncluded &&
        Objects.equals(totalDiscountsSet, that.totalDiscountsSet) &&
        Objects.equals(totalLineItemsPriceSet, that.totalLineItemsPriceSet) &&
        Objects.equals(totalPrice, that.totalPrice) &&
        Objects.equals(totalPriceSet, that.totalPriceSet) &&
        totalQuantityOfLineItems == that.totalQuantityOfLineItems &&
        Objects.equals(totalShippingPrice, that.totalShippingPrice) &&
        Objects.equals(totalShippingPriceSet, that.totalShippingPriceSet) &&
        Objects.equals(totalTax, that.totalTax) &&
        Objects.equals(totalTaxSet, that.totalTaxSet) &&
        Objects.equals(transformerFingerprint, that.transformerFingerprint) &&
        Objects.equals(warnings, that.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptAutomaticDiscounts, alerts, appliedDiscount, availableShippingRates, billingAddressMatchesShippingAddress, currencyCode, customer, discountCodes, lineItems, lineItemsSubtotalPrice, marketName, marketRegionCountryCode, phone, platformDiscounts, presentmentCurrencyCode, purchasingEntity, shippingLine, subtotalPrice, subtotalPriceSet, taxLines, taxesIncluded, totalDiscountsSet, totalLineItemsPriceSet, totalPrice, totalPriceSet, totalQuantityOfLineItems, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, transformerFingerprint, warnings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean acceptAutomaticDiscounts;

    
    private List<ResourceAlert> alerts;

    
    private DraftOrderAppliedDiscount appliedDiscount;

    
    private List<ShippingRate> availableShippingRates;

    
    private boolean billingAddressMatchesShippingAddress;

    
    private CurrencyCode currencyCode;

    
    private Customer customer;

    
    private List<String> discountCodes;

    
    private List<CalculatedDraftOrderLineItem> lineItems;

    
    private MoneyBag lineItemsSubtotalPrice;

    
    private String marketName;

    
    private CountryCode marketRegionCountryCode;

    
    private String phone;

    
    private List<DraftOrderPlatformDiscount> platformDiscounts;

    
    private CurrencyCode presentmentCurrencyCode;

    
    private PurchasingEntity purchasingEntity;

    
    private ShippingLine shippingLine;

    
    private String subtotalPrice;

    
    private MoneyBag subtotalPriceSet;

    
    private List<TaxLine> taxLines;

    
    private boolean taxesIncluded;

    
    private MoneyBag totalDiscountsSet;

    
    private MoneyBag totalLineItemsPriceSet;

    
    private String totalPrice;

    
    private MoneyBag totalPriceSet;

    
    private int totalQuantityOfLineItems;

    
    private String totalShippingPrice;

    
    private MoneyBag totalShippingPriceSet;

    
    private String totalTax;

    
    private MoneyBag totalTaxSet;

    
    private String transformerFingerprint;

    
    private List<DraftOrderWarning> warnings;

    public CalculatedDraftOrder build() {
      CalculatedDraftOrder result = new CalculatedDraftOrder();
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.alerts = this.alerts;
      result.appliedDiscount = this.appliedDiscount;
      result.availableShippingRates = this.availableShippingRates;
      result.billingAddressMatchesShippingAddress = this.billingAddressMatchesShippingAddress;
      result.currencyCode = this.currencyCode;
      result.customer = this.customer;
      result.discountCodes = this.discountCodes;
      result.lineItems = this.lineItems;
      result.lineItemsSubtotalPrice = this.lineItemsSubtotalPrice;
      result.marketName = this.marketName;
      result.marketRegionCountryCode = this.marketRegionCountryCode;
      result.phone = this.phone;
      result.platformDiscounts = this.platformDiscounts;
      result.presentmentCurrencyCode = this.presentmentCurrencyCode;
      result.purchasingEntity = this.purchasingEntity;
      result.shippingLine = this.shippingLine;
      result.subtotalPrice = this.subtotalPrice;
      result.subtotalPriceSet = this.subtotalPriceSet;
      result.taxLines = this.taxLines;
      result.taxesIncluded = this.taxesIncluded;
      result.totalDiscountsSet = this.totalDiscountsSet;
      result.totalLineItemsPriceSet = this.totalLineItemsPriceSet;
      result.totalPrice = this.totalPrice;
      result.totalPriceSet = this.totalPriceSet;
      result.totalQuantityOfLineItems = this.totalQuantityOfLineItems;
      result.totalShippingPrice = this.totalShippingPrice;
      result.totalShippingPriceSet = this.totalShippingPriceSet;
      result.totalTax = this.totalTax;
      result.totalTaxSet = this.totalTaxSet;
      result.transformerFingerprint = this.transformerFingerprint;
      result.warnings = this.warnings;
      return result;
    }

    
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    
    public Builder alerts(List<ResourceAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    
    public Builder availableShippingRates(List<ShippingRate> availableShippingRates) {
      this.availableShippingRates = availableShippingRates;
      return this;
    }

    
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder lineItems(List<CalculatedDraftOrderLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder lineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
      this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
      return this;
    }

    
    public Builder marketName(String marketName) {
      this.marketName = marketName;
      return this;
    }

    
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder platformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
      this.platformDiscounts = platformDiscounts;
      return this;
    }

    
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
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

    
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    
    public Builder totalQuantityOfLineItems(int totalQuantityOfLineItems) {
      this.totalQuantityOfLineItems = totalQuantityOfLineItems;
      return this;
    }

    
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }

    
    public Builder warnings(List<DraftOrderWarning> warnings) {
      this.warnings = warnings;
      return this;
    }
  }
}
