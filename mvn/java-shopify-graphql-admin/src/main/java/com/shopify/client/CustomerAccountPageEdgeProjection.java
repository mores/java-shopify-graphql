package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountPageEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountPageEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountPageEdge"));
  }

  public CustomerAccountPageEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountPageProjection<CustomerAccountPageEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CustomerAccountPageProjection<CustomerAccountPageEdgeProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CustomerAccountPageEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
