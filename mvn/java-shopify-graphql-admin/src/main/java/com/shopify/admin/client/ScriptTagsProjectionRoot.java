package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ScriptTagsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ScriptTagsProjectionRoot() {
    super(null, null, java.util.Optional.of("ScriptTagConnection"));
  }

  public ScriptTagsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ScriptTagEdgeProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ScriptTagEdgeProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> projection = new ScriptTagEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ScriptTagProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ScriptTagProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> projection = new ScriptTagProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ScriptTagsProjectionRoot<PARENT, ROOT>, ScriptTagsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
