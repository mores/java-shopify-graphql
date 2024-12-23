package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MetaobjectCapabilityDataPublishableProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MetaobjectCapabilityDataPublishableProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MetaobjectCapabilityDataPublishable"));
  }

  public MetaobjectCapabilityDataPublishableProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MetaobjectStatusProjection<MetaobjectCapabilityDataPublishableProjection<PARENT, ROOT>, ROOT> status(
      ) {
     MetaobjectStatusProjection<MetaobjectCapabilityDataPublishableProjection<PARENT, ROOT>, ROOT> projection = new MetaobjectStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }
}
