package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a return from an existing order that has at least one fulfilled
 * [line item](https://shopify.dev/docs/api/admin-graphql/latest/objects/LineItem)
 * that hasn't yet been refunded. If you create a return on an archived order, then the order is automatically
 * unarchived.
 *   
 * Use the `returnCreate` mutation when your workflow involves
 * [approving](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnApproveRequest) or
 * [declining](https://shopify.dev/docs/api/admin-graphql/latest/mutations/returnDeclineRequest) requested returns
 * outside of the Shopify platform.
 *   
 * The `returnCreate` mutation performs the following actions:
 *   
 * - Creates a return in the `OPEN` state, and assumes that the return request from the customer has already been
 * approved
 * - Creates a [reverse fulfillment order](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-fulfillment-orders),
 * and enables you to create a [reverse delivery](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/manage-reverse-deliveries)
 * for the reverse fulfillment order
 * - Creates a sales agreement with a `RETURN` reason, which links to all sales created for the return or exchange
 * - Generates sales records that reverse the sales records for the items being returned
 * - Generates sales records for any exchange line items
 *   
 * After you've created a return, use the
 * [`return`](https://shopify.dev/docs/api/admin-graphql/latest/queries/return) query to retrieve the
 * return by its ID. Learn more about providing a
 * [return management workflow](https://shopify.dev/docs/apps/build/orders-fulfillment/returns-apps/build-return-management)
 * for merchants.
 */
public class ReturnCreateGraphQLQuery extends GraphQLQuery {
  public ReturnCreateGraphQLQuery(ReturnInput returnInput, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (returnInput != null || fieldsSet.contains("returnInput")) {
        getInput().put("returnInput", returnInput);
    }
  }

  public ReturnCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "returnCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private ReturnInput returnInput;

    private String queryName;

    public ReturnCreateGraphQLQuery build() {
      return new ReturnCreateGraphQLQuery(returnInput, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for a return.
     */
    public Builder returnInput(ReturnInput returnInput) {
      this.returnInput = returnInput;
      this.fieldsSet.add("returnInput");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
