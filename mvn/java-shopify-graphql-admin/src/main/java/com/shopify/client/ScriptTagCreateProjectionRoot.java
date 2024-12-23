package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("ScriptTagCreatePayload"));
  }

  public ScriptTagCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagProjection<ScriptTagCreateProjectionRoot<PARENT, ROOT>, ScriptTagCreateProjectionRoot<PARENT, ROOT>> scriptTag(
      ) {
    ScriptTagProjection<ScriptTagCreateProjectionRoot<PARENT, ROOT>, ScriptTagCreateProjectionRoot<PARENT, ROOT>> projection = new ScriptTagProjection<>(this, this);    
    getFields().put("scriptTag", projection);
    return projection;
  }

  public UserErrorProjection<ScriptTagCreateProjectionRoot<PARENT, ROOT>, ScriptTagCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ScriptTagCreateProjectionRoot<PARENT, ROOT>, ScriptTagCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
