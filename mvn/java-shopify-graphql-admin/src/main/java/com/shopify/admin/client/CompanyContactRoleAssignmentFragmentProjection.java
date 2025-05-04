package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CompanyContactRoleAssignmentFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CompanyContactRoleAssignmentFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleAssignment"));
  }

  public CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> company(
      ) {
     CompanyProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyProjection<>(this, getRoot());
     getFields().put("company", projection);
     return projection;
  }

  public CompanyContactProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> companyContact(
      ) {
     CompanyContactProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactProjection<>(this, getRoot());
     getFields().put("companyContact", projection);
     return projection;
  }

  public CompanyLocationProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> companyLocation(
      ) {
     CompanyLocationProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyLocationProjection<>(this, getRoot());
     getFields().put("companyLocation", projection);
     return projection;
  }

  public CompanyContactRoleProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> role(
      ) {
     CompanyContactRoleProjection<CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("role", projection);
     return projection;
  }

  public CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactRoleAssignmentFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CompanyContactRoleAssignment {");
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
