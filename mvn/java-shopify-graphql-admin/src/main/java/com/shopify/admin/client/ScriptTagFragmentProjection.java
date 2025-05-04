package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ScriptTagFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ScriptTagFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptTag"));
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagDisplayScopeProjection<ScriptTagFragmentProjection<PARENT, ROOT>, ROOT> displayScope(
      ) {
     ScriptTagDisplayScopeProjection<ScriptTagFragmentProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagDisplayScopeProjection<>(this, getRoot());
     getFields().put("displayScope", projection);
     return projection;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> cache() {
    getFields().put("cache", null);
    return this;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> src() {
    getFields().put("src", null);
    return this;
  }

  public ScriptTagFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ScriptTag {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
