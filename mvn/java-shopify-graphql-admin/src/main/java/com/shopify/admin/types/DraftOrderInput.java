package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to create or update a draft order.
 */
public class DraftOrderInput {
  /**
   * The discount that will be applied to the draft order.
   * A draft order line item can have one discount. A draft order can also have one order-level discount.
   */
  private DraftOrderAppliedDiscountInput appliedDiscount;

  /**
   * The list of discount codes that will be attempted to be applied to the draft order.
   * If the draft isn't eligible for any given discount code it will be skipped during calculation.
   */
  private List<String> discountCodes;

  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  private Boolean acceptAutomaticDiscounts;

  /**
   * The mailing address associated with the payment method.
   */
  private MailingAddressInput billingAddress;

  /**
   * The extra information added to the draft order on behalf of the customer.
   */
  private List<AttributeInput> customAttributes;

  /**
   * The customer's email address.
   */
  private String email;

  /**
   * The list of product variant or custom line item.
   * Each draft order must include at least one line item.
   * Accepts a maximum of 499 line items.
   *   
   * NOTE: Draft orders don't currently support subscriptions.
   */
  private List<DraftOrderLineItemInput> lineItems;

  /**
   * The list of metafields attached to the draft order. An existing metafield can not be used when creating a draft order.
   */
  private List<MetafieldInput> metafields;

  /**
   * The localized fields attached to the draft order. For example, Tax IDs.
   */
  private List<LocalizedFieldInput> localizedFields;

  /**
   * The text of an optional note that a shop owner can attach to the draft order.
   */
  private String note;

  /**
   * The mailing address to where the order will be shipped.
   */
  private MailingAddressInput shippingAddress;

  /**
   * The shipping line object, which details the shipping method used.
   */
  private ShippingLineInput shippingLine;

  /**
   * A comma separated list of tags that have been added to the draft order.
   */
  private List<String> tags;

  /**
   * Whether or not taxes are exempt for the draft order.
   * If false, then Shopify will refer to the taxable field for each line item.
   * If a customer is applied to the draft order, then Shopify will use the customer's tax exempt field instead.
   */
  private Boolean taxExempt;

  /**
   * Whether to use the customer's default address.
   */
  private Boolean useCustomerDefaultAddress;

  /**
   * Whether the draft order will be visible to the customer on the self-serve portal.
   */
  private Boolean visibleToCustomer;

  /**
   * The time after which inventory reservation will expire.
   */
  private OffsetDateTime reserveInventoryUntil;

  /**
   * The payment currency of the customer for this draft order.
   */
  private CurrencyCode presentmentCurrencyCode;

  /**
   * The customer's phone number.
   */
  private String phone;

  /**
   * The fields used to create payment terms.
   */
  private PaymentTermsInput paymentTerms;

  /**
   * The purchasing entity for the draft order.
   */
  private PurchasingEntityInput purchasingEntity;

  /**
   * The source of the checkout.
   * To use this field for sales attribution, you must register the channels that your app is managing.
   * You can register the channels that your app is managing by completing
   * [this Google Form](https://docs.google.com/forms/d/e/1FAIpQLScmVTZRQNjOJ7RD738mL1lGeFjqKVe_FM2tO9xsm21QEo5Ozg/viewform?usp=sf_link).
   * After you've submitted your request, you need to wait for your request to be processed by Shopify.
   * You can find a list of your channels in the Partner Dashboard, in your app's Marketplace extension.
   * You need to specify the handle as the `source_name` value in your request.
   * The handle is the channel that the order was placed from.
   */
  private String sourceName;

  /**
   * Whether discount codes are allowed during checkout of this draft order.
   */
  private Boolean allowDiscountCodesInCheckout;

  /**
   * The purchase order number.
   */
  private String poNumber;

  /**
   * The unique token identifying the draft order.
   */
  private String sessionToken;

  /**
   * Fingerprint to guarantee bundles are handled correctly.
   */
  private String transformerFingerprint;

  public DraftOrderInput() {
  }

  /**
   * The discount that will be applied to the draft order.
   * A draft order line item can have one discount. A draft order can also have one order-level discount.
   */
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * The list of discount codes that will be attempted to be applied to the draft order.
   * If the draft isn't eligible for any given discount code it will be skipped during calculation.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
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
   * The mailing address associated with the payment method.
   */
  public MailingAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  /**
   * The extra information added to the draft order on behalf of the customer.
   */
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  /**
   * The customer's email address.
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * The list of product variant or custom line item.
   * Each draft order must include at least one line item.
   * Accepts a maximum of 499 line items.
   *   
   * NOTE: Draft orders don't currently support subscriptions.
   */
  public List<DraftOrderLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<DraftOrderLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The list of metafields attached to the draft order. An existing metafield can not be used when creating a draft order.
   */
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The localized fields attached to the draft order. For example, Tax IDs.
   */
  public List<LocalizedFieldInput> getLocalizedFields() {
    return localizedFields;
  }

