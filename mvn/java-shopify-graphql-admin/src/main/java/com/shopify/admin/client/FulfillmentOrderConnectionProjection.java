package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderConnection"));
  }

  public FulfillmentOrderConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderEdgeProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     FulfillmentOrderEdgeProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<FulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
