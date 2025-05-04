package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CustomerProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerProjectionRoot() {
    super(null, null, java.util.Optional.of("Customer"));
  }

  public CustomerProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addresses(
      ) {
    MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("addresses", projection);
    return projection;
  }

  public MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addresses(
      Integer first) {
    MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addresses").add(firstArg);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addressesV2(
      ) {
    MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressConnectionProjection<>(this, this);    
    getFields().put("addressesV2", projection);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> addressesV2(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressConnectionProjection<>(this, this);    
    getFields().put("addressesV2", projection);
    getInputArguments().computeIfAbsent("addressesV2", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addressesV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("addressesV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("addressesV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("addressesV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("addressesV2").add(reverseArg);
    return projection;
  }

  public MoneyV2Projection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> amountSpent(
      ) {
    MoneyV2Projection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("amountSpent", projection);
    return projection;
  }

  public CompanyContactProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> companyContactProfiles(
      ) {
    CompanyContactProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("companyContactProfiles", projection);
    return projection;
  }

  public MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> defaultAddress(
      ) {
    MailingAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MailingAddressProjection<>(this, this);    
    getFields().put("defaultAddress", projection);
    return projection;
  }

  public CustomerEmailAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> defaultEmailAddress(
      ) {
    CustomerEmailAddressProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerEmailAddressProjection<>(this, this);    
    getFields().put("defaultEmailAddress", projection);
    return projection;
  }

  public CustomerPhoneNumberProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> defaultPhoneNumber(
      ) {
    CustomerPhoneNumberProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerPhoneNumberProjection<>(this, this);    
    getFields().put("defaultPhoneNumber", projection);
    return projection;
  }

  public CustomerEmailMarketingConsentStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> emailMarketingConsent(
      ) {
    CustomerEmailMarketingConsentStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerEmailMarketingConsentStateProjection<>(this, this);    
    getFields().put("emailMarketingConsent", projection);
    return projection;
  }

  public EventConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public ImageProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> image(
      ) {
    ImageProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new ImageProjection<>(this, this);    
    getFields().put("image", projection);
    return projection;
  }

  public OrderProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> lastOrder(
      ) {
    OrderProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("lastOrder", projection);
    return projection;
  }

  public MarketProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public CustomerMergeableProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> mergeable(
      ) {
    CustomerMergeableProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerMergeableProjection<>(this, this);    
    getFields().put("mergeable", projection);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey, String query) {
    OrderConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> paymentMethods(
      ) {
    CustomerPaymentMethodConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodConnectionProjection<>(this, this);    
    getFields().put("paymentMethods", projection);
    return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> paymentMethods(
      Boolean showRevoked, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    CustomerPaymentMethodConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerPaymentMethodConnectionProjection<>(this, this);    
    getFields().put("paymentMethods", projection);
    getInputArguments().computeIfAbsent("paymentMethods", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked);
    getInputArguments().get("paymentMethods").add(showRevokedArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("paymentMethods").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("paymentMethods").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("paymentMethods").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("paymentMethods").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("paymentMethods").add(reverseArg);
    return projection;
  }

  public CustomerProductSubscriberStatusProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> productSubscriberStatus(
      ) {
    CustomerProductSubscriberStatusProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerProductSubscriberStatusProjection<>(this, this);    
    getFields().put("productSubscriberStatus", projection);
    return projection;
  }

  public CustomerSmsMarketingConsentStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> smsMarketingConsent(
      ) {
    CustomerSmsMarketingConsentStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerSmsMarketingConsentStateProjection<>(this, this);    
    getFields().put("smsMarketingConsent", projection);
    return projection;
  }

  public CustomerStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> state(
      ) {
    CustomerStateProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerStateProjection<>(this, this);    
    getFields().put("state", projection);
    return projection;
  }

  public CustomerStatisticsProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> statistics(
      ) {
    CustomerStatisticsProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new CustomerStatisticsProjection<>(this, this);    
    getFields().put("statistics", projection);
    return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> storeCreditAccounts(
      ) {
    StoreCreditAccountConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountConnectionProjection<>(this, this);    
    getFields().put("storeCreditAccounts", projection);
    return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> storeCreditAccounts(
      Integer first, String after, Integer last, String before, String query) {
    StoreCreditAccountConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountConnectionProjection<>(this, this);    
    getFields().put("storeCreditAccounts", projection);
    getInputArguments().computeIfAbsent("storeCreditAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("storeCreditAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("storeCreditAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("storeCreditAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("storeCreditAccounts").add(beforeArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("storeCreditAccounts").add(queryArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> subscriptionContracts(
      ) {
    SubscriptionContractConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractConnectionProjection<>(this, this);    
    getFields().put("subscriptionContracts", projection);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractConnectionProjection<>(this, this);    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    return projection;
  }

  public TaxExemptionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> taxExemptions(
      ) {
    TaxExemptionProjection<CustomerProjectionRoot<PARENT, ROOT>, CustomerProjectionRoot<PARENT, ROOT>> projection = new TaxExemptionProjection<>(this, this);    
    getFields().put("taxExemptions", projection);
    return projection;
  }

  public CustomerProjectionRoot<PARENT, ROOT> canDelete() {
    getFields().put("canDelete", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> dataSaleOptOut() {
    getFields().put("dataSaleOptOut", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> multipassIdentifier() {
    getFields().put("multipassIdentifier", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> unsubscribeUrl() {
    getFields().put("unsubscribeUrl", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> validEmailAddress() {
    getFields().put("validEmailAddress", null);
    return this;
  }

  public CustomerProjectionRoot<PARENT, ROOT> verifiedEmail() {
    getFields().put("verifiedEmail", null);
    return this;
  }
}
