package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptTag"));
  }

  public ScriptTagProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagDisplayScopeProjection<ScriptTagProjection<PARENT, ROOT>, ROOT> displayScope() {
     ScriptTagDisplayScopeProjection<ScriptTagProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagDisplayScopeProjection<>(this, getRoot());
     getFields().put("displayScope", projection);
     return projection;
  }

  public ScriptTagProjection<PARENT, ROOT> cache() {
    getFields().put("cache", null);
    return this;
  }

  public ScriptTagProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ScriptTagProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ScriptTagProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ScriptTagProjection<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ScriptTagProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
