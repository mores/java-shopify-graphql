package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.TransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;

public class StoreCreditAccountFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public StoreCreditAccountFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("StoreCreditAccount"));
  }

  public StoreCreditAccountFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> balance() {
     MoneyV2Projection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("balance", projection);
     return projection;
  }

  public HasStoreCreditAccountsProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> owner(
      ) {
     HasStoreCreditAccountsProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new HasStoreCreditAccountsProjection<>(this, getRoot());
     getFields().put("owner", projection);
     return projection;
  }

  public StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionConnectionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      TransactionSortKeys sortKey, String query) {
    StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountFragmentProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountTransactionConnectionProjection<>(this, getRoot());    
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
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("transactions").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("transactions").add(queryArg);
    return projection;
  }

  public StoreCreditAccountFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on StoreCreditAccount {");
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
