package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SitemapResourceFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SitemapResourceFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SitemapResource"));
  }

  public SitemapResourceFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SitemapImageProjection<SitemapResourceFragmentProjection<PARENT, ROOT>, ROOT> image() {
     SitemapImageProjection<SitemapResourceFragmentProjection<PARENT, ROOT>, ROOT> projection = new SitemapImageProjection<>(this, getRoot());
     getFields().put("image", projection);
     return projection;
  }

  public SitemapResourceFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public SitemapResourceFragmentProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }

  public SitemapResourceFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SitemapResource {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
