package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderLineItemConnection"));
  }

  public ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderLineItemEdgeProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReverseFulfillmentOrderLineItemEdgeProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReverseFulfillmentOrderLineItemProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReverseFulfillmentOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
