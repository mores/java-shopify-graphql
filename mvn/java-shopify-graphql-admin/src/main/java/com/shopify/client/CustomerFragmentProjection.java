package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CustomerFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CustomerFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Customer"));
  }

  public CustomerFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addresses() {
     MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addresses(
      Integer first) {
    MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("addresses").add(firstArg);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addressesV2(
      ) {
     MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());
     getFields().put("addressesV2", projection);
     return projection;
  }

  public MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> addressesV2(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());    
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

  public MoneyV2Projection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> amountSpent() {
     MoneyV2Projection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountSpent", projection);
     return projection;
  }

  public CompanyContactProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> companyContactProfiles(
      ) {
     CompanyContactProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContactProfiles", projection);
     return projection;
  }

  public MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> defaultAddress() {
     MailingAddressProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public CustomerEmailMarketingConsentStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> emailMarketingConsent(
      ) {
     CustomerEmailMarketingConsentStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("emailMarketingConsent", projection);
     return projection;
  }

  public EventConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public ImageProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public OrderProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> lastOrder() {
     OrderProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("lastOrder", projection);
     return projection;
  }

  public MarketProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public CustomerMergeableProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> mergeable() {
     CustomerMergeableProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeableProjection<>(this, getRoot());
     getFields().put("mergeable", projection);
     return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey, String query) {
    OrderConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
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

  public CustomerPaymentMethodConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> paymentMethods(
      ) {
     CustomerPaymentMethodConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodConnectionProjection<>(this, getRoot());
     getFields().put("paymentMethods", projection);
     return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> paymentMethods(
      Boolean showRevoked, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    CustomerPaymentMethodConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodConnectionProjection<>(this, getRoot());    
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

  public CustomerProductSubscriberStatusProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> productSubscriberStatus(
      ) {
     CustomerProductSubscriberStatusProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProductSubscriberStatusProjection<>(this, getRoot());
     getFields().put("productSubscriberStatus", projection);
     return projection;
  }

  public CustomerSmsMarketingConsentStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> smsMarketingConsent(
      ) {
     CustomerSmsMarketingConsentStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("smsMarketingConsent", projection);
     return projection;
  }

  public CustomerStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> state() {
     CustomerStateProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public CustomerStatisticsProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> statistics() {
     CustomerStatisticsProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerStatisticsProjection<>(this, getRoot());
     getFields().put("statistics", projection);
     return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      ) {
     StoreCreditAccountConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());
     getFields().put("storeCreditAccounts", projection);
     return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      Integer first, String after, Integer last, String before, String query) {
    StoreCreditAccountConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());    
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

  public SubscriptionContractConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
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

  public TaxExemptionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> taxExemptions() {
     TaxExemptionProjection<CustomerFragmentProjection<PARENT, ROOT>, ROOT> projection = new TaxExemptionProjection<>(this, getRoot());
     getFields().put("taxExemptions", projection);
     return projection;
  }

  public CustomerFragmentProjection<PARENT, ROOT> canDelete() {
    getFields().put("canDelete", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> dataSaleOptOut() {
    getFields().put("dataSaleOptOut", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> multipassIdentifier() {
    getFields().put("multipassIdentifier", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> unsubscribeUrl() {
    getFields().put("unsubscribeUrl", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> validEmailAddress() {
    getFields().put("validEmailAddress", null);
    return this;
  }

  public CustomerFragmentProjection<PARENT, ROOT> verifiedEmail() {
    getFields().put("verifiedEmail", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Customer {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
