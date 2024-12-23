package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerVisitProductInfoEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerVisitProductInfoEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerVisitProductInfoEdge"));
  }

  public CustomerVisitProductInfoEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerVisitProductInfoProjection<CustomerVisitProductInfoEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CustomerVisitProductInfoProjection<CustomerVisitProductInfoEdgeProjection<PARENT, ROOT>, ROOT> projection = new CustomerVisitProductInfoProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CustomerVisitProductInfoEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
