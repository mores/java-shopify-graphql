package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppDiscountTypesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppDiscountTypesProjectionRoot() {
    super(null, null, java.util.Optional.of("AppDiscountType"));
  }

  public AppDiscountTypesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public FunctionsAppBridgeProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> appBridge(
      ) {
    FunctionsAppBridgeProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> projection = new FunctionsAppBridgeProjection<>(this, this);    
    getFields().put("appBridge", projection);
    return projection;
  }

  public DiscountClassProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> discountClass(
      ) {
    DiscountClassProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> projection = new DiscountClassProjection<>(this, this);    
    getFields().put("discountClass", projection);
    return projection;
  }

  public DiscountApplicationTargetTypeProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> targetType(
      ) {
    DiscountApplicationTargetTypeProjection<AppDiscountTypesProjectionRoot<PARENT, ROOT>, AppDiscountTypesProjectionRoot<PARENT, ROOT>> projection = new DiscountApplicationTargetTypeProjection<>(this, this);    
    getFields().put("targetType", projection);
    return projection;
  }

  public AppDiscountTypesProjectionRoot<PARENT, ROOT> appKey() {
    getFields().put("appKey", null);
    return this;
  }

  public AppDiscountTypesProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public AppDiscountTypesProjectionRoot<PARENT, ROOT> functionId() {
    getFields().put("functionId", null);
    return this;
  }

  public AppDiscountTypesProjectionRoot<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
