package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypeProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypeProjectionRoot() {
    super(null, null, java.util.Optional.of("AppDiscountType"));
  }

  public AppDiscountTypeProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public FunctionsAppBridgeProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> appBridge(
      ) {
    FunctionsAppBridgeProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> projection = new FunctionsAppBridgeProjection<>(this, this);    
    getFields().put("appBridge", projection);
    return projection;
  }

  public DiscountClassProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> discountClass(
      ) {
    DiscountClassProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> projection = new DiscountClassProjection<>(this, this);    
    getFields().put("discountClass", projection);
    return projection;
  }

  public DiscountClassProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> discountClasses(
      ) {
    DiscountClassProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> projection = new DiscountClassProjection<>(this, this);    
    getFields().put("discountClasses", projection);
    return projection;
  }

  public DiscountApplicationTargetTypeProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> targetType(
      ) {
    DiscountApplicationTargetTypeProjection<AppDiscountTypeProjectionRoot<PARENT, ROOT>, AppDiscountTypeProjectionRoot<PARENT, ROOT>> projection = new DiscountApplicationTargetTypeProjection<>(this, this);    
    getFields().put("targetType", projection);
    return projection;
  }

  public AppDiscountTypeProjectionRoot<PARENT, ROOT> appKey() {
    getFields().put("appKey", null);
    return this;
  }

  public AppDiscountTypeProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppDiscountTypeProjectionRoot<PARENT, ROOT> functionId() {
    getFields().put("functionId", null);
    return this;
  }

  public AppDiscountTypeProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
