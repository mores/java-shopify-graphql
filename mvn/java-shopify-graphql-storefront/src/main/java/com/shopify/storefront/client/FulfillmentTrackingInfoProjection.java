package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentTrackingInfoProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentTrackingInfoProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentTrackingInfo"));
  }

  public FulfillmentTrackingInfoProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentTrackingInfoProjection<PARENT, ROOT> number() {
    getFields().put("number", null);
    return this;
  }

  public FulfillmentTrackingInfoProjection<PARENT, ROOT> url() {
    getFields().put("url", null);
    return this;
  }
}
