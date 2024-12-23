package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentLineItemConnection"));
  }

  public FulfillmentLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentLineItemEdgeProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentLineItemEdgeProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentLineItemProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentLineItemProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<FulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
