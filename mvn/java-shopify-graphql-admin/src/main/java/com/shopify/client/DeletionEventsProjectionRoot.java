package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class DeletionEventsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public DeletionEventsProjectionRoot() {
    super(null, null, java.util.Optional.of("DeletionEventConnection"));
  }

  public DeletionEventsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DeletionEventEdgeProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    DeletionEventEdgeProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> projection = new DeletionEventEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public DeletionEventProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    DeletionEventProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> projection = new DeletionEventProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<DeletionEventsProjectionRoot<PARENT, ROOT>, DeletionEventsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
