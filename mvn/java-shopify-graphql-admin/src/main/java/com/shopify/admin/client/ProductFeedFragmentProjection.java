package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ProductFeedFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ProductFeedFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFeed"));
  }

  public ProductFeedFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> country() {
     CountryCodeProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public LanguageCodeProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> language() {
     LanguageCodeProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> projection = new LanguageCodeProjection<>(this, getRoot());
     getFields().put("language", projection);
     return projection;
  }

  public ProductFeedStatusProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> status() {
     ProductFeedStatusProjection<ProductFeedFragmentProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductFeedFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ProductFeed {");
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
