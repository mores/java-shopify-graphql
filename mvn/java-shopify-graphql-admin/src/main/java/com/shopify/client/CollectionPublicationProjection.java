package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionPublicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionPublicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionPublication"));
  }

  public CollectionPublicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public CollectionProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> collection() {
     CollectionProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> projection = new CollectionProjection<>(this, getRoot());
     getFields().put("collection", projection);
     return projection;
  }

  public PublicationProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> publication() {
     PublicationProjection<CollectionPublicationProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("publication", projection);
     return projection;
  }

  public CollectionPublicationProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public CollectionPublicationProjection<PARENT, ROOT> publishDate() {
    getFields().put("publishDate", null);
    return this;
  }
}
