package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Represents information about a customer of the shop, such as the customer's contact details, their order
 * history, and whether they've agreed to receive marketing material by email.
 *
 * **Caution:** Only use this data if it's required for your app's functionality.
 * Shopify will restrict [access to
 * scopes](https://shopify.dev/api/usage/access-scopes) for apps that don't have a
 * legitimate use for the associated data.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Customer implements CommentEventEmbed, MetafieldReference, MetafieldReferencer, PurchasingEntity, com.shopify.admin.types.CommentEventSubject, com.shopify.admin.types.HasEvents, com.shopify.admin.types.HasMetafieldDefinitions, com.shopify.admin.types.HasMetafields, com.shopify.admin.types.HasStoreCreditAccounts, com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * A list of addresses associated with the customer.
   */
  private List<MailingAddress> addresses;

  /**
   * The addresses associated with the customer.
   */
  private MailingAddressConnection addressesV2;

  /**
   * The total amount that the customer has spent on orders in their lifetime.
   */
  private MoneyV2 amountSpent;

  /**
   * Whether the merchant can delete the customer from their store.
   *   
   * A customer can be deleted from a store only if they haven't yet made an order. After a customer makes an
   * order, they can't be deleted from a store.
   */
  private boolean canDelete;

  /**
   * A list of the customer's company contact profiles.
   */
  private List<CompanyContact> companyContactProfiles;

  /**
   * The date and time when the customer was added to the store.
   */
  private OffsetDateTime createdAt;

  /**
   * Whether the customer has opted out of having their data sold.
   */
  private boolean dataSaleOptOut;

  /**
   * The default address associated with the customer.
   */
  private MailingAddress defaultAddress;

  /**
   * The customer's default email address.
   */
  private CustomerEmailAddress defaultEmailAddress;

  /**
   * The customer's default phone number.
   */
  private CustomerPhoneNumber defaultPhoneNumber;

  /**
   * The full name of the customer, based on the values for first_name and last_name. If the first_name and
   * last_name are not available, then this falls back to the customer's email
   * address, and if that is not available, the customer's phone number.
   */
  private String displayName;

  /**
   * The customer's email address.
   */
  private String email;

  /**
   * The current email marketing state for the customer.
   * If the customer doesn't have an email address, then this property is `null`.
   */
  private CustomerEmailMarketingConsentState emailMarketingConsent;

  /**
   * A list of events associated with the customer.
   */
  private EventConnection events;

  /**
   * The customer's first name.
   */
  private String firstName;

  /**
   * Whether the merchant has added timeline comments about the customer on the customer's page.
   */
  private boolean hasTimelineComment;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The image associated with the customer.
   */
  private Image image;

  /**
   * The customer's last name.
   */
  private String lastName;

  /**
   * The customer's last order.
   */
  private Order lastOrder;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The amount of time since the customer was first added to the store.
   *   
   * Example: 'about 12 years'.
   */
  private String lifetimeDuration;

  /**
   * The customer's locale.
   */
  private String locale;

  /**
   * The market that includes the customer’s default address.
   */
  private Market market;

  /**
   * Whether the customer can be merged with another customer.
   */
  private CustomerMergeable mergeable;

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  private Metafield metafield;

  /**
   * List of metafield definitions.
   */
  private MetafieldDefinitionConnection metafieldDefinitions;

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  private MetafieldConnection metafields;

  /**
   * A unique identifier for the customer that's used with Multipass login.
   */
  private String multipassIdentifier;

  /**
   * A note about the customer.
   */
  private String note;

  /**
   * The number of orders that the customer has made at the store in their lifetime.
   */
  private String numberOfOrders;

  /**
   * A list of the customer's orders.
   */
  private OrderConnection orders;

  /**
   * A list of the customer's payment methods.
   */
  private CustomerPaymentMethodConnection paymentMethods;

  /**
   * The customer's phone number.
   */
  private String phone;

  /**
   * Possible subscriber states of a customer defined by their subscription contracts.
   */
  private CustomerProductSubscriberStatus productSubscriberStatus;

  /**
   * The current SMS marketing state for the customer's phone number.
   *   
   * If the customer does not have a phone number, then this property is `null`.
   */
  private CustomerSmsMarketingConsentState smsMarketingConsent;

  /**
   * The state of the customer's account with the shop.
   *   
   * Please note that this only meaningful when Classic Customer Accounts is active.
   */
  private CustomerState state;

  /**
   * The statistics for a given customer.
   */
  private CustomerStatistics statistics;

  /**
   * Returns a list of store credit accounts that belong to the owner resource.
   * A store credit account owner can hold multiple accounts each with a different currency.
   */
  private StoreCreditAccountConnection storeCreditAccounts;

  /**
   * A list of the customer's subscription contracts.
   */
  private SubscriptionContractConnection subscriptionContracts;

  /**
   * A comma separated list of tags that have been added to the customer.
   */
  private List<String> tags;

  /**
   * Whether the customer is exempt from being charged taxes on their orders.
   */
  private boolean taxExempt;

  /**
   * The list of tax exemptions applied to the customer.
   */
  private List<TaxExemption> taxExemptions;

  /**
   * The URL to unsubscribe the customer from the mailing list.
   */
  private String unsubscribeUrl;

  /**
   * The date and time when the customer was last updated.
   */
  private OffsetDateTime updatedAt;

  /**
   * Whether the email address is formatted correctly.
   *   
   * Returns `true` when the email is formatted correctly and
   * belongs to an existing domain. This doesn't guarantee that
   * the email address actually exists.
   */
  private boolean validEmailAddress;

  /**
   * Whether the customer has verified their email address. Defaults to `true` if
   * the customer is created through the Shopify admin or API.
   */
  private boolean verifiedEmail;

  public Customer() {
  }

  /**
   * A list of addresses associated with the customer.
   */
  public List<MailingAddress> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<MailingAddress> addresses) {
    this.addresses = addresses;
  }

  /**
   * The addresses associated with the customer.
   */
  public MailingAddressConnection getAddressesV2() {
    return addressesV2;
  }

  public void setAddressesV2(MailingAddressConnection addressesV2) {
    this.addressesV2 = addressesV2;
  }

  /**
   * The total amount that the customer has spent on orders in their lifetime.
   */
  public MoneyV2 getAmountSpent() {
    return amountSpent;
  }

  public void setAmountSpent(MoneyV2 amountSpent) {
    this.amountSpent = amountSpent;
  }

  /**
   * Whether the merchant can delete the customer from their store.
   *   
   * A customer can be deleted from a store only if they haven't yet made an order. After a customer makes an
   * order, they can't be deleted from a store.
   */
  public boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(boolean canDelete) {
    this.canDelete = canDelete;
  }

  /**
   * A list of the customer's company contact profiles.
   */
  public List<CompanyContact> getCompanyContactProfiles() {
    return companyContactProfiles;
  }

  public void setCompanyContactProfiles(List<CompanyContact> companyContactProfiles) {
    this.companyContactProfiles = companyContactProfiles;
  }

  /**
   * The date and time when the customer was added to the store.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Whether the customer has opted out of having their data sold.
   */
  public boolean getDataSaleOptOut() {
    return dataSaleOptOut;
  }

  public void setDataSaleOptOut(boolean dataSaleOptOut) {
    this.dataSaleOptOut = dataSaleOptOut;
  }

  /**
   * The default address associated with the customer.
   */
  public MailingAddress getDefaultAddress() {
    return defaultAddress;
  }

  public void setDefaultAddress(MailingAddress defaultAddress) {
    this.defaultAddress = defaultAddress;
  }

  /**
   * The customer's default email address.
   */
  public CustomerEmailAddress getDefaultEmailAddress() {
    return defaultEmailAddress;
  }

  public void setDefaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
    this.defaultEmailAddress = defaultEmailAddress;
  }

  /**
   * The customer's default phone number.
   */
  public CustomerPhoneNumber getDefaultPhoneNumber() {
    return defaultPhoneNumber;
  }

  public void setDefaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
    this.defaultPhoneNumber = defaultPhoneNumber;
  }

  /**
   * The full name of the customer, based on the values for first_name and last_name. If the first_name and
   * last_name are not available, then this falls back to the customer's email
   * address, and if that is not available, the customer's phone number.
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
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
   * The current email marketing state for the customer.
   * If the customer doesn't have an email address, then this property is `null`.
   */
  public CustomerEmailMarketingConsentState getEmailMarketingConsent() {
    return emailMarketingConsent;
  }

  public void setEmailMarketingConsent(CustomerEmailMarketingConsentState emailMarketingConsent) {
    this.emailMarketingConsent = emailMarketingConsent;
  }

  /**
   * A list of events associated with the customer.
   */
  public EventConnection getEvents() {
    return events;
  }

  public void setEvents(EventConnection events) {
    this.events = events;
  }

  /**
   * The customer's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * Whether the merchant has added timeline comments about the customer on the customer's page.
   */
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The image associated with the customer.
   */
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  /**
   * The customer's last name.
   */
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * The customer's last order.
   */
  public Order getLastOrder() {
    return lastOrder;
  }

  public void setLastOrder(Order lastOrder) {
    this.lastOrder = lastOrder;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The amount of time since the customer was first added to the store.
   *   
   * Example: 'about 12 years'.
   */
  public String getLifetimeDuration() {
    return lifetimeDuration;
  }

  public void setLifetimeDuration(String lifetimeDuration) {
    this.lifetimeDuration = lifetimeDuration;
  }

  /**
   * The customer's locale.
   */
  public String getLocale() {
    return locale;
  }

  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * The market that includes the customer’s default address.
   */
  public Market getMarket() {
    return market;
  }

  public void setMarket(Market market) {
    this.market = market;
  }

  /**
   * Whether the customer can be merged with another customer.
   */
  public CustomerMergeable getMergeable() {
    return mergeable;
  }

  public void setMergeable(CustomerMergeable mergeable) {
    this.mergeable = mergeable;
  }

  /**
   * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
   * including its `namespace` and `key`, that's associated with a Shopify resource
   * for the purposes of adding and storing additional information.
   */
  public Metafield getMetafield() {
    return metafield;
  }

  public void setMetafield(Metafield metafield) {
    this.metafield = metafield;
  }

  /**
   * List of metafield definitions.
   */
  public MetafieldDefinitionConnection getMetafieldDefinitions() {
    return metafieldDefinitions;
  }

  public void setMetafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
    this.metafieldDefinitions = metafieldDefinitions;
  }

  /**
   * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
   * that a merchant associates with a Shopify resource.
   */
  public MetafieldConnection getMetafields() {
    return metafields;
  }

  public void setMetafields(MetafieldConnection metafields) {
    this.metafields = metafields;
  }

  /**
   * A unique identifier for the customer that's used with Multipass login.
   */
  public String getMultipassIdentifier() {
    return multipassIdentifier;
  }

  public void setMultipassIdentifier(String multipassIdentifier) {
    this.multipassIdentifier = multipassIdentifier;
  }

  /**
   * A note about the customer.
   */
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  /**
   * The number of orders that the customer has made at the store in their lifetime.
   */
  public String getNumberOfOrders() {
    return numberOfOrders;
  }

  public void setNumberOfOrders(String numberOfOrders) {
    this.numberOfOrders = numberOfOrders;
  }

  /**
   * A list of the customer's orders.
   */
  public OrderConnection getOrders() {
    return orders;
  }

  public void setOrders(OrderConnection orders) {
    this.orders = orders;
  }

  /**
   * A list of the customer's payment methods.
   */
  public CustomerPaymentMethodConnection getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(CustomerPaymentMethodConnection paymentMethods) {
    this.paymentMethods = paymentMethods;
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
   * Possible subscriber states of a customer defined by their subscription contracts.
   */
  public CustomerProductSubscriberStatus getProductSubscriberStatus() {
    return productSubscriberStatus;
  }

  public void setProductSubscriberStatus(CustomerProductSubscriberStatus productSubscriberStatus) {
    this.productSubscriberStatus = productSubscriberStatus;
  }

  /**
   * The current SMS marketing state for the customer's phone number.
   *   
   * If the customer does not have a phone number, then this property is `null`.
   */
  public CustomerSmsMarketingConsentState getSmsMarketingConsent() {
    return smsMarketingConsent;
  }

  public void setSmsMarketingConsent(CustomerSmsMarketingConsentState smsMarketingConsent) {
    this.smsMarketingConsent = smsMarketingConsent;
  }

  /**
   * The state of the customer's account with the shop.
   *   
   * Please note that this only meaningful when Classic Customer Accounts is active.
   */
  public CustomerState getState() {
    return state;
  }

  public void setState(CustomerState state) {
    this.state = state;
  }

  /**
   * The statistics for a given customer.
   */
  public CustomerStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(CustomerStatistics statistics) {
    this.statistics = statistics;
  }

  /**
   * Returns a list of store credit accounts that belong to the owner resource.
   * A store credit account owner can hold multiple accounts each with a different currency.
   */
  public StoreCreditAccountConnection getStoreCreditAccounts() {
    return storeCreditAccounts;
  }

  public void setStoreCreditAccounts(StoreCreditAccountConnection storeCreditAccounts) {
    this.storeCreditAccounts = storeCreditAccounts;
  }

  /**
   * A list of the customer's subscription contracts.
   */
  public SubscriptionContractConnection getSubscriptionContracts() {
    return subscriptionContracts;
  }

  public void setSubscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
    this.subscriptionContracts = subscriptionContracts;
  }

  /**
   * A comma separated list of tags that have been added to the customer.
   */
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Whether the customer is exempt from being charged taxes on their orders.
   */
  public boolean getTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  /**
   * The list of tax exemptions applied to the customer.
   */
  public List<TaxExemption> getTaxExemptions() {
    return taxExemptions;
  }

  public void setTaxExemptions(List<TaxExemption> taxExemptions) {
    this.taxExemptions = taxExemptions;
  }

  /**
   * The URL to unsubscribe the customer from the mailing list.
   */
  public String getUnsubscribeUrl() {
    return unsubscribeUrl;
  }

  public void setUnsubscribeUrl(String unsubscribeUrl) {
    this.unsubscribeUrl = unsubscribeUrl;
  }

  /**
   * The date and time when the customer was last updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  /**
   * Whether the email address is formatted correctly.
   *   
   * Returns `true` when the email is formatted correctly and
   * belongs to an existing domain. This doesn't guarantee that
   * the email address actually exists.
   */
  public boolean getValidEmailAddress() {
    return validEmailAddress;
  }

  public void setValidEmailAddress(boolean validEmailAddress) {
    this.validEmailAddress = validEmailAddress;
  }

  /**
   * Whether the customer has verified their email address. Defaults to `true` if
   * the customer is created through the Shopify admin or API.
   */
  public boolean getVerifiedEmail() {
    return verifiedEmail;
  }

  public void setVerifiedEmail(boolean verifiedEmail) {
    this.verifiedEmail = verifiedEmail;
  }

  @Override
  public String toString() {
    return "Customer{addresses='" + addresses + "', addressesV2='" + addressesV2 + "', amountSpent='" + amountSpent + "', canDelete='" + canDelete + "', companyContactProfiles='" + companyContactProfiles + "', createdAt='" + createdAt + "', dataSaleOptOut='" + dataSaleOptOut + "', defaultAddress='" + defaultAddress + "', defaultEmailAddress='" + defaultEmailAddress + "', defaultPhoneNumber='" + defaultPhoneNumber + "', displayName='" + displayName + "', email='" + email + "', emailMarketingConsent='" + emailMarketingConsent + "', events='" + events + "', firstName='" + firstName + "', hasTimelineComment='" + hasTimelineComment + "', id='" + id + "', image='" + image + "', lastName='" + lastName + "', lastOrder='" + lastOrder + "', legacyResourceId='" + legacyResourceId + "', lifetimeDuration='" + lifetimeDuration + "', locale='" + locale + "', market='" + market + "', mergeable='" + mergeable + "', metafield='" + metafield + "', metafieldDefinitions='" + metafieldDefinitions + "', metafields='" + metafields + "', multipassIdentifier='" + multipassIdentifier + "', note='" + note + "', numberOfOrders='" + numberOfOrders + "', orders='" + orders + "', paymentMethods='" + paymentMethods + "', phone='" + phone + "', productSubscriberStatus='" + productSubscriberStatus + "', smsMarketingConsent='" + smsMarketingConsent + "', state='" + state + "', statistics='" + statistics + "', storeCreditAccounts='" + storeCreditAccounts + "', subscriptionContracts='" + subscriptionContracts + "', tags='" + tags + "', taxExempt='" + taxExempt + "', taxExemptions='" + taxExemptions + "', unsubscribeUrl='" + unsubscribeUrl + "', updatedAt='" + updatedAt + "', validEmailAddress='" + validEmailAddress + "', verifiedEmail='" + verifiedEmail + "'}";
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
        Objects.equals(defaultEmailAddress, that.defaultEmailAddress) &&
        Objects.equals(defaultPhoneNumber, that.defaultPhoneNumber) &&
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
    return Objects.hash(addresses, addressesV2, amountSpent, canDelete, companyContactProfiles, createdAt, dataSaleOptOut, defaultAddress, defaultEmailAddress, defaultPhoneNumber, displayName, email, emailMarketingConsent, events, firstName, hasTimelineComment, id, image, lastName, lastOrder, legacyResourceId, lifetimeDuration, locale, market, mergeable, metafield, metafieldDefinitions, metafields, multipassIdentifier, note, numberOfOrders, orders, paymentMethods, phone, productSubscriberStatus, smsMarketingConsent, state, statistics, storeCreditAccounts, subscriptionContracts, tags, taxExempt, taxExemptions, unsubscribeUrl, updatedAt, validEmailAddress, verifiedEmail);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A list of addresses associated with the customer.
     */
    private List<MailingAddress> addresses;

    /**
     * The addresses associated with the customer.
     */
    private MailingAddressConnection addressesV2;

    /**
     * The total amount that the customer has spent on orders in their lifetime.
     */
    private MoneyV2 amountSpent;

    /**
     * Whether the merchant can delete the customer from their store.
     *   
     * A customer can be deleted from a store only if they haven't yet made an order. After a customer makes an
     * order, they can't be deleted from a store.
     */
    private boolean canDelete;

    /**
     * A list of the customer's company contact profiles.
     */
    private List<CompanyContact> companyContactProfiles;

    /**
     * The date and time when the customer was added to the store.
     */
    private OffsetDateTime createdAt;

    /**
     * Whether the customer has opted out of having their data sold.
     */
    private boolean dataSaleOptOut;

    /**
     * The default address associated with the customer.
     */
    private MailingAddress defaultAddress;

    /**
     * The customer's default email address.
     */
    private CustomerEmailAddress defaultEmailAddress;

    /**
     * The customer's default phone number.
     */
    private CustomerPhoneNumber defaultPhoneNumber;

    /**
     * The full name of the customer, based on the values for first_name and last_name. If the first_name and
     * last_name are not available, then this falls back to the customer's email
     * address, and if that is not available, the customer's phone number.
     */
    private String displayName;

    /**
     * The customer's email address.
     */
    private String email;

    /**
     * The current email marketing state for the customer.
     * If the customer doesn't have an email address, then this property is `null`.
     */
    private CustomerEmailMarketingConsentState emailMarketingConsent;

    /**
     * A list of events associated with the customer.
     */
    private EventConnection events;

    /**
     * The customer's first name.
     */
    private String firstName;

    /**
     * Whether the merchant has added timeline comments about the customer on the customer's page.
     */
    private boolean hasTimelineComment;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The image associated with the customer.
     */
    private Image image;

    /**
     * The customer's last name.
     */
    private String lastName;

    /**
     * The customer's last order.
     */
    private Order lastOrder;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The amount of time since the customer was first added to the store.
     *   
     * Example: 'about 12 years'.
     */
    private String lifetimeDuration;

    /**
     * The customer's locale.
     */
    private String locale;

    /**
     * The market that includes the customer’s default address.
     */
    private Market market;

    /**
     * Whether the customer can be merged with another customer.
     */
    private CustomerMergeable mergeable;

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    private Metafield metafield;

    /**
     * List of metafield definitions.
     */
    private MetafieldDefinitionConnection metafieldDefinitions;

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    private MetafieldConnection metafields;

    /**
     * A unique identifier for the customer that's used with Multipass login.
     */
    private String multipassIdentifier;

    /**
     * A note about the customer.
     */
    private String note;

    /**
     * The number of orders that the customer has made at the store in their lifetime.
     */
    private String numberOfOrders;

    /**
     * A list of the customer's orders.
     */
    private OrderConnection orders;

    /**
     * A list of the customer's payment methods.
     */
    private CustomerPaymentMethodConnection paymentMethods;

    /**
     * The customer's phone number.
     */
    private String phone;

    /**
     * Possible subscriber states of a customer defined by their subscription contracts.
     */
    private CustomerProductSubscriberStatus productSubscriberStatus;

    /**
     * The current SMS marketing state for the customer's phone number.
     *   
     * If the customer does not have a phone number, then this property is `null`.
     */
    private CustomerSmsMarketingConsentState smsMarketingConsent;

    /**
     * The state of the customer's account with the shop.
     *   
     * Please note that this only meaningful when Classic Customer Accounts is active.
     */
    private CustomerState state;

    /**
     * The statistics for a given customer.
     */
    private CustomerStatistics statistics;

    /**
     * Returns a list of store credit accounts that belong to the owner resource.
     * A store credit account owner can hold multiple accounts each with a different currency.
     */
    private StoreCreditAccountConnection storeCreditAccounts;

    /**
     * A list of the customer's subscription contracts.
     */
    private SubscriptionContractConnection subscriptionContracts;

    /**
     * A comma separated list of tags that have been added to the customer.
     */
    private List<String> tags;

    /**
     * Whether the customer is exempt from being charged taxes on their orders.
     */
    private boolean taxExempt;

    /**
     * The list of tax exemptions applied to the customer.
     */
    private List<TaxExemption> taxExemptions;

    /**
     * The URL to unsubscribe the customer from the mailing list.
     */
    private String unsubscribeUrl;

    /**
     * The date and time when the customer was last updated.
     */
    private OffsetDateTime updatedAt;

    /**
     * Whether the email address is formatted correctly.
     *   
     * Returns `true` when the email is formatted correctly and
     * belongs to an existing domain. This doesn't guarantee that
     * the email address actually exists.
     */
    private boolean validEmailAddress;

    /**
     * Whether the customer has verified their email address. Defaults to `true` if
     * the customer is created through the Shopify admin or API.
     */
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
      result.defaultEmailAddress = this.defaultEmailAddress;
      result.defaultPhoneNumber = this.defaultPhoneNumber;
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

    /**
     * A list of addresses associated with the customer.
     */
    public Builder addresses(List<MailingAddress> addresses) {
      this.addresses = addresses;
      return this;
    }

    /**
     * The addresses associated with the customer.
     */
    public Builder addressesV2(MailingAddressConnection addressesV2) {
      this.addressesV2 = addressesV2;
      return this;
    }

    /**
     * The total amount that the customer has spent on orders in their lifetime.
     */
    public Builder amountSpent(MoneyV2 amountSpent) {
      this.amountSpent = amountSpent;
      return this;
    }

    /**
     * Whether the merchant can delete the customer from their store.
     *   
     * A customer can be deleted from a store only if they haven't yet made an order. After a customer makes an
     * order, they can't be deleted from a store.
     */
    public Builder canDelete(boolean canDelete) {
      this.canDelete = canDelete;
      return this;
    }

    /**
     * A list of the customer's company contact profiles.
     */
    public Builder companyContactProfiles(List<CompanyContact> companyContactProfiles) {
      this.companyContactProfiles = companyContactProfiles;
      return this;
    }

    /**
     * The date and time when the customer was added to the store.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * Whether the customer has opted out of having their data sold.
     */
    public Builder dataSaleOptOut(boolean dataSaleOptOut) {
      this.dataSaleOptOut = dataSaleOptOut;
      return this;
    }

    /**
     * The default address associated with the customer.
     */
    public Builder defaultAddress(MailingAddress defaultAddress) {
      this.defaultAddress = defaultAddress;
      return this;
    }

    /**
     * The customer's default email address.
     */
    public Builder defaultEmailAddress(CustomerEmailAddress defaultEmailAddress) {
      this.defaultEmailAddress = defaultEmailAddress;
      return this;
    }

    /**
     * The customer's default phone number.
     */
    public Builder defaultPhoneNumber(CustomerPhoneNumber defaultPhoneNumber) {
      this.defaultPhoneNumber = defaultPhoneNumber;
      return this;
    }

    /**
     * The full name of the customer, based on the values for first_name and last_name. If the first_name and
     * last_name are not available, then this falls back to the customer's email
     * address, and if that is not available, the customer's phone number.
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
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
     * The current email marketing state for the customer.
     * If the customer doesn't have an email address, then this property is `null`.
     */
    public Builder emailMarketingConsent(CustomerEmailMarketingConsentState emailMarketingConsent) {
      this.emailMarketingConsent = emailMarketingConsent;
      return this;
    }

    /**
     * A list of events associated with the customer.
     */
    public Builder events(EventConnection events) {
      this.events = events;
      return this;
    }

    /**
     * The customer's first name.
     */
    public Builder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    /**
     * Whether the merchant has added timeline comments about the customer on the customer's page.
     */
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The image associated with the customer.
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }

    /**
     * The customer's last name.
     */
    public Builder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    /**
     * The customer's last order.
     */
    public Builder lastOrder(Order lastOrder) {
      this.lastOrder = lastOrder;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The amount of time since the customer was first added to the store.
     *   
     * Example: 'about 12 years'.
     */
    public Builder lifetimeDuration(String lifetimeDuration) {
      this.lifetimeDuration = lifetimeDuration;
      return this;
    }

    /**
     * The customer's locale.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * The market that includes the customer’s default address.
     */
    public Builder market(Market market) {
      this.market = market;
      return this;
    }

    /**
     * Whether the customer can be merged with another customer.
     */
    public Builder mergeable(CustomerMergeable mergeable) {
      this.mergeable = mergeable;
      return this;
    }

    /**
     * A [custom field](https://shopify.dev/docs/apps/build/custom-data),
     * including its `namespace` and `key`, that's associated with a Shopify resource
     * for the purposes of adding and storing additional information.
     */
    public Builder metafield(Metafield metafield) {
      this.metafield = metafield;
      return this;
    }

    /**
     * List of metafield definitions.
     */
    public Builder metafieldDefinitions(MetafieldDefinitionConnection metafieldDefinitions) {
      this.metafieldDefinitions = metafieldDefinitions;
      return this;
    }

    /**
     * A list of [custom fields](https://shopify.dev/docs/apps/build/custom-data)
     * that a merchant associates with a Shopify resource.
     */
    public Builder metafields(MetafieldConnection metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * A unique identifier for the customer that's used with Multipass login.
     */
    public Builder multipassIdentifier(String multipassIdentifier) {
      this.multipassIdentifier = multipassIdentifier;
      return this;
    }

    /**
     * A note about the customer.
     */
    public Builder note(String note) {
      this.note = note;
      return this;
    }

    /**
     * The number of orders that the customer has made at the store in their lifetime.
     */
    public Builder numberOfOrders(String numberOfOrders) {
      this.numberOfOrders = numberOfOrders;
      return this;
    }

    /**
     * A list of the customer's orders.
     */
    public Builder orders(OrderConnection orders) {
      this.orders = orders;
      return this;
    }

    /**
     * A list of the customer's payment methods.
     */
    public Builder paymentMethods(CustomerPaymentMethodConnection paymentMethods) {
      this.paymentMethods = paymentMethods;
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
     * Possible subscriber states of a customer defined by their subscription contracts.
     */
    public Builder productSubscriberStatus(
        CustomerProductSubscriberStatus productSubscriberStatus) {
      this.productSubscriberStatus = productSubscriberStatus;
      return this;
    }

    /**
     * The current SMS marketing state for the customer's phone number.
     *   
     * If the customer does not have a phone number, then this property is `null`.
     */
    public Builder smsMarketingConsent(CustomerSmsMarketingConsentState smsMarketingConsent) {
      this.smsMarketingConsent = smsMarketingConsent;
      return this;
    }

    /**
     * The state of the customer's account with the shop.
     *   
     * Please note that this only meaningful when Classic Customer Accounts is active.
     */
    public Builder state(CustomerState state) {
      this.state = state;
      return this;
    }

    /**
     * The statistics for a given customer.
     */
    public Builder statistics(CustomerStatistics statistics) {
      this.statistics = statistics;
      return this;
    }

    /**
     * Returns a list of store credit accounts that belong to the owner resource.
     * A store credit account owner can hold multiple accounts each with a different currency.
     */
    public Builder storeCreditAccounts(StoreCreditAccountConnection storeCreditAccounts) {
      this.storeCreditAccounts = storeCreditAccounts;
      return this;
    }

    /**
     * A list of the customer's subscription contracts.
     */
    public Builder subscriptionContracts(SubscriptionContractConnection subscriptionContracts) {
      this.subscriptionContracts = subscriptionContracts;
      return this;
    }

    /**
     * A comma separated list of tags that have been added to the customer.
     */
    public Builder tags(List<String> tags) {
      this.tags = tags;
      return this;
    }

    /**
     * Whether the customer is exempt from being charged taxes on their orders.
     */
    public Builder taxExempt(boolean taxExempt) {
      this.taxExempt = taxExempt;
      return this;
    }

    /**
     * The list of tax exemptions applied to the customer.
     */
    public Builder taxExemptions(List<TaxExemption> taxExemptions) {
      this.taxExemptions = taxExemptions;
      return this;
    }

    /**
     * The URL to unsubscribe the customer from the mailing list.
     */
    public Builder unsubscribeUrl(String unsubscribeUrl) {
      this.unsubscribeUrl = unsubscribeUrl;
      return this;
    }

    /**
     * The date and time when the customer was last updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    /**
     * Whether the email address is formatted correctly.
     *   
     * Returns `true` when the email is formatted correctly and
     * belongs to an existing domain. This doesn't guarantee that
     * the email address actually exists.
     */
    public Builder validEmailAddress(boolean validEmailAddress) {
      this.validEmailAddress = validEmailAddress;
      return this;
    }

    /**
     * Whether the customer has verified their email address. Defaults to `true` if
     * the customer is created through the Shopify admin or API.
     */
    public Builder verifiedEmail(boolean verifiedEmail) {
      this.verifiedEmail = verifiedEmail;
      return this;
    }
  }
}
