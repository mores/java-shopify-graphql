package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPurchaseOneTimeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPurchaseOneTimeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppPurchaseOneTime"));
  }

  public AppPurchaseOneTimeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<AppPurchaseOneTimeProjection<PARENT, ROOT>, ROOT> price() {
     MoneyV2Projection<AppPurchaseOneTimeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("price", projection);
     return projection;
  }

  public AppPurchaseStatusProjection<AppPurchaseOneTimeProjection<PARENT, ROOT>, ROOT> status() {
     AppPurchaseStatusProjection<AppPurchaseOneTimeProjection<PARENT, ROOT>, ROOT> projection = new AppPurchaseStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public AppPurchaseOneTimeProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public AppPurchaseOneTimeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public AppPurchaseOneTimeProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public AppPurchaseOneTimeProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }
}
