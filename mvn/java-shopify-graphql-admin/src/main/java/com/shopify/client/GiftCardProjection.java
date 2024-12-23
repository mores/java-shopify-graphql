package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class GiftCardProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCard"));
  }

  public GiftCardProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public CustomerProjection<GiftCardProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> initialValue() {
     MoneyV2Projection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("initialValue", projection);
     return projection;
  }

  public OrderProjection<GiftCardProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public GiftCardRecipientProjection<GiftCardProjection<PARENT, ROOT>, ROOT> recipientAttributes() {
     GiftCardRecipientProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new GiftCardRecipientProjection<>(this, getRoot());
     getFields().put("recipientAttributes", projection);
     return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     GiftCardTransactionConnectionProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    GiftCardTransactionConnectionProjection<GiftCardProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionConnectionProjection<>(this, getRoot());    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public GiftCardProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> deactivatedAt() {
    getFields().put("deactivatedAt", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> expiresOn() {
    getFields().put("expiresOn", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> maskedCode() {
    getFields().put("maskedCode", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public GiftCardProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
