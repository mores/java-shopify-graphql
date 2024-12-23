package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CompanyContactRoleEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CompanyContactRoleEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CompanyContactRoleEdge"));
  }

  public CompanyContactRoleEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CompanyContactRoleProjection<CompanyContactRoleEdgeProjection<PARENT, ROOT>, ROOT> node() {
     CompanyContactRoleProjection<CompanyContactRoleEdgeProjection<PARENT, ROOT>, ROOT> projection = new CompanyContactRoleProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CompanyContactRoleEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
