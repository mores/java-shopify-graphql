package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CompanyContactRoleAssignmentSortKeys;
import com.shopify.types.CompanyLocationStaffMemberAssignmentSortKeys;
import com.shopify.types.DraftOrderSortKeys;
import com.shopify.types.EventSortKeys;
import com.shopify.types.MetafieldDefinitionPinnedStatus;
import com.shopify.types.MetafieldDefinitionSortKeys;
import com.shopify.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CompanyLocationProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocation"));
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyAddressProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> billingAddress(
      ) {
    CompanyAddressProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyAddressProjection<>(this, this);    
    getFields().put("billingAddress", projection);
    return projection;
  }

  public BuyerExperienceConfigurationProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> buyerExperienceConfiguration(
      ) {
    BuyerExperienceConfigurationProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new BuyerExperienceConfigurationProjection<>(this, this);    
    getFields().put("buyerExperienceConfiguration", projection);
    return projection;
  }

  public CatalogConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> catalogs(
      ) {
    CatalogConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    return projection;
  }

  public CatalogConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CatalogConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CatalogConnectionProjection<>(this, this);    
    getFields().put("catalogs", projection);
    getInputArguments().computeIfAbsent("catalogs", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("catalogs").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("catalogs").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("catalogs").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("catalogs").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("catalogs").add(reverseArg);
    return projection;
  }

  public CountProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> catalogsCount(
      ) {
    CountProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("catalogsCount", projection);
    return projection;
  }

  public CompanyProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> company(
      ) {
    CompanyProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyProjection<>(this, this);    
    getFields().put("company", projection);
    return projection;
  }

  public CurrencyCodeProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> currency(
      ) {
    CurrencyCodeProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CurrencyCodeProjection<>(this, this);    
    getFields().put("currency", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> draftOrders(
      ) {
    DraftOrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
    getFields().put("draftOrders", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
    getFields().put("draftOrders", projection);
    getInputArguments().computeIfAbsent("draftOrders", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("draftOrders").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("draftOrders").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("draftOrders").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("draftOrders").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("draftOrders").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("draftOrders").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("draftOrders").add(queryArg);
    return projection;
  }

  public EventConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public BooleanProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> inCatalog(
      String catalogId) {
    BooleanProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new BooleanProjection<>(this, this);    
    getFields().put("inCatalog", projection);
    getInputArguments().computeIfAbsent("inCatalog", k -> new ArrayList<>());                      
    InputArgument catalogIdArg = new InputArgument("catalogId", catalogId);
    getInputArguments().get("inCatalog").add(catalogIdArg);
    return projection;
  }

  public MarketProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> market(
      ) {
    MarketProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("market", projection);
    return projection;
  }

  public MetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public OrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
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
    return projection;
  }

  public CountProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> ordersCount(
      ) {
    CountProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("ordersCount", projection);
    return projection;
  }

  public PrivateMetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    getInputArguments().computeIfAbsent("privateMetafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafields").add(namespaceArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("privateMetafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("privateMetafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("privateMetafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("privateMetafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("privateMetafields").add(reverseArg);
    return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> roleAssignments(
      ) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> roleAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleAssignmentSortKeys sortKey, String query) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    getInputArguments().computeIfAbsent("roleAssignments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("roleAssignments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("roleAssignments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("roleAssignments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("roleAssignments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("roleAssignments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("roleAssignments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("roleAssignments").add(queryArg);
    return projection;
  }

  public CompanyAddressProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> shippingAddress(
      ) {
    CompanyAddressProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyAddressProjection<>(this, this);    
    getFields().put("shippingAddress", projection);
    return projection;
  }

  public CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> staffMemberAssignments(
      ) {
    CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationStaffMemberAssignmentConnectionProjection<>(this, this);    
    getFields().put("staffMemberAssignments", projection);
    return projection;
  }

  public CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> staffMemberAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationStaffMemberAssignmentSortKeys sortKey, String query) {
    CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationStaffMemberAssignmentConnectionProjection<>(this, this);    
    getFields().put("staffMemberAssignments", projection);
    getInputArguments().computeIfAbsent("staffMemberAssignments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("staffMemberAssignments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("staffMemberAssignments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("staffMemberAssignments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("staffMemberAssignments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("staffMemberAssignments").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("staffMemberAssignments").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("staffMemberAssignments").add(queryArg);
    return projection;
  }

  public TaxExemptionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> taxExemptions(
      ) {
    TaxExemptionProjection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new TaxExemptionProjection<>(this, this);    
    getFields().put("taxExemptions", projection);
    return projection;
  }

  public MoneyV2Projection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> totalSpent(
      ) {
    MoneyV2Projection<CompanyLocationProjectionRoot<PARENT, ROOT>, CompanyLocationProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalSpent", projection);
    return projection;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> externalId() {
    getFields().put("externalId", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> inCatalog() {
    getFields().put("inCatalog", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> orderCount() {
    getFields().put("orderCount", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> taxRegistrationId() {
    getFields().put("taxRegistrationId", null);
    return this;
  }

  public CompanyLocationProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
