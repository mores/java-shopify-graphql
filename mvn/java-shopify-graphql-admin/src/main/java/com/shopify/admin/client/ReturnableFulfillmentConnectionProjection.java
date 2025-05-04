package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillmentConnection"));
  }

  public ReturnableFulfillmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnableFulfillmentEdgeProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnableFulfillmentEdgeProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnableFulfillmentProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReturnableFulfillmentProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReturnableFulfillmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
