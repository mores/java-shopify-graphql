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

public class CompanyLocationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocation"));
  }

  public CompanyLocationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyAddressProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> billingAddress() {
     CompanyAddressProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyAddressProjection<>(this, getRoot());
     getFields().put("billingAddress", projection);
     return projection;
  }

  public BuyerExperienceConfigurationProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> buyerExperienceConfiguration(
      ) {
     BuyerExperienceConfigurationProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new BuyerExperienceConfigurationProjection<>(this, getRoot());
     getFields().put("buyerExperienceConfiguration", projection);
     return projection;
  }

  public CatalogConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> catalogs() {
     CatalogConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());
     getFields().put("catalogs", projection);
     return projection;
  }

  public CatalogConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> catalogs(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    CatalogConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CatalogConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> catalogsCount() {
     CountProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("catalogsCount", projection);
     return projection;
  }

  public CompanyProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CurrencyCodeProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> currency() {
     CurrencyCodeProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CurrencyCodeProjection<>(this, getRoot());
     getFields().put("currency", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> draftOrders(
      ) {
     DraftOrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
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

  public EventConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public MarketProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> market() {
     MarketProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("market", projection);
     return projection;
  }

  public MetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public OrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> ordersCount() {
     CountProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("ordersCount", projection);
     return projection;
  }

  public PrivateMetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> privateMetafield(
      ) {
     PrivateMetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());
     getFields().put("privateMetafield", projection);
     return projection;
  }

  public PrivateMetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldProjection<>(this, getRoot());    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> privateMetafields(
      ) {
     PrivateMetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());
     getFields().put("privateMetafields", projection);
     return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new PrivateMetafieldConnectionProjection<>(this, getRoot());    
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

  public CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> roleAssignments(
      ) {
     CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, getRoot());
     getFields().put("roleAssignments", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> roleAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleAssignmentSortKeys sortKey, String query) {
    CompanyContactRoleAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentConnectionProjection<>(this, getRoot());    
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

  public CompanyAddressProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> shippingAddress() {
     CompanyAddressProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyAddressProjection<>(this, getRoot());
     getFields().put("shippingAddress", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> staffMemberAssignments(
      ) {
     CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationStaffMemberAssignmentConnectionProjection<>(this, getRoot());
     getFields().put("staffMemberAssignments", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> staffMemberAssignments(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationStaffMemberAssignmentSortKeys sortKey, String query) {
    CompanyLocationStaffMemberAssignmentConnectionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationStaffMemberAssignmentConnectionProjection<>(this, getRoot());    
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

  public TaxExemptionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> taxExemptions() {
     TaxExemptionProjection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new TaxExemptionProjection<>(this, getRoot());
     getFields().put("taxExemptions", projection);
     return projection;
  }

  public MoneyV2Projection<CompanyLocationProjection<PARENT, ROOT>, ROOT> totalSpent() {
     MoneyV2Projection<CompanyLocationProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSpent", projection);
     return projection;
  }

  public CompanyLocationProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> externalId() {
    getFields().put("externalId", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> inCatalog() {
    getFields().put("inCatalog", null);
    return this;
  }

  public CompanyLocationProjection inCatalog(String catalogId) {
    getFields().put("inCatalog", null);
    getInputArguments().computeIfAbsent("inCatalog", k -> new ArrayList<>());
    InputArgument catalogIdArg = new InputArgument("catalogId", catalogId);
    getInputArguments().get("inCatalog").add(catalogIdArg);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> locale() {
    getFields().put("locale", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> orderCount() {
    getFields().put("orderCount", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> taxRegistrationId() {
    getFields().put("taxRegistrationId", null);
    return this;
  }

  public CompanyLocationProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
