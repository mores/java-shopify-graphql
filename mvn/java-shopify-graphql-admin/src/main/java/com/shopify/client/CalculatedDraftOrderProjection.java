package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CalculatedDraftOrderProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CalculatedDraftOrderProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CalculatedDraftOrder"));
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourceAlertProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> alerts() {
     ResourceAlertProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new ResourceAlertProjection<>(this, getRoot());
     getFields().put("alerts", projection);
     return projection;
  }

  public DraftOrderAppliedDiscountProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> appliedDiscount(
      ) {
     DraftOrderAppliedDiscountProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderAppliedDiscountProjection<>(this, getRoot());
     getFields().put("appliedDiscount", projection);
     return projection;
  }

  public ShippingRateProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> availableShippingRates(
      ) {
     ShippingRateProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new ShippingRateProjection<>(this, getRoot());
     getFields().put("availableShippingRates", projection);
     return projection;
  }

  public CurrencyCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> currencyCode() {
     CurrencyCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currencyCode", projection);
     return projection;
  }

  public CustomerProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     CalculatedDraftOrderLineItemProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new CalculatedDraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> lineItemsSubtotalPrice(
      ) {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("lineItemsSubtotalPrice", projection);
     return projection;
  }

  public CountryCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> marketRegionCountryCode(
      ) {
     CountryCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("marketRegionCountryCode", projection);
     return projection;
  }

  public DraftOrderPlatformDiscountProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> platformDiscounts(
      ) {
     DraftOrderPlatformDiscountProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderPlatformDiscountProjection<>(this, getRoot());
     getFields().put("platformDiscounts", projection);
     return projection;
  }

  public CurrencyCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> presentmentCurrencyCode(
      ) {
     CurrencyCodeProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("presentmentCurrencyCode", projection);
     return projection;
  }

  public PurchasingEntityProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> purchasingEntity(
      ) {
     PurchasingEntityProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new PurchasingEntityProjection<>(this, getRoot());
     getFields().put("purchasingEntity", projection);
     return projection;
  }

  public ShippingLineProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> shippingLine() {
     ShippingLineProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new ShippingLineProjection<>(this, getRoot());
     getFields().put("shippingLine", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> subtotalPriceSet() {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("subtotalPriceSet", projection);
     return projection;
  }

  public TaxLineProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> taxLines() {
     TaxLineProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new TaxLineProjection<>(this, getRoot());
     getFields().put("taxLines", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> totalDiscountsSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalDiscountsSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> totalLineItemsPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalLineItemsPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> totalShippingPriceSet(
      ) {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalShippingPriceSet", projection);
     return projection;
  }

  public MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> totalTaxSet() {
     MoneyBagProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalTaxSet", projection);
     return projection;
  }

  public DraftOrderWarningProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> warnings(
      ) {
     DraftOrderWarningProjection<CalculatedDraftOrderProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderWarningProjection<>(this, getRoot());
     getFields().put("warnings", projection);
     return projection;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> acceptAutomaticDiscounts() {
    getFields().put("acceptAutomaticDiscounts", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> allVariantPricesOverridden() {
    getFields().put("allVariantPricesOverridden", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> anyVariantPricesOverridden() {
    getFields().put("anyVariantPricesOverridden", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> billingAddressMatchesShippingAddress() {
    getFields().put("billingAddressMatchesShippingAddress", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> discountCodes() {
    getFields().put("discountCodes", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> marketName() {
    getFields().put("marketName", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> subtotalPrice() {
    getFields().put("subtotalPrice", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> taxesIncluded() {
    getFields().put("taxesIncluded", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> totalPrice() {
    getFields().put("totalPrice", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> totalQuantityOfLineItems() {
    getFields().put("totalQuantityOfLineItems", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> totalShippingPrice() {
    getFields().put("totalShippingPrice", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> totalTax() {
    getFields().put("totalTax", null);
    return this;
  }

  public CalculatedDraftOrderProjection<PARENT, ROOT> transformerFingerprint() {
    getFields().put("transformerFingerprint", null);
    return this;
  }
}
