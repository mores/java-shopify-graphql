package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRevokeRoleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRevokeRoleProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactRevokeRolePayload"));
  }

  public CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public BusinessCustomerUserErrorProjection<CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT>, CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    BusinessCustomerUserErrorProjection<CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT>, CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT>> projection = new BusinessCustomerUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public CompanyContactRevokeRoleProjectionRoot<PARENT, ROOT> revokedCompanyContactRoleAssignmentId(
      ) {
    getFields().put("revokedCompanyContactRoleAssignmentId", null);
    return this;
  }
}
