package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerEdge"));
  }

  public CustomerEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerProjection<CustomerEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CustomerProjection<CustomerEdgeProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CustomerEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
