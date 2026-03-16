package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ShopPayPaymentRequestContactFieldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ShopPayPaymentRequestContactFieldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopPayPaymentRequestContactField"));
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> address1() {
    getFields().put("address1", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> address2() {
    getFields().put("address2", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> city() {
    getFields().put("city", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> companyName() {
    getFields().put("companyName", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> countryCode() {
    getFields().put("countryCode", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> email() {
    getFields().put("email", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> firstName() {
    getFields().put("firstName", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> lastName() {
    getFields().put("lastName", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> phone() {
    getFields().put("phone", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> postalCode() {
    getFields().put("postalCode", null);
    return this;
  }

  public ShopPayPaymentRequestContactFieldProjection<PARENT, ROOT> provinceCode() {
    getFields().put("provinceCode", null);
    return this;
  }
}
