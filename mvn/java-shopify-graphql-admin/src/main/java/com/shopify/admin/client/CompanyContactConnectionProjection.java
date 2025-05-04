package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactConnection"));
  }

  public CompanyContactConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactEdgeProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CompanyContactEdgeProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyContactProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     CompanyContactProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CompanyContactConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
