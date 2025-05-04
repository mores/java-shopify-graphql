package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.admin.types.TransactionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class StoreCreditAccountProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public StoreCreditAccountProjectionRoot() {
    super(null, null, java.util.Optional.of("StoreCreditAccount"));
  }

  public StoreCreditAccountProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> balance(
      ) {
    MoneyV2Projection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("balance", projection);
    return projection;
  }

  public HasStoreCreditAccountsProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> owner(
      ) {
    HasStoreCreditAccountsProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> projection = new HasStoreCreditAccountsProjection<>(this, this);    
    getFields().put("owner", projection);
    return projection;
  }

  public StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> transactions(
      ) {
    StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountTransactionConnectionProjection<>(this, this);    
    getFields().put("transactions", projection);
    return projection;
  }

  public StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> transactions(
      Integer first, String after, Integer last, String before, Boolean reverse,
      TransactionSortKeys sortKey, String query) {
    StoreCreditAccountTransactionConnectionProjection<StoreCreditAccountProjectionRoot<PARENT, ROOT>, StoreCreditAccountProjectionRoot<PARENT, ROOT>> projection = new StoreCreditAccountTransactionConnectionProjection<>(this, this);    
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

  public StoreCreditAccountProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }
}
