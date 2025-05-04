package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyLocationStaffMemberAssignment"));
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationProjection<CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT>, ROOT> companyLocation(
      ) {
     CompanyLocationProjection<CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public StaffMemberProjection<CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT>, ROOT> staffMember(
      ) {
     StaffMemberProjection<CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public CompanyLocationStaffMemberAssignmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CompanyLocationStaffMemberAssignment {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
