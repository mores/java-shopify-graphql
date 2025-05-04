package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerMomentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerMomentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerMomentConnection"));
  }

  public CustomerMomentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerMomentEdgeProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CustomerMomentEdgeProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CustomerMomentProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CustomerMomentProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerMomentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CustomerMomentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
