package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleProjectionRoot() {
    super(null, null, java.util.Optional.of("CompanyContactRole"));
  }

  public CompanyContactRoleProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public CompanyContactRoleProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CompanyContactRoleProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
