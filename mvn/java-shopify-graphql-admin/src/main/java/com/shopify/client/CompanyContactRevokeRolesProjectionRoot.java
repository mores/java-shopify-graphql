package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRevokeRolesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRevokeRolesProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactRevokeRolesPayload"));
  }

  public CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT>, CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT>, CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyContactRevokeRolesProjectionRoot<PARENT, ROOT> revokedRoleAssignmentIds() {
    getFields().put("revokedRoleAssignmentIds", null);
    return this;
  }
}
