package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleConnection"));
  }

  public CompanyContactRoleConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleEdgeProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CompanyContactRoleEdgeProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyContactRoleProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CompanyContactRoleProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<CompanyContactRoleConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
