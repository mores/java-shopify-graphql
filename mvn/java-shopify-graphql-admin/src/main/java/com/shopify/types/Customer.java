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
public class Customer implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, PurchasingEntity, com.shopify.types.CommentEventSubject, com.shopify.types.HasEvents, com.shopify.types.HasMetafieldDefinitions, com.shopify.types.HasMetafields, com.shopify.types.HasStoreCreditAccounts, com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private List<MailingAddress> addresses;

  
  private MailingAddressConnection addressesV2;

  
  private MoneyV2 amountSpent;

  
  private boolean canDelete;

  
  private List<CompanyContact> companyContactProfiles;

  
  private OffsetDateTime createdAt;

  
  private boolean dataSaleOptOut;

  
  private MailingAddress defaultAddress;

  
  private String displayName;

  
  private String email;

  
  private CustomerEmailMarketingConsentState emailMarketingConsent;

  
  private EventConnection events;

  
  private String firstName;

  
  private boolean hasTimelineComment;

  
  private String id;

  
  private Image image;

  
  private String lastName;

  
  private Order lastOrder;

  
  private String legacyResourceId;

  
  private String lifetimeDuration;

  
  private String locale;

  
  private Market market;

  
  private CustomerMergeable mergeable;

  
  private Metafield metafield;

  
  private MetafieldDefinitionConnection metafieldDefinitions;

  
  private MetafieldConnection metafields;

  
  private String multipassIdentifier;

  
  private String note;

  
  private String numberOfOrders;

  
  private OrderConnection orders;

  
  private CustomerPaymentMethodConnection paymentMethods;

  
  private String phone;

  
  private PrivateMetafield privateMetafield;

  
  private PrivateMetafieldConnection privateMetafields;

  
  private CustomerProductSubscriberStatus productSubscriberStatus;

  
  private CustomerSmsMarketingConsentState smsMarketingConsent;

  
  private CustomerState state;

  
  private CustomerStatistics statistics;

  
  private StoreCreditAccountConnection storeCreditAccounts;

  
  private SubscriptionContractConnection subscriptionContracts;

  
  private List<String> tags;

  
  private boolean taxExempt;

  
  private List<TaxExemption> taxExemptions;

  
  private String unsubscribeUrl;

  
  private OffsetDateTime updatedAt;

  
  private boolean validEmailAddress;

  
  private boolean verifiedEmail;

  public Customer() {
  }

  
  public List<MailingAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<MailingAddress> addresses) {
    this.addresses = addresses;
  }

  
  public MailingAddressConnection getAddressesV2() {
    return addressesV2;
  }

  public void setAddressesV2(MailingAddressConnection addressesV2) {
    this.addressesV2 = addressesV2;
  }

  
  public MoneyV2 getAmountSpent() {
    return amountSpent;
  }

  public void setAmountSpent(MoneyV2 amountSpent) {
    this.amountSpent = amountSpent;
  }

  
  public boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(boolean canDelete) {
    this.canDelete = canDelete;
  }

  
  public List<CompanyContact> getCompanyContactProfiles() {
    return companyContactProfiles;
  }

  public void setCompanyContactProfiles(List<CompanyContact> companyContactProfiles) {
    this.companyContactProfiles = companyContactProfiles;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public boolean getDataSaleOptOut() {
    return dataSaleOptOut;
  }

  public void setDataSaleOptOut(boolean dataSaleOptOut) {
    this.dataSaleOptOut = dataSaleOptOut;
  }

  
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  
  public CustomerEmailMarketingConsentState getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentState emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  public Order getLastOrder() {
    return lastOrder;
  }

  public void setLastOrder(Order lastOrder) {
    this.lastOrder = lastOrder;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  
  public CustomerMergeable getMergeable() {
    return mergeable;
  }

  public void setMergeable(CustomerMergeable mergeable) {
    this.mergeable = mergeable;
  }

  
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  
  public String getMultipassIdentifier() {
    return multipassIdentifier;
  }

  public void setMultipassIdentifier(String multipassIdentifier) {
    this.multipassIdentifier = multipassIdentifier;
  }

  
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  
  public String getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(String numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  
  public CustomerPaymentMethodConnection getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(CustomerPaymentMethodConnection paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  public PrivateMetafield getPrivateMetafield() {
    return privateMetafield;
  }

  public void setPrivateMetafield(PrivateMetafield privateMetafield) {
    this.privateMetafield = privateMetafield;
  }

  
  public PrivateMetafieldConnection getPrivateMetafields() {
    return privateMetafields;
  }

  public void setPrivateMetafields(PrivateMetafieldConnection privateMetafields) {
    this.privateMetafields = privateMetafields;
  }

  
  public CustomerProductSubscriberStatus getProductSubscriberStatus() {
    return productSubscriberStatus;
  }

  public void setProductSubscriberStatus(CustomerProductSubscriberStatus productSubscriberStatus) {
    this.productSubscriberStatus = productSubscriberStatus;
  }

  
  public CustomerSmsMarketingConsentState getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentState smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  
  public CustomerState getState() {
    return state;
  }

  public void setState(CustomerState state) {
    this.state = state;
  }

  
  public CustomerStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(CustomerStatistics statistics) {
    this.statistics = statistics;
  }

  
  public StoreCreditAccountConnection getStoreCreditAccounts() {
    return storeCreditAccounts;
  }

  public void setStoreCreditAccounts(StoreCreditAccountConnection storeCreditAccounts) {
    this.storeCreditAccounts = storeCreditAccounts;
  }

  
  public SubscriptionContractConnection getSubscriptionContracts() {
    return subscriptionContracts;
  }

  public void setSubscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
    this.subscriptionContracts = subscriptionContracts;
  }

  
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  
  public String getUnsubscribeUrl() {
    return unsubscribeUrl;
  }

  public void setUnsubscribeUrl(String unsubscribeUrl) {
    this.unsubscribeUrl = unsubscribeUrl;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public boolean getValidEmailAddress() {
    return validEmailAddress;
  }

  public void setValidEmailAddress(boolean validEmailAddress) {
    this.validEmailAddress = validEmailAddress;
  }

  
  public boolean getVerifiedEmail() {
    return verifiedEmail;
  }

  public void setVerifiedEmail(boolean verifiedEmail) {
    this.verifiedEmail = verifiedEmail;
  }

  @Override
  public String toString() {
    return "Customer{addresses='" + addresses + "', addressesV2='" + addressesV2 + "', amountSpent='" + amountSpent + "', canDelete='" + canDelete + "', companyContactProfiles='" + companyContactProfiles + "', createdAt='" + createdAt + "', dataSaleOptOut='" + dataSaleOptOut + "', defaultAddress='" + defaultAddress + "', displayName='" + displayName + "', email='" + email + "', emailMarketingConsent='" + emailMarketingConsent + "', events='" + events + "', firstName='" + firstName + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', image='" + image + "', lastName='" + lastName + "', lastOrder='" + lastOrder + "', legacyResourceId='" + legacyResourceId + "', lifetimeDuration='" + lifetimeDuration + "', locale='" + locale + "', market='" + market + "', mergeable='" + mergeable + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', multipassIdentifier='" + multipassIdentifier + "', note='" + note + "', numberOfOrders='" + numberOfOrders + "', orders='" + orders + "', paymentMethods='" + paymentMethods + "', phone='" + phone + "', privateMetafield='" + privateMetafield + "', privateMetafields='" + privateMetafields + "', productSubscriberStatus='" + productSubscriberStatus + "', smsMarketingConsent='" + smsMarketingConsent + "', state='" + state + "', statistics='" + statistics + "', storeCreditAccounts='" + storeCreditAccounts + "', subscriptionContracts='" + subscriptionContracts + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "', unsubscribeUrl='" + unsubscribeUrl + "', updatedAt='" + updatedAt + "', validEmailAddress='" + validEmailAddress + "', verifiedEmail='" + verifiedEmail + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Customer that = (Customer) o;
    return Objects.equals(addresses, that.addresses) &&
        Objects.equals(addressesV2, that.addressesV2) &&
        Objects.equals(amountSpent, that.amountSpent) &&
        canDelete == that.canDelete &&
        Objects.equals(companyContactProfiles, that.companyContactProfiles) &&
        Objects.equals(createdAt, that.createdAt) &&
        dataSaleOptOut == that.dataSaleOptOut &&
        Objects.equals(defaultAddress, that.defaultAddress) &&
        Objects.equals(displayName, that.displayName) &&
        Objects.equals(email, that.email) &&
        Objects.equals(emailMarketingConsent, that.emailMarketingConsent) &&
        Objects.equals(events, that.events) &&
        Objects.equals(firstName, that.firstName) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(id, that.id) &&
        Objects.equals(image, that.image) &&
        Objects.equals(lastName, that.lastName) &&
        Objects.equals(lastOrder, that.lastOrder) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(lifetimeDuration, that.lifetimeDuration) &&
        Objects.equals(locale, that.locale) &&
        Objects.equals(market, that.market) &&
        Objects.equals(mergeable, that.mergeable) &&
        Objects.equals(metafield, that.metafield) &&
        Objects.equals(metafieldDefinitions, that.metafieldDefinitions) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(multipassIdentifier, that.multipassIdentifier) &&
        Objects.equals(note, that.note) &&
        Objects.equals(numberOfOrders, that.numberOfOrders) &&
        Objects.equals(orders, that.orders) &&
        Objects.equals(paymentMethods, that.paymentMethods) &&
        Objects.equals(phone, that.phone) &&
        Objects.equals(privateMetafield, that.privateMetafield) &&
        Objects.equals(privateMetafields, that.privateMetafields) &&
        Objects.equals(productSubscriberStatus, that.productSubscriberStatus) &&
        Objects.equals(smsMarketingConsent, that.smsMarketingConsent) &&
        Objects.equals(state, that.state) &&
        Objects.equals(statistics, that.statistics) &&
        Objects.equals(storeCreditAccounts, that.storeCreditAccounts) &&
        Objects.equals(subscriptionContracts, that.subscriptionContracts) &&
        Objects.equals(tags, that.tags) &&
        taxExempt == that.taxExempt &&
        Objects.equals(taxExemptions, that.taxExemptions) &&
        Objects.equals(unsubscribeUrl, that.unsubscribeUrl) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        validEmailAddress == that.validEmailAddress &&
        verifiedEmail == that.verifiedEmail;
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, addressesV2, amountSpent, canDelete, companyContactProfiles, createdAt, dataSaleOptOut, defaultAddress, displayName, email, emailMarketingConsent, events, firstName, hasTimelineComment, id, image, lastName, lastOrder, legacyResourceId, lifetimeDuration, locale, market, mergeable, metafield, metafieldDefinitions, metafields, multipassIdentifier, note, numberOfOrders, orders, paymentMethods, phone, privateMetafield, privateMetafields, productSubscriberStatus, smsMarketingConsent, state, statistics, storeCreditAccounts, subscriptionContracts, tags, taxExempt, taxExemptions, unsubscribeUrl, updatedAt, validEmailAddress, verifiedEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<MailingAddress> addresses;

    
    private MailingAddressConnection addressesV2;

    
    private MoneyV2 amountSpent;

    
    private boolean canDelete;

    
    private List<CompanyContact> companyContactProfiles;

    
    private OffsetDateTime createdAt;

    
    private boolean dataSaleOptOut;

    
    private MailingAddress defaultAddress;

    
    private String displayName;

    
    private String email;

    
    private CustomerEmailMarketingConsentState emailMarketingConsent;

    
    private EventConnection events;

    
    private String firstName;

    
    private boolean hasTimelineComment;

    
    private String id;

    
    private Image image;

    
    private String lastName;

    
    private Order lastOrder;

    
    private String legacyResourceId;

    
    private String lifetimeDuration;

    
    private String locale;

    
    private Market market;

    
    private CustomerMergeable mergeable;

    
    private Metafield metafield;

    
    private MetafieldDefinitionConnection metafieldDefinitions;

    
    private MetafieldConnection metafields;

    
    private String multipassIdentifier;

    
    private String note;

    
    private String numberOfOrders;

    
    private OrderConnection orders;

    
    private CustomerPaymentMethodConnection paymentMethods;

    
    private String phone;

    
    private PrivateMetafield privateMetafield;

    
    private PrivateMetafieldConnection privateMetafields;

    
    private CustomerProductSubscriberStatus productSubscriberStatus;

    
    private CustomerSmsMarketingConsentState smsMarketingConsent;

    
    private CustomerState state;

    
    private CustomerStatistics statistics;

    
    private StoreCreditAccountConnection storeCreditAccounts;

    
    private SubscriptionContractConnection subscriptionContracts;

    
    private List<String> tags;

    
    private boolean taxExempt;

    
    private List<TaxExemption> taxExemptions;

    
    private String unsubscribeUrl;

    
    private OffsetDateTime updatedAt;

    
    private boolean validEmailAddress;

    
    private boolean verifiedEmail;

    public Customer build() {
      Customer result = new Customer();
      result.addresses = this.addresses;
      result.addressesV2 = this.addressesV2;
      result.amountSpent = this.amountSpent;
      result.canDelete = this.canDelete;
      result.companyContactProfiles = this.companyContactProfiles;
      result.createdAt = this.createdAt;
      result.dataSaleOptOut = this.dataSaleOptOut;
      result.defaultAddress = this.defaultAddress;
      result.displayName = this.displayName;
      result.email = this.email;
      result.emailMarketingConsent = this.emailMarketingConsent;
      result.events = this.events;
      result.firstName = this.firstName;
      result.hasTimelineComment = this.hasTimelineComment;
      result.id = this.id;
      result.image = this.image;
      result.lastName = this.lastName;
      result.lastOrder = this.lastOrder;
      result.legacyResourceId = this.legacyResourceId;
      result.lifetimeDuration = this.lifetimeDuration;
      result.locale = this.locale;
      result.market = this.market;
      result.mergeable = this.mergeable;
      result.metafield = this.metafield;
      result.metafieldDefinitions = this.metafieldDefinitions;
      result.metafields = this.metafields;
      result.multipassIdentifier = this.multipassIdentifier;
      result.note = this.note;
      result.numberOfOrders = this.numberOfOrders;
      result.orders = this.orders;
      result.paymentMethods = this.paymentMethods;
      result.phone = this.phone;
      result.privateMetafield = this.privateMetafield;
      result.privateMetafields = this.privateMetafields;
      result.productSubscriberStatus = this.productSubscriberStatus;
      result.smsMarketingConsent = this.smsMarketingConsent;
      result.state = this.state;
      result.statistics = this.statistics;
      result.storeCreditAccounts = this.storeCreditAccounts;
      result.subscriptionContracts = this.subscriptionContracts;
      result.tags = this.tags;
      result.taxExempt = this.taxExempt;
      result.taxExemptions = this.taxExemptions;
      result.unsubscribeUrl = this.unsubscribeUrl;
      result.updatedAt = this.updatedAt;
      result.validEmailAddress = this.validEmailAddress;
      result.verifiedEmail = this.verifiedEmail;
      return result;
    }

    
    public Builder addresses(List<MailingAddress> addresses) {
      this.addresses = addresses;
      return this;
    }

    
    public Builder addressesV2(MailingAddressConnection addressesV2) {
      this.addressesV2 = addressesV2;
      return this;
    }

    
    public Builder amountSpent(MoneyV2 amountSpent) {
      this.amountSpent = amountSpent;
      return this;
    }

    
    public Builder canDelete(boolean canDelete) {
      this.canDelete = canDelete;
      return this;
    }

    
    public Builder companyContactProfiles(List<CompanyContact> companyContactProfiles) {
      this.companyContactProfiles = companyContactProfiles;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder dataSaleOptOut(boolean dataSaleOptOut) {
      this.dataSaleOptOut = dataSaleOptOut;
      return this;
    }

    
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    
    public Builder email(String email) {
      this.email = email;
      return this;
    }

    
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentState emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }

    
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    
    public Builder lastOrder(Order lastOrder) {
      this.lastOrder = lastOrder;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    
    public Builder mergeable(CustomerMergeable mergeable) {
      this.mergeable = mergeable;
      return this;
    }

    
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    
    public Builder multipassIdentifier(String multipassIdentifier) {
      this.multipassIdentifier = multipassIdentifier;
      return this;
    }

    
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    
    public Builder numberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
      return this;
    }

    
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    
    public Builder paymentMethods(CustomerPaymentMethodConnection paymentMethods) {
      this.paymentMethods = paymentMethods;
      return this;
    }

    
    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    
    public Builder privateMetafield(PrivateMetafield privateMetafield) {
      this.privateMetafield = privateMetafield;
      return this;
    }

    
    public Builder privateMetafields(PrivateMetafieldConnection privateMetafields) {
      this.privateMetafields = privateMetafields;
      return this;
    }

    
    public Builder productSubscriberStatus(
        CustomerProductSubscriberStatus productSubscriberStatus) {
      this.productSubscriberStatus = productSubscriberStatus;
      return this;
    }

    
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentState smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }

    
    public Builder state(CustomerState state) {
      this.state = state;
      return this;
    }

    
    public Builder statistics(CustomerStatistics statistics) {
      this.statistics = statistics;
      return this;
    }

    
    public Builder storeCreditAccounts(StoreCreditAccountConnection storeCreditAccounts) {
      this.storeCreditAccounts = storeCreditAccounts;
      return this;
    }

    
    public Builder subscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
      this.subscriptionContracts = subscriptionContracts;
      return this;
    }

    
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    
    public Builder unsubscribeUrl(String unsubscribeUrl) {
      this.unsubscribeUrl = unsubscribeUrl;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder validEmailAddress(boolean validEmailAddress) {
      this.validEmailAddress = validEmailAddress;
      return this;
    }

    
    public Builder verifiedEmail(boolean verifiedEmail) {
      this.verifiedEmail = verifiedEmail;
      return this;
    }
  }
}
