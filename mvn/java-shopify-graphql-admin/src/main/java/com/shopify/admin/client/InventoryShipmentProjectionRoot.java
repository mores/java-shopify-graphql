package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.ShipmentLineItemSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class InventoryShipmentProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public InventoryShipmentProjectionRoot() {
    super(null, null, java.util.Optional.of("InventoryShipment"));
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> lineItems(
      ) {
    InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentLineItemConnectionProjection<>(this, this);    
    getFields().put("lineItems", projection);
    return projection;
  }

  public InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> lineItems(
      Integer first, String after, Integer last, String before, Boolean reverse,
      ShipmentLineItemSortKeys sortKey, String query) {
    InventoryShipmentLineItemConnectionProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentLineItemConnectionProjection<>(this, this);    
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

  public CountProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> lineItemsCount(
      ) {
    CountProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("lineItemsCount", projection);
    return projection;
  }

  public CountProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> lineItemsCount(
      String query, Integer limit) {
    CountProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new CountProjection<>(this, this);    
    getFields().put("lineItemsCount", projection);
    getInputArguments().computeIfAbsent("lineItemsCount", k -> new ArrayList<>());                      
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("lineItemsCount").add(queryArg);
    InputArgument limitArg = new InputArgument("limit", limit);
    getInputArguments().get("lineItemsCount").add(limitArg);
    return projection;
  }

  public InventoryShipmentStatusProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> status(
      ) {
    InventoryShipmentStatusProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentStatusProjection<>(this, this);    
    getFields().put("status", projection);
    return projection;
  }

  public InventoryShipmentTrackingProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> tracking(
      ) {
    InventoryShipmentTrackingProjection<InventoryShipmentProjectionRoot<PARENT, ROOT>, InventoryShipmentProjectionRoot<PARENT, ROOT>> projection = new InventoryShipmentTrackingProjection<>(this, this);    
    getFields().put("tracking", projection);
    return projection;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> lineItemTotalQuantity() {
    getFields().put("lineItemTotalQuantity", null);
    return this;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> totalAcceptedQuantity() {
    getFields().put("totalAcceptedQuantity", null);
    return this;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> totalReceivedQuantity() {
    getFields().put("totalReceivedQuantity", null);
    return this;
  }

  public InventoryShipmentProjectionRoot<PARENT, ROOT> totalRejectedQuantity() {
    getFields().put("totalRejectedQuantity", null);
    return this;
  }
}
