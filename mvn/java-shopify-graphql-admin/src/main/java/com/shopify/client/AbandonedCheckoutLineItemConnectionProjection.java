package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AbandonedCheckoutLineItemConnection"));
  }

  public AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutLineItemEdgeProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     AbandonedCheckoutLineItemEdgeProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     AbandonedCheckoutLineItemProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new AbandonedCheckoutLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<AbandonedCheckoutLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
