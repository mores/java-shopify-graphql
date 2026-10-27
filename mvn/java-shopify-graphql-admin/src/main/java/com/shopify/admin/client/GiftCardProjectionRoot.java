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

  public GiftCardCrossCurrencyRedemptionStrategyProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> crossCurrencyRedemptionStrategy(
      ) {
    GiftCardCrossCurrencyRedemptionStrategyProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new GiftCardCrossCurrencyRedemptionStrategyProjection<>(this, this);    
    getFields().put("crossCurrencyRedemptionStrategy", projection);
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

  public LineItemProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> lineItem(
      ) {
    LineItemProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new LineItemProjection<>(this, this);    
    getFields().put("lineItem", projection);
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
    InputArgument firstArg = new InputArgument("first", first, false, null);
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after, false, null);
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last, false, null);
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before, false, null);
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse, false, null);
    getInputArguments().get("transactions").add(reverseArg);
    return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> transactionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    GiftCardTransactionConnectionProjection<GiftCardProjectionRoot<PARENT, ROOT>, GiftCardProjectionRoot<PARENT, ROOT>> projection = new GiftCardTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    getInputArguments().computeIfAbsent("transactions", k -> new ArrayList<>());              
    InputArgument firstArg = new InputArgument("first", firstReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transactions").add(firstArg);
    InputArgument afterArg = new InputArgument("after", afterReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transactions").add(afterArg);
    InputArgument lastArg = new InputArgument("last", lastReference, true, new graphql.language.TypeName("Int"));
    getInputArguments().get("transactions").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", beforeReference, true, new graphql.language.TypeName("String"));
    getInputArguments().get("transactions").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverseReference, true, new graphql.language.TypeName("Boolean"));
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

  public GiftCardProjectionRoot<PARENT, ROOT> isRedeemable() {
    getFields().put("isRedeemable", null);
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
