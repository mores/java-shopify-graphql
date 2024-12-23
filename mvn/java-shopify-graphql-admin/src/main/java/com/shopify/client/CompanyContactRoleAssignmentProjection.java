package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleAssignmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleAssignmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleAssignment"));
  }

  public CompanyContactRoleAssignmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> company() {
     CompanyProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyContactProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> companyContact(
      ) {
     CompanyContactProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContact", projection);
     return projection;
  }

  public CompanyLocationProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> companyLocation(
      ) {
     CompanyLocationProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public CompanyContactRoleProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> role(
      ) {
     CompanyContactRoleProjection<CompanyContactRoleAssignmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("role", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactRoleAssignmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
