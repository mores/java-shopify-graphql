package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class CardPaymentDetailsFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public CardPaymentDetailsFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CardPaymentDetails"));
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DigitalWalletProjection<CardPaymentDetailsFragmentProjection<PARENT, ROOT>, ROOT> wallet(
      ) {
     DigitalWalletProjection<CardPaymentDetailsFragmentProjection<PARENT, ROOT>, ROOT> projection = new DigitalWalletProjection<>(this, getRoot());
     getFields().put("wallet", projection);
     return projection;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> avsResultCode() {
    getFields().put("avsResultCode", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> bin() {
    getFields().put("bin", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> company() {
    getFields().put("company", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> cvvResultCode() {
    getFields().put("cvvResultCode", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> expirationMonth() {
    getFields().put("expirationMonth", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> expirationYear() {
    getFields().put("expirationYear", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> number() {
    getFields().put("number", null);
    return this;
  }

  public CardPaymentDetailsFragmentProjection<PARENT, ROOT> paymentMethodName() {
    getFields().put("paymentMethodName", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on CardPaymentDetails {");
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
