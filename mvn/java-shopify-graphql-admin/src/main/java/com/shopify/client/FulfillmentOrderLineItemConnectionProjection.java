package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemConnection"));
  }

  public FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemEdgeProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentOrderLineItemEdgeProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentOrderLineItemProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentOrderLineItemProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<FulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
