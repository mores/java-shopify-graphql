package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import com.shopify.types.CustomerSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;

public class PriceRuleCustomerSelectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceRuleCustomerSelectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PriceRuleCustomerSelection"));
  }

  public PriceRuleCustomerSelectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CustomerConnectionProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> customers(
      ) {
     CustomerConnectionProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());
     getFields().put("customers", projection);
     return projection;
  }

  public CustomerConnectionProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> customers(
      Integer first, String after, Integer last, String before, Boolean reverse,
      CustomerSortKeys sortKey, String query, String savedSearchId) {
    CustomerConnectionProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> projection = new CustomerConnectionProjection<>(this, getRoot());    
    getFields().put("customers", projection);
    getInputArguments().computeIfAbsent("customers", k -> new ArrayList<>());                      
    InputArgument firstArg = new InputArgument("first", first);
    getInputArguments().get("customers").add(firstArg);
    InputArgument afterArg = new InputArgument("after", after);
    getInputArguments().get("customers").add(afterArg);
    InputArgument lastArg = new InputArgument("last", last);
    getInputArguments().get("customers").add(lastArg);
    InputArgument beforeArg = new InputArgument("before", before);
    getInputArguments().get("customers").add(beforeArg);
    InputArgument reverseArg = new InputArgument("reverse", reverse);
    getInputArguments().get("customers").add(reverseArg);
    InputArgument sortKeyArg = new InputArgument("sortKey", sortKey);
    getInputArguments().get("customers").add(sortKeyArg);
    InputArgument queryArg = new InputArgument("query", query);
    getInputArguments().get("customers").add(queryArg);
    InputArgument savedSearchIdArg = new InputArgument("savedSearchId", savedSearchId);
    getInputArguments().get("customers").add(savedSearchIdArg);
    return projection;
  }

  public SegmentProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> segments() {
     SegmentProjection<PriceRuleCustomerSelectionProjection<PARENT, ROOT>, ROOT> projection = new SegmentProjection<>(this, getRoot());
     getFields().put("segments", projection);
     return projection;
  }

  public PriceRuleCustomerSelectionProjection<PARENT, ROOT> forAllCustomers() {
    getFields().put("forAllCustomers", null);
    return this;
  }
}
