package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationEdge"));
  }

  public CompanyLocationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CompanyLocationProjection<CompanyLocationEdgeProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CompanyLocationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
