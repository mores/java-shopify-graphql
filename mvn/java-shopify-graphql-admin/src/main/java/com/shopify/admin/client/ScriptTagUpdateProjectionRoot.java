package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("ScriptTagUpdatePayload"));
  }

  public ScriptTagUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagProjection<ScriptTagUpdateProjectionRoot<PARENT, ROOT>, ScriptTagUpdateProjectionRoot<PARENT, ROOT>> scriptTag(
      ) {
    ScriptTagProjection<ScriptTagUpdateProjectionRoot<PARENT, ROOT>, ScriptTagUpdateProjectionRoot<PARENT, ROOT>> projection = new ScriptTagProjection<>(this, this);    
    getFields().put("scriptTag", projection);
    return projection;
  }

  public UserErrorProjection<ScriptTagUpdateProjectionRoot<PARENT, ROOT>, ScriptTagUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<ScriptTagUpdateProjectionRoot<PARENT, ROOT>, ScriptTagUpdateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
