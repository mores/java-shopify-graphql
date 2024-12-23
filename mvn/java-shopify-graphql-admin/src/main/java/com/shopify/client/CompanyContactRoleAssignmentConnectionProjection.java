package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleAssignmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleAssignmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleAssignmentConnection"));
  }

  public CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleAssignmentEdgeProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CompanyContactRoleAssignmentEdgeProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CompanyContactRoleAssignmentProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CompanyContactRoleAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
