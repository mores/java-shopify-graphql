package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class GiftCardProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCard"));
  }

  public GiftCardProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> balance(
      ) {
    MoneyV2Projection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("balance", projection);
    return projection;
  }

  public CustomerProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> customer(
      ) {
    CustomerProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new CustomerProjection<>(this, this);    
    getFields().put("customer", projection);
    return projection;
  }

  public MoneyV2Projection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> initialValue(
      ) {
    MoneyV2Projection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("initialValue", projection);
    return projection;
  }

  public OrderProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> order(
      ) {
    OrderProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new OrderProjection<>(this, this);    
    getFields().put("order", projection);
    return projection;
  }

  public GiftCardRecipientProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> recipientAttributes(
      ) {
    GiftCardRecipientProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new GiftCardRecipientProjection<>(this, this);    
    getFields().put("recipientAttributes", projection);
    return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new GiftCardTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new GiftCardTransactionConnectionProjection<>(this, this);    
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

  public GiftCardProjectionRoot<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> deactivatedAt() {
    getFields().put("deactivatedAt", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> expiresOn() {
    getFields().put("expiresOn", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> maskedCode() {
    getFields().put("maskedCode", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public GiftCardProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
