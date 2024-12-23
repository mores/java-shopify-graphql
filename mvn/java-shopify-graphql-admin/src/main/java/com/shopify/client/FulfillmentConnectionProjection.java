package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentConnection"));
  }

  public FulfillmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentEdgeProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     FulfillmentEdgeProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     FulfillmentProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<FulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
