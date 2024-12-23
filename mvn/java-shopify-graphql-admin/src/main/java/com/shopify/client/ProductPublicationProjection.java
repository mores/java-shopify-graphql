package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductPublicationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductPublicationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductPublication"));
  }

  public ProductPublicationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ChannelProjection<ProductPublicationProjection<PARENT, ROOT>, ROOT> channel() {
     ChannelProjection<ProductPublicationProjection<PARENT, ROOT>, ROOT> projection = new ChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public ProductProjection<ProductPublicationProjection<PARENT, ROOT>, ROOT> product() {
     ProductProjection<ProductPublicationProjection<PARENT, ROOT>, ROOT> projection = new ProductProjection<>(this, getRoot());
     getFields().put("product", projection);
     return projection;
  }

  public ProductPublicationProjection<PARENT, ROOT> isPublished() {
    getFields().put("isPublished", null);
    return this;
  }

  public ProductPublicationProjection<PARENT, ROOT> publishDate() {
    getFields().put("publishDate", null);
    return this;
  }
}
