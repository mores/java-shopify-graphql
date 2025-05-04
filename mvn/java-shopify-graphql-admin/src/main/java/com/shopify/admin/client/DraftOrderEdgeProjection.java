package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DraftOrderEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DraftOrderEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("DraftOrderEdge"));
  }

  public DraftOrderEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DraftOrderProjection<DraftOrderEdgeProjection<PARENT, ROOT>, ROOT> node() {
     DraftOrderProjection<DraftOrderEdgeProjection<PARENT, ROOT>, ROOT> projection = new DraftOrderProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public DraftOrderEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
