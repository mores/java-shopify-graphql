package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleAssignmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleAssignmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleAssignmentEdge"));
  }

  public CompanyContactRoleAssignmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<CompanyContactRoleAssignmentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CompanyContactRoleAssignmentProjection<CompanyContactRoleAssignmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleAssignmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
