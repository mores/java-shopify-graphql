package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("EventConnection"));
  }

  public EventConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventEdgeProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     EventEdgeProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> projection = new EventEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public EventProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     EventProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> projection = new EventProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<EventConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
