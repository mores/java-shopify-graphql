package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationStaffMemberAssignmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationStaffMemberAssignmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationStaffMemberAssignment"));
  }

  public CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT>, ROOT> companyLocation(
      ) {
     CompanyLocationProjection<CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public StaffMemberProjection<CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
