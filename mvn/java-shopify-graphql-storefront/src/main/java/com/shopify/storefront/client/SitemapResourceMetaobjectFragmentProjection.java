package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SitemapResourceMetaobjectFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SitemapResourceMetaobjectFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SitemapResourceMetaobject"));
  }

  public SitemapResourceMetaobjectFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SitemapResourceMetaobjectFragmentProjection<PARENT, ROOT> handle() {
    getFields().put("handle", null);
    return this;
  }

  public SitemapResourceMetaobjectFragmentProjection<PARENT, ROOT> onlineStoreUrlHandle() {
    getFields().put("onlineStoreUrlHandle", null);
    return this;
  }

  public SitemapResourceMetaobjectFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  public SitemapResourceMetaobjectFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SitemapResourceMetaobject {");
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
