package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The calculated fields for a draft order.
 */
public class CalculatedDraftOrder {
  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  private Boolean acceptAutomaticDiscounts;

  /**
   * The list of alerts raised while calculating.
   */
  private List<ResourceAlert> alerts;

  /**
   * Whether all variant prices have been overridden.
   */
  private boolean allVariantPricesOverridden;

  /**
   * Whether any variant prices have been overridden.
   */
  private boolean anyVariantPricesOverridden;

  /**
   * The custom order-level discount applied.
   */
  private DraftOrderAppliedDiscount appliedDiscount;

  /**
   * The available shipping rates.
   * Requires a customer with a valid shipping address and at least one line item.
   */
  private List<ShippingRate> availableShippingRates;

  /**
   * Whether the billing address matches the shipping address.
   */
  private boolean billingAddressMatchesShippingAddress;

  /**
   * The shop currency used for calculation.
   */
  private CurrencyCode currencyCode;

  /**
   * The customer who will be sent an invoice.
   */
  private Customer customer;

  /**
   * All discount codes applied.
   */
  private List<String> discountCodes;

  /**
   * The list of the line items in the calculated draft order.
   */
  private List<CalculatedDraftOrderLineItem> lineItems;

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  private MoneyBag lineItemsSubtotalPrice;

  /**
   * The name of the selected market.
   */
  private String marketName;

  /**
   * The selected country code that determines the pricing.
   */
  private CountryCode marketRegionCountryCode;

  /**
   * The assigned phone number.
   */
  private String phone;

  /**
   * The list of platform discounts applied.
   */
  private List<DraftOrderPlatformDiscount> platformDiscounts;

  /**
   * The payment currency used for calculation.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The purchasing entity.
   */
  private PurchasingEntity purchasingEntity;

  /**
   * The line item containing the shipping information and costs.
   */
  private ShippingLine shippingLine;

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  private String subtotalPrice;

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  private MoneyBag subtotalPriceSet;

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  private List<TaxLine> taxLines;

  /**
   * Whether the line item prices include taxes.
   */
  private boolean taxesIncluded;

  /**
   * Total discounts.
   */
  private MoneyBag totalDiscountsSet;

  /**
   * Total price of line items.
   */
  private MoneyBag totalLineItemsPriceSet;

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  private String totalPrice;

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  private MoneyBag totalPriceSet;

  /**
   * The sum of individual line item quantities.
   * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
   */
  private int totalQuantityOfLineItems;

  /**
   * The total shipping price in shop currency.
   */
  private String totalShippingPrice;

  /**
   * The total shipping price.
   */
  private MoneyBag totalShippingPriceSet;

  /**
   * The total tax in shop currency.
   */
  private String totalTax;

  /**
   * The total tax.
   */
  private MoneyBag totalTaxSet;

  /**
   * Fingerprint of the current cart.
   * In order to have bundles work, the fingerprint must be passed to
   * each request as it was previously returned, unmodified.
   */
  private String transformerFingerprint;

  /**
   * The list of warnings raised while calculating.
   */
  private List<DraftOrderWarning> warnings;

  public CalculatedDraftOrder() {
  }

  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  /**
   * The list of alerts raised while calculating.
   */
  public List<ResourceAlert> getAlerts() {
    return alerts;
  }

  public void setAlerts(List<ResourceAlert> alerts) {
    this.alerts = alerts;
  }

  /**
   * Whether all variant prices have been overridden.
   */
  public boolean getAllVariantPricesOverridden() {
    return allVariantPricesOverridden;
  }

  public void setAllVariantPricesOverridden(boolean allVariantPricesOverridden) {
    this.allVariantPricesOverridden = allVariantPricesOverridden;
  }

  /**
   * Whether any variant prices have been overridden.
   */
  public boolean getAnyVariantPricesOverridden() {
    return anyVariantPricesOverridden;
  }

  public void setAnyVariantPricesOverridden(boolean anyVariantPricesOverridden) {
    this.anyVariantPricesOverridden = anyVariantPricesOverridden;
  }

  /**
   * The custom order-level discount applied.
   */
  public DraftOrderAppliedDiscount getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * The available shipping rates.
   * Requires a customer with a valid shipping address and at least one line item.
   */
  public List<ShippingRate> getAvailableShippingRates() {
    return availableShippingRates;
  }

