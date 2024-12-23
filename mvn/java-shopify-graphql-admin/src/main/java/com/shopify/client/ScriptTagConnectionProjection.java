package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptTagConnection"));
  }

  public ScriptTagConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagEdgeProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     ScriptTagEdgeProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ScriptTagProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     ScriptTagProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<ScriptTagConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
