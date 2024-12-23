package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderLineItemConnection"));
  }

  public DraftOrderLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderLineItemEdgeProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     DraftOrderLineItemEdgeProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public DraftOrderLineItemProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     DraftOrderLineItemProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<DraftOrderLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
