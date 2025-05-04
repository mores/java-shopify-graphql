package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a draft order from order.
 */
public class DraftOrderCreateFromOrderGraphQLQuery extends GraphQLQuery {
  public DraftOrderCreateFromOrderGraphQLQuery(String orderId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (orderId != null || fieldsSet.contains("orderId")) {
        getInput().put("orderId", orderId);
    }
  }

  public DraftOrderCreateFromOrderGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "draftOrderCreateFromOrder";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String orderId;

    private String queryName;

    public DraftOrderCreateFromOrderGraphQLQuery build() {
      return new DraftOrderCreateFromOrderGraphQLQuery(orderId, queryName, fieldsSet);
               
    }

    /**
     * Specifies the order's id that we create the draft order from.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      this.fieldsSet.add("orderId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
