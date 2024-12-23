package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerAccountPageConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerAccountPageConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerAccountPageConnection"));
  }

  public CustomerAccountPageConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerAccountPageEdgeProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CustomerAccountPageEdgeProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CustomerAccountPageProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CustomerAccountPageProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerAccountPageProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CustomerAccountPageConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
