package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


public class OrderCreateOrderInput {
  
  private MailingAddressInput billingAddress;

  
  private Boolean buyerAcceptsMarketing = null;

  
  private OffsetDateTime closedAt;

  
  private String companyLocationId;

  
  private CurrencyCode currency;

  
  private List<OrderCreateCustomAttributeInput> customAttributes;

  
  private OrderCreateDiscountCodeInput discountCode;

  
  private String email;

  
  private OrderCreateFinancialStatus financialStatus;

  
  private OrderCreateFulfillmentInput fulfillment;

  
  private OrderCreateFulfillmentStatus fulfillmentStatus;

  
  private List<OrderCreateLineItemInput> lineItems;

  
  private List<MetafieldInput> metafields;

  
  private String name;

  
  private String note;

  
  private String phone;

  
  private String poNumber;

  
  private CurrencyCode presentmentCurrency;

  
  private OffsetDateTime processedAt;

  
  private String referringSite;

  
  private MailingAddressInput shippingAddress;

  
  private List<OrderCreateShippingLineInput> shippingLines;

  
  private String sourceIdentifier;

  
  private String sourceName;

  
  private String sourceUrl;

  
  private List<String> tags;

  
  private Boolean taxesIncluded = false;

  
  private List<OrderCreateTaxLineInput> taxLines;

  
  private Boolean test = false;

  
  private List<OrderCreateOrderTransactionInput> transactions;

  
  private String userId;

  public OrderCreateOrderInput() {
  }

  
  public MailingAddressInput getBillingAddress() {
    return billingAddress;
  }

  public void setBillingAddress(MailingAddressInput billingAddress) {
    this.billingAddress = billingAddress;
  }

  
  public Boolean getBuyerAcceptsMarketing() {
    return buyerAcceptsMarketing;
  }

