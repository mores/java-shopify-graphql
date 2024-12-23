package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentEventConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentEventConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentEventConnection"));
  }

  public FulfillmentEventConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEventEdgeProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentEventEdgeProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentEventProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentEventProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEventProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<FulfillmentEventConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
