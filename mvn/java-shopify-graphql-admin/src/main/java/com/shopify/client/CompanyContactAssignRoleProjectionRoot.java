package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactAssignRoleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactAssignRoleProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactAssignRolePayload"));
  }

  public CompanyContactAssignRoleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>, CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>> companyContactRoleAssignment(
      ) {
    CompanyContactRoleAssignmentProjection<CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>, CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentProjection<>(this, this);    
    getFields().put("companyContactRoleAssignment", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>, CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>, CompanyContactAssignRoleProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