  public void setAvailableShippingRates(List<ShippingRate> availableShippingRates) {
    this.availableShippingRates = availableShippingRates;
  }

  /**
   * Whether the billing address matches the shipping address.
   */
  public boolean getBillingAddressMatchesShippingAddress() {
    return billingAddressMatchesShippingAddress;
  }

  public void setBillingAddressMatchesShippingAddress(
      boolean billingAddressMatchesShippingAddress) {
    this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
  }

  /**
   * The shop currency used for calculation.
   */
  public CurrencyCode getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(CurrencyCode currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * The customer who will be sent an invoice.
   */
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  /**
   * All discount codes applied.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * The list of the line items in the calculated draft order.
   */
  public List<CalculatedDraftOrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CalculatedDraftOrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * A subtotal of the line items and corresponding discounts,
   * excluding include shipping charges, shipping discounts, taxes, or order discounts.
   */
  public MoneyBag getLineItemsSubtotalPrice() {
    return lineItemsSubtotalPrice;
  }

  public void setLineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
    this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
  }

  /**
   * The name of the selected market.
   */
  public String getMarketName() {
    return marketName;
  }

  public void setMarketName(String marketName) {
    this.marketName = marketName;
  }

  /**
   * The selected country code that determines the pricing.
   */
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
  }

  /**
   * The assigned phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The list of platform discounts applied.
   */
  public List<DraftOrderPlatformDiscount> getPlatformDiscounts() {
    return platformDiscounts;
  }

  public void setPlatformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
    this.platformDiscounts = platformDiscounts;
  }

  /**
   * The payment currency used for calculation.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The purchasing entity.
   */
  public PurchasingEntity getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntity purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  /**
   * The line item containing the shipping information and costs.
   */
  public ShippingLine getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLine shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * The subtotal, in shop currency, of the line items and their discounts,
   * excluding shipping charges, shipping discounts, and taxes.
   */
  public String getSubtotalPrice() {
    return subtotalPrice;
  }

  public void setSubtotalPrice(String subtotalPrice) {
    this.subtotalPrice = subtotalPrice;
  }

  /**
   * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
   */
  public MoneyBag getSubtotalPriceSet() {
    return subtotalPriceSet;
  }

  public void setSubtotalPriceSet(MoneyBag subtotalPriceSet) {
    this.subtotalPriceSet = subtotalPriceSet;
  }

  /**
   * The list of of taxes lines charged for each line item and shipping line.
   */
  public List<TaxLine> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<TaxLine> taxLines) {
    this.taxLines = taxLines;
  }

  /**
   * Whether the line item prices include taxes.
   */
  public boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  /**
   * Total discounts.
   */
  public MoneyBag getTotalDiscountsSet() {
    return totalDiscountsSet;
  }

  public void setTotalDiscountsSet(MoneyBag totalDiscountsSet) {
    this.totalDiscountsSet = totalDiscountsSet;
  }

  /**
   * Total price of line items.
   */
  public MoneyBag getTotalLineItemsPriceSet() {
    return totalLineItemsPriceSet;
  }

  public void setTotalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
    this.totalLineItemsPriceSet = totalLineItemsPriceSet;
  }

  /**
   * The total price, in shop currency, includes taxes, shipping charges, and discounts.
   */
  public String getTotalPrice() {
    return totalPrice;
  }

  public void setTotalPrice(String totalPrice) {
    this.totalPrice = totalPrice;
  }

  /**
   * The total price, includes taxes, shipping charges, and discounts.
   */
  public MoneyBag getTotalPriceSet() {
    return totalPriceSet;
  }

  public void setTotalPriceSet(MoneyBag totalPriceSet) {
    this.totalPriceSet = totalPriceSet;
  }

  /**
   * The sum of individual line item quantities.
   * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
   */
  public int getTotalQuantityOfLineItems() {
    return totalQuantityOfLineItems;
  }

  public void setTotalQuantityOfLineItems(int totalQuantityOfLineItems) {
    this.totalQuantityOfLineItems = totalQuantityOfLineItems;
  }

  /**
   * The total shipping price in shop currency.
   */
  public String getTotalShippingPrice() {
    return totalShippingPrice;
  }

  public void setTotalShippingPrice(String totalShippingPrice) {
    this.totalShippingPrice = totalShippingPrice;
  }

  /**
   * The total shipping price.
   */
  public MoneyBag getTotalShippingPriceSet() {
    return totalShippingPriceSet;
  }

  public void setTotalShippingPriceSet(MoneyBag totalShippingPriceSet) {
    this.totalShippingPriceSet = totalShippingPriceSet;
  }

  /**
   * The total tax in shop currency.
   */
  public String getTotalTax() {
    return totalTax;
  }

  public void setTotalTax(String totalTax) {
    this.totalTax = totalTax;
  }

  /**
   * The total tax.
   */
  public MoneyBag getTotalTaxSet() {
    return totalTaxSet;
  }

  public void setTotalTaxSet(MoneyBag totalTaxSet) {
    this.totalTaxSet = totalTaxSet;
  }

  /**
   * Fingerprint of the current cart.
   * In order to have bundles work, the fingerprint must be passed to
   * each request as it was previously returned, unmodified.
   */
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  /**
   * The list of warnings raised while calculating.
   */
  public List<DraftOrderWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<DraftOrderWarning> warnings) {
    this.warnings = warnings;
  }

  @Override
  public String toString() {
    return "CalculatedDraftOrder{acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', alerts='" + alerts + "', allVariantPricesOverridden='" + allVariantPricesOverridden + "', anyVariantPricesOverridden='" + anyVariantPricesOverridden + "', appliedDiscount='" + appliedDiscount + "', availableShippingRates='" + availableShippingRates + "', billingAddressMatchesShippingAddress='" + billingAddressMatchesShippingAddress + "', currencyCode='" + currencyCode + "', customer='" + customer + "', discountCodes='" + discountCodes + "', lineItems='" + lineItems + "', lineItemsSubtotalPrice='" + lineItemsSubtotalPrice + "', marketName='" + marketName + "', marketRegionCountryCode='" + marketRegionCountryCode + "', phone='" + phone + "', platformDiscounts='" + platformDiscounts + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', purchasingEntity='" + purchasingEntity + "', shippingLine='" + shippingLine + "', subtotalPrice='" + subtotalPrice + "', subtotalPriceSet='" + subtotalPriceSet + "', taxLines='" + taxLines + "', taxesIncluded='" + taxesIncluded + "', totalDiscountsSet='" + totalDiscountsSet + "', totalLineItemsPriceSet='" + totalLineItemsPriceSet + "', totalPrice='" + totalPrice + "', totalPriceSet='" + totalPriceSet + "', totalQuantityOfLineItems='" + totalQuantityOfLineItems + "', totalShippingPrice='" + totalShippingPrice + "', totalShippingPriceSet='" + totalShippingPriceSet + "', totalTax='" + totalTax + "', totalTaxSet='" + totalTaxSet + "', transformerFingerprint='" + transformerFingerprint + "', warnings='" + warnings + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedDraftOrder that = (CalculatedDraftOrder) o;
    return Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        Objects.equals(alerts, that.alerts) &&
        allVariantPricesOverridden == that.allVariantPricesOverridden &&
        anyVariantPricesOverridden == that.anyVariantPricesOverridden &&
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
    return Objects.hash(acceptAutomaticDiscounts, alerts, allVariantPricesOverridden, anyVariantPricesOverridden, appliedDiscount, availableShippingRates, billingAddressMatchesShippingAddress, currencyCode, customer, discountCodes, lineItems, lineItemsSubtotalPrice, marketName, marketRegionCountryCode, phone, platformDiscounts, presentmentCurrencyCode, purchasingEntity, shippingLine, subtotalPrice, subtotalPriceSet, taxLines, taxesIncluded, totalDiscountsSet, totalLineItemsPriceSet, totalPrice, totalPriceSet, totalQuantityOfLineItems, totalShippingPrice, totalShippingPriceSet, totalTax, totalTaxSet, transformerFingerprint, warnings);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    private Boolean acceptAutomaticDiscounts;

    /**
     * The list of alerts raised while calculating.
     */
    private List<ResourceAlert> alerts;

    /**
     * Whether all variant prices have been overridden.
     */
    private boolean allVariantPricesOverridden;

    /**
     * Whether any variant prices have been overridden.
     */
    private boolean anyVariantPricesOverridden;

    /**
     * The custom order-level discount applied.
     */
    private DraftOrderAppliedDiscount appliedDiscount;

    /**
     * The available shipping rates.
     * Requires a customer with a valid shipping address and at least one line item.
     */
    private List<ShippingRate> availableShippingRates;

    /**
     * Whether the billing address matches the shipping address.
     */
    private boolean billingAddressMatchesShippingAddress;

    /**
     * The shop currency used for calculation.
     */
    private CurrencyCode currencyCode;

    /**
     * The customer who will be sent an invoice.
     */
    private Customer customer;

    /**
     * All discount codes applied.
     */
    private List<String> discountCodes;

    /**
     * The list of the line items in the calculated draft order.
     */
    private List<CalculatedDraftOrderLineItem> lineItems;

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    private MoneyBag lineItemsSubtotalPrice;

    /**
     * The name of the selected market.
     */
    private String marketName;

    /**
     * The selected country code that determines the pricing.
     */
    private CountryCode marketRegionCountryCode;

    /**
     * The assigned phone number.
     */
    private String phone;

    /**
     * The list of platform discounts applied.
     */
    private List<DraftOrderPlatformDiscount> platformDiscounts;

    /**
     * The payment currency used for calculation.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The purchasing entity.
     */
    private PurchasingEntity purchasingEntity;

    /**
     * The line item containing the shipping information and costs.
     */
    private ShippingLine shippingLine;

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    private String subtotalPrice;

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    private MoneyBag subtotalPriceSet;

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    private List<TaxLine> taxLines;

    /**
     * Whether the line item prices include taxes.
     */
    private boolean taxesIncluded;

    /**
     * Total discounts.
     */
    private MoneyBag totalDiscountsSet;

    /**
     * Total price of line items.
     */
    private MoneyBag totalLineItemsPriceSet;

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    private String totalPrice;

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    private MoneyBag totalPriceSet;

    /**
     * The sum of individual line item quantities.
     * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
     */
    private int totalQuantityOfLineItems;

    /**
     * The total shipping price in shop currency.
     */
    private String totalShippingPrice;

    /**
     * The total shipping price.
     */
    private MoneyBag totalShippingPriceSet;

    /**
     * The total tax in shop currency.
     */
    private String totalTax;

    /**
     * The total tax.
     */
    private MoneyBag totalTaxSet;

    /**
     * Fingerprint of the current cart.
     * In order to have bundles work, the fingerprint must be passed to
     * each request as it was previously returned, unmodified.
     */
    private String transformerFingerprint;

    /**
     * The list of warnings raised while calculating.
     */
    private List<DraftOrderWarning> warnings;

    public CalculatedDraftOrder build() {
      CalculatedDraftOrder result = new CalculatedDraftOrder();
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.alerts = this.alerts;
      result.allVariantPricesOverridden = this.allVariantPricesOverridden;
      result.anyVariantPricesOverridden = this.anyVariantPricesOverridden;
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

    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    /**
     * The list of alerts raised while calculating.
     */
    public Builder alerts(List<ResourceAlert> alerts) {
      this.alerts = alerts;
      return this;
    }

    /**
     * Whether all variant prices have been overridden.
     */
    public Builder allVariantPricesOverridden(boolean allVariantPricesOverridden) {
      this.allVariantPricesOverridden = allVariantPricesOverridden;
      return this;
    }

    /**
     * Whether any variant prices have been overridden.
     */
    public Builder anyVariantPricesOverridden(boolean anyVariantPricesOverridden) {
      this.anyVariantPricesOverridden = anyVariantPricesOverridden;
      return this;
    }

    /**
     * The custom order-level discount applied.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscount appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * The available shipping rates.
     * Requires a customer with a valid shipping address and at least one line item.
     */
    public Builder availableShippingRates(List<ShippingRate> availableShippingRates) {
      this.availableShippingRates = availableShippingRates;
      return this;
    }

    /**
     * Whether the billing address matches the shipping address.
     */
    public Builder billingAddressMatchesShippingAddress(
        boolean billingAddressMatchesShippingAddress) {
      this.billingAddressMatchesShippingAddress = billingAddressMatchesShippingAddress;
      return this;
    }

    /**
     * The shop currency used for calculation.
     */
    public Builder currencyCode(CurrencyCode currencyCode) {
      this.currencyCode = currencyCode;
      return this;
    }

    /**
     * The customer who will be sent an invoice.
     */
    public Builder customer(Customer customer) {
      this.customer = customer;
      return this;
    }

    /**
     * All discount codes applied.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * The list of the line items in the calculated draft order.
     */
    public Builder lineItems(List<CalculatedDraftOrderLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * A subtotal of the line items and corresponding discounts,
     * excluding include shipping charges, shipping discounts, taxes, or order discounts.
     */
    public Builder lineItemsSubtotalPrice(MoneyBag lineItemsSubtotalPrice) {
      this.lineItemsSubtotalPrice = lineItemsSubtotalPrice;
      return this;
    }

    /**
     * The name of the selected market.
     */
    public Builder marketName(String marketName) {
      this.marketName = marketName;
      return this;
    }

    /**
     * The selected country code that determines the pricing.
     */
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
      return this;
    }

    /**
     * The assigned phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The list of platform discounts applied.
     */
    public Builder platformDiscounts(List<DraftOrderPlatformDiscount> platformDiscounts) {
      this.platformDiscounts = platformDiscounts;
      return this;
    }

    /**
     * The payment currency used for calculation.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The purchasing entity.
     */
    public Builder purchasingEntity(PurchasingEntity purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    /**
     * The line item containing the shipping information and costs.
     */
    public Builder shippingLine(ShippingLine shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * The subtotal, in shop currency, of the line items and their discounts,
     * excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPrice(String subtotalPrice) {
      this.subtotalPrice = subtotalPrice;
      return this;
    }

    /**
     * The subtotal, of the line items and their discounts, excluding shipping charges, shipping discounts, and taxes.
     */
    public Builder subtotalPriceSet(MoneyBag subtotalPriceSet) {
      this.subtotalPriceSet = subtotalPriceSet;
      return this;
    }

    /**
     * The list of of taxes lines charged for each line item and shipping line.
     */
    public Builder taxLines(List<TaxLine> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    /**
     * Whether the line item prices include taxes.
     */
    public Builder taxesIncluded(boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    /**
     * Total discounts.
     */
    public Builder totalDiscountsSet(MoneyBag totalDiscountsSet) {
      this.totalDiscountsSet = totalDiscountsSet;
      return this;
    }

    /**
     * Total price of line items.
     */
    public Builder totalLineItemsPriceSet(MoneyBag totalLineItemsPriceSet) {
      this.totalLineItemsPriceSet = totalLineItemsPriceSet;
      return this;
    }

    /**
     * The total price, in shop currency, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPrice(String totalPrice) {
      this.totalPrice = totalPrice;
      return this;
    }

    /**
     * The total price, includes taxes, shipping charges, and discounts.
     */
    public Builder totalPriceSet(MoneyBag totalPriceSet) {
      this.totalPriceSet = totalPriceSet;
      return this;
    }

    /**
     * The sum of individual line item quantities.
     * If the draft order has bundle items, this is the sum containing the quantities of individual items in the bundle.
     */
    public Builder totalQuantityOfLineItems(int totalQuantityOfLineItems) {
      this.totalQuantityOfLineItems = totalQuantityOfLineItems;
      return this;
    }

    /**
     * The total shipping price in shop currency.
     */
    public Builder totalShippingPrice(String totalShippingPrice) {
      this.totalShippingPrice = totalShippingPrice;
      return this;
    }

    /**
     * The total shipping price.
     */
    public Builder totalShippingPriceSet(MoneyBag totalShippingPriceSet) {
      this.totalShippingPriceSet = totalShippingPriceSet;
      return this;
    }

    /**
     * The total tax in shop currency.
     */
    public Builder totalTax(String totalTax) {
      this.totalTax = totalTax;
      return this;
    }

    /**
     * The total tax.
     */
    public Builder totalTaxSet(MoneyBag totalTaxSet) {
      this.totalTaxSet = totalTaxSet;
      return this;
    }

    /**
     * Fingerprint of the current cart.
     * In order to have bundles work, the fingerprint must be passed to
     * each request as it was previously returned, unmodified.
     */
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }

    /**
     * The list of warnings raised while calculating.
     */
    public Builder warnings(List<DraftOrderWarning> warnings) {
      this.warnings = warnings;
      return this;
    }
  }
}
