package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.EventSortKeys;
import com.shopify.admin.types.MetafieldDefinitionPinnedStatus;
import com.shopify.admin.types.MetafieldDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class InventoryTransferFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public InventoryTransferFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryTransfer"));
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationSnapshotProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> destination(
      ) {
     LocationSnapshotProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationSnapshotProjection<>(this, getRoot());
     getFields().put("destination", projection);
     return projection;
  }

  public EventConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> events(
      ) {
     EventConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());
     getFields().put("events", projection);
     return projection;
  }

  public EventConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> events(
      Integer first, String after, Integer last, String before, Boolean reverse,
      EventSortKeys sortKey, String query) {
    EventConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new EventConnectionProjection<>(this, getRoot());    
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

  public InventoryTransferLineItemConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     InventoryTransferLineItemConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public InventoryTransferLineItemConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse, String query) {
    InventoryTransferLineItemConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferLineItemConnectionProjection<>(this, getRoot());    
    getFields().put("lineItems", projection);
    getInputArguments().computeIfAbsent("lineItems", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("lineItems").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("lineItems").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("lineItems").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("lineItems").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("lineItems").add(reverseArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public CountProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> lineItemsCount() {
     CountProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("lineItemsCount", projection);
     return projection;
  }

  public CountProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> lineItemsCount(
      String query, Integer limit) {
    CountProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("lineItemsCount", projection);
    getInputArguments().computeIfAbsent("lineItemsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItemsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("lineItemsCount").add(limitArg);
    return projection;
  }

  public MetafieldProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldDefinitionConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      ) {
     MetafieldDefinitionConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());
     getFields().put("metafieldDefinitions", projection);
     return projection;
  }

  public MetafieldDefinitionConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafieldDefinitions(
      String namespace, MetafieldDefinitionPinnedStatus pinnedStatus, Integer first, String after,
      Integer last, String before, Boolean reverse, MetafieldDefinitionSortKeys sortKey,
      String query) {
    MetafieldDefinitionConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDefinitionConnectionProjection<>(this, getRoot());    
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

  public MetafieldConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
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

  public LocationSnapshotProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> origin(
      ) {
     LocationSnapshotProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationSnapshotProjection<>(this, getRoot());
     getFields().put("origin", projection);
     return projection;
  }

  public InventoryShipmentConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> shipments(
      ) {
     InventoryShipmentConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentConnectionProjection<>(this, getRoot());
     getFields().put("shipments", projection);
     return projection;
  }

  public InventoryShipmentConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> shipments(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    InventoryShipmentConnectionProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentConnectionProjection<>(this, getRoot());    
    getFields().put("shipments", projection);
    getInputArguments().computeIfAbsent("shipments", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("shipments").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("shipments").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("shipments").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("shipments").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("shipments").add(reverseArg);
    return projection;
  }

  public InventoryTransferStatusProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     InventoryTransferStatusProjection<InventoryTransferFragmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryTransferStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> dateCreated() {
    getFields().put("dateCreated", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> hasTimelineComment() {
    getFields().put("hasTimelineComment", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> receivedQuantity() {
    getFields().put("receivedQuantity", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> referenceName() {
    getFields().put("referenceName", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> tags() {
    getFields().put("tags", null);
    return this;
  }

  public InventoryTransferFragmentProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on InventoryTransfer {");
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
