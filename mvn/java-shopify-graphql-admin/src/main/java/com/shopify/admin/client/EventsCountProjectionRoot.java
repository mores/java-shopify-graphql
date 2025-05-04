package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class EventsCountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public EventsCountProjectionRoot() {
    super(null, null, java.util.Optional.of("Count"));
  }

  public EventsCountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountPrecisionProjection<EventsCountProjectionRoot<PARENT, ROOT>, EventsCountProjectionRoot<PARENT, ROOT>> precision(
      ) {
    CountPrecisionProjection<EventsCountProjectionRoot<PARENT, ROOT>, EventsCountProjectionRoot<PARENT, ROOT>> projection = new CountPrecisionProjection<>(this, this);    
    getFields().put("precision", projection);
    return projection;
  }

  public EventsCountProjectionRoot<PARENT, ROOT> count() {
    getFields().put("count", null);
    return this;
  }
}
