package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class HasStoreCreditAccountsProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public HasStoreCreditAccountsProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("HasStoreCreditAccounts"));
  }

  public HasStoreCreditAccountsProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public StoreCreditAccountConnectionProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      ) {
     StoreCreditAccountConnectionProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());
     getFields().put("storeCreditAccounts", projection);
     return projection;
  }

  public StoreCreditAccountConnectionProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> storeCreditAccounts(
      Integer first, String after, Integer last, String before, String query) {
    StoreCreditAccountConnectionProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> projection = new StoreCreditAccountConnectionProjection<>(this, getRoot());    
    getFields().put("storeCreditAccounts", projection);
    getInputArguments().computeIfAbsent("storeCreditAccounts", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("storeCreditAccounts").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("storeCreditAccounts").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("storeCreditAccounts").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("storeCreditAccounts").add(beforeArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("storeCreditAccounts").add(queryArg);
    return projection;
  }

  public CustomerFragmentProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> onCustomer(
      ) {
    CustomerFragmentProjection<HasStoreCreditAccountsProjection<PARENT, ROOT>, ROOT> fragment = new CustomerFragmentProjection<>(this, getRoot());
    getFragments().add(fragment);
    return fragment;
  }
}
