package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationConnection"));
  }

  public CompanyLocationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationEdgeProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CompanyLocationEdgeProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyLocationProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CompanyLocationProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CompanyLocationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
