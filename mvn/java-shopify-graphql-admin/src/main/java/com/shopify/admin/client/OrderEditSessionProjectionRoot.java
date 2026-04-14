package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class OrderEditSessionProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public OrderEditSessionProjectionRoot() {
    super(null, null, java.util.Optional.of("OrderEditSession"));
  }

  public OrderEditSessionProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public OrderEditSessionProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
