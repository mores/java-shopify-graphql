package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemsPreparedForPickupProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderLineItemsPreparedForPickupPayload"));
  }

  public FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT, ROOT>, FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT, ROOT>, FulfillmentOrderLineItemsPreparedForPickupProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderLineItemsPreparedForPickupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
