package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppPurchaseOneTimeCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppPurchaseOneTimeCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("AppPurchaseOneTimeCreatePayload"));
  }

  public AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppPurchaseOneTimeProjection<AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>, AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>> appPurchaseOneTime(
      ) {
    AppPurchaseOneTimeProjection<AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>, AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>> projection = new AppPurchaseOneTimeProjection<>(this, this);    
    getFields().put("appPurchaseOneTime", projection);
    return projection;
  }

  public UserErrorProjection<AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>, AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>, AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public AppPurchaseOneTimeCreateProjectionRoot<PARENT, ROOT> confirmationUrl() {
    getFields().put("confirmationUrl", null);
    return this;
  }
}
