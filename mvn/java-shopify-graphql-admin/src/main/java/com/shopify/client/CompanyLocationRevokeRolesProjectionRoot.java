package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyLocationRevokeRolesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyLocationRevokeRolesProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyLocationRevokeRolesPayload"));
  }

  public CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT>, CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyLocationRevokeRolesProjectionRoot<PARENT, ROOT> revokedRoleAssignmentIds() {
    getFields().put("revokedRoleAssignmentIds", null);
    return this;
  }
}
