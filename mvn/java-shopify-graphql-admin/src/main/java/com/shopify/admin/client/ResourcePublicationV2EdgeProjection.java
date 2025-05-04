package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationV2EdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationV2EdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublicationV2Edge"));
  }

  public ResourcePublicationV2EdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourcePublicationV2Projection<ResourcePublicationV2EdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ResourcePublicationV2Projection<ResourcePublicationV2EdgeProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2Projection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ResourcePublicationV2EdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
