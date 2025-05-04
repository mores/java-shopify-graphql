package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AccessScopeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AccessScopeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AccessScope"));
  }

  public AccessScopeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AccessScopeProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AccessScopeProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }
}
