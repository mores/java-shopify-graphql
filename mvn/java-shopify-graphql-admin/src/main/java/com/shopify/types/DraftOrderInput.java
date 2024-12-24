package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class DraftOrderInput {
  
  private DraftOrderAppliedDiscountInput appliedDiscount;

  
  private List<String> discountCodes;

  
  private Boolean acceptAutomaticDiscounts;

  
  private MailingAddressInput billingAddress;

  
  private List<AttributeInput> customAttributes;

  
  private String email;

  
  private List<DraftOrderLineItemInput> lineItems;

  
  private List<MetafieldInput> metafields;

  
  private String note;

  
  private MailingAddressInput shippingAddress;

  
  private ShippingLineInput shippingLine;

  
  private List<String> tags;

  
  private Boolean taxExempt;

  
  private Boolean useCustomerDefaultAddress;

  
  private Boolean visibleToCustomer;

  
  private OffsetDateTime reserveInventoryUntil;

  
  private CurrencyCode presentmentCurrencyCode;

  
  private String phone;

  
  private PaymentTermsInput paymentTerms;

  
  private PurchasingEntityInput purchasingEntity;

  
  private String sourceName;

  
  private Boolean allowDiscountCodesInCheckout;

  
  private String poNumber;

  
  private String sessionToken;

  
  private String transformerFingerprint;

  public DraftOrderInput() {
  }

  
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  
  public MailingAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public List<AttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<AttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public List<DraftOrderLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<DraftOrderLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public ShippingLineInput getShippingLine() {
    return shippingLine;
  }

  public void setShippingLine(ShippingLineInput shippingLine) {
    this.shippingLine = shippingLine;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public Boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  public Boolean getUseCustomerDefaultAddress() {
    return useCustomerDefaultAddress;
  }

  public void setUseCustomerDefaultAddress(Boolean useCustomerDefaultAddress) {
    this.useCustomerDefaultAddress = useCustomerDefaultAddress;
  }

  
  public Boolean getVisibleToCustomer() {
    return visibleToCustomer;
  }

  public void setVisibleToCustomer(Boolean visibleToCustomer) {
    this.visibleToCustomer = visibleToCustomer;
  }

  
  public OffsetDateTime getReserveInventoryUntil() {
    return reserveInventoryUntil;
  }

  public void setReserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
    this.reserveInventoryUntil = reserveInventoryUntil;
  }

  
  public CurrencyCode getPresentmentCurrencyCode() {
    return presentmentCurrencyCode;
  }

  public void setPresentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
    this.presentmentCurrencyCode = presentmentCurrencyCode;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public PaymentTermsInput getPaymentTerms() {
    return paymentTerms;
  }

  public void setPaymentTerms(PaymentTermsInput paymentTerms) {
    this.paymentTerms = paymentTerms;
  }

  
  public PurchasingEntityInput getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntityInput purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  
  public Boolean getAllowDiscountCodesInCheckout() {
    return allowDiscountCodesInCheckout;
  }

  public void setAllowDiscountCodesInCheckout(Boolean allowDiscountCodesInCheckout) {
    this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
  }

  
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  
  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }

  
  public String getTransformerFingerprint() {
    return transformerFingerprint;
  }

  public void setTransformerFingerprint(String transformerFingerprint) {
    this.transformerFingerprint = transformerFingerprint;
  }

  @Override
  public String toString() {
    return "DraftOrderInput{appliedDiscount='" + appliedDiscount + "', discountCodes='" + discountCodes + "', acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', billingAddress='" + billingAddress + "', customAttributes='" + customAttributes + "', email='" + email + "', lineItems='" + lineItems + "', metafields='" + metafields + "', note='" + note + "', shippingAddress='" + shippingAddress + "', shippingLine='" + shippingLine + "', tags='" + tags + "', taxExempt='" + taxExempt + "', useCustomerDefaultAddress='" + useCustomerDefaultAddress + "', visibleToCustomer='" + visibleToCustomer + "', reserveInventoryUntil='" + reserveInventoryUntil + "', presentmentCurrencyCode='" + presentmentCurrencyCode + "', phone='" + phone + "', paymentTerms='" + paymentTerms + "', purchasingEntity='" + purchasingEntity + "', sourceName='" + sourceName + "', allowDiscountCodesInCheckout='" + allowDiscountCodesInCheckout + "', poNumber='" + poNumber + "', sessionToken='" + sessionToken + "', transformerFingerprint='" + transformerFingerprint + "'}";
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
    return Objects.hash(appliedDiscount, discountCodes, acceptAutomaticDiscounts, billingAddress, customAttributes, email, lineItems, metafields, note, shippingAddress, shippingLine, tags, taxExempt, useCustomerDefaultAddress, visibleToCustomer, reserveInventoryUntil, presentmentCurrencyCode, phone, paymentTerms, purchasingEntity, sourceName, allowDiscountCodesInCheckout, poNumber, sessionToken, transformerFingerprint);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DraftOrderAppliedDiscountInput appliedDiscount;

    
    private List<String> discountCodes;

    
    private Boolean acceptAutomaticDiscounts;

    
    private MailingAddressInput billingAddress;

    
    private List<AttributeInput> customAttributes;

    
    private String email;

    
    private List<DraftOrderLineItemInput> lineItems;

    
    private List<MetafieldInput> metafields;

    
    private String note;

    
    private MailingAddressInput shippingAddress;

    
    private ShippingLineInput shippingLine;

    
    private List<String> tags;

    
    private Boolean taxExempt;

    
    private Boolean useCustomerDefaultAddress;

    
    private Boolean visibleToCustomer;

    
    private OffsetDateTime reserveInventoryUntil;

    
    private CurrencyCode presentmentCurrencyCode;

    
    private String phone;

    
    private PaymentTermsInput paymentTerms;

    
    private PurchasingEntityInput purchasingEntity;

    
    private String sourceName;

    
    private Boolean allowDiscountCodesInCheckout;

    
    private String poNumber;

    
    private String sessionToken;

    
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

    
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder customAttributes(List<AttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder lineItems(List<DraftOrderLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder shippingLine(ShippingLineInput shippingLine) {
      this.shippingLine = shippingLine;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder taxExempt(Boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    
    public Builder useCustomerDefaultAddress(Boolean useCustomerDefaultAddress) {
      this.useCustomerDefaultAddress = useCustomerDefaultAddress;
      return this;
    }

    
    public Builder visibleToCustomer(Boolean visibleToCustomer) {
      this.visibleToCustomer = visibleToCustomer;
      return this;
    }

    
    public Builder reserveInventoryUntil(OffsetDateTime reserveInventoryUntil) {
      this.reserveInventoryUntil = reserveInventoryUntil;
      return this;
    }

    
    public Builder presentmentCurrencyCode(CurrencyCode presentmentCurrencyCode) {
      this.presentmentCurrencyCode = presentmentCurrencyCode;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder paymentTerms(PaymentTermsInput paymentTerms) {
      this.paymentTerms = paymentTerms;
      return this;
    }

    
    public Builder purchasingEntity(PurchasingEntityInput purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }

    
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    
    public Builder allowDiscountCodesInCheckout(Boolean allowDiscountCodesInCheckout) {
      this.allowDiscountCodesInCheckout = allowDiscountCodesInCheckout;
      return this;
    }

    
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    
    public Builder sessionToken(String sessionToken) {
      this.sessionToken = sessionToken;
      return this;
    }

    
    public Builder transformerFingerprint(String transformerFingerprint) {
      this.transformerFingerprint = transformerFingerprint;
      return this;
    }
  }
}
