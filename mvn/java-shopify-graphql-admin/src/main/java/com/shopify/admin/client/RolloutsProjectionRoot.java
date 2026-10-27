package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class RolloutsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public RolloutsProjectionRoot() {
    super(null, null, java.util.Optional.of("RolloutConnection"));
  }

  public RolloutsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public RolloutEdgeProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    RolloutEdgeProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> projection = new RolloutEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public RolloutProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    RolloutProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> projection = new RolloutProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<RolloutsProjectionRoot<PARENT, ROOT>, RolloutsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
