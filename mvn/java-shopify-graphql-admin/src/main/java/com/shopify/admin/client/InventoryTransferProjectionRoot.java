package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryTransferProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryTransferProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryTransfer"));
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationSnapshotProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> destination(
      ) {
    LocationSnapshotProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new LocationSnapshotProjection<>(this, this);    
    getFields().put("destination", projection);
    return projection;
  }

  public EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> events(
      ) {
    EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
    getFields().put("events", projection);
    return projection;
  }

  public EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> eventsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String sortKeyReference, String queryReference) {
    EventConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new EventConnectionProjection<>(this, this);    
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

  public InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItemsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference, String queryReference) {
    InventoryTransferLineItemConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItemsCount(
      ) {
    CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("lineItemsCount", projection);
    return projection;
  }

  public CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItemsCount(
      String query, Integer limit) {
    CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("lineItemsCount", projection);
    getInputArguments().computeIfAbsent("lineItemsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query, false, null);
    getInputArguments().get("lineItemsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit, false, null);
    getInputArguments().get("lineItemsCount").add(limitArg);
    return projection;
  }

  public CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> lineItemsCountWithVariableReferences(
      String queryReference, String limitReference) {
    CountProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("lineItemsCount", projection);
    getInputArguments().computeIfAbsent("lineItemsCount", k -> new ArrayList<>());              
    InputArgument queryArg = new InputArgument("query", queryReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("lineItemsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limitReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("lineItemsCount").add(limitArg);
    return projection;
  }

  public MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafield(
      ) {
    MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    return projection;
  }

  public MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafield(
      String namespace, String key) {
    MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace, false, null);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key, false, null);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafieldWithVariableReferences(
      String namespaceReference, String keyReference) {
    MetafieldProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldProjection<>(this, this);    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());              
    InputArgument namespaceArg = new InputArgument("namespace", namespaceReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", keyReference, true, new graphql.language.NonNullType(new graphql.language.TypeName("String")));
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      ) {
    MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
    getFields().put("metafieldDefinitions", projection);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafieldDefinitionsWithVariableReferences(
      String namespaceReference, String pinnedStatusReference, String firstReference,
      String afterReference, String lastReference, String beforeReference, String reverseReference,
      String sortKeyReference, String queryReference) {
    MetafieldDefinitionConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldDefinitionConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafields(
      ) {
    MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
    getFields().put("metafields", projection);
    return projection;
  }

  public MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> metafieldsWithVariableReferences(
      String namespaceReference, String keysReference, String firstReference, String afterReference,
      String lastReference, String beforeReference, String reverseReference) {
    MetafieldConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new MetafieldConnectionProjection<>(this, this);    
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

  public LocationSnapshotProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> origin(
      ) {
    LocationSnapshotProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new LocationSnapshotProjection<>(this, this);    
    getFields().put("origin", projection);
    return projection;
  }

  public InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> shipments(
      ) {
    InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentConnectionProjection<>(this, this);    
    getFields().put("shipments", projection);
    return projection;
  }

  public InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> shipments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentConnectionProjection<>(this, this);    
    getFields().put("shipments", projection);
    getInputArguments().computeIfAbsent("shipments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("shipments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("shipments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("shipments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("shipments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("shipments").add(reverseArg);
    return projection;
  }

  public InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> shipmentsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    InventoryShipmentConnectionProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentConnectionProjection<>(this, this);    
    getFields().put("shipments", projection);
    getInputArguments().computeIfAbsent("shipments", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("shipments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("shipments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("shipments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("shipments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
    getInputArguments().get("shipments").add(reverseArg);
    return projection;
  }

  public InventoryTransferStatusProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> status(
      ) {
    InventoryTransferStatusProjection<InventoryTransferProjectionRoot<PARENT, ROOT>, InventoryTransferProjectionRoot<PARENT, ROOT>> projection = new InventoryTransferStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> dateCreated() {
    getFields().put("dateCreated", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> receivedQuantity() {
    getFields().put("receivedQuantity", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> referenceName() {
    getFields().put("referenceName", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public InventoryTransferProjectionRoot<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
