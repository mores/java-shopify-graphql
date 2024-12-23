package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ValidationEdge"));
  }

  public ValidationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationProjection<ValidationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ValidationProjection<ValidationEdgeProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ValidationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
