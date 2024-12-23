package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CurrencyFormatsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CurrencyFormatsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CurrencyFormats"));
  }

  public CurrencyFormatsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CurrencyFormatsProjection<PARENT, ROOT> moneyFormat() {
    getFields().put("moneyFormat", null);
    return this;
  }

  public CurrencyFormatsProjection<PARENT, ROOT> moneyInEmailsFormat() {
    getFields().put("moneyInEmailsFormat", null);
    return this;
  }

  public CurrencyFormatsProjection<PARENT, ROOT> moneyWithCurrencyFormat() {
    getFields().put("moneyWithCurrencyFormat", null);
    return this;
  }

  public CurrencyFormatsProjection<PARENT, ROOT> moneyWithCurrencyInEmailsFormat() {
    getFields().put("moneyWithCurrencyInEmailsFormat", null);
    return this;
  }
}
