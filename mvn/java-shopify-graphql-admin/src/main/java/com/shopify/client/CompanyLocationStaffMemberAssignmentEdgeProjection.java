package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationStaffMemberAssignmentEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationStaffMemberAssignmentEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationStaffMemberAssignmentEdge"));
  }

  public CompanyLocationStaffMemberAssignmentEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationStaffMemberAssignmentProjection<CompanyLocationStaffMemberAssignmentEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CompanyLocationStaffMemberAssignmentProjection<CompanyLocationStaffMemberAssignmentEdgeProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationStaffMemberAssignmentProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
