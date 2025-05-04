package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventsProjectionRoot() {
    super(null, null, java.util.Optional.of("EventConnection"));
  }

  public EventsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public EventEdgeProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    EventEdgeProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> projection = new EventEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public EventProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    EventProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> projection = new EventProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<EventsProjectionRoot<PARENT, ROOT>, EventsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
