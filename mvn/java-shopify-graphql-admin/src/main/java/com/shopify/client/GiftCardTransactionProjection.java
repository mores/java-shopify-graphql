package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class GiftCardTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("GiftCardTransaction"));
  }

  public GiftCardTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public GiftCardProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> giftCard() {
     GiftCardProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new GiftCardProjection<>(this, getRoot());
     getFields().put("giftCard", projection);
     return projection;
  }

  public MetafieldProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> metafield() {
     MetafieldProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());
     getFields().put("metafield", projection);
     return projection;
  }

  public MetafieldProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> metafield(
      String namespace, String key) {
    MetafieldProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldProjection<>(this, getRoot());    
    getFields().put("metafield", projection);
    getInputArguments().computeIfAbsent("metafield", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafield").add(namespaceArg);
    InputArgument keyArg = new InputArgument("key", key);
    getInputArguments().get("metafield").add(keyArg);
    return projection;
  }

  public MetafieldConnectionProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> metafields(
      ) {
     MetafieldConnectionProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());
     getFields().put("metafields", projection);
     return projection;
  }

  public MetafieldConnectionProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> metafields(
      String namespace, List<String> keys, Integer first, String after, Integer last, String before,
      Boolean reverse) {
    MetafieldConnectionProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> projection = new MetafieldConnectionProjection<>(this, getRoot());    
    getFields().put("metafields", projection);
    getInputArguments().computeIfAbsent("metafields", k -> new ArrayList<>());                      
    InputArgument namespaceArg = new InputArgument("namespace", namespace);
    getInputArguments().get("metafields").add(namespaceArg);
    InputArgument keysArg = new InputArgument("keys", keys);
    getInputArguments().get("metafields").add(keysArg);
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("metafields").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("metafields").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("metafields").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("metafields").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("metafields").add(reverseArg);
    return projection;
  }

  public GiftCardTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public GiftCardTransactionProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  public GiftCardTransactionProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public GiftCardCreditTransactionFragmentProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> onGiftCardCreditTransaction(
      ) {
    GiftCardCreditTransactionFragmentProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardCreditTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }

  public GiftCardDebitTransactionFragmentProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> onGiftCardDebitTransaction(
      ) {
    GiftCardDebitTransactionFragmentProjection<GiftCardTransactionProjection<PARENT, ROOT>, ROOT> fragment = new GiftCardDebitTransactionFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
