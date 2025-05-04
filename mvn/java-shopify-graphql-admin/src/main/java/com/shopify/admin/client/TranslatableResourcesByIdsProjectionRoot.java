package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslatableResourcesByIdsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourcesByIdsProjectionRoot() {
    super(null, null, java.util.Optional.of("TranslatableResourceConnection"));
  }

  public TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceEdgeProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    TranslatableResourceEdgeProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public TranslatableResourceProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    TranslatableResourceProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>, TranslatableResourcesByIdsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
