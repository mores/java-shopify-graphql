package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderMergeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderMergeProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderMergePayload"));
  }

  public FulfillmentOrderMergeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderMergeResultProjection<FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>, FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>> fulfillmentOrderMerges(
      ) {
    FulfillmentOrderMergeResultProjection<FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>, FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderMergeResultProjection<>(this, this);    
    getFields().put("fulfillmentOrderMerges", projection);
    return projection;
  }

  public FulfillmentOrderMergeUserErrorProjection<FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>, FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    FulfillmentOrderMergeUserErrorProjection<FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>, FulfillmentOrderMergeProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderMergeUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
