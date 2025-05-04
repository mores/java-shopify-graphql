package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ProductFeedProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ProductFeedProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ProductFeed"));
  }

  public ProductFeedProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CountryCodeProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> country() {
     CountryCodeProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> projection = new CountryCodeProjection<>(this, getRoot());
     getFields().put("country", projection);
     return projection;
  }

  public LanguageCodeProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> language() {
     LanguageCodeProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> projection = new LanguageCodeProjection<>(this, getRoot());
     getFields().put("language", projection);
     return projection;
  }

  public ProductFeedStatusProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> status() {
     ProductFeedStatusProjection<ProductFeedProjection<PARENT, ROOT>, ROOT> projection = new ProductFeedStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ProductFeedProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
