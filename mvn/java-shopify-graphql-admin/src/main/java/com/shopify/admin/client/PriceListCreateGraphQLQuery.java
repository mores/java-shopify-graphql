package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PriceListCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a price list. You can use the `priceListCreate` mutation to create a
 * new price list and associate it with a catalog. This enables you to sell your
 * products with contextual pricing.
 */
public class PriceListCreateGraphQLQuery extends GraphQLQuery {
  public PriceListCreateGraphQLQuery(PriceListCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PriceListCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PriceListCreateInput input;

    private String queryName;

    public PriceListCreateGraphQLQuery build() {
      return new PriceListCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new price list.
     */
    public Builder input(PriceListCreateInput input) {
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
