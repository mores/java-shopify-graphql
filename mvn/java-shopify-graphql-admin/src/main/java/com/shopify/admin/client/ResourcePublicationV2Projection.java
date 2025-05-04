package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublicationV2"));
  }

  public ResourcePublicationV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationProjection<ResourcePublicationV2Projection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<ResourcePublicationV2Projection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public PublishableProjection<ResourcePublicationV2Projection<PARENT, ROOT>, ROOT> publishable() {
     PublishableProjection<ResourcePublicationV2Projection<PARENT, ROOT>, ROOT> projection = new PublishableProjection<>(this, getRoot());
     getFields().put("publishable", projection);
     return projection;
  }

  public ResourcePublicationV2Projection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public ResourcePublicationV2Projection<PARENT, ROOT> publishDate() {
    getFields().put("publishDate", null);
    return this;
  }
}
