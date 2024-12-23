package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ValidationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ValidationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ValidationConnection"));
  }

  public ValidationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ValidationEdgeProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ValidationEdgeProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ValidationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ValidationProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ValidationProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ValidationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ValidationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
