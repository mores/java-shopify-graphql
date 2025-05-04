package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslatableResourceConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourceConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslatableResourceConnection"));
  }

  public TranslatableResourceConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceEdgeProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     TranslatableResourceEdgeProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public TranslatableResourceProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     TranslatableResourceProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<TranslatableResourceConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
