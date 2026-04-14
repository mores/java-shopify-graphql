package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditSessionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditSessionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderEditSession"));
  }

  public OrderEditSessionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditSessionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
