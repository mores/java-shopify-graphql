package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestReceiptsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestReceiptsProjectionRoot() {
    super(null, null, java.util.Optional.of("ShopPayPaymentRequestReceiptConnection"));
  }

  public ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestReceiptEdgeProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ShopPayPaymentRequestReceiptEdgeProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestReceiptEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ShopPayPaymentRequestReceiptProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> projection = new ShopPayPaymentRequestReceiptProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>, ShopPayPaymentRequestReceiptsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
