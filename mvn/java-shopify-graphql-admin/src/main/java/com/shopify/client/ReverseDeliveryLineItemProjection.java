package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseDeliveryLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseDeliveryLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseDeliveryLineItem"));
  }

  public ReverseDeliveryLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<ReverseDeliveryLineItemProjection<PARENT, ROOT>, ROOT> dispositions(
      ) {
     ReverseFulfillmentOrderDispositionProjection<ReverseDeliveryLineItemProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionProjection<>(this, getRoot());
     getFields().put("dispositions", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemProjection<ReverseDeliveryLineItemProjection<PARENT, ROOT>, ROOT> reverseFulfillmentOrderLineItem(
      ) {
     ReverseFulfillmentOrderLineItemProjection<ReverseDeliveryLineItemProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("reverseFulfillmentOrderLineItem", projection);
     return projection;
  }

  public ReverseDeliveryLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseDeliveryLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