  public void setLocalizedFields(List<LocalizedFieldInput> localizedFields) {
    this.localizedFields = localizedFields;
  }

  /**
   * The text of an optional note that a shop owner can attach to the draft order.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The mailing address to where the order will be shipped.
   */
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The shipping line object, which details the shipping method used.
   */
  public ShippingLineInput getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLineInput shippingLine) {
    this.shippingLine = shippingLine;
  }

  /**
   * A comma separated list of tags that have been added to the draft order.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Whether or not taxes are exempt for the draft order.
   * If false, then Shopify will refer to the taxable field for each line item.
   * If a customer is applied to the draft order, then Shopify will use the customer's tax exempt field instead.
   */
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * Whether to use the customer's default address.
   */
  public Boolean getUseCustomerDefaultAddress() {
    return useCustomerDefaultAddress;
  }

  public void setUseCustomerDefaultAddress(Boolean useCustomerDefaultAddress) {
    this.useCustomerDefaultAddress = useCustomerDefaultAddress;
  }

  /**
   * Whether the draft order will be visible to the customer on the self-serve portal.
   */
  public Boolean getVisibleToCustomer() {
    return visibleToCustomer;
  }

  public void setVisibleToCustomer(Boolean visibleToCustomer) {
    this.visibleToCustomer = visibleToCustomer;
  }

  /**
   * The time after which inventory reservation will expire.
   */
  public OffsetDateTime getReserveInventoryUntil() {
    return reserveInventoryUntil;
  }

  public void setReserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
    this.reserveInventoryUntil = reserveInventoryUntil;
  }

  /**
   * The payment currency of the customer for this draft order.
   */
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  /**
   * The customer's phone number.
   */
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   * The fields used to create payment terms.
   */
  public PaymentTermsInput getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTermsInput paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  /**
   * The purchasing entity for the draft order.
   */
  public PurchasingEntityInput getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntityInput purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  /**
   * The source of the checkout.
   * To use this field for sales attribution, you must register the channels that your app is managing.
   * You can register the channels that your app is managing by completing
   * [this Google Form](https://docs.google.com/forms/d/e/1FAIpQLScmVTZRQNjOJ7RD738mL1lGeFjqKVe_FM2tO9xsm21QEo5Ozg/viewform?usp=sf_link).
   * After you've submitted your request, you need to wait for your request to be processed by Shopify.
   * You can find a list of your channels in the Partner Dashboard, in your app's Marketplace extension.
   * You need to specify the handle as the `source_name` value in your request.
   * The handle is the channel that the order was placed from.
   */
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  /**
   * Whether discount codes are allowed during checkout of this draft order.
   */
  public Boolean getAllowDiscountCodesInCheckout() {
    return allowDiscountCodesInCheckout;
  }

  public void setAllowDiscountCodesInCheckout(Boolean allowDiscountCodesInCheckout) {
    this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
  }

  /**
   * The purchase order number.
   */
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  /**
   * The unique token identifying the draft order.
   */
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  /**
   * Fingerprint to guarantee bundles are handled correctly.
   */
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  @Override
  public String toString() {
    return "DraftOrderInput{appliedDiscount='" + appliedDiscount + "', discountCodes='" + discountCodes + "', acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', billingAddress='" + billingAddress + "', customAttributes='" + customAttributes + "', email='" + email + "', lineItems='" + lineItems + "', metafields='" + metafields + "', localizedFields='" + localizedFields + "', note='" + note + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', tags='" + tags + "', taxExempt='" + taxExempt + "', useCustomerDefaultAddress='" + useCustomerDefaultAddress + "', visibleToCustomer='" + visibleToCustomer + "', reserveInventoryUntil='" + reserveInventoryUntil + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', phone='" + phone + "', paymentTerms='" + paymentTerms + "', purchasingEntity='" + purchasingEntity + "', sourceName='" + sourceName + "', allowDiscountCodesInCheckout='" + allowDiscountCodesInCheckout + "', poNumber='" + poNumber + "', sessionToken='" + sessionToken + "', transformerFingerprint='" + transformerFingerprint + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderInput that = (DraftOrderInput) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(email, that.email) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(localizedFields, that.localizedFields) &&
        Objects.equals(note, that.note) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingLine, that.shippingLine) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(taxExempt, that.taxExempt) &&
        Objects.equals(useCustomerDefaultAddress, that.useCustomerDefaultAddress) &&
        Objects.equals(visibleToCustomer, that.visibleToCustomer) &&
        Objects.equals(reserveInventoryUntil, that.reserveInventoryUntil) &&
        Objects.equals(presentmentCurrencyCode, that.presentmentCurrencyCode) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(paymentTerms, that.paymentTerms) &&
        Objects.equals(purchasingEntity, that.purchasingEntity) &&
        Objects.equals(sourceName, that.sourceName) &&
        Objects.equals(allowDiscountCodesInCheckout, that.allowDiscountCodesInCheckout) &&
        Objects.equals(poNumber, that.poNumber) &&
        Objects.equals(sessionToken, that.sessionToken) &&
        Objects.equals(transformerFingerprint, that.transformerFingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, discountCodes, acceptAutomaticDiscounts, billingAddress, customAttributes, email, lineItems, metafields, localizedFields, note, shippingAddress, shippingLine, tags, taxExempt, useCustomerDefaultAddress, visibleToCustomer, reserveInventoryUntil, presentmentCurrencyCode, phone, paymentTerms, purchasingEntity, sourceName, allowDiscountCodesInCheckout, poNumber, sessionToken, transformerFingerprint);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount that will be applied to the draft order.
     * A draft order line item can have one discount. A draft order can also have one order-level discount.
     */
    private DraftOrderAppliedDiscountInput appliedDiscount;

    /**
     * The list of discount codes that will be attempted to be applied to the draft order.
     * If the draft isn't eligible for any given discount code it will be skipped during calculation.
     */
    private List<String> discountCodes;

    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    private Boolean acceptAutomaticDiscounts;

    /**
     * The mailing address associated with the payment method.
     */
    private MailingAddressInput billingAddress;

    /**
     * The extra information added to the draft order on behalf of the customer.
     */
    private List<AttributeInput> customAttributes;

    /**
     * The customer's email address.
     */
    private String email;

    /**
     * The list of product variant or custom line item.
     * Each draft order must include at least one line item.
     * Accepts a maximum of 499 line items.
     *   
     * NOTE: Draft orders don't currently support subscriptions.
     */
    private List<DraftOrderLineItemInput> lineItems;

    /**
     * The list of metafields attached to the draft order. An existing metafield can not be used when creating a draft order.
     */
    private List<MetafieldInput> metafields;

    /**
     * The localized fields attached to the draft order. For example, Tax IDs.
     */
    private List<LocalizedFieldInput> localizedFields;

    /**
     * The text of an optional note that a shop owner can attach to the draft order.
     */
    private String note;

    /**
     * The mailing address to where the order will be shipped.
     */
    private MailingAddressInput shippingAddress;

    /**
     * The shipping line object, which details the shipping method used.
     */
    private ShippingLineInput shippingLine;

    /**
     * A comma separated list of tags that have been added to the draft order.
     */
    private List<String> tags;

    /**
     * Whether or not taxes are exempt for the draft order.
     * If false, then Shopify will refer to the taxable field for each line item.
     * If a customer is applied to the draft order, then Shopify will use the customer's tax exempt field instead.
     */
    private Boolean taxExempt;

    /**
     * Whether to use the customer's default address.
     */
    private Boolean useCustomerDefaultAddress;

    /**
     * Whether the draft order will be visible to the customer on the self-serve portal.
     */
    private Boolean visibleToCustomer;

    /**
     * The time after which inventory reservation will expire.
     */
    private OffsetDateTime reserveInventoryUntil;

    /**
     * The payment currency of the customer for this draft order.
     */
    private CurrencyCode presentmentCurrencyCode;

    /**
     * The customer's phone number.
     */
    private String phone;

    /**
     * The fields used to create payment terms.
     */
    private PaymentTermsInput paymentTerms;

    /**
     * The purchasing entity for the draft order.
     */
    private PurchasingEntityInput purchasingEntity;

    /**
     * The source of the checkout.
     * To use this field for sales attribution, you must register the channels that your app is managing.
     * You can register the channels that your app is managing by completing
     * [this Google Form](https://docs.google.com/forms/d/e/1FAIpQLScmVTZRQNjOJ7RD738mL1lGeFjqKVe_FM2tO9xsm21QEo5Ozg/viewform?usp=sf_link).
     * After you've submitted your request, you need to wait for your request to be processed by Shopify.
     * You can find a list of your channels in the Partner Dashboard, in your app's Marketplace extension.
     * You need to specify the handle as the `source_name` value in your request.
     * The handle is the channel that the order was placed from.
     */
    private String sourceName;

    /**
     * Whether discount codes are allowed during checkout of this draft order.
     */
    private Boolean allowDiscountCodesInCheckout;

    /**
     * The purchase order number.
     */
    private String poNumber;

    /**
     * The unique token identifying the draft order.
     */
    private String sessionToken;

    /**
     * Fingerprint to guarantee bundles are handled correctly.
     */
    private String transformerFingerprint;

    public DraftOrderInput build() {
      DraftOrderInput result = new DraftOrderInput();
      result.appliedDiscount = this.appliedDiscount;
      result.discountCodes = this.discountCodes;
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.billingAddress = this.billingAddress;
      result.customAttributes = this.customAttributes;
      result.email = this.email;
      result.lineItems = this.lineItems;
      result.metafields = this.metafields;
      result.localizedFields = this.localizedFields;
      result.note = this.note;
      result.shippingAddress = this.shippingAddress;
      result.shippingLine = this.shippingLine;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      result.useCustomerDefaultAddress = this.useCustomerDefaultAddress;
      result.visibleToCustomer = this.visibleToCustomer;
      result.reserveInventoryUntil = this.reserveInventoryUntil;
      result.presentmentCurrencyCode = this.presentmentCurrencyCode;
      result.phone = this.phone;
      result.paymentTerms = this.paymentTerms;
      result.purchasingEntity = this.purchasingEntity;
      result.sourceName = this.sourceName;
      result.allowDiscountCodesInCheckout = this.allowDiscountCodesInCheckout;
      result.poNumber = this.poNumber;
      result.sessionToken = this.sessionToken;
      result.transformerFingerprint = this.transformerFingerprint;
      return result;
    }

    /**
     * The discount that will be applied to the draft order.
     * A draft order line item can have one discount. A draft order can also have one order-level discount.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * The list of discount codes that will be attempted to be applied to the draft order.
     * If the draft isn't eligible for any given discount code it will be skipped during calculation.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
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
     * The mailing address associated with the payment method.
     */
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    /**
     * The extra information added to the draft order on behalf of the customer.
     */
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    /**
     * The customer's email address.
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * The list of product variant or custom line item.
     * Each draft order must include at least one line item.
     * Accepts a maximum of 499 line items.
     *   
     * NOTE: Draft orders don't currently support subscriptions.
     */
    public Builder lineItems(List<DraftOrderLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The list of metafields attached to the draft order. An existing metafield can not be used when creating a draft order.
     */
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The localized fields attached to the draft order. For example, Tax IDs.
     */
    public Builder localizedFields(List<LocalizedFieldInput> localizedFields) {
      this.localizedFields = localizedFields;
      return this;
    }

    /**
     * The text of an optional note that a shop owner can attach to the draft order.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The mailing address to where the order will be shipped.
     */
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The shipping line object, which details the shipping method used.
     */
    public Builder shippingLine(ShippingLineInput shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    /**
     * A comma separated list of tags that have been added to the draft order.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Whether or not taxes are exempt for the draft order.
     * If false, then Shopify will refer to the taxable field for each line item.
     * If a customer is applied to the draft order, then Shopify will use the customer's tax exempt field instead.
     */
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * Whether to use the customer's default address.
     */
    public Builder useCustomerDefaultAddress(Boolean useCustomerDefaultAddress) {
      this.useCustomerDefaultAddress = useCustomerDefaultAddress;
      return this;
    }

    /**
     * Whether the draft order will be visible to the customer on the self-serve portal.
     */
    public Builder visibleToCustomer(Boolean visibleToCustomer) {
      this.visibleToCustomer = visibleToCustomer;
      return this;
    }

    /**
     * The time after which inventory reservation will expire.
     */
    public Builder reserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
      this.reserveInventoryUntil = reserveInventoryUntil;
      return this;
    }

    /**
     * The payment currency of the customer for this draft order.
     */
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    /**
     * The customer's phone number.
     */
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    /**
     * The fields used to create payment terms.
     */
    public Builder paymentTerms(PaymentTermsInput paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    /**
     * The purchasing entity for the draft order.
     */
    public Builder purchasingEntity(PurchasingEntityInput purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    /**
     * The source of the checkout.
     * To use this field for sales attribution, you must register the channels that your app is managing.
     * You can register the channels that your app is managing by completing
     * [this Google Form](https://docs.google.com/forms/d/e/1FAIpQLScmVTZRQNjOJ7RD738mL1lGeFjqKVe_FM2tO9xsm21QEo5Ozg/viewform?usp=sf_link).
     * After you've submitted your request, you need to wait for your request to be processed by Shopify.
     * You can find a list of your channels in the Partner Dashboard, in your app's Marketplace extension.
     * You need to specify the handle as the `source_name` value in your request.
     * The handle is the channel that the order was placed from.
     */
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    /**
     * Whether discount codes are allowed during checkout of this draft order.
     */
    public Builder allowDiscountCodesInCheckout(Boolean allowDiscountCodesInCheckout) {
      this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
      return this;
    }

    /**
     * The purchase order number.
     */
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    /**
     * The unique token identifying the draft order.
     */
    public Builder sessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
      return this;
    }

    /**
     * Fingerprint to guarantee bundles are handled correctly.
     */
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }
  }
}
