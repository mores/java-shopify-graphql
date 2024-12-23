package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRole"));
  }

  public CompanyContactRoleProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactRoleProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyContactRoleProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
