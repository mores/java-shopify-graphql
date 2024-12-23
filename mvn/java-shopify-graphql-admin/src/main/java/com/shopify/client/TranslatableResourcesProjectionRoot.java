package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslatableResourcesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourcesProjectionRoot() {
    super(null, null, java.util.Optional.of("TranslatableResourceConnection"));
  }

  public TranslatableResourcesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceEdgeProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    TranslatableResourceEdgeProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public TranslatableResourceProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    TranslatableResourceProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> projection = new TranslatableResourceProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<TranslatableResourcesProjectionRoot<PARENT, ROOT>, TranslatableResourcesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
