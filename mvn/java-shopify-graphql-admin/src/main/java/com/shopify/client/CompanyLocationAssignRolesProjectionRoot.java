package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationAssignRolesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationAssignRolesProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationAssignRolesPayload"));
  }

  public CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>, CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>> roleAssignments(
      ) {
    CompanyContactRoleAssignmentProjection<CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>, CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>> projection = new CompanyContactRoleAssignmentProjection<>(this, this);    
    getFields().put("roleAssignments", projection);
    return projection;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>, CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>, CompanyLocationAssignRolesProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
