package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderConnection"));
  }

  public ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderEdgeProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReverseFulfillmentOrderEdgeProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReverseFulfillmentOrderProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReverseFulfillmentOrderProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReverseFulfillmentOrderConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
