package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("EventEdge"));
  }

  public EventEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventProjection<EventEdgeProjection<PARENT, ROOT>, ROOT> node() {
     EventProjection<EventEdgeProjection<PARENT, ROOT>, ROOT> projection = new EventProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public EventEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
