package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSupportedActionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSupportedActionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderSupportedAction"));
  }

  public FulfillmentOrderSupportedActionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderActionProjection<FulfillmentOrderSupportedActionProjection<PARENT, ROOT>, ROOT> action(
      ) {
     FulfillmentOrderActionProjection<FulfillmentOrderSupportedActionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderActionProjection<>(this, getRoot());
     getFields().put("action", projection);
     return projection;
  }

  public FulfillmentOrderSupportedActionProjection<PARENT, ROOT> externalUrl() {
    getFields().put("externalUrl", null);
    return this;
  }
}
