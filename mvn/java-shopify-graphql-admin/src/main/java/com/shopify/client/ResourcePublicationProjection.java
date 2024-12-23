package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublication"));
  }

  public ResourcePublicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public PublicationProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public PublishableProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> publishable() {
     PublishableProjection<ResourcePublicationProjection<PARENT, ROOT>, ROOT> projection = new PublishableProjection<>(this, getRoot());
     getFields().put("publishable", projection);
     return projection;
  }

  public ResourcePublicationProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public ResourcePublicationProjection<PARENT, ROOT> publishDate() {
    getFields().put("publishDate", null);
    return this;
  }
}
