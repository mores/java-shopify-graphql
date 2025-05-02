package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetafieldDeleteUserErrorProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetafieldDeleteUserErrorProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetafieldDeleteUserError"));
  }

  public MetafieldDeleteUserErrorProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetafieldDeleteErrorCodeProjection<MetafieldDeleteUserErrorProjection<PARENT, ROOT>, ROOT> code(
      ) {
     MetafieldDeleteErrorCodeProjection<MetafieldDeleteUserErrorProjection<PARENT, ROOT>, ROOT> projection = new MetafieldDeleteErrorCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public MetafieldDeleteUserErrorProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public MetafieldDeleteUserErrorProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
