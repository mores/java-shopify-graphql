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

public class CustomerProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Customer"));
  }

  public CustomerProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> addresses() {
     MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("addresses", projection);
     return projection;
  }

  public MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> addresses(Integer first) {
    MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("addresses").add(firstArg);
    return projection;
  }

  public MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> addressesWithVariableReferences(
      String firstReference) {
    MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());    
    getFields().put("addresses", projection);
    getInputArguments().computeIfAbsent("addresses", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("addresses").add(firstArg);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> addressesV2() {
     MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());
     getFields().put("addressesV2", projection);
     return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> addressesV2(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());    
    getFields().put("addressesV2", projection);
    getInputArguments().computeIfAbsent("addressesV2", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("addressesV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("addressesV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("addressesV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("addressesV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("addressesV2").add(reverseArg);
    return projection;
  }

  public MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> addressesV2WithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    MailingAddressConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressConnectionProjection<>(this, getRoot());    
    getFields().put("addressesV2", projection);
    getInputArguments().computeIfAbsent("addressesV2", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("addressesV2").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("addressesV2").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("addressesV2").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("addressesV2").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("addressesV2").add(reverseArg);
    return projection;
  }

  public MoneyV2Projection<CustomerProjection<PARENT, ROOT>, ROOT> amountSpent() {
     MoneyV2Projection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amountSpent", projection);
     return projection;
  }

  public CompanyContactProjection<CustomerProjection<PARENT, ROOT>, ROOT> companyContactProfiles() {
     CompanyContactProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContactProfiles", projection);
     return projection;
  }

  public MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> defaultAddress() {
     MailingAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MailingAddressProjection<>(this, getRoot());
     getFields().put("defaultAddress", projection);
     return projection;
  }

  public CustomerEmailAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> defaultEmailAddress(
      ) {
     CustomerEmailAddressProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailAddressProjection<>(this, getRoot());
     getFields().put("defaultEmailAddress", projection);
     return projection;
  }

  public CustomerPhoneNumberProjection<CustomerProjection<PARENT, ROOT>, ROOT> defaultPhoneNumber(
      ) {
     CustomerPhoneNumberProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerPhoneNumberProjection<>(this, getRoot());
     getFields().put("defaultPhoneNumber", projection);
     return projection;
  }

  public CustomerEmailMarketingConsentStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> emailMarketingConsent(
      ) {
     CustomerEmailMarketingConsentStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerEmailMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("emailMarketingConsent", projection);
     return projection;
  }

  public EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> events(Integer first,
      String after, Integer last, String before, Boolean reverse, EventSortKeys sortKey,
      String query) {
    EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
    getFields().put("events", projection);
    getInputArguments().computeIfAbsent("events", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("events").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("events").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("EventSortKeys"));
    getInputArguments().get("events").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("events").add(queryArg);
    return projection;
  }

  public IdentityProviderSubjectProjection<CustomerProjection<PARENT, ROOT>, ROOT> identityProviderSubjects(
      ) {
     IdentityProviderSubjectProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new IdentityProviderSubjectProjection<>(this, getRoot());
     getFields().put("identityProviderSubjects", projection);
     return projection;
  }

  public ImageProjection<CustomerProjection<PARENT, ROOT>, ROOT> image() {
     ImageProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new ImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public OrderProjection<CustomerProjection<PARENT, ROOT>, ROOT> lastOrder() {
     OrderProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("lastOrder", projection);
     return projection;
  }

  public MarketProjection<CustomerProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public CustomerMergeableProjection<CustomerProjection<PARENT, ROOT>, ROOT> mergeable() {
     CustomerMergeableProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerMergeableProjection<>(this, getRoot());
     getFields().put("mergeable", projection);
     return projection;
  }

  public MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafield(String namespace,
      String key) {
    MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatus, false, null);
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
    getFields().put("metafieldDefinitions", projection);
    getInputArguments().computeIfAbsent("metafieldDefinitions", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(namespaceArg);
    InputArgument pinnedStatusArg = new InputArgument("pinnedStatus", pinnedStatusReference, true, new graphql.language.TypeName("MetafieldDefinitionPinnedStatus"));
    getInputArguments().get("metafieldDefinitions").add(pinnedStatusArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafieldDefinitions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafieldDefinitions").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("MetafieldDefinitionSortKeys"));
    getInputArguments().get("metafieldDefinitions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafieldDefinitions").add(queryArg);
    return projection;
  }

  public MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys, false, null);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keysReference, true, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("String"))));
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> orders(Integer first,
      String after, Integer last, String before, Boolean reverse, OrderSortKeys sortKey,
      String query) {
    OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey, false, null);
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> ordersWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    OrderConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
    getFields().put("orders", projection);
    getInputArguments().computeIfAbsent("orders", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("orders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("orders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKeyReference, true, new graphql.language.TypeName("OrderSortKeys"));
    getInputArguments().get("orders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("orders").add(queryArg);
    return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> paymentMethods(
      ) {
     CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodConnectionProjection<>(this, getRoot());
     getFields().put("paymentMethods", projection);
     return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> paymentMethods(
      Boolean showRevoked, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodConnectionProjection<>(this, getRoot());    
    getFields().put("paymentMethods", projection);
    getInputArguments().computeIfAbsent("paymentMethods", k -> new ArrayList<>());                      
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevoked, false, null);
    getInputArguments().get("paymentMethods").add(showRevokedArg);
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("paymentMethods").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("paymentMethods").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("paymentMethods").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("paymentMethods").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("paymentMethods").add(reverseArg);
    return projection;
  }

  public CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> paymentMethodsWithVariableReferences(
      String showRevokedReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    CustomerPaymentMethodConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerPaymentMethodConnectionProjection<>(this, getRoot());    
    getFields().put("paymentMethods", projection);
    getInputArguments().computeIfAbsent("paymentMethods", k -> new ArrayList<>());              
    InputArgument showRevokedArg = new InputArgument("showRevoked", showRevokedReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("paymentMethods").add(showRevokedArg);
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("paymentMethods").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("paymentMethods").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("paymentMethods").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("paymentMethods").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("paymentMethods").add(reverseArg);
    return projection;
  }

  public CustomerProductSubscriberStatusProjection<CustomerProjection<PARENT, ROOT>, ROOT> productSubscriberStatus(
      ) {
     CustomerProductSubscriberStatusProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerProductSubscriberStatusProjection<>(this, getRoot());
     getFields().put("productSubscriberStatus", projection);
     return projection;
  }

  public CustomerSmsMarketingConsentStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> smsMarketingConsent(
      ) {
     CustomerSmsMarketingConsentStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerSmsMarketingConsentStateProjection<>(this, getRoot());
     getFields().put("smsMarketingConsent", projection);
     return projection;
  }

  public CustomerStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> state() {
     CustomerStateProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerStateProjection<>(this, getRoot());
     getFields().put("state", projection);
     return projection;
  }

  public CustomerStatisticsProjection<CustomerProjection<PARENT, ROOT>, ROOT> statistics() {
     CustomerStatisticsProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new CustomerStatisticsProjection<>(this, getRoot());
     getFields().put("statistics", projection);
     return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      ) {
     StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());
     getFields().put("storeCreditAccounts", projection);
     return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      Integer first, String after, Integer last, String before, String query) {
    StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());    
    getFields().put("storeCreditAccounts", projection);
    getInputArguments().computeIfAbsent("storeCreditAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("storeCreditAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("storeCreditAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("storeCreditAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("storeCreditAccounts").add(beforeArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("storeCreditAccounts").add(queryArg);
    return projection;
  }

  public StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> storeCreditAccountsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String queryReference) {
    StoreCreditAccountConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());    
    getFields().put("storeCreditAccounts", projection);
    getInputArguments().computeIfAbsent("storeCreditAccounts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("storeCreditAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("storeCreditAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("storeCreditAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("storeCreditAccounts").add(beforeArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("storeCreditAccounts").add(queryArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      ) {
     SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());
     getFields().put("subscriptionContracts", projection);
     return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> subscriptionContracts(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    return projection;
  }

  public SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> subscriptionContractsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    SubscriptionContractConnectionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractConnectionProjection<>(this, getRoot());    
    getFields().put("subscriptionContracts", projection);
    getInputArguments().computeIfAbsent("subscriptionContracts", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("subscriptionContracts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("subscriptionContracts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("subscriptionContracts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("subscriptionContracts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("subscriptionContracts").add(reverseArg);
    return projection;
  }

  public TaxExemptionProjection<CustomerProjection<PARENT, ROOT>, ROOT> taxExemptions() {
     TaxExemptionProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new TaxExemptionProjection<>(this, getRoot());
     getFields().put("taxExemptions", projection);
     return projection;
  }

  public TaxSettingsProjection<CustomerProjection<PARENT, ROOT>, ROOT> taxSettings() {
     TaxSettingsProjection<CustomerProjection<PARENT, ROOT>, ROOT> projection = new TaxSettingsProjection<>(this, getRoot());
     getFields().put("taxSettings", projection);
     return projection;
  }

  public CustomerProjection<PARENT, ROOT> canDelete() {
    getFields().put("canDelete", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> dataSaleOptOut() {
    getFields().put("dataSaleOptOut", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> displayName() {
    getFields().put("displayName", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> multipassIdentifier() {
    getFields().put("multipassIdentifier", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> numberOfOrders() {
    getFields().put("numberOfOrders", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> taxExempt() {
    getFields().put("taxExempt", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> unsubscribeUrl() {
    getFields().put("unsubscribeUrl", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> validEmailAddress() {
    getFields().put("validEmailAddress", null);
    return this;
  }

  public CustomerProjection<PARENT, ROOT> verifiedEmail() {
    getFields().put("verifiedEmail", null);
    return this;
  }
}
