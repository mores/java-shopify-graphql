package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerConnection"));
  }

  public CustomerConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerEdgeProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CustomerEdgeProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CustomerProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CustomerProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CustomerConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
