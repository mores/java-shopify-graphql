package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyConnection"));
  }

  public CompanyConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyEdgeProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     CompanyEdgeProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CompanyProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CompanyConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
