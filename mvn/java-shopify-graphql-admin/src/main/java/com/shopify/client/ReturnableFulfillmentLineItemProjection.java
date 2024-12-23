package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentLineItemProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentLineItemProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillmentLineItem"));
  }

  public ReturnableFulfillmentLineItemProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentLineItemProjection<ReturnableFulfillmentLineItemProjection<PARENT, ROOT>, ROOT> fulfillmentLineItem(
      ) {
     FulfillmentLineItemProjection<ReturnableFulfillmentLineItemProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("fulfillmentLineItem", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
