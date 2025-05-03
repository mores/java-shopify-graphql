package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("UserErrorsShopPayPaymentRequestSessionUserErrors"));
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsCodeProjection<UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT, ROOT>, ROOT> code(
      ) {
     UserErrorsShopPayPaymentRequestSessionUserErrorsCodeProjection<UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT, ROOT>, ROOT> projection = new UserErrorsShopPayPaymentRequestSessionUserErrorsCodeProjection<>(this, getRoot());
     getFields().put("code", projection);
     return projection;
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT, ROOT> field() {
    getFields().put("field", null);
    return this;
  }

  public UserErrorsShopPayPaymentRequestSessionUserErrorsProjection<PARENT, ROOT> message() {
    getFields().put("message", null);
    return this;
  }
}
