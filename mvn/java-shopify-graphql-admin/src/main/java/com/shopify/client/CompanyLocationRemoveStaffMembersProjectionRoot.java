package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationRemoveStaffMembersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationRemoveStaffMembersProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationRemoveStaffMembersPayload"));
  }

  public CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT>, CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyLocationRemoveStaffMembersProjectionRoot<PARENT, ROOT> deletedCompanyLocationStaffMemberAssignmentIds(
      ) {
    getFields().put("deletedCompanyLocationStaffMemberAssignmentIds", null);
    return this;
  }
}
