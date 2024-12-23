package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CompanyContactRoleSortKeys;
import com.shopify.types.CompanyContactSortKeys;
import com.shopify.types.CompanyLocationSortKeys;
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

public class CompanyProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyProjectionRoot() {
    super(null, null, java.util.Optional.of("Company"));
  }

  public CompanyProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> contactRoles(
      ) {
    CompanyContactRoleConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleConnectionProjection<>(this, this);    
    getFields().put("contactRoles", projection);
    return projection;
  }

  public CompanyContactRoleConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> contactRoles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleSortKeys sortKey) {
    CompanyContactRoleConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleConnectionProjection<>(this, this);    
    getFields().put("contactRoles", projection);
    getInputArguments().computeIfAbsent("contactRoles", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("contactRoles").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("contactRoles").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("contactRoles").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("contactRoles").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("contactRoles").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("contactRoles").add(sortKeyArg);
    return projection;
  }

  public CompanyContactConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> contacts(
      ) {
    CompanyContactConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactConnectionProjection<>(this, this);    
    getFields().put("contacts", projection);
    return projection;
  }

  public CompanyContactConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> contacts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactSortKeys sortKey, String query) {
    CompanyContactConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactConnectionProjection<>(this, this);    
    getFields().put("contacts", projection);
    getInputArguments().computeIfAbsent("contacts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("contacts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("contacts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("contacts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("contacts").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("contacts").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("contacts").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("contacts").add(queryArg);
    return projection;
  }

  public CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> contactsCount(
      ) {
    CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("contactsCount", projection);
    return projection;
  }

  public CompanyContactRoleProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> defaultRole(
      ) {
    CompanyContactRoleProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleProjection<>(this, this);    
    getFields().put("defaultRole", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> draftOrders(
      ) {
    DraftOrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
    getFields().put("draftOrders", projection);
    return projection;
  }

  public DraftOrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new DraftOrderConnectionProjection<>(this, this);    
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

  public EventConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public CompanyLocationConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> locations(
      ) {
    CompanyLocationConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationConnectionProjection<>(this, this);    
    getFields().put("locations", projection);
    return projection;
  }

  public CompanyLocationConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationSortKeys sortKey, String query) {
    CompanyLocationConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationConnectionProjection<>(this, this);    
    getFields().put("locations", projection);
    getInputArguments().computeIfAbsent("locations", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("locations").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("locations").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("locations").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("locations").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("locations").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("locations").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("locations").add(queryArg);
    return projection;
  }

  public CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> locationsCount(
      ) {
    CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("locationsCount", projection);
    return projection;
  }

  public CompanyContactProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> mainContact(
      ) {
    CompanyContactProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CompanyContactProjection<>(this, this);    
    getFields().put("mainContact", projection);
    return projection;
  }

  public MetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public OrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> orders(
      ) {
    OrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
    getFields().put("orders", projection);
    return projection;
  }

  public OrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new OrderConnectionProjection<>(this, this);    
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

  public CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> ordersCount(
      ) {
    CountProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("ordersCount", projection);
    return projection;
  }

  public PrivateMetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> privateMetafield(
      ) {
    PrivateMetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    return projection;
  }

  public PrivateMetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> privateMetafield(
      String namespace, String key) {
    PrivateMetafieldProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldProjection<>(this, this);    
    getFields().put("privateMetafield", projection);
    getInputArguments().computeIfAbsent("privateMetafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("privateMetafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("privateMetafield").add(keyArg);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> privateMetafields(
      ) {
    PrivateMetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
    getFields().put("privateMetafields", projection);
    return projection;
  }

  public PrivateMetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> privateMetafields(
      String namespace, Integer first, String after, Integer last, String before, Boolean reverse) {
    PrivateMetafieldConnectionProjection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new PrivateMetafieldConnectionProjection<>(this, this);    
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

  public MoneyV2Projection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> totalSpent(
      ) {
    MoneyV2Projection<CompanyProjectionRoot<PARENT, ROOT>, CompanyProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalSpent", projection);
    return projection;
  }

  public CompanyProjectionRoot<PARENT, ROOT> contactCount() {
    getFields().put("contactCount", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> customerSince() {
    getFields().put("customerSince", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> externalId() {
    getFields().put("externalId", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CompanyProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
