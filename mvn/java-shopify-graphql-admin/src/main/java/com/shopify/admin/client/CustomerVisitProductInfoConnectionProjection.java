package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerVisitProductInfoConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerVisitProductInfoConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerVisitProductInfoConnection"));
  }

  public CustomerVisitProductInfoConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerVisitProductInfoEdgeProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CustomerVisitProductInfoEdgeProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CustomerVisitProductInfoProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CustomerVisitProductInfoProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CustomerVisitProductInfoConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
