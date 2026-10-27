package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class GiftCardFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public GiftCardFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCard"));
  }

  public GiftCardFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public GiftCardCrossCurrencyRedemptionStrategyProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> crossCurrencyRedemptionStrategy(
      ) {
     GiftCardCrossCurrencyRedemptionStrategyProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardCrossCurrencyRedemptionStrategyProjection<>(this, getRoot());
     getFields().put("crossCurrencyRedemptionStrategy", projection);
     return projection;
  }

  public CustomerProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> customer() {
     CustomerProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new CustomerProjection<>(this, getRoot());
     getFields().put("customer", projection);
     return projection;
  }

  public MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> initialValue() {
     MoneyV2Projection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("initialValue", projection);
     return projection;
  }

  public LineItemProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> lineItem() {
     LineItemProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new LineItemProjection<>(this, getRoot());
     getFields().put("lineItem", projection);
     return projection;
  }

  public OrderProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public GiftCardRecipientProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> recipientAttributes(
      ) {
     GiftCardRecipientProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardRecipientProjection<>(this, getRoot());
     getFields().put("recipientAttributes", projection);
     return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse) {
    GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionConnectionProjection<>(this, getRoot());    
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

  public GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> transactionsWithVariableReferences(
      String firstReference, String afterReference, String lastReference, String beforeReference,
      String reverseReference) {
    GiftCardTransactionConnectionProjection<GiftCardFragmentProjection<PARENT, ROOT>, ROOT> projection = new GiftCardTransactionConnectionProjection<>(this, getRoot());    
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

  public GiftCardFragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> deactivatedAt() {
    getFields().put("deactivatedAt", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> enabled() {
    getFields().put("enabled", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> expiresOn() {
    getFields().put("expiresOn", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> isRedeemable() {
    getFields().put("isRedeemable", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> lastCharacters() {
    getFields().put("lastCharacters", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> maskedCode() {
    getFields().put("maskedCode", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> templateSuffix() {
    getFields().put("templateSuffix", null);
    return this;
  }

  public GiftCardFragmentProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on GiftCard {");
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
