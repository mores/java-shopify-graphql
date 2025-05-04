package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationStaffMemberAssignmentConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationStaffMemberAssignmentConnection"));
  }

  public CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationStaffMemberAssignmentEdgeProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CompanyLocationStaffMemberAssignmentEdgeProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationStaffMemberAssignmentEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CompanyLocationStaffMemberAssignmentProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationStaffMemberAssignmentProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CompanyLocationStaffMemberAssignmentConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
