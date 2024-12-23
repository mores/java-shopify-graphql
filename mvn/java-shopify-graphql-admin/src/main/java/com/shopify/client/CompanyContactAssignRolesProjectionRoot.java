package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactAssignRolesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactAssignRolesProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactAssignRolesPayload"));
  }

  public CompanyContactAssignRolesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>, CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>> roleAssignments(
      ) {
    CompanyContactRoleAssignmentProjection<CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>, CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>, CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>, CompanyContactAssignRolesProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
