package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldReferenceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldReferenceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldReferenceConnection"));
  }

  public MetafieldReferenceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldReferenceEdgeProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MetafieldReferenceEdgeProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MetafieldReferenceProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MetafieldReferenceProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldReferenceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<MetafieldReferenceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
