package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagDeleteProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagDeleteProjectionRoot() {
    super(null, null, java.util.Optional.of("ScriptTagDeletePayload"));
  }

  public ScriptTagDeleteProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorProjection<ScriptTagDeleteProjectionRoot<PARENT, ROOT>, ScriptTagDeleteProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ScriptTagDeleteProjectionRoot<PARENT, ROOT>, ScriptTagDeleteProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public ScriptTagDeleteProjectionRoot<PARENT, ROOT> deletedScriptTagId() {
    getFields().put("deletedScriptTagId", null);
    return this;
  }
}