  public void setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
    this.buyerAcceptsMarketing = buyerAcceptsMarketing;
  }

  
  public OffsetDateTime getClosedAt() {
    return closedAt;
  }

  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }

  
  public String getCompanyLocationId() {
    return companyLocationId;
  }

  public void setCompanyLocationId(String companyLocationId) {
    this.companyLocationId = companyLocationId;
  }

  
  public CurrencyCode getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyCode currency) {
    this.currency = currency;
  }

  
  public List<OrderCreateCustomAttributeInput> getCustomAttributes() {
    return customAttributes;
  }

  public void setCustomAttributes(List<OrderCreateCustomAttributeInput> customAttributes) {
    this.customAttributes = customAttributes;
  }

  
  public OrderCreateDiscountCodeInput getDiscountCode() {
    return discountCode;
  }

  public void setDiscountCode(OrderCreateDiscountCodeInput discountCode) {
    this.discountCode = discountCode;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public OrderCreateFinancialStatus getFinancialStatus() {
    return financialStatus;
  }

  public void setFinancialStatus(OrderCreateFinancialStatus financialStatus) {
    this.financialStatus = financialStatus;
  }

  
  public OrderCreateFulfillmentInput getFulfillment() {
    return fulfillment;
  }

  public void setFulfillment(OrderCreateFulfillmentInput fulfillment) {
    this.fulfillment = fulfillment;
  }

  
  public OrderCreateFulfillmentStatus getFulfillmentStatus() {
    return fulfillmentStatus;
  }

  public void setFulfillmentStatus(OrderCreateFulfillmentStatus fulfillmentStatus) {
    this.fulfillmentStatus = fulfillmentStatus;
  }

  
  public List<OrderCreateLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderCreateLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  
  public List<MetafieldInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<MetafieldInput> metafields) {
    this.metafields = metafields;
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

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public String getPoNumber() {
    return poNumber;
  }

  public void setPoNumber(String poNumber) {
    this.poNumber = poNumber;
  }

  
  public CurrencyCode getPresentmentCurrency() {
    return presentmentCurrency;
  }

  public void setPresentmentCurrency(CurrencyCode presentmentCurrency) {
    this.presentmentCurrency = presentmentCurrency;
  }

  
  public OffsetDateTime getProcessedAt() {
    return processedAt;
  }

  public void setProcessedAt(OffsetDateTime processedAt) {
    this.processedAt = processedAt;
  }

  
  public String getReferringSite() {
    return referringSite;
  }

  public void setReferringSite(String referringSite) {
    this.referringSite = referringSite;
  }

  
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  
  public List<OrderCreateShippingLineInput> getShippingLines() {
    return shippingLines;
  }

  public void setShippingLines(List<OrderCreateShippingLineInput> shippingLines) {
    this.shippingLines = shippingLines;
  }

  
  public String getSourceIdentifier() {
    return sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  
  public String getSourceName() {
    return sourceName;
  }

  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }

  
  public String getSourceUrl() {
    return sourceUrl;
  }

  public void setSourceUrl(String sourceUrl) {
    this.sourceUrl = sourceUrl;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public Boolean getTaxesIncluded() {
    return taxesIncluded;
  }

  public void setTaxesIncluded(Boolean taxesIncluded) {
    this.taxesIncluded = taxesIncluded;
  }

  
  public List<OrderCreateTaxLineInput> getTaxLines() {
    return taxLines;
  }

  public void setTaxLines(List<OrderCreateTaxLineInput> taxLines) {
    this.taxLines = taxLines;
  }

  
  public Boolean getTest() {
    return test;
  }

  public void setTest(Boolean test) {
    this.test = test;
  }

  
  public List<OrderCreateOrderTransactionInput> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<OrderCreateOrderTransactionInput> transactions) {
    this.transactions = transactions;
  }

  
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public String toString() {
    return "OrderCreateOrderInput{billingAddress='" + billingAddress + "', buyerAcceptsMarketing='" + buyerAcceptsMarketing + "', closedAt='" + closedAt + "', companyLocationId='" + companyLocationId + "', currency='" + currency + "', customAttributes='" + customAttributes + "', discountCode='" + discountCode + "', email='" + email + "', financialStatus='" + financialStatus + "', fulfillment='" + fulfillment + "', fulfillmentStatus='" + fulfillmentStatus + "', lineItems='" + lineItems + "', metafields='" + metafields + "', name='" + name + "', note='" + note + "', phone='" + phone + "', poNumber='" + poNumber + "', presentmentCurrency='" + presentmentCurrency + "', processedAt='" + processedAt + "', referringSite='" + referringSite + "', shippingAddress='" + shippingAddress + "', shippingLines='" + shippingLines + "', sourceIdentifier='" + sourceIdentifier + "', sourceName='" + sourceName + "', sourceUrl='" + sourceUrl + "', tags='" + tags + "', taxesIncluded='" + taxesIncluded + "', taxLines='" + taxLines + "', test='" + test + "', transactions='" + transactions + "', userId='" + userId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderCreateOrderInput that = (OrderCreateOrderInput) o;
    return Objects.equals(billingAddress, that.billingAddress) &&
        Objects.equals(buyerAcceptsMarketing, that.buyerAcceptsMarketing) &&
        Objects.equals(closedAt, that.closedAt) &&
        Objects.equals(companyLocationId, that.companyLocationId) &&
        Objects.equals(currency, that.currency) &&
        Objects.equals(customAttributes, that.customAttributes) &&
        Objects.equals(discountCode, that.discountCode) &&
        Objects.equals(email, that.email) &&
        Objects.equals(financialStatus, that.financialStatus) &&
        Objects.equals(fulfillment, that.fulfillment) &&
        Objects.equals(fulfillmentStatus, that.fulfillmentStatus) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(name, that.name) &&
        Objects.equals(note, that.note) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(poNumber, that.poNumber) &&
        Objects.equals(presentmentCurrency, that.presentmentCurrency) &&
        Objects.equals(processedAt, that.processedAt) &&
        Objects.equals(referringSite, that.referringSite) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(shippingLines, that.shippingLines) &&
        Objects.equals(sourceIdentifier, that.sourceIdentifier) &&
        Objects.equals(sourceName, that.sourceName) &&
        Objects.equals(sourceUrl, that.sourceUrl) &&
        Objects.equals(tags, that.tags) &&
        Objects.equals(taxesIncluded, that.taxesIncluded) &&
        Objects.equals(taxLines, that.taxLines) &&
        Objects.equals(test, that.test) &&
        Objects.equals(transactions, that.transactions) &&
        Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingAddress, buyerAcceptsMarketing, closedAt, companyLocationId, currency, customAttributes, discountCode, email, financialStatus, fulfillment, fulfillmentStatus, lineItems, metafields, name, note, phone, poNumber, presentmentCurrency, processedAt, referringSite, shippingAddress, shippingLines, sourceIdentifier, sourceName, sourceUrl, tags, taxesIncluded, taxLines, test, transactions, userId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MailingAddressInput billingAddress;

    
    private Boolean buyerAcceptsMarketing = null;

    
    private OffsetDateTime closedAt;

    
    private String companyLocationId;

    
    private CurrencyCode currency;

    
    private List<OrderCreateCustomAttributeInput> customAttributes;

    
    private OrderCreateDiscountCodeInput discountCode;

    
    private String email;

    
    private OrderCreateFinancialStatus financialStatus;

    
    private OrderCreateFulfillmentInput fulfillment;

    
    private OrderCreateFulfillmentStatus fulfillmentStatus;

    
    private List<OrderCreateLineItemInput> lineItems;

    
    private List<MetafieldInput> metafields;

    
    private String name;

    
    private String note;

    
    private String phone;

    
    private String poNumber;

    
    private CurrencyCode presentmentCurrency;

    
    private OffsetDateTime processedAt;

    
    private String referringSite;

    
    private MailingAddressInput shippingAddress;

    
    private List<OrderCreateShippingLineInput> shippingLines;

    
    private String sourceIdentifier;

    
    private String sourceName;

    
    private String sourceUrl;

    
    private List<String> tags;

    
    private Boolean taxesIncluded = false;

    
    private List<OrderCreateTaxLineInput> taxLines;

    
    private Boolean test = false;

    
    private List<OrderCreateOrderTransactionInput> transactions;

    
    private String userId;

    public OrderCreateOrderInput build() {
      OrderCreateOrderInput result = new OrderCreateOrderInput();
      result.billingAddress = this.billingAddress;
      result.buyerAcceptsMarketing = this.buyerAcceptsMarketing;
      result.closedAt = this.closedAt;
      result.companyLocationId = this.companyLocationId;
      result.currency = this.currency;
      result.customAttributes = this.customAttributes;
      result.discountCode = this.discountCode;
      result.email = this.email;
      result.financialStatus = this.financialStatus;
      result.fulfillment = this.fulfillment;
      result.fulfillmentStatus = this.fulfillmentStatus;
      result.lineItems = this.lineItems;
      result.metafields = this.metafields;
      result.name = this.name;
      result.note = this.note;
      result.phone = this.phone;
      result.poNumber = this.poNumber;
      result.presentmentCurrency = this.presentmentCurrency;
      result.processedAt = this.processedAt;
      result.referringSite = this.referringSite;
      result.shippingAddress = this.shippingAddress;
      result.shippingLines = this.shippingLines;
      result.sourceIdentifier = this.sourceIdentifier;
      result.sourceName = this.sourceName;
      result.sourceUrl = this.sourceUrl;
      result.tags = this.tags;
      result.taxesIncluded = this.taxesIncluded;
      result.taxLines = this.taxLines;
      result.test = this.test;
      result.transactions = this.transactions;
      result.userId = this.userId;
      return result;
    }

    
    public Builder billingAddress(MailingAddressInput billingAddress) {
      this.billingAddress = billingAddress;
      return this;
    }

    
    public Builder buyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
      this.buyerAcceptsMarketing = buyerAcceptsMarketing;
      return this;
    }

    
    public Builder closedAt(OffsetDateTime closedAt) {
      this.closedAt = closedAt;
      return this;
    }

    
    public Builder companyLocationId(String companyLocationId) {
      this.companyLocationId = companyLocationId;
      return this;
    }

    
    public Builder currency(CurrencyCode currency) {
      this.currency = currency;
      return this;
    }

    
    public Builder customAttributes(List<OrderCreateCustomAttributeInput> customAttributes) {
      this.customAttributes = customAttributes;
      return this;
    }

    
    public Builder discountCode(OrderCreateDiscountCodeInput discountCode) {
      this.discountCode = discountCode;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder financialStatus(OrderCreateFinancialStatus financialStatus) {
      this.financialStatus = financialStatus;
      return this;
    }

    
    public Builder fulfillment(OrderCreateFulfillmentInput fulfillment) {
      this.fulfillment = fulfillment;
      return this;
    }

    
    public Builder fulfillmentStatus(OrderCreateFulfillmentStatus fulfillmentStatus) {
      this.fulfillmentStatus = fulfillmentStatus;
      return this;
    }

    
    public Builder lineItems(List<OrderCreateLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    
    public Builder metafields(List<MetafieldInput> metafields) {
      this.metafields = metafields;
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

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder poNumber(String poNumber) {
      this.poNumber = poNumber;
      return this;
    }

    
    public Builder presentmentCurrency(CurrencyCode presentmentCurrency) {
      this.presentmentCurrency = presentmentCurrency;
      return this;
    }

    
    public Builder processedAt(OffsetDateTime processedAt) {
      this.processedAt = processedAt;
      return this;
    }

    
    public Builder referringSite(String referringSite) {
      this.referringSite = referringSite;
      return this;
    }

    
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    
    public Builder shippingLines(List<OrderCreateShippingLineInput> shippingLines) {
      this.shippingLines = shippingLines;
      return this;
    }

    
    public Builder sourceIdentifier(String sourceIdentifier) {
      this.sourceIdentifier = sourceIdentifier;
      return this;
    }

    
    public Builder sourceName(String sourceName) {
      this.sourceName = sourceName;
      return this;
    }

    
    public Builder sourceUrl(String sourceUrl) {
      this.sourceUrl = sourceUrl;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder taxesIncluded(Boolean taxesIncluded) {
      this.taxesIncluded = taxesIncluded;
      return this;
    }

    
    public Builder taxLines(List<OrderCreateTaxLineInput> taxLines) {
      this.taxLines = taxLines;
      return this;
    }

    
    public Builder test(Boolean test) {
      this.test = test;
      return this;
    }

    
    public Builder transactions(List<OrderCreateOrderTransactionInput> transactions) {
      this.transactions = transactions;
      return this;
    }

    
    public Builder userId(String userId) {
      this.userId = userId;
      return this;
    }
  }
}
