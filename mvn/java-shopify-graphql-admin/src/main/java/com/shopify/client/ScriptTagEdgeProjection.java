package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ScriptTagEdge"));
  }

  public ScriptTagEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagProjection<ScriptTagEdgeProjection<PARENT, ROOT>, ROOT> node() {
     ScriptTagProjection<ScriptTagEdgeProjection<PARENT, ROOT>, ROOT> projection = new ScriptTagProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ScriptTagEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
