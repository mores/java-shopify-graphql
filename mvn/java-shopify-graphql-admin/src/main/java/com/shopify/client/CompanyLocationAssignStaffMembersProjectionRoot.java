package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationAssignStaffMembersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationAssignStaffMembersProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationAssignStaffMembersPayload"));
  }

  public CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyLocationStaffMemberAssignmentProjection<CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>> companyLocationStaffMemberAssignments(
      ) {
    CompanyLocationStaffMemberAssignmentProjection<CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>> projection = new CompanyLocationStaffMemberAssignmentProjection<>(this, this);    
    getFields().put("companyLocationStaffMemberAssignments", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationAssignStaffMembersProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
