package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("AppDiscountType"));
  }

  public AppDiscountTypeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public FunctionsAppBridgeProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> appBridge() {
     FunctionsAppBridgeProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> projection = new FunctionsAppBridgeProjection<>(this, getRoot());
     getFields().put("appBridge", projection);
     return projection;
  }

  public DiscountClassProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> discountClass() {
     DiscountClassProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClass", projection);
     return projection;
  }

  public DiscountClassProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> discountClasses() {
     DiscountClassProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> projection = new DiscountClassProjection<>(this, getRoot());
     getFields().put("discountClasses", projection);
     return projection;
  }

  public DiscountApplicationTargetTypeProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> targetType(
      ) {
     DiscountApplicationTargetTypeProjection<AppDiscountTypeProjection<PARENT, ROOT>, ROOT> projection = new DiscountApplicationTargetTypeProjection<>(this, getRoot());
     getFields().put("targetType", projection);
     return projection;
  }

  public AppDiscountTypeProjection<PARENT, ROOT> appKey() {
    getFields().put("appKey", null);
    return this;
  }

  public AppDiscountTypeProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppDiscountTypeProjection<PARENT, ROOT> functionId() {
    getFields().put("functionId", null);
    return this;
  }

  public AppDiscountTypeProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
