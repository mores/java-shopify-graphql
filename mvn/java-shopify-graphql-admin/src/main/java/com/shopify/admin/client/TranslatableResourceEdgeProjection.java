package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TranslatableResourceEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TranslatableResourceEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TranslatableResourceEdge"));
  }

  public TranslatableResourceEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TranslatableResourceProjection<TranslatableResourceEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     TranslatableResourceProjection<TranslatableResourceEdgeProjection<PARENT, ROOT>, ROOT> projection = new TranslatableResourceProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public TranslatableResourceEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
