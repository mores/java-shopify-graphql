package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMomentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMomentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMomentEdge"));
  }

  public CustomerMomentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMomentProjection<CustomerMomentEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CustomerMomentProjection<CustomerMomentEdgeProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CustomerMomentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
