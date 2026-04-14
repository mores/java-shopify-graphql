package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnProcessInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Processes a return by confirming which items customers return and exchange,
 * handling their disposition, and optionally issuing refunds. This mutation
 * confirms the quantities for [`ReturnLineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ReturnLineItem) and [`ExchangeLineItem`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ExchangeLineItem)
 * objects previously created on the
 * [`Return`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Return).
 *   
 * For returned items, you specify how to handle them through dispositions such
 * as restocking or disposal. The mutation creates [`FulfillmentOrder`](https://shopify.dev/docs/api/admin-graphql/latest/objects/FulfillmentOrder)
 * objects for exchange items and records all transactions in the merchant's
 * financial reports. You can optionally issue refunds through financial
 * transfers, apply refund duties, and refund shipping costs.
 *   
 * Learn more about [processing returns](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management).
 */
public class ReturnProcessGraphQLQuery extends GraphQLQuery {
  public ReturnProcessGraphQLQuery(ReturnProcessInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public ReturnProcessGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnProcess";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnProcessInput input;

    private String queryName;

    public ReturnProcessGraphQLQuery build() {
      return new ReturnProcessGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for processing a return.
     */
    public Builder input(ReturnProcessInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
