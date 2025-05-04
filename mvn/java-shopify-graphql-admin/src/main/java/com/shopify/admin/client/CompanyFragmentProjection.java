package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.CompanyContactRoleSortKeys;
import com.shopify.admin.types.CompanyContactSortKeys;
import com.shopify.admin.types.CompanyLocationSortKeys;
import com.shopify.admin.types.DraftOrderSortKeys;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import com.shopify.admin.types.OrderSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class CompanyFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("Company"));
  }

  public CompanyFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> contactRoles(
      ) {
     CompanyContactRoleConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleConnectionProjection<>(this, getRoot());
     getFields().put("contactRoles", projection);
     return projection;
  }

  public CompanyContactRoleConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> contactRoles(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactRoleSortKeys sortKey) {
    CompanyContactRoleConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleConnectionProjection<>(this, getRoot());    
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

  public CompanyContactConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> contacts(
      ) {
     CompanyContactConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactConnectionProjection<>(this, getRoot());
     getFields().put("contacts", projection);
     return projection;
  }

  public CompanyContactConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> contacts(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyContactSortKeys sortKey, String query) {
    CompanyContactConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> contactsCount() {
     CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("contactsCount", projection);
     return projection;
  }

  public CompanyContactRoleProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> defaultRole() {
     CompanyContactRoleProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("defaultRole", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> draftOrders(
      ) {
     DraftOrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());
     getFields().put("draftOrders", projection);
     return projection;
  }

  public DraftOrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> draftOrders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      DraftOrderSortKeys sortKey, String query) {
    DraftOrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderConnectionProjection<>(this, getRoot());    
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

  public EventConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> events() {
     EventConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public CompanyLocationConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> locations(
      ) {
     CompanyLocationConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());
     getFields().put("locations", projection);
     return projection;
  }

  public CompanyLocationConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> locations(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CompanyLocationSortKeys sortKey, String query) {
    CompanyLocationConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> locationsCount() {
     CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("locationsCount", projection);
     return projection;
  }

  public CompanyContactProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> mainContact() {
     CompanyContactProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("mainContact", projection);
     return projection;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafields() {
     MetafieldConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public OrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> orders() {
     OrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());
     getFields().put("orders", projection);
     return projection;
  }

  public OrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> orders(
      Integer first, String after, Integer last, String before, Boolean reverse,
      OrderSortKeys sortKey) {
    OrderConnectionProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderConnectionProjection<>(this, getRoot());    
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

  public CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> ordersCount() {
     CountProjection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("ordersCount", projection);
     return projection;
  }

  public MoneyV2Projection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> totalSpent() {
     MoneyV2Projection<CompanyFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalSpent", projection);
     return projection;
  }

  public CompanyFragmentProjection<PARENT, ROOT> contactCount() {
    getFields().put("contactCount", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> customerSince() {
    getFields().put("customerSince", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> defaultCursor() {
    getFields().put("defaultCursor", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> externalId() {
    getFields().put("externalId", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> lifetimeDuration() {
    getFields().put("lifetimeDuration", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public CompanyFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on Company {");
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
