package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderLineItem"));
  }

  public ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> dispositions(
      ) {
     ReverseFulfillmentOrderDispositionProjection<ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionProjection<>(this, getRoot());
     getFields().put("dispositions", projection);
     return projection;
  }

  public FulfillmentLineItemProjection<ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemProjection<PARENT, ROOT> totalQuantity() {
    getFields().put("totalQuantity", null);
    return this;
  }
}
