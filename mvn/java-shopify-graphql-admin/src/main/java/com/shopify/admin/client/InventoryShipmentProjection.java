package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ShipmentLineItemSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class InventoryShipmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("InventoryShipment"));
  }

  public InventoryShipmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> lineItems(
      ) {
     InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentLineItemConnectionProjection<>(this, getRoot());
     getFields().put("lineItems", projection);
     return projection;
  }

  public InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ShipmentLineItemSortKeys sortKey, String query) {
    InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentLineItemConnectionProjection<>(this, getRoot());    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("lineItems").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItems").add(queryArg);
    return projection;
  }

  public CountProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> lineItemsCount() {
     CountProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());
     getFields().put("lineItemsCount", projection);
     return projection;
  }

  public CountProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> lineItemsCount(
      String query, Integer limit) {
    CountProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new CountProjection<>(this, getRoot());    
    getFields().put("lineItemsCount", projection);
    getInputArguments().computeIfAbsent("lineItemsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItemsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("lineItemsCount").add(limitArg);
    return projection;
  }

  public InventoryShipmentStatusProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     InventoryShipmentStatusProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public InventoryShipmentTrackingProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> tracking(
      ) {
     InventoryShipmentTrackingProjection<InventoryShipmentProjection<PARENT, ROOT>, ROOT> projection = new InventoryShipmentTrackingProjection<>(this, getRoot());
     getFields().put("tracking", projection);
     return projection;
  }

  public InventoryShipmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryShipmentProjection<PARENT, ROOT> lineItemTotalQuantity() {
    getFields().put("lineItemTotalQuantity", null);
    return this;
  }

  public InventoryShipmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryShipmentProjection<PARENT, ROOT> totalAcceptedQuantity() {
    getFields().put("totalAcceptedQuantity", null);
    return this;
  }

  public InventoryShipmentProjection<PARENT, ROOT> totalReceivedQuantity() {
    getFields().put("totalReceivedQuantity", null);
    return this;
  }

  public InventoryShipmentProjection<PARENT, ROOT> totalRejectedQuantity() {
    getFields().put("totalRejectedQuantity", null);
    return this;
  }
}
