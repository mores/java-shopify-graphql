package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagDisplayScopeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagDisplayScopeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptTagDisplayScope"));
  }

  public ScriptTagDisplayScopeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
