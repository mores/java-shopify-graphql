package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.BuyerSignalInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The resolved values for a buyer signal.
 */
public class MarketsResolvedValuesGraphQLQuery extends GraphQLQuery {
  public MarketsResolvedValuesGraphQLQuery(BuyerSignalInput buyerSignal, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (buyerSignal != null || fieldsSet.contains("buyerSignal")) {
        getInput().put("buyerSignal", buyerSignal);
    }
  }

  public MarketsResolvedValuesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketsResolvedValues";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private BuyerSignalInput buyerSignal;

    private String queryName;

    public MarketsResolvedValuesGraphQLQuery build() {
      return new MarketsResolvedValuesGraphQLQuery(buyerSignal, queryName, fieldsSet);
               
    }

    /**
     * The buyer signal.
     */
    public Builder buyerSignal(BuyerSignalInput buyerSignal) {
      this.buyerSignal = buyerSignal;
      this.fieldsSet.add("buyerSignal");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
