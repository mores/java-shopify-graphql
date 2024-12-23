package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagProjectionRoot() {
    super(null, null, java.util.Optional.of("ScriptTag"));
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagDisplayScopeProjection<ScriptTagProjectionRoot<PARENT, ROOT>, ScriptTagProjectionRoot<PARENT, ROOT>> displayScope(
      ) {
    ScriptTagDisplayScopeProjection<ScriptTagProjectionRoot<PARENT, ROOT>, ScriptTagProjectionRoot<PARENT, ROOT>> projection = new ScriptTagDisplayScopeProjection<>(this, this);    
    getFields().put("displayScope", projection);
    return projection;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> cache() {
    getFields().put("cache", null);
    return this;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ScriptTagProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
